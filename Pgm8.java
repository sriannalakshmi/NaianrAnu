import java.io.*;
import java.util.*;
class Pgm8
{ 
 public static void main(String args[])
 {
  Scanner s = new Scanner(System.in);
  int number = s.nextInt();
  int sum=0;
  for(int i=1;i<=number;i++)
  {
      sum = sum+i;
  }
  System.out.print(sum);
 }
}
