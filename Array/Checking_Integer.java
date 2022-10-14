// Create an integer array and reade an integer from user and check the data is present or not and print as Found or Not Found

import java.util.Scanner;
public class Checking_Integer 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

       int[] a = {10,20,30,40};
       System.out.println("Enter the numbre you want find");
       int x = s.nextInt();
       boolean flag = false;
   
       for(int i = 0; i <= a.length-1; i++)
        {
            if(x == a[i])
            {
                System.out.print("Found");
                flag = true;
            }             
        }

        if(flag == true)
        {
            System.out.println();
        }
        else
        {
            System.out.println("not found");
        }  
        s.close();

    }
}
