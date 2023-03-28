public class Calculation {

 public static int subtract(int a, int b) {
 return a - b;
 }

 public static double divide(double a, double b) {
 return a / b;
 }

 public static int multiply(int a, int b) {
 return a * b;
 }

 public static void main(String[] args) {
 
 	int value1 = 10;
 	int value2= 5;

 	int result1 = subtract(value1, value2);
 	System.out.println("Subtraction Result: " + result1);

 	double result2 = divide(value1, value2);
 	System.out.println("Division Result: " + result2);

 	int result3 = multiply(value1, value2);
 	System.out.println("Multiplication Result: " + result3);
 }
}