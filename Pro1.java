import java.io.*;
import java.util.*;
class Pro1
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if(number>0)
        {
            System.out.print("Positive");
        }
        else if(number<0)
        {
            System.out.print("Negative");
        }
        else
        {
            System.out.print("Zero");
        }
    }
}
