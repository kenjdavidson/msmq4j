package kjd.microsoft.msmq.mqoa20  ;

import com4j.*;

/**
 * Exposes properties that return information about the Message Queuing service on a computer and methods that perform general configurational tasks.
 */
@IID("{12A30900-7300-11D2-B0E6-00E02C074F6B}")
public interface IMSMQApplication2 extends kjd.microsoft.msmq.mqoa20.IMSMQApplication {
  // Methods:
  /**
   * <p>
   * Method used to register a user certificate in Active Directory Domain Services.
   * </p>
   * @param flags Optional parameter. Default value is com4j.Variant.getMissing()
   * @param externalCertificate Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1610809344) //= 0x60030000. The runtime will prefer the VTID if present
  @VTID(8)
  void registerCertificate(
    @Optional java.lang.Object flags,
    @Optional java.lang.Object externalCertificate);


  /**
   * <p>
   * Returns the name of a computer specified by its globally unique identifier (GUID).
   * </p>
   * @param bstrGuid Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809345) //= 0x60030001. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String machineNameOfMachineId(
    java.lang.String bstrGuid);


  /**
   * <p>
   * Returns the major version number of Message Queuing running on the computer.
   * </p>
   * <p>
   * Getter method for the COM property "MSMQVersionMajor"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  short msmqVersionMajor();


  /**
   * <p>
   * Returns the minor version number of Message Queuing running on the computer.
   * </p>
   * <p>
   * Getter method for the COM property "MSMQVersionMinor"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  short msmqVersionMinor();


  /**
   * <p>
   * Returns the build version number of Message Queuing running on the computer.
   * </p>
   * <p>
   * Getter method for the COM property "MSMQVersionBuild"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  short msmqVersionBuild();


  /**
   * <p>
   * Returns a Boolean indicating whether the Message Queuing service on the computer is configured to use Active Directory Domain Services and is operating in domain or offline mode.
   * </p>
   * <p>
   * Getter method for the COM property "IsDsEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  boolean isDsEnabled();


  /**
   * <p>
   * Getter method for the COM property "Properties"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(14)
  @DefaultMethod
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject properties();


  // Properties:
}
