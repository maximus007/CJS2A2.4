
import java.util.Scanner;
        
 public class TestDemo {

    
    public static void main(String[] args) {
    
      Scanner sc=new Scanner(System.in);  
      System.out.println("Enter the number");
      int x=sc.nextInt();  
      if(x==0)
      {
      System.out.println("You have entered zero");
      }          
      if(x>0)
      {
      System.out.println("You have entered positive value");
      }
      if(x<0)
      {
      System.out.println("You have entered negative value");
      }

        
       Scanner ac=new Scanner(System.in);
       System.out.println("Enter marks for Physics");
      int p=sc.nextInt();
      
      System.out.println("Enter marks for Chemistry");
      int c=sc.nextInt();
      
      System.out.println("Enter marks for Maths");
      int m=sc.nextInt();
      
      int y= (p+c+m)/3;
      
      if(y>70)
      {
      System.out.println("A grade");
      }
      if(y>61 & y<70)
      {
          System.out.println("B grade");
      }
      if(y<61)
      {
      System.out.println("C grade");
              }
          
      
      
    }
    
}
