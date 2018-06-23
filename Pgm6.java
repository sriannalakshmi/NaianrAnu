import java.io.*;
import java.util.*;
class Pgm6
{ 
 public static void main(String args[])
 {
  Scanner s = new Scanner(System.in);
  int year = s.nextInt();
  if(year%4==0)
  {
      System.out.print("yes");
  }
  else
  {
  System.out.print("no");
  }
 }
}
