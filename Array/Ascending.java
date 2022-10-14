import java.util.Scanner;
class Ascending
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        

        System.out.println("Enter the no of element you want");
        int size = s.nextInt();

        int[] a = new int[size];
       // int temp;

        System.out.println("Enter the element");
        for(int i=0; i < size; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i=0; i < size; i++)

        {
            for(int j = i+1; j < size; j++)
            {
                if(a[i] > a[j])
                {
                    a[i] = a[i]+a[j];
                    a[j] = a[i]-a[j];
                    a[i] = a[i]-a[j];
                }
            }
        }

        for(int i = 0; i < size-1; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print(a[size-1]+" ");
        s.close();
    }
}