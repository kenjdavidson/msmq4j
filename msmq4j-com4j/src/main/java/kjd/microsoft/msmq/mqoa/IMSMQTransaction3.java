package kjd.microsoft.msmq.mqoa  ;

import com4j.*;

/**
 * Exposes properties that specify an underlying MS DTC external transaction object or internal transaction object and the standard ITransaction::Commit and Abort methods.
 */
@IID("{EBA96B13-2168-11D3-898C-00E02C074F6B}")
public interface IMSMQTransaction3 extends kjd.microsoft.msmq.mqoa.IMSMQTransaction2 {
  // Methods:
  /**
   * <p>
   * Returns the ITransaction interface on the underlying transaction object that is used by the MSMQTransaction object as a Variant (VT_UNKNOWN).
   * </p>
   * <p>
   * Getter method for the COM property "ITransaction"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object iTransaction();


  // Properties:
}
