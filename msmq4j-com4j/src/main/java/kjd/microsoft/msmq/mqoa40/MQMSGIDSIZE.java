package kjd.microsoft.msmq.mqoa40  ;

import com4j.*;

/**
 * <p>
 * Enumerates the identifier sizes for a message.
 * </p>
 */
public enum MQMSGIDSIZE implements ComEnum {
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  MQMSG_MSGID_SIZE(20),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  MQMSG_CORRELATIONID_SIZE(20),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  MQMSG_XACTID_SIZE(20),
  ;

  private final int value;
  MQMSGIDSIZE(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
