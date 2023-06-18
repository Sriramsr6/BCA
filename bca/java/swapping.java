import java.util.Scanner;

class swapping
{
	
public static void main(String args[]) 
{
	  Scanner sc = new Scanner (System.in);
	  System.out.println("Enter first number");

	  int num1 = sc.nextInt();
	  System.out.println("enter second number");
	  int num2= sc.nextInt();
     
      System.out.println ("initial values of num1 : and num2 " + num1 + num2);

      num1 = num1 + num2;
      num2 = num1 - num2;
      num1 = num1 - num2;

      System.out.println ("after   values of num1 : and num2 " + num1 + num2);
	  

	}

}