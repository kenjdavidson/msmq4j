package kjd.microsoft.msmq.mqoa40  ;

import com4j.*;

/**
 * Exposes methods for enumerating the elements of a collection of public queues returned by MSMQQuery.LookupQueue.
 */
@IID("{D7D6E07D-DCCD-11D0-AA4B-0060970DEBAE}")
public interface IMSMQQueueInfos extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Returns the cursor to the start of the collection of queues returned by MSMQQuery.LookupQueue and returns the element at the cursor.
   * </p>
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  void reset();


  /**
   * <p>
   * Advances the cursor to the next element of the collection of queues returned by MSMQQuery.LookupQueue and returns the element at the cursor.
   * </p>
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa40.IMSMQQueueInfo
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  kjd.microsoft.msmq.mqoa40.IMSMQQueueInfo next();


  // Properties:
}
