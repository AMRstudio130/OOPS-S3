import java.util.*;
class frequency
{
   public static void main(String args[])
{
   int count=0;
   Scanner S=new Scanner(System.in);
   String sr;
   sr=S.nextLine();
   sr.toLowerCase();
   System.out.println("Enter the chatrachter to check=");
   char c=S.next().charAt(0);
   int len=sr.length();
   for(int i=0;i<len;i++)
   {
     if(sr.charAt(i)==c)
      {
         count++;
      }
    }
    System.out.println("The frequency character is="+count);
    S.close();
}
}
