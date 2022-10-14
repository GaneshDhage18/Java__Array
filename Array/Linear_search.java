import java.util.*;
public class Linear_search 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int sum=0;
        int count=0;

        int numbers[] = new int[size];

        for(int i=0; i<size; i++)
        {
             numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the number do you find");
        int x = sc.nextInt();

        for(int i=0; i<numbers.length; i++)
        {
           if(numbers[i]==x)
           {
            count++;
           
            System.out.println("x found at index: "+i);
           }
        }
        sum = sum+count;
        System.out.println(x+" is found "+sum+" times");
        sc.close();
    }
}