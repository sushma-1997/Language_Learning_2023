float myOtherFloatvalue = 5.25;
/*
|  Error:
|  incompatible types: possible lossy conversion from double to float
|  float myOtherFloatvalue = 5.25;*/

//we need to do casting for this as we did in the previous blog

float myOtherFloatvalue = (float)5.25;
//we did casting here to overcome the error but it's not recommended to do so (Output: myOtherFloatvalue ==> 5.25)




//CHALLENGE

/*The objective of this challenge, is to convert a given number of pounds to kilograms.

STEPS: 

1. Create a variable with the appropriate type, to store the number of pounds that we want to convert into kilograms.

2. Calculate kilograms, using the variable above, and store the result in a 2nd appropriately typed variable.

3. Print the result. Don't forget to use the conversion formula shown here: So, pause the video now. Type your code in, and give it a test run and see if you can get the result. */



double numberOfPounds = 200d;

//numberOfPounds ==> 200.0

double convertedKilograms = numberOfPounds * 0.45359237d;

//convertedKilograms ==> 90.718474

System.out.print("Converted kilograms = " + convertedKilograms);

//Converted kilograms = 90.718474



