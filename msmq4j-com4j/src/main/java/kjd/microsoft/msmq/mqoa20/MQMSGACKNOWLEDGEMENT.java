package kjd.microsoft.msmq.mqoa20  ;

import com4j.*;

/**
 * <p>
 * Enumerates the acknowledgement levels for a message.
 * </p>
 */
public enum MQMSGACKNOWLEDGEMENT implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  MQMSG_ACKNOWLEDGMENT_NONE(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  MQMSG_ACKNOWLEDGMENT_POS_ARRIVAL(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  MQMSG_ACKNOWLEDGMENT_POS_RECEIVE(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  MQMSG_ACKNOWLEDGMENT_NEG_ARRIVAL(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  MQMSG_ACKNOWLEDGMENT_NEG_RECEIVE(8),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  MQMSG_ACKNOWLEDGMENT_NACK_REACH_QUEUE(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  MQMSG_ACKNOWLEDGMENT_FULL_REACH_QUEUE(5),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  MQMSG_ACKNOWLEDGMENT_NACK_RECEIVE(12),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  MQMSG_ACKNOWLEDGMENT_FULL_RECEIVE(14),
  ;

  private final int value;
  MQMSGACKNOWLEDGEMENT(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
