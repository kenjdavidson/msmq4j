package kjd.microsoft.msmq.mqoa40  ;

import com4j.*;

/**
 * <p>
 * Enumerates the maximum length for the message label.
 * </p>
 */
public enum MQMSGMAX implements ComEnum {
  /**
   * <p>
   * The value of this constant is 249
   * </p>
   */
  MQ_MAX_MSG_LABEL_LEN(249),
  ;

  private final int value;
  MQMSGMAX(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
