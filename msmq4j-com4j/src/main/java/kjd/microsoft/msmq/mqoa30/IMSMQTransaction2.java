package kjd.microsoft.msmq.mqoa30  ;

import com4j.*;

/**
 * Exposes properties that specify an underlying MS DTC external transaction object or internal transaction object, an initialization method, and the standard ITransaction::Commit and Abort methods.
 */
@IID("{2CE0C5B0-6E67-11D2-B0E6-00E02C074F6B}")
public interface IMSMQTransaction2 extends kjd.microsoft.msmq.mqoa30.IMSMQTransaction {
  // Methods:
  /**
   * <p>
   * Initializes an MSMQ transaction object to represent an existing underlying transaction object.
   * </p>
   * @param varTransaction Mandatory java.lang.Object parameter.
   */

  @DISPID(1610809344) //= 0x60030000. The runtime will prefer the VTID if present
  @VTID(10)
  void initNew(
    @MarshalAs(NativeType.VARIANT) java.lang.Object varTransaction);


  /**
   * <p>
   * Getter method for the COM property "Properties"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject properties();


  // Properties:
}
