package kjd.microsoft.msmq.mqoa30  ;

import com4j.*;

/**
 * Exposes properties that return information about the Message Queuing service on a computer and methods that perform general configurational tasks.
 */
@IID("{EBA96B1F-2168-11D3-898C-00E02C074F6B}")
public interface IMSMQApplication3 extends kjd.microsoft.msmq.mqoa30.IMSMQApplication2 {
  // Methods:
  /**
   * <p>
   * Returns an array of format names of all active queues on the local computer.
   * </p>
   * <p>
   * Getter method for the COM property "ActiveQueues"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object activeQueues();


  /**
   * <p>
   * Returns an array of path names of all private queues on the local computer.
   * </p>
   * <p>
   * Getter method for the COM property "PrivateQueues"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object privateQueues();


  /**
   * <p>
   * Returns the name of the directory service server.
   * </p>
   * <p>
   * Getter method for the COM property "DirectoryServiceServer"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String directoryServiceServer();


  /**
   * <p>
   * Returns a Boolean indicating whether the queue manager on the computer has been disconnected from the network by MSMQApplication.Disconnect, by the equivalent API function call, or by taking Message Queuing offline in the user interface.
   * </p>
   * <p>
   * Getter method for the COM property "IsConnected"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(18)
  boolean isConnected();


  /**
   * <p>
   * Returns the number of message bytes currently stored in all queues on the computer.
   * </p>
   * <p>
   * Getter method for the COM property "BytesInAllQueues"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object bytesInAllQueues();


  /**
   * <p>
   * Returns the name of the computer used to initialize the object.
   * </p>
   * <p>
   * Setter method for the COM property "Machine"
   * </p>
   * @param pbstrMachine Mandatory java.lang.String parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(20)
  void machine(
    java.lang.String pbstrMachine);


  /**
   * <p>
   * Returns the name of the computer used to initialize the object.
   * </p>
   * <p>
   * Getter method for the COM property "Machine"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String machine();


  /**
   * <p>
   * Connects the queue manager to the network and to the directory service server.
   * </p>
   */

  @DISPID(1610874887) //= 0x60040007. The runtime will prefer the VTID if present
  @VTID(22)
  void connect();


  /**
   * <p>
   * Disconnects the queue manager from the network and the directory service server.
   * </p>
   */

  @DISPID(1610874888) //= 0x60040008. The runtime will prefer the VTID if present
  @VTID(23)
  void disconnect();


  /**
   * <p>
   * Cleans up empty message files on the local computer.
   * </p>
   */

  @DISPID(1610874889) //= 0x60040009. The runtime will prefer the VTID if present
  @VTID(24)
  void tidy();


  // Properties:
}
