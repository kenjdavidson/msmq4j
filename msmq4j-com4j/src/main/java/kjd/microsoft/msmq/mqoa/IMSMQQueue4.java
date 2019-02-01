package kjd.microsoft.msmq.mqoa  ;

import com4j.*;

/**
 * Exposes the properties of an open instance of a queue and methods for peeking at or retrieving messages in it.
 */
@IID("{EBA96B20-2168-11D3-898C-00E02C074F6B}")
public interface IMSMQQueue4 extends Com4jObject {
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
  MQACCESS access();


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
  MQSHARE shareMode();


  /**
   * <p>
   * Returns the MSMQQueueInfo object that was used to open the queue.
   * </p>
   * <p>
   * Getter method for the COM property "QueueInfo"
   * </p>
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQQueueInfo4
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  kjd.microsoft.msmq.mqoa.IMSMQQueueInfo4 queueInfo();


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
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQMessage
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  kjd.microsoft.msmq.mqoa.IMSMQMessage receive_v1(
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
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQMessage
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  kjd.microsoft.msmq.mqoa.IMSMQMessage peek_v1(
    @Optional java.lang.Object wantDestinationQueue,
    @Optional java.lang.Object wantBody,
    @Optional java.lang.Object receiveTimeout);


  /**
   * <p>
   * Starts event notification for asynchronously reading messages in the specified queue, firing an MSMQEvent_Arrived event when a message is found or arrives at the position specified by the optional Cursor parameter and firing an MSMQEvent_ArrivedError if an error is generated while the application waits for a message.
   * </p>
   * @param event Mandatory kjd.microsoft.msmq.mqoa.IMSMQEvent3 parameter.
   * @param cursor Optional parameter. Default value is com4j.Variant.getMissing()
   * @param receiveTimeout Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  void enableNotification(
    kjd.microsoft.msmq.mqoa.IMSMQEvent3 event,
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
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQMessage
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  kjd.microsoft.msmq.mqoa.IMSMQMessage receiveCurrent_v1(
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
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQMessage
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(18)
  kjd.microsoft.msmq.mqoa.IMSMQMessage peekNext_v1(
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
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQMessage
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(19)
  kjd.microsoft.msmq.mqoa.IMSMQMessage peekCurrent_v1(
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
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQMessage4
   */

  @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
  @VTID(20)
  kjd.microsoft.msmq.mqoa.IMSMQMessage4 receive(
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
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQMessage4
   */

  @DISPID(1610743822) //= 0x6002000e. The runtime will prefer the VTID if present
  @VTID(21)
  kjd.microsoft.msmq.mqoa.IMSMQMessage4 peek(
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
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQMessage4
   */

  @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
  @VTID(22)
  kjd.microsoft.msmq.mqoa.IMSMQMessage4 receiveCurrent(
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
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQMessage4
   */

  @DISPID(1610743824) //= 0x60020010. The runtime will prefer the VTID if present
  @VTID(23)
  kjd.microsoft.msmq.mqoa.IMSMQMessage4 peekNext(
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
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQMessage4
   */

  @DISPID(1610743825) //= 0x60020011. The runtime will prefer the VTID if present
  @VTID(24)
  kjd.microsoft.msmq.mqoa.IMSMQMessage4 peekCurrent(
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


  /**
   * <p>
   * Returns a Variant (VT_I8) specifying the handle of the open instance of the queue, which can be used for directly calling Message Queuing APIs.
   * </p>
   * <p>
   * Getter method for the COM property "Handle2"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(26)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object handle2();


  /**
   * <p>
   * Retrieves a message with a LookupId property that is equal to the specified lookup identifier, removing it from the queue, and has the optional parameters Transaction (default set to MTS Transaction), WantDestinationQueue (default set to False), WantBody (default set to True), and WantConnectorType (default set to False).
   * </p>
   * @param lookupId Mandatory java.lang.Object parameter.
   * @param transaction Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantDestinationQueue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantBody Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantConnectorType Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQMessage4
   */

  @DISPID(1610743828) //= 0x60020014. The runtime will prefer the VTID if present
  @VTID(27)
  kjd.microsoft.msmq.mqoa.IMSMQMessage4 receiveByLookupId(
    @MarshalAs(NativeType.VARIANT) java.lang.Object lookupId,
    @Optional java.lang.Object transaction,
    @Optional java.lang.Object wantDestinationQueue,
    @Optional java.lang.Object wantBody,
    @Optional java.lang.Object wantConnectorType);


  /**
   * <p>
   * Retrieves the message following a message with a LookupId property that is equal to the specified lookup identifier, removing it from the queue, and has the optional parameters Transaction (default set to MTS Transaction), WantDestinationQueue (default set to False), WantBody (default set to True), and WantConnectorType (default set to False).
   * </p>
   * @param lookupId Mandatory java.lang.Object parameter.
   * @param transaction Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantDestinationQueue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantBody Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantConnectorType Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQMessage4
   */

  @DISPID(1610743829) //= 0x60020015. The runtime will prefer the VTID if present
  @VTID(28)
  kjd.microsoft.msmq.mqoa.IMSMQMessage4 receiveNextByLookupId(
    @MarshalAs(NativeType.VARIANT) java.lang.Object lookupId,
    @Optional java.lang.Object transaction,
    @Optional java.lang.Object wantDestinationQueue,
    @Optional java.lang.Object wantBody,
    @Optional java.lang.Object wantConnectorType);


  /**
   * <p>
   * Retrieves the message preceding a message with a LookupId property that is equal to the specified lookup identifier, removing it from the queue, and has the optional parameters Transaction (default set to MTS Transaction), WantDestinationQueue (default set to False), WantBody (default set to True), and WantConnectorType (default set to False).
   * </p>
   * @param lookupId Mandatory java.lang.Object parameter.
   * @param transaction Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantDestinationQueue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantBody Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantConnectorType Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQMessage4
   */

  @DISPID(1610743830) //= 0x60020016. The runtime will prefer the VTID if present
  @VTID(29)
  kjd.microsoft.msmq.mqoa.IMSMQMessage4 receivePreviousByLookupId(
    @MarshalAs(NativeType.VARIANT) java.lang.Object lookupId,
    @Optional java.lang.Object transaction,
    @Optional java.lang.Object wantDestinationQueue,
    @Optional java.lang.Object wantBody,
    @Optional java.lang.Object wantConnectorType);


  /**
   * <p>
   * Retrieves the first message in the queue, removing it from the queue, and has the optional parameters Transaction (default set to MTS Transaction), WantDestinationQueue (default set to False), WantBody (default set to True), and WantConnectorType (default set to False).
   * </p>
   * @param transaction Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantDestinationQueue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantBody Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantConnectorType Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQMessage4
   */

  @DISPID(1610743831) //= 0x60020017. The runtime will prefer the VTID if present
  @VTID(30)
  kjd.microsoft.msmq.mqoa.IMSMQMessage4 receiveFirstByLookupId(
    @Optional java.lang.Object transaction,
    @Optional java.lang.Object wantDestinationQueue,
    @Optional java.lang.Object wantBody,
    @Optional java.lang.Object wantConnectorType);


  /**
   * <p>
   * Retrieves the last message in the queue, removing it from the queue, and has the optional parameters Transaction (default set to MTS Transaction), WantDestinationQueue (default set to False), WantBody (default set to True), and WantConnectorType (default set to False).
   * </p>
   * @param transaction Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantDestinationQueue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantBody Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantConnectorType Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQMessage4
   */

  @DISPID(1610743832) //= 0x60020018. The runtime will prefer the VTID if present
  @VTID(31)
  kjd.microsoft.msmq.mqoa.IMSMQMessage4 receiveLastByLookupId(
    @Optional java.lang.Object transaction,
    @Optional java.lang.Object wantDestinationQueue,
    @Optional java.lang.Object wantBody,
    @Optional java.lang.Object wantConnectorType);


  /**
   * <p>
   * Peeks at a message with a LookupId property that is equal to the specified lookup identifier and has the optional parameters WantDestinationQueue (default set to False), WantBody (default set to True), and WantConnectorType (default set to False).
   * </p>
   * @param lookupId Mandatory java.lang.Object parameter.
   * @param wantDestinationQueue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantBody Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantConnectorType Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQMessage4
   */

  @DISPID(1610743833) //= 0x60020019. The runtime will prefer the VTID if present
  @VTID(32)
  kjd.microsoft.msmq.mqoa.IMSMQMessage4 peekByLookupId(
    @MarshalAs(NativeType.VARIANT) java.lang.Object lookupId,
    @Optional java.lang.Object wantDestinationQueue,
    @Optional java.lang.Object wantBody,
    @Optional java.lang.Object wantConnectorType);


  /**
   * <p>
   * Peeks at the message following a message with a LookupId property that is equal to the specified lookup identifier and has the optional parameters WantDestinationQueue (default set to False), WantBody (default set to True), and WantConnectorType (default set to False).
   * </p>
   * @param lookupId Mandatory java.lang.Object parameter.
   * @param wantDestinationQueue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantBody Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantConnectorType Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQMessage4
   */

  @DISPID(1610743834) //= 0x6002001a. The runtime will prefer the VTID if present
  @VTID(33)
  kjd.microsoft.msmq.mqoa.IMSMQMessage4 peekNextByLookupId(
    @MarshalAs(NativeType.VARIANT) java.lang.Object lookupId,
    @Optional java.lang.Object wantDestinationQueue,
    @Optional java.lang.Object wantBody,
    @Optional java.lang.Object wantConnectorType);


  /**
   * <p>
   * Peeks at the message preceding a message with a LookupId property that is equal to the specified lookup identifier and has the optional parameters WantDestinationQueue (default set to False), WantBody (default set to True), and WantConnectorType (default set to False).
   * </p>
   * @param lookupId Mandatory java.lang.Object parameter.
   * @param wantDestinationQueue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantBody Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantConnectorType Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQMessage4
   */

  @DISPID(1610743835) //= 0x6002001b. The runtime will prefer the VTID if present
  @VTID(34)
  kjd.microsoft.msmq.mqoa.IMSMQMessage4 peekPreviousByLookupId(
    @MarshalAs(NativeType.VARIANT) java.lang.Object lookupId,
    @Optional java.lang.Object wantDestinationQueue,
    @Optional java.lang.Object wantBody,
    @Optional java.lang.Object wantConnectorType);


  /**
   * <p>
   * Peeks at the first message in the queue and has the optional parameters WantDestinationQueue (default set to False), WantBody (default set to True), and WantConnectorType (default set to False).
   * </p>
   * @param wantDestinationQueue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantBody Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantConnectorType Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQMessage4
   */

  @DISPID(1610743836) //= 0x6002001c. The runtime will prefer the VTID if present
  @VTID(35)
  kjd.microsoft.msmq.mqoa.IMSMQMessage4 peekFirstByLookupId(
    @Optional java.lang.Object wantDestinationQueue,
    @Optional java.lang.Object wantBody,
    @Optional java.lang.Object wantConnectorType);


  /**
   * <p>
   * Peeks at the last message in the queue and has the optional parameters WantDestinationQueue (default set to False), WantBody (default set to True), and WantConnectorType (default set to False).
   * </p>
   * @param wantDestinationQueue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantBody Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantConnectorType Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQMessage4
   */

  @DISPID(1610743837) //= 0x6002001d. The runtime will prefer the VTID if present
  @VTID(36)
  kjd.microsoft.msmq.mqoa.IMSMQMessage4 peekLastByLookupId(
    @Optional java.lang.Object wantDestinationQueue,
    @Optional java.lang.Object wantBody,
    @Optional java.lang.Object wantConnectorType);


  /**
   * <p>
   * Purges all messages in the queue.
   * </p>
   */

  @DISPID(1610743838) //= 0x6002001e. The runtime will prefer the VTID if present
  @VTID(37)
  void purge();


  /**
   * <p>
   * Returns a Boolean indicating whether the queue object is an open instance of the queue (True) or not (False).
   * </p>
   * <p>
   * Getter method for the COM property "IsOpen2"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(38)
  boolean isOpen2();


  /**
   * <p>
   * Retrieves a message with a LookupId property that is equal to the specified lookup identifier, removing it from the queue, and has the optional parameters Transaction (default set to MTS Transaction), WantDestinationQueue (default set to False), WantBody (default set to True), and WantConnectorType (default set to False).
   * </p>
   * @param lookupId Mandatory java.lang.Object parameter.
   * @param transaction Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantDestinationQueue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantBody Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wantConnectorType Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQMessage4
   */

  @DISPID(1610743840) //= 0x60020020. The runtime will prefer the VTID if present
  @VTID(39)
  kjd.microsoft.msmq.mqoa.IMSMQMessage4 receiveByLookupIdAllowPeek(
    @MarshalAs(NativeType.VARIANT) java.lang.Object lookupId,
    @Optional java.lang.Object transaction,
    @Optional java.lang.Object wantDestinationQueue,
    @Optional java.lang.Object wantBody,
    @Optional java.lang.Object wantConnectorType);


  // Properties:
}
