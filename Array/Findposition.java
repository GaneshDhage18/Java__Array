import java.util.Scanner;
public class Findposition 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        String name[] = {"Sanvi","Siri","Neha","Nisha","Roshan"};

        System.out.println("Enter the position");
        int num = s.nextInt();

        for(int i=0; i < name.length+1; i++)
        {
            if(i == num)
            {
                System.out.println(name[i-1]);
            }
        }
        s.close();
    }
}
