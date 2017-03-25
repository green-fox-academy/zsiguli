import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.Scanner;

/**
 * Created by markovich on 2017.03.25..
 */
public class Calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double result = 0;

    System.out.println("Please type in the expression:");
    String inputOperation = scanner.next();
    double inputFirstNumber = scanner.nextDouble();
    double inputSecondNumber = scanner.nextDouble();
    
    System.out.println(result);
  }
}
