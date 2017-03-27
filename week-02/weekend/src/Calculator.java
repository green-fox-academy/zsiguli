import java.util.Scanner;

/**
 * Created by markovich on 2017.03.25..
 */
public class Calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type in the expression:");
    System.out.println("The reslult is: " +
            operation(scanner.next(), scanner.nextDouble(), scanner.nextDouble()));
  }

  public static double operation(String str, double num1, double num2) {
    double result = 0;
    switch (str) {
      case "+": result = num1 + num2;
      break;
      case "-": result = num1 - num2;
      break;
      case "*": result = num1 * num2;
      break;
      case "/": result = num1 / num2;
      break;
      case "%": result = num1 % num2;
    }
    return result;
  }
}
