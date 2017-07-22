
import java.util.Scanner;
        
 public class TestDemo {

    
    public static void main(String[] args) {
    
      Scanner sc=new Scanner(System.in);  // Using scanner for getting user input//
      System.out.println("Enter the number");
      int x=sc.nextInt();  // Taking integer as a user input//
      if(x==0) // If condition to verify//
      {
      System.out.println("You have entered zero "+ (int)x); // If the statment is true then this will print//
      }          
      if(x>0)
      {
      System.out.println("You have entered positive value "+ (int)x);
      }
      if(x<0)
      {
      System.out.println("You have entered negative value "+ (int)x);
      }

        
       Scanner ac=new Scanner(System.in); // creating a new scanner object for subject //
       System.out.println("Enter marks for Physics");
      int p=sc.nextInt();
      
      System.out.println("Enter marks for Chemistry");
      int c=sc.nextInt();
      
      System.out.println("Enter marks for Maths");
      int m=sc.nextInt();
      
      int y= (p+c+m)/3; // Taking average of 3 subjects//
      
      if(y>70) // If condition 
      {
      System.out.println("A grade"); // This statement will print if the condition is true//
      }
      if(y>61 & y<70) // Using and operator to verify multiple conditions//
      {
          System.out.println("B grade");
      }
      if(y<61)
      {
      System.out.println("C grade");
              }
          
      
      
    }
    
}
