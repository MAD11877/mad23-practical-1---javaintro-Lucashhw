import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    let height = prompt("Enter your height in meters:");
    let weight = prompt("Enter your weight in kilograms:");


    height = parseFloat(height);
    weight = parseFloat(weight);


    let bmi = weight / (height * height);


    console.log("Your BMI is: " + bmi);
     
    Scanner in = new Scanner(System.in);
    double height = in.nextDouble();
  }
}
