package basicCalculator;

public class Calculator {
  /* This program is a basic calculator. It contains methods 
   * that adds, subtract, multiply, divides and finds the remainder.
   * Author: Guido Fajardo
   * Date: 06/12/2024
   */

    //this adds ints a and b and returns the result
    public int add(int a, int b){
      int result = a + b;
      return result;
    }
    //this method subtracts ints a and b and returns the result
    public int subtract(int a, int b){
      int result = a - b;
      return result;  
    }
    //this method multiplies ints a and b and returns the result
    public int multiply(int a, int b){
      int result = a * b;
      return result;
    }
    //this method divides ints a and b and returns the result
    public int divide(int a, int b) {
      if (b == 0) {
        System.out.println("Error: Division by zero");
        return 0;
      }
      return a / b;
    }
    //this method returns the remainder of ints a and b
    public int modulo(int a, int b){
      int result = a % b;
      return result;
    }

    public static void main(String[] args) {
      Calculator myCalculator = new Calculator();
      System.out.println(myCalculator.add(5,7));
      System.out.println(myCalculator.subtract(45,11));
      System.out.println(myCalculator.multiply(20,2));
      System.out.println(myCalculator.divide(6,2));
      System.out.println(myCalculator.modulo(7,2));
    }
}



