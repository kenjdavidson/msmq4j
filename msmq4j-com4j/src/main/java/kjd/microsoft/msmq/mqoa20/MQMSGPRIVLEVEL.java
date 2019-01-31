package kjd.microsoft.msmq.mqoa20  ;

import com4j.*;

/**
 * <p>
 * Enumerates the privacy levels for a message.
 * </p>
 */
public enum MQMSGPRIVLEVEL implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  MQMSG_PRIV_LEVEL_NONE(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  MQMSG_PRIV_LEVEL_BODY(1),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  MQMSG_PRIV_LEVEL_BODY_BASE(1),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  MQMSG_PRIV_LEVEL_BODY_ENHANCED(3),
  ;

  private final int value;
  MQMSGPRIVLEVEL(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
