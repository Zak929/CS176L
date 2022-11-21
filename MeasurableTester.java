import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;
/**
   This program demonstrates the measurable Country class.
*/
public class MeasurableTester {
	 
	 public static void main(String[] args) {
     
	  //Countries
	  System.out.println("Countries Data");
	  Measurable[] countries = new Measurable[3];
      countries[0] = new Country("Bangaldesh", 56156);
      countries[1] = new Country("United States", 350000);
      countries[2] = new Country("Ireland", 73129);
      double avg=Data.average(countries);
      System.out.println("Average area: " + avg);
      System.out.println("Expected: 159761");
      System.out.println("");
      double maxData = Data.max(countries);
      System.out.println("Maximum area: " + maxData);
      System.out.println("Expected: 350000");
      System.out.println("");
      double minData = Data.min(countries);
      System.out.println("Minimum area: " + minData);
      System.out.println("Expected: 56156");
      System.out.println("");
     
      //Bank Accounts
      System.out.println("Bank account data");
      Measurable[] bank = new Measurable[3];
      bank[0] = new BankAccount(176220);
      bank[1] = new BankAccount(513120);
      bank[2] = new BankAccount(30510);
      avg=Data.average(bank);
      System.out.println("Average balance: " + avg);
      System.out.println("Expected: 239950");
      System.out.println("");
      maxData = Data.max(bank);
      System.out.println("Maximum balance: " + maxData);
      System.out.println("Expected: 513120");
      System.out.println("");
      minData = Data.min(bank);
      System.out.println("Minimum balance: " + minData);
      System.out.println("Expected: 30510");
      System.out.println("");
      
      //Quiz Scores
      System.out.println("Quiz data");
      Measurable[] quizzes = new Measurable[5];
      quizzes[0] = new Quiz(95);
      quizzes[1] = new Quiz(80);
      quizzes[2] = new Quiz(90);
      quizzes[3] = new Quiz(50);
      quizzes[4] = new Quiz(75);
      avg=Data.average(quizzes);
      System.out.println("Average score: " + avg);
      System.out.println("Expected: 78");
      System.out.println("");
      maxData = Data.max(quizzes);
      System.out.println("Maximum score: " + maxData);
      System.out.println("Expected: 95");
      System.out.println("");
      minData = Data.min(quizzes);
      System.out.println("Minimum score: " + minData);
      System.out.println("Expected: 50");
      System.out.println();
      
      Scanner in = new Scanner(System.in);
      System.out.print("Enter metric to use, 1 for maximum, 2 for minimum, 3 for average: ");
	  int whichMetric = in.nextInt();
	  String type = " ";
	  if (whichMetric == 1) {
		  type = "Maximum";
	  }
	  else if (whichMetric == 2) {
		  type = "Minimum";
	  }
	  else if (whichMetric == 3) {
		  type = "Average";
	  }
	  in.close();
      
      JPanel panel = new JPanel();
	  JFrame frame = new JFrame();
      frame.add(panel);
     
      JButton bankButton = new JButton("Get " + type + " Balance");
      panel.add(bankButton);
      ActionListener bankListener = new ButtonListener(bank,type);
      bankButton.addActionListener(bankListener);
    
      JButton countryButton = new JButton("Get " + type + " Area");
      panel.add(countryButton);
      ActionListener countryListener = new ButtonListener(countries, type);
      countryButton.addActionListener(countryListener);
      
      JButton quizButton = new JButton("Get " + type + " Score");
      panel.add(quizButton);
      ActionListener quizListener = new ButtonListener(quizzes, type);
      quizButton.addActionListener(quizListener);
  
      frame.setSize(200,150);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
      
      
}

