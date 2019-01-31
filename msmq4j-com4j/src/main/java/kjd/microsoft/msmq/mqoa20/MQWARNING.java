package kjd.microsoft.msmq.mqoa20  ;

import com4j.*;

/**
 * <p>
 * Enumerates all Message Queuing warnings.
 * </p>
 */
public enum MQWARNING implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1074659329
   * </p>
   */
  MQ_INFORMATION_PROPERTY(1074659329),
  /**
   * <p>
   * The value of this constant is 1074659330
   * </p>
   */
  MQ_INFORMATION_ILLEGAL_PROPERTY(1074659330),
  /**
   * <p>
   * The value of this constant is 1074659331
   * </p>
   */
  MQ_INFORMATION_PROPERTY_IGNORED(1074659331),
  /**
   * <p>
   * The value of this constant is 1074659332
   * </p>
   */
  MQ_INFORMATION_UNSUPPORTED_PROPERTY(1074659332),
  /**
   * <p>
   * The value of this constant is 1074659333
   * </p>
   */
  MQ_INFORMATION_DUPLICATE_PROPERTY(1074659333),
  /**
   * <p>
   * The value of this constant is 1074659334
   * </p>
   */
  MQ_INFORMATION_OPERATION_PENDING(1074659334),
  /**
   * <p>
   * The value of this constant is 1074659337
   * </p>
   */
  MQ_INFORMATION_FORMATNAME_BUFFER_TOO_SMALL(1074659337),
  /**
   * <p>
   * The value of this constant is 1074659338
   * </p>
   */
  MQ_INFORMATION_INTERNAL_USER_CERT_EXIST(1074659338),
  /**
   * <p>
   * The value of this constant is 1074659339
   * </p>
   */
  MQ_INFORMATION_OWNER_IGNORED(1074659339),
  ;

  private final int value;
  MQWARNING(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
