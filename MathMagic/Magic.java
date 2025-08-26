public class Magic {
    /* This program is just to practice arithmetic in java.
     * It performs a math trick that will always return the number 3
     * no matter what number you start with.
     * Author: Guido Fajardo
     * Date: 06/12/2024
     */

	public static void main(String[] args) {
    //myNumber is the original number.

 // Uncomment the following block to see each step of the magic trick
  /*
    //myNumber is the original number.
    int myNumber = 4;
    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;

    System.out.println(stepSix);
	*/
    int myNumber = 10;
    // magicNumber calculates the magic number using the math trick formula
    int magicNumber = ((((((myNumber * myNumber) + myNumber) / myNumber) + 17) - myNumber) / 6);

    System.out.println(magicNumber);
	}
}