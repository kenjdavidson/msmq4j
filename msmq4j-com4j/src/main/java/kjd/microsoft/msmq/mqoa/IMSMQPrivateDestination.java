package kjd.microsoft.msmq.mqoa  ;

import com4j.*;

@IID("{EBA96B17-2168-11D3-898C-00E02C074F6B}")
public interface IMSMQPrivateDestination extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Handle"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object handle();


  /**
   * <p>
   * Setter method for the COM property "Handle"
   * </p>
   * @param pvarHandle Mandatory java.lang.Object parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(8)
  void handle(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pvarHandle);


  // Properties:
}
