package kjd.microsoft.msmq.mqoa  ;

import com4j.*;

/**
 * <p>
 * Enumerates the access (send, peek, receive) modes for an open queue.
 * </p>
 */
public enum MQACCESS implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  MQ_RECEIVE_ACCESS(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  MQ_SEND_ACCESS(2),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  MQ_PEEK_ACCESS(32),
  /**
   * <p>
   * The value of this constant is 128
   * </p>
   */
  MQ_ADMIN_ACCESS(128),
  /**
   * <p>
   * The value of this constant is 129
   * </p>
   */
  MQ_PEEK_ADMIN_ACCESS(32 | 128),
  /**
   * <p>
   * The value of this constant is 129
   * </p>
   */
  MQ_RECEIVE_ADMIN_ACCESS(1 | 128)
  ;

  private final int value;
  MQACCESS(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
