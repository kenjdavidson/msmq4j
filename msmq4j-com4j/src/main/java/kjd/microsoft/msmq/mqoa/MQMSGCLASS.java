package kjd.microsoft.msmq.mqoa  ;

import com4j.*;

/**
 * <p>
 * Enumerates the classes for a message.
 * </p>
 */
public enum MQMSGCLASS implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  MQMSG_CLASS_NORMAL(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  MQMSG_CLASS_REPORT(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  MQMSG_CLASS_ACK_REACH_QUEUE(2),
  /**
   * <p>
   * The value of this constant is 16384
   * </p>
   */
  MQMSG_CLASS_ACK_RECEIVE(16384),
  /**
   * <p>
   * The value of this constant is 32768
   * </p>
   */
  MQMSG_CLASS_NACK_BAD_DST_Q(32768),
  /**
   * <p>
   * The value of this constant is 32769
   * </p>
   */
  MQMSG_CLASS_NACK_PURGED(32769),
  /**
   * <p>
   * The value of this constant is 32770
   * </p>
   */
  MQMSG_CLASS_NACK_REACH_QUEUE_TIMEOUT(32770),
  /**
   * <p>
   * The value of this constant is 32771
   * </p>
   */
  MQMSG_CLASS_NACK_Q_EXCEED_QUOTA(32771),
  /**
   * <p>
   * The value of this constant is 32772
   * </p>
   */
  MQMSG_CLASS_NACK_ACCESS_DENIED(32772),
  /**
   * <p>
   * The value of this constant is 32773
   * </p>
   */
  MQMSG_CLASS_NACK_HOP_COUNT_EXCEEDED(32773),
  /**
   * <p>
   * The value of this constant is 32774
   * </p>
   */
  MQMSG_CLASS_NACK_BAD_SIGNATURE(32774),
  /**
   * <p>
   * The value of this constant is 32775
   * </p>
   */
  MQMSG_CLASS_NACK_BAD_ENCRYPTION(32775),
  /**
   * <p>
   * The value of this constant is 32776
   * </p>
   */
  MQMSG_CLASS_NACK_COULD_NOT_ENCRYPT(32776),
  /**
   * <p>
   * The value of this constant is 32777
   * </p>
   */
  MQMSG_CLASS_NACK_NOT_TRANSACTIONAL_Q(32777),
  /**
   * <p>
   * The value of this constant is 32778
   * </p>
   */
  MQMSG_CLASS_NACK_NOT_TRANSACTIONAL_MSG(32778),
  /**
   * <p>
   * The value of this constant is 32779
   * </p>
   */
  MQMSG_CLASS_NACK_UNSUPPORTED_CRYPTO_PROVIDER(32779),
  /**
   * <p>
   * The value of this constant is 32780
   * </p>
   */
  MQMSG_CLASS_NACK_SOURCE_COMPUTER_GUID_CHANGED(32780),
  /**
   * <p>
   * The value of this constant is 49152
   * </p>
   */
  MQMSG_CLASS_NACK_Q_DELETED(49152),
  /**
   * <p>
   * The value of this constant is 49153
   * </p>
   */
  MQMSG_CLASS_NACK_Q_PURGED(49153),
  /**
   * <p>
   * The value of this constant is 49154
   * </p>
   */
  MQMSG_CLASS_NACK_RECEIVE_TIMEOUT(49154),
  /**
   * <p>
   * The value of this constant is 49155
   * </p>
   */
  MQMSG_CLASS_NACK_RECEIVE_TIMEOUT_AT_SENDER(49155),
  ;

  private final int value;
  MQMSGCLASS(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
