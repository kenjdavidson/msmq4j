package kjd.microsoft.msmq.mqoa30  ;

import com4j.*;

/**
 * Exposes a lookup method that is used to locate public queues.
 */
@IID("{EBA96B0E-2168-11D3-898C-00E02C074F6B}")
public interface IMSMQQuery2 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Returns a collection of public queues that match the specified search criteria.
   * </p>
   * @param queueGuid Optional parameter. Default value is com4j.Variant.getMissing()
   * @param serviceTypeGuid Optional parameter. Default value is com4j.Variant.getMissing()
   * @param label Optional parameter. Default value is com4j.Variant.getMissing()
   * @param createTime Optional parameter. Default value is com4j.Variant.getMissing()
   * @param modifyTime Optional parameter. Default value is com4j.Variant.getMissing()
   * @param relServiceType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param relLabel Optional parameter. Default value is com4j.Variant.getMissing()
   * @param relCreateTime Optional parameter. Default value is com4j.Variant.getMissing()
   * @param relModifyTime Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa30.IMSMQQueueInfos2
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  kjd.microsoft.msmq.mqoa30.IMSMQQueueInfos2 lookupQueue(
    @Optional java.lang.Object queueGuid,
    @Optional java.lang.Object serviceTypeGuid,
    @Optional java.lang.Object label,
    @Optional java.lang.Object createTime,
    @Optional java.lang.Object modifyTime,
    @Optional java.lang.Object relServiceType,
    @Optional java.lang.Object relLabel,
    @Optional java.lang.Object relCreateTime,
    @Optional java.lang.Object relModifyTime);


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
