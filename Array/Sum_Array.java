import java.util.Scanner;
public class Sum_Array
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the element you want");
        int size = s.nextInt();
        int sum = 0;
        int prod = 1;

        int num[] = new int[size];
        System.out.println("Enter the amount she spent on gift");
        for(int i=0; i < size; i++)
        {
            num[i] = s.nextInt();
            sum=sum+num[i];
            prod=prod*num[i];
        }

        System.out.println("The amount is: "+sum);
        System.out.println("The product is:"+prod);
        s.close();
    }    
}
