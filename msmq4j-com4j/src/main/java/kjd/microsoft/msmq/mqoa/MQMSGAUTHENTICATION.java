package kjd.microsoft.msmq.mqoa  ;

import com4j.*;

/**
 * <p>
 * Enumerates the authentication levels of a delivered message.
 * </p>
 */
public enum MQMSGAUTHENTICATION implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  MQMSG_AUTHENTICATION_NOT_REQUESTED(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  MQMSG_AUTHENTICATION_REQUESTED(1),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  MQMSG_AUTHENTICATED_SIG10(1),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  MQMSG_AUTHENTICATION_REQUESTED_EX(3),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  MQMSG_AUTHENTICATED_SIG20(3),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  MQMSG_AUTHENTICATED_SIG30(5),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  MQMSG_AUTHENTICATED_SIGXML(9),
  ;

  private final int value;
  MQMSGAUTHENTICATION(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
