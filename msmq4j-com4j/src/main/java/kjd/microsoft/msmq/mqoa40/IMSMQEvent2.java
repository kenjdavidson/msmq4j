package kjd.microsoft.msmq.mqoa40  ;

import com4j.*;

/**
 * Exposes events that are used for reading messages asynchronously.
 */
@IID("{EBA96B12-2168-11D3-898C-00E02C074F6B}")
public interface IMSMQEvent2 extends kjd.microsoft.msmq.mqoa40.IMSMQEvent {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Properties"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject properties();


  // Properties:
}
