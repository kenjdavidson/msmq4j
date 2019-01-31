package kjd.microsoft.msmq.mqoa  ;

import com4j.*;

/**
 * <p>
 * Enumerates the default values for message and queue properties.
 * </p>
 */
public enum MQDEFAULT implements ComEnum {
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  DEFAULT_M_PRIORITY(3),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  DEFAULT_M_DELIVERY(0),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  DEFAULT_M_ACKNOWLEDGE(0),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  DEFAULT_M_JOURNAL(0),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  DEFAULT_M_APPSPECIFIC(0),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  DEFAULT_M_PRIV_LEVEL(0),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  DEFAULT_M_AUTH_LEVEL(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  DEFAULT_M_SENDERID_TYPE(1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  DEFAULT_Q_JOURNAL(0),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  DEFAULT_Q_BASEPRIORITY(0),
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  DEFAULT_Q_QUOTA(-1),
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  DEFAULT_Q_JOURNAL_QUOTA(-1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  DEFAULT_Q_TRANSACTION(0),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  DEFAULT_Q_AUTHENTICATE(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  DEFAULT_Q_PRIV_LEVEL(1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  DEFAULT_M_LOOKUPID(0),
  ;

  private final int value;
  MQDEFAULT(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
