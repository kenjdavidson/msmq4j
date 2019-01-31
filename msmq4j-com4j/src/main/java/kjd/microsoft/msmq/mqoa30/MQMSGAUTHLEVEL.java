package kjd.microsoft.msmq.mqoa30  ;

import com4j.*;

/**
 * <p>
 * Enumerates the authentication levels for a message on sending.
 * </p>
 */
public enum MQMSGAUTHLEVEL implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  MQMSG_AUTH_LEVEL_NONE(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  MQMSG_AUTH_LEVEL_ALWAYS(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  MQMSG_AUTH_LEVEL_MSMQ10(2),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  MQMSG_AUTH_LEVEL_SIG10(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  MQMSG_AUTH_LEVEL_MSMQ20(4),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  MQMSG_AUTH_LEVEL_SIG20(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  MQMSG_AUTH_LEVEL_SIG30(8),
  ;

  private final int value;
  MQMSGAUTHLEVEL(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
