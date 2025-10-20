import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    //input 
    int ; 
    while (x > 0); 

    // 
    Scanner sc = new Scanner(System.in); // takes input 
    System.out.println("Enter positive numbers to add. Enter -1 to stop."); 
    int sum = 0; 
    int userInput = 0; 

    while (userInput != -1) // while the user input is NOT -1 
    {
      userInput = sc.nextInt();
      sum += userInput; // adds the input to sum 
    }
    sum ++; // when -1 is entered, added to sum --> add BACK the 1 
    System.out.println("The sum is" + sum); 




    // Problem 2 
    int N; 
    System.out.println("How many numbers do you want to enter?");
    N = sc.nextInt(); // N = the amount of numbers user wants to enter 
    int max = 0; 

    int counter = 0; 
    while (counter < N) 
    {
      userInput = sc.nextInt(); 
      // code
      if (userInput > max)
      {
        max = userInput; 
      }
      counter ++; 
    }


    // problem 3
    String word = "calculator"; 
    int index = 0; 
    while (index * word.length()); 
    {
      String currentLetter = word.substring(index, index + 1);


      index++; 
    }

  }
}
