package kjd.microsoft.msmq.mqoa20  ;

import com4j.*;

/**
 * <p>
 * Enumerates the various hashing and encryption algorithms.
 * </p>
 */
public enum MQCALG implements ComEnum {
  /**
   * <p>
   * The value of this constant is 32769
   * </p>
   */
  MQMSG_CALG_MD2(32769),
  /**
   * <p>
   * The value of this constant is 32770
   * </p>
   */
  MQMSG_CALG_MD4(32770),
  /**
   * <p>
   * The value of this constant is 32771
   * </p>
   */
  MQMSG_CALG_MD5(32771),
  /**
   * <p>
   * The value of this constant is 32772
   * </p>
   */
  MQMSG_CALG_SHA(32772),
  /**
   * <p>
   * The value of this constant is 32773
   * </p>
   */
  MQMSG_CALG_MAC(32773),
  /**
   * <p>
   * The value of this constant is 9216
   * </p>
   */
  MQMSG_CALG_RSA_SIGN(9216),
  /**
   * <p>
   * The value of this constant is 8704
   * </p>
   */
  MQMSG_CALG_DSS_SIGN(8704),
  /**
   * <p>
   * The value of this constant is 41984
   * </p>
   */
  MQMSG_CALG_RSA_KEYX(41984),
  /**
   * <p>
   * The value of this constant is 26113
   * </p>
   */
  MQMSG_CALG_DES(26113),
  /**
   * <p>
   * The value of this constant is 26114
   * </p>
   */
  MQMSG_CALG_RC2(26114),
  /**
   * <p>
   * The value of this constant is 26625
   * </p>
   */
  MQMSG_CALG_RC4(26625),
  /**
   * <p>
   * The value of this constant is 26626
   * </p>
   */
  MQMSG_CALG_SEAL(26626),
  ;

  private final int value;
  MQCALG(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
