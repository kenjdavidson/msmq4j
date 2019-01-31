package kjd.microsoft.msmq.mqoa20  ;

import com4j.*;

/**
 * Exposes methods for enumerating the elements of a collection of public queues returned by MSMQQuery.LookupQueue.
 */
@IID("{EBA96B0F-2168-11D3-898C-00E02C074F6B}")
public interface IMSMQQueueInfos2 extends Com4jObject {
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
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa20.IMSMQQueueInfo2
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  kjd.microsoft.msmq.mqoa20.IMSMQQueueInfo2 next();


  /**
   * <p>
   * Getter method for the COM property "Properties"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject properties();


  // Properties:
}
