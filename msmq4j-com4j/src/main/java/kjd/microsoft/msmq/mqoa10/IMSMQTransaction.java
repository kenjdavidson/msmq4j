package kjd.microsoft.msmq.mqoa10  ;

import com4j.*;

/**
 * Exposes properties that specify an underlying MS DTC external transaction object or internal transaction object and the standard ITransaction::Commit and Abort methods.
 */
@IID("{D7D6E07F-DCCD-11D0-AA4B-0060970DEBAE}")
public interface IMSMQTransaction extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Returns the underlying transaction object created by the transaction dispenser.
   * </p>
   * <p>
   * Getter method for the COM property "Transaction"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  int transaction();


  /**
   * <p>
   * Commits the Message Queuing internal transaction or MS DTC external transaction.
   * </p>
   * @param fRetaining Optional parameter. Default value is com4j.Variant.getMissing()
   * @param grfTC Optional parameter. Default value is com4j.Variant.getMissing()
   * @param grfRM Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  void commit(
    @Optional java.lang.Object fRetaining,
    @Optional java.lang.Object grfTC,
    @Optional java.lang.Object grfRM);


  /**
   * <p>
   * Aborts the Message Queuing internal transaction or MS DTC external transaction.
   * </p>
   * @param fRetaining Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fAsync Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  void abort(
    @Optional java.lang.Object fRetaining,
    @Optional java.lang.Object fAsync);


  // Properties:
}
