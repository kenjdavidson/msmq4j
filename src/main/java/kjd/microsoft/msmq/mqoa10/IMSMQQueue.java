package kjd.microsoft.msmq.mqoa10  ;

import com4j.*;

/**
 * Exposes the properties of an open instance of a queue and methods for peeking at or retrieving messages in it.
 */
@IID("{D7D6E076-DCCD-11D0-AA4B-0060970DEBAE}")
public interface IMSMQQueue extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Returns one of the access modes defined by the MQACCESS enumeration for the queue.
   * </p>
   * <p>
   * Getter method for the COM property "Access"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int access();


  /**
   * <p>
   * Returns one of the share modes defined by the MQSHARE enumeration for the queue.
   * </p>
   * <p>
   * Getter method for the COM property "ShareMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  int shareMode();


  /**
   * <p>
   * Returns the MSMQQueueInfo object that was used to open the queue.
   * </p>
   * <p>
   * Getter method for the COM property "QueueInfo"
   * </p>
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa10.IMSMQQueueInfo
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  kjd.microsoft.msmq.mqoa10.IMSMQQueueInfo queueInfo();


  /**
   * <p>
   * Returns the handle of the open instance of the queue, which can be used for directly calling Message Queuing APIs.
   * </p>
   * <p>
   * Getter method for the COM property "Handle"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  int handle();


  /**
   * <p>
   * Returns a value indicating whether the queue object is an open instance of the queue (1) or not (0).
   * </p>
   * <p>
   * Getter method for the COM property "IsOpen"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(11)
  short isOpen();


  /**
   * <p>
   * Closes an open instance of the queue.
   * </p>
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  void close();


  /**
   * <p>
   * Retrieves the first message in the queue, removing the message from the queue.
   * </p>
   * @param transaction Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantDestinationQueue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantBody Optional parameter. Default value is com4j.Variant.getMissing()
   * @param receiveTimeout Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa10.IMSMQMessage
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  kjd.microsoft.msmq.mqoa10.IMSMQMessage receive(
    @Optional java.lang.Object transaction,
    @Optional java.lang.Object wantDestinationQueue,
    @Optional java.lang.Object wantBody,
    @Optional java.lang.Object receiveTimeout);


  /**
   * <p>
   * Peeks at the first message in the queue.
   * </p>
   * @param wantDestinationQueue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantBody Optional parameter. Default value is com4j.Variant.getMissing()
   * @param receiveTimeout Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa10.IMSMQMessage
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  kjd.microsoft.msmq.mqoa10.IMSMQMessage peek(
    @Optional java.lang.Object wantDestinationQueue,
    @Optional java.lang.Object wantBody,
    @Optional java.lang.Object receiveTimeout);


  /**
   * <p>
   * Starts event notification for asynchronously reading messages in the specified queue, firing an MSMQEvent_Arrived event when a message is found or arrives at the position specified by the optional Cursor parameter and firing an MSMQEvent_ArrivedError if an error is generated while the application waits for a message.
   * </p>
   * @param event Mandatory kjd.microsoft.msmq.mqoa10.IMSMQEvent parameter.
   * @param cursor Optional parameter. Default value is com4j.Variant.getMissing()
   * @param receiveTimeout Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  void enableNotification(
    kjd.microsoft.msmq.mqoa10.IMSMQEvent event,
    @Optional java.lang.Object cursor,
    @Optional java.lang.Object receiveTimeout);


  /**
   * <p>
   * Returns the queue's cursor to the beginning of the queue.
   * </p>
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  void reset();


  /**
   * <p>
   * Retrieves the message at the position pointed to by the cursor, removing the message from the queue.
   * </p>
   * @param transaction Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantDestinationQueue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantBody Optional parameter. Default value is com4j.Variant.getMissing()
   * @param receiveTimeout Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa10.IMSMQMessage
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  kjd.microsoft.msmq.mqoa10.IMSMQMessage receiveCurrent(
    @Optional java.lang.Object transaction,
    @Optional java.lang.Object wantDestinationQueue,
    @Optional java.lang.Object wantBody,
    @Optional java.lang.Object receiveTimeout);


  /**
   * <p>
   * Advances the cursor to the next message in the queue and peeks at the message at the cursor.
   * </p>
   * @param wantDestinationQueue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantBody Optional parameter. Default value is com4j.Variant.getMissing()
   * @param receiveTimeout Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa10.IMSMQMessage
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(18)
  kjd.microsoft.msmq.mqoa10.IMSMQMessage peekNext(
    @Optional java.lang.Object wantDestinationQueue,
    @Optional java.lang.Object wantBody,
    @Optional java.lang.Object receiveTimeout);


  /**
   * <p>
   * Peeks at the current message in the queue without advancing the cursor.
   * </p>
   * @param wantDestinationQueue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantBody Optional parameter. Default value is com4j.Variant.getMissing()
   * @param receiveTimeout Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa10.IMSMQMessage
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(19)
  kjd.microsoft.msmq.mqoa10.IMSMQMessage peekCurrent(
    @Optional java.lang.Object wantDestinationQueue,
    @Optional java.lang.Object wantBody,
    @Optional java.lang.Object receiveTimeout);


  // Properties:
}
