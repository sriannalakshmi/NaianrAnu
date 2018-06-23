import java.io.*;
import java.util.*;
class Pgm12
{ 
 public static void main(String args[])
 {
  Scanner s = new Scanner(System.in);
  int number = s.nextInt();
  String s0 = String.valueOf(number);
  StringBuffer sb = new StringBuffer(s0);
  if(sb==sb.reverse())
  {
      System.out.print("yes");
  }
  else
  {
      System.out.print("no");
  }
   }
}
