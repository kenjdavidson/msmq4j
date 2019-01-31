package kjd.microsoft.msmq.mqoa30  ;

import com4j.*;

/**
 * Exposes a method that initiates a new MS DTC external transaction and returns an MSMQ transaction object representing the new underlying transaction object.
 */
@IID("{EBA96B10-2168-11D3-898C-00E02C074F6B}")
public interface IMSMQCoordinatedTransactionDispenser2 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Initiates a new transaction and returns an MSMQ transaction object representing the new underlying transaction object created by the transaction dispenser.
   * </p>
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa30.IMSMQTransaction2
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  kjd.microsoft.msmq.mqoa30.IMSMQTransaction2 beginTransaction();


  /**
   * <p>
   * Getter method for the COM property "Properties"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject properties();


  // Properties:
}
