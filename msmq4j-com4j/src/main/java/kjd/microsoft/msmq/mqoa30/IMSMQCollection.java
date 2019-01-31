package kjd.microsoft.msmq.mqoa30  ;

import com4j.*;

/**
 * Represents a collection of Variants and provides methods for accessing them through string keys.
 */
@IID("{0188AC2F-ECB3-4173-9779-635CA2039C72}")
public interface IMSMQCollection extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Returns the value of the specified element from the collection.
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object item(
    java.lang.Object index);


  /**
   * <p>
   * Returns the number of elements in the collection.
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  int count();


  /**
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(9)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
