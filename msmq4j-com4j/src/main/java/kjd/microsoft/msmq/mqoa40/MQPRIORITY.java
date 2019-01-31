package kjd.microsoft.msmq.mqoa40  ;

import com4j.*;

/**
 * <p>
 * Enumerates the minimum and maximum queue priorities.
 * </p>
 */
public enum MQPRIORITY implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  MQ_MIN_PRIORITY(0),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  MQ_MAX_PRIORITY(7),
  ;

  private final int value;
  MQPRIORITY(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
