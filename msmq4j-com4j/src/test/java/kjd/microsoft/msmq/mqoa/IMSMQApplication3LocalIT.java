package kjd.microsoft.msmq.mqoa;

import static org.junit.Assert.*;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com4j.ComException;

/**
 * Perform some integration testing on the {@link IMSMQApplication3} COM Interface.  More detailed
 * examples can be found in the {@code samples} folder.  Ensure that the account you're logged 
 * into Eclipse with (while running these) has Administrator access on the MSMQ Server.
 * 
 * @author kenjdavidson
 *
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class IMSMQApplication3LocalIT {

	IMSMQApplication3 app;
	
	@Before
	public void setup() {
		app = ClassFactory.createMSMQApplication();
	}

	/**
	 * This is only available when running in Directory mode.  On Workgroup
	 * mode this will throw an exception.
	 * @throws UnknownHostException 
	 */
	@Test
	public void test_Application_machineIdOfMachine() throws UnknownHostException {
		String hostname = InetAddress.getLocalHost().getHostName();
		String machineId = null;
		
		try {
			machineId = app.machineIdOfMachineName(hostname);
			assertNotNull(machineId);
		} catch (ComException e) {
			assertTrue(!app.isDsEnabled() 	// Allowed in Workgroup
					&& MQERROR.MQ_ERROR_UNSUPPORTED_OPERATION.comEnumValue() == e.getHRESULT());
		}		
	}
	
	@Test
	public void test_Application3_machine() throws UnknownHostException {
		String hostname = InetAddress.getLocalHost().getHostName();
		String machineName = app.machine();
		
		assertEquals(hostname.toUpperCase(), machineName.toUpperCase());
	}
	
	@Test
	public void test_Application3_connect_disconnect() {
		boolean connected = app.isConnected();
		
		try {
			toggleConnection(connected);		
			assertEquals(!connected, (connected = app.isConnected()));
			
			toggleConnection(connected);
			assertEquals(!connected, app.isConnected());	
		} catch (ComException e) {
			// Chances are this is failing due to security reasons.  You need to ensure that the
			// user running the tests has Admin access over the COM Services.
			fail(e.getDetailMessage());
		}
	}
	
	@Test
	public void test_Application3_privateQueues() {
		List<String> queues = Arrays.stream(app.privateQueues())
			.map(String::valueOf)
			.collect(Collectors.toList());
		
		assertNotNull(queues);
		assertTrue(!queues.isEmpty());		
	}
	
	/**
	 * Change the connection of the MSMQApplication.  This requires that the user
	 * running the tests has administrative rights to the COM Server.
	 * @param connected
	 */
	private void toggleConnection(boolean connected) {
		if (connected) app.disconnect();
		else app.connect();
	}
}
