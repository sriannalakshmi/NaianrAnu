import java.io.*;
import java.util.*;
class Pro3
{ 
 public static void main(String args[])
 {
  Scanner s = new Scanner(System.in);
  String ch = s.nextLine();
  String ch1 = ch.toUpperCase();
  String s0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  String s1 = "AEIOU";
  if(s0.contains(ch1))
  {
       if(s1.contains(ch1))
       {
           System.out.print("Vowel");
       }
       else
       {
           System.out.print("Consonant");
       }
   }
  else
  {
      System.out.print("Input is invalid");
  }
 }
}
