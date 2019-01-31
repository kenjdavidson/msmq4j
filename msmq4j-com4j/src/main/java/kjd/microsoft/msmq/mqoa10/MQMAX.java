package kjd.microsoft.msmq.mqoa10  ;

import com4j.*;

/**
 * <p>
 * Enumerates the maximum lengths for a queue label and path name.
 * </p>
 */
public enum MQMAX implements ComEnum {
  /**
   * <p>
   * The value of this constant is 124
   * </p>
   */
  MQ_MAX_Q_NAME_LEN(124),
  /**
   * <p>
   * The value of this constant is 124
   * </p>
   */
  MQ_MAX_Q_LABEL_LEN(124),
  ;

  private final int value;
  MQMAX(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
