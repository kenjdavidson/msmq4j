package kjd.microsoft.msmq.mqoa30  ;

import com4j.*;

/**
 * Exposes a lookup method that is used to locate public queues.
 */
@IID("{D7D6E072-DCCD-11D0-AA4B-0060970DEBAE}")
public interface IMSMQQuery extends Com4jObject {
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
   * @return  Returns a value of type kjd.microsoft.msmq.mqoa30.IMSMQQueueInfos
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  kjd.microsoft.msmq.mqoa30.IMSMQQueueInfos lookupQueue(
    @Optional java.lang.Object queueGuid,
    @Optional java.lang.Object serviceTypeGuid,
    @Optional java.lang.Object label,
    @Optional java.lang.Object createTime,
    @Optional java.lang.Object modifyTime,
    @Optional java.lang.Object relServiceType,
    @Optional java.lang.Object relLabel,
    @Optional java.lang.Object relCreateTime,
    @Optional java.lang.Object relModifyTime);


  // Properties:
}
