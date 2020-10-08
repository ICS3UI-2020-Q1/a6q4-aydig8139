import java.util.Scanner;

/**
 * determines dot product of two 3D vectors
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new scanner for user input
    Scanner input = new Scanner(System.in);

    //Ask user for three numbers 
    System.out.println("Please enter the 3 values for the first vector");

    //create an array to store the values of the first vector
    int[] vector1 = new int [3];

    //create a for loop to get all the points from the user
    for(int i = 0; i < vector1.length; i++){
      vector1[i] = input.nextInt();
    }
    
    //ask user for the points of the second vector
    System.out.println(" Please enter the 3 values for the second vector");

    //create an array to store the values
    int[] vector2 = new int [3];

    //create a for loop to get all the points from the user
    for(int i = 0; i < vector2.length; i++){
      vector2[i] = input.nextInt();
    }

    //declare a variable for the dot product and define it by using the formula to find the dot product
    int dotProduct = vector1[0]*vector2[0]+vector1[1]*vector2[1]+vector1[2]*vector2[2];

    //tell user the answer
    System.out.println("The dot product is " + dotProduct);

  }
}
