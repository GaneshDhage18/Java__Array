import java.util.Scanner;
public class Decending 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Element you Want");
        int size = s.nextInt();
        int temp;

        int[] a = new int[size];

        for(int i=0; i < size; i++)
        {
            a[i] = s.nextInt();
        }

        for(int i=0; i < size; i++)
        {
            for(int j=i+1; j < size; j++)
            {
                if(a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
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
