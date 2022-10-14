import java.util.Scanner;
public class Findlargest 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of element you want");
        int size = s.nextInt();
        
       int arr[] = new int[size];
       for(int i=0; i < size; i++)
       {
            arr[i] = s.nextInt();
       }

       int max = arr[0];
       for(int i=0; i < size; i++)
       {
            if(arr[i] > max)
            {
                max = arr[i];
            }
       }
       System.out.println("The largest number is: "+max);
       s.close();

    }
}
