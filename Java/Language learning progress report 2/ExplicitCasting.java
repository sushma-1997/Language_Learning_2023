double myDouble = 9.78;
int myInt = (int) myDouble; // Explicit casting from double to int

/*It's important to be mindful when using explicit casting, as it can lead to data loss if the value being converted is too large to fit into the target data type. 
For example:*/

double myDouble = 9.78;
byte myByte = (byte) myDouble; // This will result in data loss, as the value of 9.78 cannot fit into a byte data type

//Here's another example of casting in Java:

double myDouble = 9.78;
float myFloat = (float) myDouble; // Explicit casting from double to float

//In this example, the value of 9.78 is being converted from a double data type to a float data type using explicit casting.
