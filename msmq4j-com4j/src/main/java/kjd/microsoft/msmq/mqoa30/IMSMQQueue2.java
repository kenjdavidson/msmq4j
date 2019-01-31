package kjd.microsoft.msmq.mqoa30  ;

import com4j.*;

/**
 * Exposes the properties of an open instance of a queue and methods for peeking at or retrieving messages in it.
 */
@IID("{EF0574E0-06D8-11D3-B100-00E02C074F6B}")
public interface IMSMQQueue2 extends Com4jObject {
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
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa30.IMSMQQueueInfo2
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  kjd.microsoft.msmq.mqoa30.IMSMQQueueInfo2 queueInfo();


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
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa30.IMSMQMessage
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  kjd.microsoft.msmq.mqoa30.IMSMQMessage receive_v1(
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
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa30.IMSMQMessage
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  kjd.microsoft.msmq.mqoa30.IMSMQMessage peek_v1(
    @Optional java.lang.Object wantDestinationQueue,
    @Optional java.lang.Object wantBody,
    @Optional java.lang.Object receiveTimeout);


  /**
   * <p>
   * Starts event notification for asynchronously reading messages in the specified queue, firing an MSMQEvent_Arrived event when a message is found or arrives at the position specified by the optional Cursor parameter and firing an MSMQEvent_ArrivedError if an error is generated while the application waits for a message.
   * </p>
   * @param event Mandatory kjd.microsoft.msmq.mqoa30.IMSMQEvent2 parameter.
   * @param cursor Optional parameter. Default value is com4j.Variant.getMissing()
   * @param receiveTimeout Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  void enableNotification(
    kjd.microsoft.msmq.mqoa30.IMSMQEvent2 event,
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
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa30.IMSMQMessage
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  kjd.microsoft.msmq.mqoa30.IMSMQMessage receiveCurrent_v1(
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
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa30.IMSMQMessage
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(18)
  kjd.microsoft.msmq.mqoa30.IMSMQMessage peekNext_v1(
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
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa30.IMSMQMessage
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(19)
  kjd.microsoft.msmq.mqoa30.IMSMQMessage peekCurrent_v1(
    @Optional java.lang.Object wantDestinationQueue,
    @Optional java.lang.Object wantBody,
    @Optional java.lang.Object receiveTimeout);


  /**
   * <p>
   * Retrieves the first message in the queue, removing the message from the queue.
   * </p>
   * @param transaction Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantDestinationQueue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantBody Optional parameter. Default value is com4j.Variant.getMissing()
   * @param receiveTimeout Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantConnectorType Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa30.IMSMQMessage2
   */

  @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
  @VTID(20)
  kjd.microsoft.msmq.mqoa30.IMSMQMessage2 receive(
    @Optional java.lang.Object transaction,
    @Optional java.lang.Object wantDestinationQueue,
    @Optional java.lang.Object wantBody,
    @Optional java.lang.Object receiveTimeout,
    @Optional java.lang.Object wantConnectorType);


  /**
   * <p>
   * Peeks at the first message in the queue.
   * </p>
   * @param wantDestinationQueue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantBody Optional parameter. Default value is com4j.Variant.getMissing()
   * @param receiveTimeout Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantConnectorType Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa30.IMSMQMessage2
   */

  @DISPID(1610743822) //= 0x6002000e. The runtime will prefer the VTID if present
  @VTID(21)
  kjd.microsoft.msmq.mqoa30.IMSMQMessage2 peek(
    @Optional java.lang.Object wantDestinationQueue,
    @Optional java.lang.Object wantBody,
    @Optional java.lang.Object receiveTimeout,
    @Optional java.lang.Object wantConnectorType);


  /**
   * <p>
   * Retrieves the message at the position pointed to by the cursor, removing the message from the queue.
   * </p>
   * @param transaction Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantDestinationQueue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantBody Optional parameter. Default value is com4j.Variant.getMissing()
   * @param receiveTimeout Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantConnectorType Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa30.IMSMQMessage2
   */

  @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
  @VTID(22)
  kjd.microsoft.msmq.mqoa30.IMSMQMessage2 receiveCurrent(
    @Optional java.lang.Object transaction,
    @Optional java.lang.Object wantDestinationQueue,
    @Optional java.lang.Object wantBody,
    @Optional java.lang.Object receiveTimeout,
    @Optional java.lang.Object wantConnectorType);


  /**
   * <p>
   * Advances the cursor to the next message in the queue and peeks at the message at the cursor.
   * </p>
   * @param wantDestinationQueue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantBody Optional parameter. Default value is com4j.Variant.getMissing()
   * @param receiveTimeout Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantConnectorType Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa30.IMSMQMessage2
   */

  @DISPID(1610743824) //= 0x60020010. The runtime will prefer the VTID if present
  @VTID(23)
  kjd.microsoft.msmq.mqoa30.IMSMQMessage2 peekNext(
    @Optional java.lang.Object wantDestinationQueue,
    @Optional java.lang.Object wantBody,
    @Optional java.lang.Object receiveTimeout,
    @Optional java.lang.Object wantConnectorType);


  /**
   * <p>
   * Peeks at the current message in the queue without advancing the cursor.
   * </p>
   * @param wantDestinationQueue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantBody Optional parameter. Default value is com4j.Variant.getMissing()
   * @param receiveTimeout Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantConnectorType Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa30.IMSMQMessage2
   */

  @DISPID(1610743825) //= 0x60020011. The runtime will prefer the VTID if present
  @VTID(24)
  kjd.microsoft.msmq.mqoa30.IMSMQMessage2 peekCurrent(
    @Optional java.lang.Object wantDestinationQueue,
    @Optional java.lang.Object wantBody,
    @Optional java.lang.Object receiveTimeout,
    @Optional java.lang.Object wantConnectorType);


  /**
   * <p>
   * Getter method for the COM property "Properties"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(25)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject properties();


  // Properties:
}
