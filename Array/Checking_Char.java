// Creating a character array and find the given character present or not if present display Found if not display Not Found.

import java.util.Scanner;
public class Checking_Char 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        char[] ch = {'a','p','p','l','e'};

        System.out.println("Enter the charecter you want to check");
        char x = s.next().charAt(0);
        boolean flag = false;

        for(int i=0; i < ch.length; i++)
        {
            if(x == ch[i])
            {
                System.out.println("Found");
                flag = true;
            }
        }
        if(flag==true)
        {
            System.out.println();
        }
        else
        {
            System.out.println("Not Found");
        }
        s.close();
    }
}
