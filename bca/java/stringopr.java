import java.io.*;

class Stringopr
{
public static void main(String args[])
{
string s1=new string ("object oriented program");
string s2=s1.touppercase();
System.out.println("uppercase string=" +s2);

string s3=s2.tolowercase();
System.out.println("lowercase string=" +s3);

string s4=s1.replace('c',"*");
System.out.println("replace a character in a string="+s4);

string s5=s1.trim();
System.out.println("remove white spaces from a string="+s5);

if (s1equals(s2));
System.out.println("s1 and s2 are equals");
else(s1notequals(s2))
System.out.println("s1 and s2 are not equals");

int len=s1.length();
System.out.println("length of s1."+len);

char x=s1.char(15);
System.out.println(" character at 15 position in s1="+x);

if (s1.compareto (s2)>0);
System.out.println("s1 is bigger than s2");

 elseif (s1.compareto (s2)<0);
System.out.println("s1 is smaller than s2") ;

 if(s1.compareto (s2)==0)
System.out.println("s1 is equals to s2");

String s6= s1.concat(s2);
System.out.println("s2 add at end of s1="+s6);

String s7=s1.substring (15);
System.out.println("sub String="+s7);

}
}
	





