package kjd.microsoft.msmq.mqoa30  ;

import com4j.*;

/**
 * <p>
 * Enumerates the flags that specify when an certificate is registered.
 * </p>
 */
public enum MQCERT_REGISTER implements ComEnum {
  /**
   * <p>
   * Register an internal or external certificate whenever MSMQApplication.RegisterCertificate is called.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  MQCERT_REGISTER_ALWAYS(1),
  /**
   * <p>
   * Register a new internal certificate only if none exists.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  MQCERT_REGISTER_IF_NOT_EXIST(2),
  ;

  private final int value;
  MQCERT_REGISTER(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
