package kjd.microsoft.msmq.mqoa20  ;

import com4j.*;

@IID("{D7AB3341-C9D3-11D1-BB47-0080C7C5A2C0}")
public interface IMSMQPrivateEvent extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Hwnd"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  int hwnd();


  /**
   * @param pq Mandatory kjd.microsoft.msmq.mqoa20.IMSMQQueue parameter.
   * @param msgcursor Mandatory int parameter.
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  void fireArrivedEvent(
    kjd.microsoft.msmq.mqoa20.IMSMQQueue pq,
    int msgcursor);


  /**
   * @param pq Mandatory kjd.microsoft.msmq.mqoa20.IMSMQQueue parameter.
   * @param hrStatus Mandatory int parameter.
   * @param msgcursor Mandatory int parameter.
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  void fireArrivedErrorEvent(
    kjd.microsoft.msmq.mqoa20.IMSMQQueue pq,
    int hrStatus,
    int msgcursor);


  // Properties:
}
