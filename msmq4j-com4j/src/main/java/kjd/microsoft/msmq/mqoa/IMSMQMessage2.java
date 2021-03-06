package kjd.microsoft.msmq.mqoa  ;

import com4j.*;

/**
 * Exposes properties that define the message and methods for sending it to a queue.
 */
@IID("{D9933BE0-A567-11D2-B0F3-00E02C074F6B}")
public interface IMSMQMessage2 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Returns one of the the message classes defined by the MQMSGCLASS enumeration.
   * </p>
   * <p>
   * Getter method for the COM property "Class"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(7)
  int _class();


  /**
   * <p>
   * Sets/returns one of the privacy levels defined by the MQMSGPRIVLEVEL enumeration for the message.
   * </p>
   * <p>
   * Getter method for the COM property "PrivLevel"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(8)
  int privLevel();


  /**
   * <p>
   * Sets/returns one of the privacy levels defined by the MQMSGPRIVLEVEL enumeration for the message.
   * </p>
   * <p>
   * Setter method for the COM property "PrivLevel"
   * </p>
   * @param plPrivLevel Mandatory int parameter.
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(9)
  void privLevel(
    int plPrivLevel);


  /**
   * <p>
   * Sets/returns one of the authentication levels defined by the MQMSGAUTHLEVEL enumeration for the message.
   * </p>
   * <p>
   * Getter method for the COM property "AuthLevel"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(10)
  int authLevel();


  /**
   * <p>
   * Sets/returns one of the authentication levels defined by the MQMSGAUTHLEVEL enumeration for the message.
   * </p>
   * <p>
   * Setter method for the COM property "AuthLevel"
   * </p>
   * @param plAuthLevel Mandatory int parameter.
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(11)
  void authLevel(
    int plAuthLevel);


  /**
   * <p>
   * Returns a value indicating whether the message was authenticated (1) or not (0).
   * </p>
   * <p>
   * Getter method for the COM property "IsAuthenticated"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(12)
  short isAuthenticated();


  /**
   * <p>
   * Sets/returns one of the delivery modes defined by the MQMSGDELIVERY enumeration for the message.
   * </p>
   * <p>
   * Getter method for the COM property "Delivery"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(13)
  int delivery();


  /**
   * <p>
   * Sets/returns one of the delivery modes defined by the MQMSGDELIVERY enumeration for the message.
   * </p>
   * <p>
   * Setter method for the COM property "Delivery"
   * </p>
   * @param plDelivery Mandatory int parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(14)
  void delivery(
    int plDelivery);


  /**
   * <p>
   * Sets/returns one of the tracing levels defined by the MQMSGTRACE enumeration for the message.
   * </p>
   * <p>
   * Getter method for the COM property "Trace"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(15)
  int trace();


  /**
   * <p>
   * Sets/returns one of the tracing levels defined by the MQMSGTRACE enumeration for the message.
   * </p>
   * <p>
   * Setter method for the COM property "Trace"
   * </p>
   * @param plTrace Mandatory int parameter.
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(16)
  void trace(
    int plTrace);


  /**
   * <p>
   * Sets/returns a priority level between MQ_MIN_PRIORITY and MQ_MAX_PRIORITY for the message.
   * </p>
   * <p>
   * Getter method for the COM property "Priority"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(17)
  int priority();


  /**
   * <p>
   * Sets/returns a priority level between MQ_MIN_PRIORITY and MQ_MAX_PRIORITY for the message.
   * </p>
   * <p>
   * Setter method for the COM property "Priority"
   * </p>
   * @param plPriority Mandatory int parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(18)
  void priority(
    int plPriority);


  /**
   * <p>
   * Sets/returns one of the journaling levels defined by the MQMSGJOURNAL enumeration for the message.
   * </p>
   * <p>
   * Getter method for the COM property "Journal"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(19)
  int journal();


  /**
   * <p>
   * Sets/returns one of the journaling levels defined by the MQMSGJOURNAL enumeration for the message.
   * </p>
   * <p>
   * Setter method for the COM property "Journal"
   * </p>
   * @param plJournal Mandatory int parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(20)
  void journal(
    int plJournal);


  /**
   * <p>
   * Sets/returns the response queue for the message.
   * </p>
   * <p>
   * Getter method for the COM property "ResponseQueueInfo_v1"
   * </p>
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQQueueInfo
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(21)
  kjd.microsoft.msmq.mqoa.IMSMQQueueInfo responseQueueInfo_v1();


  /**
   * <p>
   * Sets/returns the response queue for the message.
   * </p>
   * <p>
   * Setter method for the COM property "ResponseQueueInfo_v1"
   * </p>
   * @param ppqinfoResponse Mandatory kjd.microsoft.msmq.mqoa.IMSMQQueueInfo parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(22)
  void responseQueueInfo_v1(
    kjd.microsoft.msmq.mqoa.IMSMQQueueInfo ppqinfoResponse);


  /**
   * <p>
   * Sets/returns application-specific information that can be used to filter the message.
   * </p>
   * <p>
   * Getter method for the COM property "AppSpecific"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(23)
  int appSpecific();


  /**
   * <p>
   * Sets/returns application-specific information that can be used to filter the message.
   * </p>
   * <p>
   * Setter method for the COM property "AppSpecific"
   * </p>
   * @param plAppSpecific Mandatory int parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(24)
  void appSpecific(
    int plAppSpecific);


  /**
   * <p>
   * Returns the identifier of the computer where the message originated.
   * </p>
   * <p>
   * Getter method for the COM property "SourceMachineGuid"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String sourceMachineGuid();


  /**
   * <p>
   * Returns the length (in bytes) of the message body.
   * </p>
   * <p>
   * Getter method for the COM property "BodyLength"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(26)
  int bodyLength();


  /**
   * <p>
   * Sets/returns a Variant containing the message body in the form of any intrinsic type or a persistent object.
   * </p>
   * <p>
   * Getter method for the COM property "Body"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(27)
  @DefaultMethod
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object body();


  /**
   * <p>
   * Sets/returns a Variant containing the message body in the form of any intrinsic type or a persistent object.
   * </p>
   * <p>
   * Setter method for the COM property "Body"
   * </p>
   * @param pvarBody Mandatory java.lang.Object parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(28)
  @DefaultMethod
  void body(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pvarBody);


  /**
   * <p>
   * Sets/returns the administration queue for the message.
   * </p>
   * <p>
   * Getter method for the COM property "AdminQueueInfo_v1"
   * </p>
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQQueueInfo
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(29)
  kjd.microsoft.msmq.mqoa.IMSMQQueueInfo adminQueueInfo_v1();


  /**
   * <p>
   * Sets/returns the administration queue for the message.
   * </p>
   * <p>
   * Setter method for the COM property "AdminQueueInfo_v1"
   * </p>
   * @param ppqinfoAdmin Mandatory kjd.microsoft.msmq.mqoa.IMSMQQueueInfo parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(30)
  void adminQueueInfo_v1(
    kjd.microsoft.msmq.mqoa.IMSMQQueueInfo ppqinfoAdmin);


  /**
   * <p>
   * Returns the MSMQ-generated identifier (array of bytes) of the message.
   * </p>
   * <p>
   * Getter method for the COM property "Id"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(31)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object id();


  /**
   * <p>
   * Sets/returns the correlation identifier (array of bytes) of the message.
   * </p>
   * <p>
   * Getter method for the COM property "CorrelationId"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(32)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object correlationId();


  /**
   * <p>
   * Sets/returns the correlation identifier (array of bytes) of the message.
   * </p>
   * <p>
   * Setter method for the COM property "CorrelationId"
   * </p>
   * @param pvarMsgId Mandatory java.lang.Object parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(33)
  void correlationId(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pvarMsgId);


  /**
   * <p>
   * Sets/returns one of the acknowledgement levels defined by the MQMSGACKNOWLEDGEMENT enumeration for the message.
   * </p>
   * <p>
   * Getter method for the COM property "Ack"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(34)
  int ack();


  /**
   * <p>
   * Sets/returns one of the acknowledgement levels defined by the MQMSGACKNOWLEDGEMENT enumeration for the message.
   * </p>
   * <p>
   * Setter method for the COM property "Ack"
   * </p>
   * @param plAck Mandatory int parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(35)
  void ack(
    int plAck);


  /**
   * <p>
   * Sets/returns the label of the message.
   * </p>
   * <p>
   * Getter method for the COM property "Label"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(36)
  java.lang.String label();


  /**
   * <p>
   * Sets/returns the label of the message.
   * </p>
   * <p>
   * Setter method for the COM property "Label"
   * </p>
   * @param pbstrLabel Mandatory java.lang.String parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(37)
  void label(
    java.lang.String pbstrLabel);


  /**
   * <p>
   * Sets/returns the amount of time allowed to deliver the message to its destination queue.
   * </p>
   * <p>
   * Getter method for the COM property "MaxTimeToReachQueue"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(38)
  int maxTimeToReachQueue();


  /**
   * <p>
   * Sets/returns the amount of time allowed to deliver the message to its destination queue.
   * </p>
   * <p>
   * Setter method for the COM property "MaxTimeToReachQueue"
   * </p>
   * @param plMaxTimeToReachQueue Mandatory int parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(39)
  void maxTimeToReachQueue(
    int plMaxTimeToReachQueue);


  /**
   * <p>
   * Sets/returns the amount of time that the receiving application has to retreive the message from its destination queue.
   * </p>
   * <p>
   * Getter method for the COM property "MaxTimeToReceive"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(40)
  int maxTimeToReceive();


  /**
   * <p>
   * Sets/returns the amount of time that the receiving application has to retreive the message from its destination queue.
   * </p>
   * <p>
   * Setter method for the COM property "MaxTimeToReceive"
   * </p>
   * @param plMaxTimeToReceive Mandatory int parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(41)
  void maxTimeToReceive(
    int plMaxTimeToReceive);


  /**
   * <p>
   * Sets/returns the hash algorithm that Message Queuing uses when authenticating the message.
   * </p>
   * <p>
   * Getter method for the COM property "HashAlgorithm"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(42)
  int hashAlgorithm();


  /**
   * <p>
   * Sets/returns the hash algorithm that Message Queuing uses when authenticating the message.
   * </p>
   * <p>
   * Setter method for the COM property "HashAlgorithm"
   * </p>
   * @param plHashAlg Mandatory int parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(43)
  void hashAlgorithm(
    int plHashAlg);


  /**
   * <p>
   * Sets/returns the encryption algorithm used to encrypt the message body of the private message.
   * </p>
   * <p>
   * Getter method for the COM property "EncryptAlgorithm"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(44)
  int encryptAlgorithm();


  /**
   * <p>
   * Sets/returns the encryption algorithm used to encrypt the message body of the private message.
   * </p>
   * <p>
   * Setter method for the COM property "EncryptAlgorithm"
   * </p>
   * @param plEncryptAlg Mandatory int parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(45)
  void encryptAlgorithm(
    int plEncryptAlg);


  /**
   * <p>
   * Returns a Variant (Date) indicating the date and time when the message was sent.
   * </p>
   * <p>
   * Getter method for the COM property "SentTime"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(46)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object sentTime();


  /**
   * <p>
   * Returns a Variant (Date) indicating the date and time when the message arrived at its destination queue.
   * </p>
   * <p>
   * Getter method for the COM property "ArrivedTime"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(47)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object arrivedTime();


  /**
   * <p>
   * Returns the original destination queue of the message, which is typically used when reading response messages, or messages in computer journals or dead-letter queues.
   * </p>
   * <p>
   * Getter method for the COM property "DestinationQueueInfo"
   * </p>
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQQueueInfo2
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(48)
  kjd.microsoft.msmq.mqoa.IMSMQQueueInfo2 destinationQueueInfo();


  /**
   * <p>
   * Sets/returns an array of bytes containing the sender certificate in the message.
   * </p>
   * <p>
   * Getter method for the COM property "SenderCertificate"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(49)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object senderCertificate();


  /**
   * <p>
   * Sets/returns an array of bytes containing the sender certificate in the message.
   * </p>
   * <p>
   * Setter method for the COM property "SenderCertificate"
   * </p>
   * @param pvarSenderCert Mandatory java.lang.Object parameter.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(50)
  void senderCertificate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pvarSenderCert);


  /**
   * <p>
   * Sets/returns an array of bytes containing the sender's identifier in the message.
   * </p>
   * <p>
   * Getter method for the COM property "SenderId"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(51)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object senderId();


  /**
   * <p>
   * Sets/returns one of the types of sender identifiers defined by the MSMQSENDERIDTYPE enumeration for the message.
   * </p>
   * <p>
   * Getter method for the COM property "SenderIdType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(52)
  int senderIdType();


  /**
   * <p>
   * Sets/returns one of the types of sender identifiers defined by the MSMQSENDERIDTYPE enumeration for the message.
   * </p>
   * <p>
   * Setter method for the COM property "SenderIdType"
   * </p>
   * @param plSenderIdType Mandatory int parameter.
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(53)
  void senderIdType(
    int plSenderIdType);


  /**
   * <p>
   * Sends the message to the destination queue with the optional use of a transaction parameter.
   * </p>
   * @param destinationQueue Mandatory kjd.microsoft.msmq.mqoa.IMSMQQueue2 parameter.
   * @param transaction Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1610743855) //= 0x6002002f. The runtime will prefer the VTID if present
  @VTID(54)
  void send(
    kjd.microsoft.msmq.mqoa.IMSMQQueue2 destinationQueue,
    @Optional java.lang.Object transaction);


  /**
   * <p>
   * Retrieves the security context information needed to attach a certificate to the message.
   * </p>
   */

  @DISPID(1610743856) //= 0x60020030. The runtime will prefer the VTID if present
  @VTID(55)
  void attachCurrentSecurityContext();


  /**
   * <p>
   * Returns the the wire format used to send the message.
   * </p>
   * <p>
   * Getter method for the COM property "SenderVersion"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(56)
  int senderVersion();


  /**
   * <p>
   * Sets/returns additional application-defined information that is associated with the message.
   * </p>
   * <p>
   * Getter method for the COM property "Extension"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(57)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object extension();


  /**
   * <p>
   * Sets/returns additional application-defined information that is associated with the message.
   * </p>
   * <p>
   * Setter method for the COM property "Extension"
   * </p>
   * @param pvarExtension Mandatory java.lang.Object parameter.
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(58)
  void extension(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pvarExtension);


  /**
   * <p>
   * Sets/returns a value indicating whether some message properties typically set by Message Queuing were generated and set by the sending application.
   * </p>
   * <p>
   * Getter method for the COM property "ConnectorTypeGuid"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(59)
  java.lang.String connectorTypeGuid();


  /**
   * <p>
   * Sets/returns a value indicating whether some message properties typically set by Message Queuing were generated and set by the sending application.
   * </p>
   * <p>
   * Setter method for the COM property "ConnectorTypeGuid"
   * </p>
   * @param pbstrGuidConnectorType Mandatory java.lang.String parameter.
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(60)
  void connectorTypeGuid(
    java.lang.String pbstrGuidConnectorType);


  /**
   * <p>
   * Sets/returns the transaction status queue on the source computer.
   * </p>
   * <p>
   * Getter method for the COM property "TransactionStatusQueueInfo"
   * </p>
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQQueueInfo2
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(61)
  kjd.microsoft.msmq.mqoa.IMSMQQueueInfo2 transactionStatusQueueInfo();


  /**
   * <p>
   * Sets/returns the symmetric key used to encrypt messages.
   * </p>
   * <p>
   * Getter method for the COM property "DestinationSymmetricKey"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(62)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object destinationSymmetricKey();


  /**
   * <p>
   * Sets/returns the symmetric key used to encrypt messages.
   * </p>
   * <p>
   * Setter method for the COM property "DestinationSymmetricKey"
   * </p>
   * @param pvarDestSymmKey Mandatory java.lang.Object parameter.
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(63)
  void destinationSymmetricKey(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pvarDestSymmKey);


  /**
   * <p>
   * Sets/returns the specifies the MSMQ 1.0 signature or application-generated digital signature that is attached to the message.
   * </p>
   * <p>
   * Getter method for the COM property "Signature"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(64)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object signature();


  /**
   * <p>
   * Sets/returns the specifies the MSMQ 1.0 signature or application-generated digital signature that is attached to the message.
   * </p>
   * <p>
   * Setter method for the COM property "Signature"
   * </p>
   * @param pvarSignature Mandatory java.lang.Object parameter.
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(65)
  void signature(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pvarSignature);


  /**
   * <p>
   * Sets/returns the type of cryptographic service provider used to generate the digital signature attached to the message.
   * </p>
   * <p>
   * Getter method for the COM property "AuthenticationProviderType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(66)
  int authenticationProviderType();


  /**
   * <p>
   * Sets/returns the type of cryptographic service provider used to generate the digital signature attached to the message.
   * </p>
   * <p>
   * Setter method for the COM property "AuthenticationProviderType"
   * </p>
   * @param plAuthProvType Mandatory int parameter.
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(67)
  void authenticationProviderType(
    int plAuthProvType);


  /**
   * <p>
   * Sets/returns the name of the cryptographic provider used to generate the digital signature attached to the message.
   * </p>
   * <p>
   * Getter method for the COM property "AuthenticationProviderName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(68)
  java.lang.String authenticationProviderName();


  /**
   * <p>
   * Sets/returns the name of the cryptographic provider used to generate the digital signature attached to the message.
   * </p>
   * <p>
   * Setter method for the COM property "AuthenticationProviderName"
   * </p>
   * @param pbstrAuthProvName Mandatory java.lang.String parameter.
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(69)
  void authenticationProviderName(
    java.lang.String pbstrAuthProvName);


  /**
   * <p>
   * Sets/returns an array of bytes containing the sender's identifier in the message.
   * </p>
   * <p>
   * Setter method for the COM property "SenderId"
   * </p>
   * @param pvarSenderId Mandatory java.lang.Object parameter.
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(70)
  void senderId(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pvarSenderId);


  /**
   * <p>
   * Returns one of the message classes defined by the MQMSGCLASS enumeration.
   * </p>
   * <p>
   * Getter method for the COM property "MsgClass"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(71)
  int msgClass();


  /**
   * <p>
   * Returns one of the message classes defined by the MQMSGCLASS enumeration.
   * </p>
   * <p>
   * Setter method for the COM property "MsgClass"
   * </p>
   * @param plMsgClass Mandatory int parameter.
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(72)
  void msgClass(
    int plMsgClass);


  /**
   * <p>
   * Getter method for the COM property "Properties"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(73)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject properties();


  /**
   * <p>
   * Returns an identifier indicating which transaction sent the message.
   * </p>
   * <p>
   * Getter method for the COM property "TransactionId"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(74)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object transactionId();


  /**
   * <p>
   * Returns a value indicating whether the message was the first message sent in a transaction (1) or not (0).
   * </p>
   * <p>
   * Getter method for the COM property "IsFirstInTransaction"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
  @VTID(75)
  short isFirstInTransaction();


  /**
   * <p>
   * Returns a value indicating whether the message was the last message sent in a transaction (1) or not (0).
   * </p>
   * <p>
   * Getter method for the COM property "IsLastInTransaction"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(76)
  short isLastInTransaction();


  /**
   * <p>
   * Sets/returns the response queue for the message.
   * </p>
   * <p>
   * Getter method for the COM property "ResponseQueueInfo"
   * </p>
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQQueueInfo2
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(77)
  kjd.microsoft.msmq.mqoa.IMSMQQueueInfo2 responseQueueInfo();


  /**
   * <p>
   * Sets/returns the response queue for the message.
   * </p>
   * <p>
   * Setter method for the COM property "ResponseQueueInfo"
   * </p>
   * @param ppqinfoResponse Mandatory kjd.microsoft.msmq.mqoa.IMSMQQueueInfo2 parameter.
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(78)
  void responseQueueInfo(
    kjd.microsoft.msmq.mqoa.IMSMQQueueInfo2 ppqinfoResponse);


  /**
   * <p>
   * Sets/returns the administration queue for the message.
   * </p>
   * <p>
   * Getter method for the COM property "AdminQueueInfo"
   * </p>
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQQueueInfo2
   */

  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
  @VTID(79)
  kjd.microsoft.msmq.mqoa.IMSMQQueueInfo2 adminQueueInfo();


  /**
   * <p>
   * Sets/returns the administration queue for the message.
   * </p>
   * <p>
   * Setter method for the COM property "AdminQueueInfo"
   * </p>
   * @param ppqinfoAdmin Mandatory kjd.microsoft.msmq.mqoa.IMSMQQueueInfo2 parameter.
   */

  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
  @VTID(80)
  void adminQueueInfo(
    kjd.microsoft.msmq.mqoa.IMSMQQueueInfo2 ppqinfoAdmin);


  /**
   * <p>
   * Returns one of the authentication levels defined by the MQMSGAUTHENTICATION enumeration for the message in the destination queue.
   * </p>
   * <p>
   * Getter method for the COM property "ReceivedAuthenticationLevel"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(43) //= 0x2b. The runtime will prefer the VTID if present
  @VTID(81)
  short receivedAuthenticationLevel();


  // Properties:
}
