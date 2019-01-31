package kjd.microsoft.msmq.mqoa40  ;

import com4j.*;

/**
 * Exposes properties that specify one or more queues and methods that open and close a destination object representing the queue or queues for sending messages.
 */
@IID("{EBA96B16-2168-11D3-898C-00E02C074F6B}")
public interface IMSMQDestination extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Opens the MSMQDestination object for sending messages to the queue or queues specified by the ADsPath, FormatName, or PathName property.
   * </p>
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  void open();


  /**
   * <p>
   * Closes the open MSMQDestination object.
   * </p>
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  void close();


  /**
   * <p>
   * Returns a Boolean indicating whether or not the MSMQDestination object is open for sending messages.
   * </p>
   * <p>
   * Getter method for the COM property "IsOpen"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  boolean isOpen();


  /**
   * <p>
   * Getter method for the COM property "IADs"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject iaDs();


  /**
   * <p>
   * Setter method for the COM property "IADs"
   * </p>
   * @param ppIADs Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  void iaDs(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject ppIADs);


  /**
   * <p>
   * Sets/returns the ADs path to a distribution list, public queue, or queue alias object stored in Active Directory Domain Services.
   * </p>
   * <p>
   * Getter method for the COM property "ADsPath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String aDsPath();


  /**
   * <p>
   * Sets/returns the ADs path to a distribution list, public queue, or queue alias object stored in Active Directory Domain Services.
   * </p>
   * <p>
   * Setter method for the COM property "ADsPath"
   * </p>
   * @param pbstrADsPath Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  void aDsPath(
    java.lang.String pbstrADsPath);


  /**
   * <p>
   * Sets/returns the path name of a public or private queue.
   * </p>
   * <p>
   * Getter method for the COM property "PathName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String pathName();


  /**
   * <p>
   * Sets/returns the path name of a public or private queue.
   * </p>
   * <p>
   * Setter method for the COM property "PathName"
   * </p>
   * @param pbstrPathName Mandatory java.lang.String parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(15)
  void pathName(
    java.lang.String pbstrPathName);


  /**
   * <p>
   * Sets/returns the format name of the queue or queues represented by the MSMQDestination object.
   * </p>
   * <p>
   * Getter method for the COM property "FormatName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String formatName();


  /**
   * <p>
   * Sets/returns the format name of the queue or queues represented by the MSMQDestination object.
   * </p>
   * <p>
   * Setter method for the COM property "FormatName"
   * </p>
   * @param pbstrFormatName Mandatory java.lang.String parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(17)
  void formatName(
    java.lang.String pbstrFormatName);


  /**
   * <p>
   * Getter method for the COM property "Destinations"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject destinations();


  /**
   * <p>
   * Setter method for the COM property "Destinations"
   * </p>
   * @param ppDestinations Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(19)
  void destinations(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject ppDestinations);


  /**
   * <p>
   * Getter method for the COM property "Properties"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(20)
  @DefaultMethod
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject properties();


  // Properties:
}
