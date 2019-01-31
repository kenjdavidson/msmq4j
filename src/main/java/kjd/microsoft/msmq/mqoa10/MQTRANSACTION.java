package kjd.microsoft.msmq.mqoa10  ;

import com4j.*;

/**
 * <p>
 * Enumerates the transaction options when sending or receiving a message.
 * </p>
 */
public enum MQTRANSACTION {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  MQ_NO_TRANSACTION, // 0
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  MQ_MTS_TRANSACTION, // 1
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  MQ_XA_TRANSACTION, // 2
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  MQ_SINGLE_MESSAGE, // 3
}
