package kjd.microsoft.msmq.mqoa40.events;

import com4j.*;

/**
 * Event dispinterface that supports asynchronous message notifications.
 */
@IID("{D7D6E078-DCCD-11D0-AA4B-0060970DEBAE}")
public abstract class _DMSMQEventEvents {
  // Methods:
  /**
   * <p>
   * Fired when MSMQQueue.EnableNotification has been called and a message is found or arrives at the applicable position in the specified queue.
   * </p>
   * @param queue Mandatory com4j.Com4jObject parameter.
   * @param cursor Mandatory int parameter.
   */

  @DISPID(0)
  @DefaultMethod
  public void arrived(
    com4j.Com4jObject queue,
    int cursor) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fired when MSMQQueue.EnableNotification has been called and an error is generated while the application waits for a message at the applicable position in the specified queue.
   * </p>
   * @param queue Mandatory com4j.Com4jObject parameter.
   * @param errorCode Mandatory int parameter.
   * @param cursor Mandatory int parameter.
   */

  @DISPID(1)
  public void arrivedError(
    com4j.Com4jObject queue,
    int errorCode,
    int cursor) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
