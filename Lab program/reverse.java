import java.util.*;
class reverse
{
  public static void main(String[] args)
{
  String str,rev="";
  Scanner s1=new Scanner(System.in);
  System.out.println("Enter the String=");
  str=s1.nextLine();
  int len=str.length();
  for(int i=len-1;i>=0;i--)
  {
     rev=rev + str.charAt(i);
     }
   System.out.println("Reverse is="+rev);
   s1.close();
   }
   }
