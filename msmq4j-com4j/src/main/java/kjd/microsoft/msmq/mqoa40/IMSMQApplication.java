package kjd.microsoft.msmq.mqoa40  ;

import com4j.*;

/**
 * Exposes properties that return information about the Message Queuing service on a computer and methods that perform general configurational tasks.
 */
@IID("{D7D6E085-DCCD-11D0-AA4B-0060970DEBAE}")
public interface IMSMQApplication extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Returns the globally unique identifier (GUID) for a specified computer, which can be used to create a private format name for a private queue or a machine format name for the computer journal or a dead-letter queue.
   * </p>
   * @param machineName Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String machineIdOfMachineName(
    java.lang.String machineName);


  // Properties:
}
