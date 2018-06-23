import java.io.*;
import java.util.*;
class Pro2
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if(1<=number<=100000)
        {
            if(number%2==0)
            {
            System.out.print("Even");
            }
            else 
            {
            System.out.print("Odd");
            }
        }
    }
}
