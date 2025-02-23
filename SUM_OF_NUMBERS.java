import java.util.Scanner;
class SUM_OF_NUMBERS {
    public static void main(String[] args){
        int num1, num2;
        System.out.println("Enter first number :");//user entering first number 
        Scanner sc = new Scanner(System.in); // new operator creates an object 
        num1 = sc.nextInt(); //sc is reference of obj that takes input in the form of integer with the help of scanner class
        System.out.println("Enter second number :");//user entering second number
        num2 = sc.nextInt(); //taking 2nd integer
        System.out.println("sum of these numbers is :"+ (num1 + num2));//adding two numbers


    }
}