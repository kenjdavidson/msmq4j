package kjd.microsoft.msmq.mqoa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Type;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com4j.ComException;

/**
 * Run some MSMQQueue tests.  A number of changes were made to the {@link IMSMQQueueInfo4} 
 * interface to allow for passing and receiving MQ* Enums directly - an example of this is
 * the {@link IMSMQQueueInfo4#open(MQACCESS, MQSHARE)} method.  
 * <p>
 * Queues are generally used for reading/receiving messages, while sending is performed from
 * the {@link IMSMQMessage4} interface, by passing the {@link IMSMQQueue4} or {@link IMSMQDestination}
 * into the message instead of the message into the queue/destination.
 * 
 * @author kenjdavidson
 *
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class IMSMQQueue4LocalIT {

	IMSMQQueueInfo4 info;
	IMSMQQueue4 queue;
	
	@Before
	public void setup() {
		info = ClassFactory.createMSMQQueueInfo();
		
		String pathName = ".\\private$\\test_queue";
		info.pathName(pathName);
		
		try {
			info.refresh();
		} catch (ComException e) {
			if (MQERROR.MQ_ERROR_QUEUE_NOT_FOUND.comEnumValue() != e.getHRESULT()) {
				throw e;
			} 
			
			info.create(false, false);
		}
	}
	
	@After
	public void tearDown() {
		info.delete();
	}
	
	@Test
	public void test_openQueue_writeShare_closeQueue() {		
		IMSMQQueue4 queue = info.open(MQACCESS.MQ_SEND_ACCESS, MQSHARE.MQ_DENY_NONE);
		
		assertTrue(queue.isOpen2());
		assertEquals(MQACCESS.MQ_SEND_ACCESS, queue.access());
		assertEquals(MQSHARE.MQ_DENY_NONE, queue.shareMode());
		
		queue.close();
		assertFalse(queue.isOpen2());
	}
	
}
