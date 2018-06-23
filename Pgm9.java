import java.io.*;
import java.util.*;
class Pgm9
{ 
 public static void main(String args[])
 {
  Scanner s = new Scanner(System.in);
  int number = s.nextInt();
  int value = s.nextInt();
  int sum=0;
  int[] arr = new int[number];
  for(int i=0;i<number;i++)
  {
      arr[i] = s.nextInt();
  }
  for(int i=0;i<value;i++)
  {
      sum = sum+arr[i];
  }
  System.out.print(sum);
   }
}
