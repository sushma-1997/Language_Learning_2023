public class PrimitiveDataTypes {
  public static void main(String[] args) {
    // Byte data type
    byte myByte = 100;
    System.out.println("Byte: " + myByte);

    // Short data type
    short myShort = 10000;
    System.out.println("Short: " + myShort);

    // Integer data type
    int myInt = 100000;
    System.out.println("Integer: " + myInt);

    // Long data type
    long myLong = 10000000000L;
    System.out.println("Long: " + myLong);

    // Float data type
    float myFloat = 10.5f;
    System.out.println("Float: " + myFloat);

    // Double data type
    double myDouble = 20.5;
    System.out.println("Double: " + myDouble);

    // Character data type
    char myChar = 'A';
    System.out.println("Character: " + myChar);

    // Boolean data type
    boolean myBoolean = true;
    System.out.println("Boolean: " + myBoolean);
    
    //primitive data types value ranges
    int myIntValue = Integer.MIN_VALUE, myIntMaxValue = Integer.MAX_VALUE; 
    byte myByteValue = Byte.MIN_VALUE, myByteMaxValue = Byte.MAX_VALUE; 
    short myShortValue = Short.MIN_VALUE, myShortMaxValue = Short.MAX_VALUE; 
    long myLongValue = Long.MIN_VALUE, myLongMaxValue = Long.MAX_VALUE; 
    
    System.out.println("Integer minimum value: " + myIntValue);
    System.out.println("Integer maximum value: " + myIntMaxValue);
    System.out.println("Byte minimum value: " + myByteValue);
    System.out.println("Byte maximum value: " + myByteMaxValue);
    System.out.println("Short minimum value: " + myShortValue);
    System.out.println("Short maximum value: " + myShortMaxValue);
    System.out.println("Long minimum value: " + myLongValue);
    System.out.println("Long maximum value: " + myLongMaxValue);
  }
}

