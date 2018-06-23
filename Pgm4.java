import java.io.*;
import java.util.*;
class Pgm4
{ 
 public static void main(String args[])
 {
  Scanner s = new Scanner(System.in);
  String ch = s.nextLine();
  String ch1 = ch.toUpperCase();
  String s0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  if(s0.contains(ch1))
   {
     System.out.print("Yes");
   }
     else
       {
           System.out.print("No");
       }
 }
}
