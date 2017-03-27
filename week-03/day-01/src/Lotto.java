import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by markovich on 2017.03.27..
 */
public class Lotto {
  public static void main(String[] args) {
   // makeTempFileWithUsefulData(parseUsefulDataFromInput("otos.txt"));
   // writeTemp2(readIntsFromATextFile("temp.txt"));
   // System.out.println(readThePerfectOnes("temp2.txt"));
   // readThePerfectOnes("temp2.txt");
  }

  public static List<String> parseUsefulDataFromInput(String inputFile) {
    List<String> winnerNums = new ArrayList<>();
    try {
      for (String line: Files.readAllLines(Paths.get(inputFile))) {
        winnerNums.add(line.substring(line.lastIndexOf(("Ft")) + 3));
      }
    } catch (IOException e) {
      winnerNums.add("Ooops something went wrong, during the reading");
    }
    return winnerNums;
  }

  public static void makeTempFileWithUsefulData(List<String> goesToTemp) {
    Path tempPath = Paths.get("temp.txt");
    try{
        Files.write(tempPath, goesToTemp);
    } catch (IOException e) {
      System.out.println("Oops something went wrong");
    }
  }

  public static String readIntsFromATextFile(String path) {
    List<String> winnerNumbersAsStrings = new ArrayList<String>();
    try {
      File file = new File(path);
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        winnerNumbersAsStrings.add(scanner.nextLine());
      }
    } catch (FileNotFoundException ex) {
      System.out.println("Wrong!");
    }
    StringBuilder winnerNumbersAsStringBuilder = new StringBuilder();

    for (String s : winnerNumbersAsStrings)
      winnerNumbersAsStringBuilder.append(s+" ");


    String winnerNumbersAsOneString = winnerNumbersAsStringBuilder.toString();

    return winnerNumbersAsOneString.replaceAll(";", " ");
  }

  public static void writeTemp2(String stringToWrite) {
     try {
       BufferedWriter writer = new BufferedWriter( new FileWriter("temp2.txt"));
       writer.write(stringToWrite);
       writer.close();
     } catch (IOException e) {
       System.out.println("Wrong!");
     }
  }

  public static void readThePerfectOnes(String path) {
    List<Integer> winnerNumbersList = new ArrayList<Integer>();
    HashMap bestFive = new HashMap();
    try {
      File file = new File(path);
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextInt()) {
     //   bestFive.put(scanner.nextInt());
      }
    } catch (FileNotFoundException ex) {
      System.out.println("Wrong!");
    }
  }
}
