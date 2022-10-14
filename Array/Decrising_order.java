import java.util.Scanner;
public class Decrising_order 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the no of Element");
        int size = s.nextInt();
        double temp;

        double[] num = new double[size];

        for(int i=0; i < size; i++)
        {
            num[i] = s.nextDouble();
        }

        for(int i=0; i < size; i++)
        {
            for(int j=i+1; j < size; j++)
            {
                if(num[i] < num[j])
                {
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        for(int i=0; i < size; i++)
        {
            System.out.print(num[i]+" ");
        }
        s.close();

    }
}
