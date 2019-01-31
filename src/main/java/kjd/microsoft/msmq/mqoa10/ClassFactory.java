package kjd.microsoft.msmq.mqoa10  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * Provides a lookup method that is used to locate public queues.
   */
  public static kjd.microsoft.msmq.mqoa10.IMSMQQuery createMSMQQuery() {
    return COM4J.createInstance( kjd.microsoft.msmq.mqoa10.IMSMQQuery.class, "{D7D6E073-DCCD-11D0-AA4B-0060970DEBAE}" );
  }

  /**
   * Provides properties that define the message and methods for sending it to one or more queues.
   */
  public static kjd.microsoft.msmq.mqoa10.IMSMQMessage createMSMQMessage() {
    return COM4J.createInstance( kjd.microsoft.msmq.mqoa10.IMSMQMessage.class, "{D7D6E075-DCCD-11D0-AA4B-0060970DEBAE}" );
  }

  /**
   * Provides the properties of an open instance of a queue and methods for peeking at or retrieving messages in it.
   */
  public static kjd.microsoft.msmq.mqoa10.IMSMQQueue createMSMQQueue() {
    return COM4J.createInstance( kjd.microsoft.msmq.mqoa10.IMSMQQueue.class, "{D7D6E079-DCCD-11D0-AA4B-0060970DEBAE}" );
  }

  /**
   * Provides events that are used for reading messages asynchronously.
   */
  public static kjd.microsoft.msmq.mqoa10.IMSMQEvent createMSMQEvent() {
    return COM4J.createInstance( kjd.microsoft.msmq.mqoa10.IMSMQEvent.class, "{D7D6E07A-DCCD-11D0-AA4B-0060970DEBAE}" );
  }

  /**
   * Provides the properties that define a queue and methods for creating, opening, and deleting the queue and for setting and retrieving its properties.
   */
  public static kjd.microsoft.msmq.mqoa10.IMSMQQueueInfo createMSMQQueueInfo() {
    return COM4J.createInstance( kjd.microsoft.msmq.mqoa10.IMSMQQueueInfo.class, "{D7D6E07C-DCCD-11D0-AA4B-0060970DEBAE}" );
  }

  /**
   * Provides methods for enumerating the elements of a collection of public queues returned by MSMQQuery.LookupQueue.
   */
  public static kjd.microsoft.msmq.mqoa10.IMSMQQueueInfos createMSMQQueueInfos() {
    return COM4J.createInstance( kjd.microsoft.msmq.mqoa10.IMSMQQueueInfos.class, "{D7D6E07E-DCCD-11D0-AA4B-0060970DEBAE}" );
  }

  /**
   * Provides properties that specify an underlying MS DTC external transaction object or internal transaction object and the standard ITransaction Commit and Abort methods.
   */
  public static kjd.microsoft.msmq.mqoa10.IMSMQTransaction createMSMQTransaction() {
    return COM4J.createInstance( kjd.microsoft.msmq.mqoa10.IMSMQTransaction.class, "{D7D6E080-DCCD-11D0-AA4B-0060970DEBAE}" );
  }

  /**
   * Provides a method that initiates a new MS DTC external transaction and returns an MSMQ transaction object representing the new underlying transaction object.
   */
  public static kjd.microsoft.msmq.mqoa10.IMSMQCoordinatedTransactionDispenser createMSMQCoordinatedTransactionDispenser() {
    return COM4J.createInstance( kjd.microsoft.msmq.mqoa10.IMSMQCoordinatedTransactionDispenser.class, "{D7D6E082-DCCD-11D0-AA4B-0060970DEBAE}" );
  }

  /**
   * Provides a method that initiates a new internal transaction and returns an MSMQ transaction object representing the new underlying transaction object.
   */
  public static kjd.microsoft.msmq.mqoa10.IMSMQTransactionDispenser createMSMQTransactionDispenser() {
    return COM4J.createInstance( kjd.microsoft.msmq.mqoa10.IMSMQTransactionDispenser.class, "{D7D6E084-DCCD-11D0-AA4B-0060970DEBAE}" );
  }

  /**
   * Provides properties that return information about the Message Queuing service on a computer and methods that perform general configurational tasks.
   */
  public static kjd.microsoft.msmq.mqoa10.IMSMQApplication createMSMQApplication() {
    return COM4J.createInstance( kjd.microsoft.msmq.mqoa10.IMSMQApplication.class, "{D7D6E086-DCCD-11D0-AA4B-0060970DEBAE}" );
  }
}
