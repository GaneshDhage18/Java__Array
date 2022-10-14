 import java.util.Scanner;
class Array_Practice
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
        System.out.println("Enter the no of element you want");
        int num = s.nextInt();
        int count=0;

        int numbers[] = new int[100];

        System.out.println("====Enter the numbers===");
        for(int i=0; i<num; i++)
        {
            numbers[i] = s.nextInt();
        }
        System.out.println("Enter the Element you want find");
        int x = s.nextInt();

        for(int i=0; i<num; i++)
        {
            if(x==numbers[i])
            {
                count++;
                System.out.println(x+ " is found at index "+i);
            }
        }
        System.out.println(count);
    
        s.close();

		
	}
}
