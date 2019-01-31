package kjd.microsoft.msmq.mqoa40;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.jinterop.dcom.common.JIException;
import org.jinterop.dcom.core.IJIComObject;
import org.jinterop.dcom.core.JIArray;
import org.jinterop.dcom.core.JICallBuilder;
import org.jinterop.dcom.core.JIClsid;
import org.jinterop.dcom.core.JIComServer;
import org.jinterop.dcom.core.JISession;
import org.jinterop.dcom.core.JIVariant;
import org.jinterop.dcom.impls.JIObjectFactory;
import org.jinterop.dcom.impls.automation.IJIDispatch;
import org.jinterop.dcom.impls.automation.IJITypeInfo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import kjd.microsoft.msmq.JISessionBuilder;

/**
 * MSMQ.MSMQApplication1 integration tests using j-interop.  There is no actual MSMQApplication4,
 * so this actually tests MSMQApplication3 as described in the MSMQ Com Reference.
 * 
 * @author kenjdavidson
 *
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class IMSMQApplication4IT {

	JISession session;
	JICallBuilder call;
	JIComServer service;
	IJIComObject application;
	
	@Before
	public void setup() throws IllegalArgumentException, UnknownHostException, JIException {
		session = JISessionBuilder.create("klaptop01")
				.username("dcomadmin")
				.password("dcomadmin")
				.build();
		call = new JICallBuilder();
				
		service = new JIComServer(JIClsid.valueOf("D7D6E086-DCCD-11D0-AA4B-0060970DEBAE"), session);
		application = service.createInstance();	
	}
	
	@After
	public void breakdown() throws JIException {
		JISession.destroySession(session);
	}
	
	@Test
	public void test_initLocalServer_retreiveProperties() 
			throws IllegalArgumentException, UnknownHostException, JIException {
		IJIDispatch dispatch = (IJIDispatch)JIObjectFactory.narrowObject(application.queryInterface(IJIDispatch.IID));
		
		int dispId = dispatch.getIDsOfNames("Machine");
		String hostname = dispatch.get(dispId).getObjectAsString2();
		assertTrue(InetAddress.getLocalHost().getHostName().equalsIgnoreCase(hostname));
		
		dispId = dispatch.getIDsOfNames("IsConnected");
		boolean connected = dispatch.get(dispId).getObjectAsBoolean();
		assertTrue(connected);
				
	}

	@Test
	public void test_initLocalServer_disconnectConnect() throws JIException {				
		IJIDispatch dispatch = (IJIDispatch)JIObjectFactory.narrowObject(application.queryInterface(IJIDispatch.IID));
		
		int isConnected = dispatch.getIDsOfNames("IsConnected");
		int connect = dispatch.getIDsOfNames("Connect");
		int disconnect = dispatch.getIDsOfNames("Disconnect");
		
		dispatch.callMethod(disconnect);		
		boolean connected = dispatch.get(isConnected).getObjectAsBoolean();
		assertFalse(connected);
		
		dispatch.callMethod(connect);		
		connected = dispatch.get(isConnected).getObjectAsBoolean();
		assertTrue(connected);
	}
	
	@Test
	public void test_getPrivateQueues_returnsQueues() throws JIException {
		IJIDispatch dispatch = (IJIDispatch)JIObjectFactory.narrowObject(application.queryInterface(IJIDispatch.IID));
		
		int privateQueues = dispatch.getIDsOfNames("PrivateQueues");
		
		JIVariant queueV = dispatch.get(privateQueues);	
		JIVariant[] queues = (JIVariant[]) queueV.getObjectAsArray().getArrayInstance();
	}
}
