package kjd.microsoft.msmq.mqoa30  ;

/**
 * <p>
 * Enumerates the possible queue states.
 * </p>
 */
public enum QUEUE_STATE {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  MQ_QUEUE_STATE_LOCAL_CONNECTION, // 0
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  MQ_QUEUE_STATE_DISCONNECTED, // 1
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  MQ_QUEUE_STATE_WAITING, // 2
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  MQ_QUEUE_STATE_NEEDVALIDATE, // 3
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  MQ_QUEUE_STATE_ONHOLD, // 4
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  MQ_QUEUE_STATE_NONACTIVE, // 5
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  MQ_QUEUE_STATE_CONNECTED, // 6
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  MQ_QUEUE_STATE_DISCONNECTING, // 7
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  MQ_QUEUE_STATE_LOCKED, // 8
}
