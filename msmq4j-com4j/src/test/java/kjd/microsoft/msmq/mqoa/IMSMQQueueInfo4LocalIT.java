package kjd.microsoft.msmq.mqoa;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com4j.ComException;

@RunWith(BlockJUnit4ClassRunner.class)
public class IMSMQQueueInfo4LocalIT {

	IMSMQApplication3 app;
	IMSMQQueueInfo4 info;
	
	@Before
	public void setup() {
		app = ClassFactory.createMSMQApplication();
		info = ClassFactory.createMSMQQueueInfo();
	}
	
	@Test
	public void test_queueInfo_formatName() {
		String pathName = ".\\private$\\test_queue";
		info.pathName(pathName);	
		
		String formatName = info.formatName();
		assertNotNull(formatName);
	}
	
	@Test
	public void test_queueInfo_queueGuid() {
		String pathName = ".\\private$\\test_queue";
		info.pathName(pathName);	
		
		String guid = info.queueGuid();
		assertNotNull(guid);
		
		guid = info.serviceTypeGuid();
		assertNotNull(guid);
	}
	
	@Test
	public void test_queueInfo_privLevels() {
		String pathName = ".\\private$\\test_queue";
		info.pathName(pathName);		
		
		int priority = info.basePriority();
		assertTrue(priority >= MQPRIORITY.MQ_MIN_PRIORITY.comEnumValue() 
				&& priority <= MQPRIORITY.MQ_MAX_PRIORITY.comEnumValue());
		
		MQPRIVLEVEL originalPriv = info.privLevel();
		
		for (MQPRIVLEVEL level : MQPRIVLEVEL.values()) {
			info.privLevel(level);
			assertEquals(level, info.privLevel());
		}
		
		info.privLevel(originalPriv);
	}

	@Test
	public void test_queueInfo_authenticated() {
		String pathName = ".\\private$\\test_queue";
		info.pathName(pathName);		
		
		MQAUTHENTICATE originalAuth = info.authenticate();
		
		for (MQAUTHENTICATE auth : MQAUTHENTICATE.values()) {
			info.authenticate(auth);
			assertEquals(auth, info.authenticate());
		}
		
		info.authenticate(originalAuth);
	}
	
	@Test
	public void test_createQueue_alreadyCreated_exception() {
		String pathName = ".\\private$\\test_queue";
		info.pathName(pathName);
		
		try {
			info.create(false, false);
		} catch (ComException e) {
			assertEquals(MQERROR.MQ_ERROR_QUEUE_EXISTS.comEnumValue(), e.getHRESULT());
		}
	}
	
	@Test
	public void test_createQueue() {
		String pathName = ".\\private$\\new_queue";
		info.pathName(pathName);
		
		try {
			info.create(false, false);
		} finally {
			info.delete();
		}
	}
	
}
