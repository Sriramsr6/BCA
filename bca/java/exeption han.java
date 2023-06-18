import java.lang.exeptions;

class exeption
{
	public static void main (String args[])
}
int a[]={10,20};
float x;
int b=10;
try
{
	x=a[2]/b-a[1];

}
catch(ArithmeticException)
{
	System.out.println("division error");
}
catch (Array IndexOutOfBoundsException)
{
	System.out.println("Array index error");
}


