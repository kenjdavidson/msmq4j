package kjd.microsoft.msmq.mqoa40  ;

import com4j.*;

/**
 * Exposes a method that initiates a new internal transaction and returns an MSMQ transaction object representing the new underlying transaction object.
 */
@IID("{D7D6E083-DCCD-11D0-AA4B-0060970DEBAE}")
public interface IMSMQTransactionDispenser extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Initiates a new transaction and returns an MSMQ transaction object representing the new underlying transaction object created by the transaction dispenser.
   * </p>
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa40.IMSMQTransaction
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  kjd.microsoft.msmq.mqoa40.IMSMQTransaction beginTransaction();


  // Properties:
}
