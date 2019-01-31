package kjd.microsoft.msmq.mqoa  ;

import com4j.*;

/**
 * Exposes properties that define a queue and methods for creating, opening, and deleting the queue and for updating and retrieving its stored properties.
 */
@IID("{FD174A80-89CF-11D2-B0F2-00E02C074F6B}")
public interface IMSMQQueueInfo2 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Returns the identifier of the public queue.
   * </p>
   * <p>
   * Getter method for the COM property "QueueGuid"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  java.lang.String queueGuid();


  /**
   * <p>
   * Sets/returns an identifier indicating the type of service provided by the queue.
   * </p>
   * <p>
   * Getter method for the COM property "ServiceTypeGuid"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String serviceTypeGuid();


  /**
   * <p>
   * Sets/returns an identifier indicating the type of service provided by the queue.
   * </p>
   * <p>
   * Setter method for the COM property "ServiceTypeGuid"
   * </p>
   * @param pbstrGuidServiceType Mandatory java.lang.String parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  void serviceTypeGuid(
    java.lang.String pbstrGuidServiceType);


  /**
   * <p>
   * Sets/returns the label of the queue.
   * </p>
   * <p>
   * Getter method for the COM property "Label"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String label();


  /**
   * <p>
   * Sets/returns the label of the queue.
   * </p>
   * <p>
   * Setter method for the COM property "Label"
   * </p>
   * @param pbstrLabel Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  void label(
    java.lang.String pbstrLabel);


  /**
   * <p>
   * Sets/returns the path name (physical location) of the queue.
   * </p>
   * <p>
   * Getter method for the COM property "PathName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String pathName();


  /**
   * <p>
   * Sets/returns the path name (physical location) of the queue.
   * </p>
   * <p>
   * Setter method for the COM property "PathName"
   * </p>
   * @param pbstrPathName Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  void pathName(
    java.lang.String pbstrPathName);


  /**
   * <p>
   * Sets the format name used to identify the queue or returns the format name generated by MSMQ when the queue was created or an application-specified format name.
   * </p>
   * <p>
   * Getter method for the COM property "FormatName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String formatName();


  /**
   * <p>
   * Sets the format name used to identify the queue or returns the format name generated by MSMQ when the queue was created or an application-specified format name.
   * </p>
   * <p>
   * Setter method for the COM property "FormatName"
   * </p>
   * @param pbstrFormatName Mandatory java.lang.String parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  void formatName(
    java.lang.String pbstrFormatName);


  /**
   * <p>
   * Returns a value indicating whether the queue is transactional (1) or non-transactional (0).
   * </p>
   * <p>
   * Getter method for the COM property "IsTransactional"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  short isTransactional();


  /**
   * <p>
   * Sets/returns one of the privacy levels defined by the MQPRIVLEVEL enumeration for the queue.
   * </p>
   * <p>
   * Getter method for the COM property "PrivLevel"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(17)
  int privLevel();


  /**
   * <p>
   * Sets/returns one of the privacy levels defined by the MQPRIVLEVEL enumeration for the queue.
   * </p>
   * <p>
   * Setter method for the COM property "PrivLevel"
   * </p>
   * @param plPrivLevel Mandatory int parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(18)
  void privLevel(
    int plPrivLevel);


  /**
   * <p>
   * Sets/returns one of the journaling levels defined by the MQJOURNAL enumeration for the queue.
   * </p>
   * <p>
   * Getter method for the COM property "Journal"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(19)
  int journal();


  /**
   * <p>
   * Sets/returns one of the journaling levels defined by the MQJOURNAL enumeration for the queue.
   * </p>
   * <p>
   * Setter method for the COM property "Journal"
   * </p>
   * @param plJournal Mandatory int parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
  void journal(
    int plJournal);


  /**
   * <p>
   * Sets/returns the maximum size (in kilobytes) of the queue.
   * </p>
   * <p>
   * Getter method for the COM property "Quota"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(21)
  int quota();


  /**
   * <p>
   * Sets/returns the maximum size (in kilobytes) of the queue.
   * </p>
   * <p>
   * Setter method for the COM property "Quota"
   * </p>
   * @param plQuota Mandatory int parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(22)
  void quota(
    int plQuota);


  /**
   * <p>
   * Sets/returns the base priority for all messages sent to the public queue.
   * </p>
   * <p>
   * Getter method for the COM property "BasePriority"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  int basePriority();


  /**
   * <p>
   * Sets/returns the base priority for all messages sent to the public queue.
   * </p>
   * <p>
   * Setter method for the COM property "BasePriority"
   * </p>
   * @param plBasePriority Mandatory int parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(24)
  void basePriority(
    int plBasePriority);


  /**
   * <p>
   * Returns a Variant (Date) indicating the date and time when the queue was created.
   * </p>
   * <p>
   * Getter method for the COM property "CreateTime"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object createTime();


  /**
   * <p>
   * Returns a Variant (Date) indicating the date and time when the queue's properties were last modified.
   * </p>
   * <p>
   * Getter method for the COM property "ModifyTime"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(26)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object modifyTime();


  /**
   * <p>
   * Sets/returns one of the authentication levels defined by the MQAUTHENTICATE enumeration for the queue.
   * </p>
   * <p>
   * Getter method for the COM property "Authenticate"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(27)
  int authenticate();


  /**
   * <p>
   * Sets/returns one of the authentication levels defined by the MQAUTHENTICATE enumeration for the queue.
   * </p>
   * <p>
   * Setter method for the COM property "Authenticate"
   * </p>
   * @param plAuthenticate Mandatory int parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(28)
  void authenticate(
    int plAuthenticate);


  /**
   * <p>
   * Sets/returns the maximum size (in kilobytes) of the queue journal.
   * </p>
   * <p>
   * Getter method for the COM property "JournalQuota"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(29)
  int journalQuota();


  /**
   * <p>
   * Sets/returns the maximum size (in kilobytes) of the queue journal.
   * </p>
   * <p>
   * Setter method for the COM property "JournalQuota"
   * </p>
   * @param plJournalQuota Mandatory int parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(30)
  void journalQuota(
    int plJournalQuota);


  /**
   * <p>
   * Returns a value indicating whether everyone can read messages in the queue (1) or only the owner of the queue can read messages in it (0, the default).
   * </p>
   * <p>
   * Getter method for the COM property "IsWorldReadable"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(31)
  short isWorldReadable();


  /**
   * <p>
   * Creates a new queue with the path name set in PathName (required) and the values set by the optional IsWorldReadable (the default is False) and IsTransactional (the default is False) parameters.
   * </p>
   * @param isTransactional Optional parameter. Default value is com4j.Variant.getMissing()
   * @param isWorldReadable Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1610743833) //= 0x60020019. The runtime will prefer the VTID if present
  @VTID(32)
  void create(
    @Optional java.lang.Object isTransactional,
    @Optional java.lang.Object isWorldReadable);


  /**
   * <p>
   * Deletes the queue with the format name set in FormatName or the path name set in PathName.
   * </p>
   */

  @DISPID(1610743834) //= 0x6002001a. The runtime will prefer the VTID if present
  @VTID(33)
  void delete();


  /**
   * <p>
   * Opens the queue specified by the format name set in FormatName or by the path name set in PathName with the access and share modes specified, returning an MSMQQueue object.
   * </p>
   * @param access Mandatory int parameter.
   * @param shareMode Mandatory int parameter.
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa.IMSMQQueue2
   */

  @DISPID(1610743835) //= 0x6002001b. The runtime will prefer the VTID if present
  @VTID(34)
  kjd.microsoft.msmq.mqoa.IMSMQQueue2 open(
    int access,
    int shareMode);


  /**
   * <p>
   * Refreshes the properties of the object with with the values stored in the directory service (for public queues) or the local computer (for private queues).
   * </p>
   */

  @DISPID(1610743836) //= 0x6002001c. The runtime will prefer the VTID if present
  @VTID(35)
  void refresh();


  /**
   * <p>
   * Updates the directory service or the local computer with the current values of the object's properties.
   * </p>
   */

  @DISPID(1610743837) //= 0x6002001d. The runtime will prefer the VTID if present
  @VTID(36)
  void update();


  /**
   * <p>
   * Returns the DNS path name of the queue.
   * </p>
   * <p>
   * Getter method for the COM property "PathNameDNS"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(37)
  java.lang.String pathNameDNS();


  /**
   * <p>
   * Getter method for the COM property "Properties"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(38)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject properties();


  /**
   * <p>
   * Getter method for the COM property "Security"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(39)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object security();


  /**
   * <p>
   * Setter method for the COM property "Security"
   * </p>
   * @param pvarSecurity Mandatory java.lang.Object parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(40)
  void security(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pvarSecurity);


  // Properties:
}
