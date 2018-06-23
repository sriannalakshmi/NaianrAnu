import java.io.*;
import java.util.*;
class Pgm13
{ 
 public static void main(String args[])
 {
  Scanner s = new Scanner(System.in);
  int number = s.nextInt();
  int m=0,flag=0;
  int i;
  m=number/2;
  if((number==0)||(number==1))
  {
      System.out.print("no");
  }
  else
  {
  for(i=2;i<=m;i++)
  {
      if(number%i==0)
      {
          System.out.print("no");
          flag=1;
          break;
      }
  }
  }
     if(flag==0)
      {
          System.out.print("yes");
      }
   }
}
