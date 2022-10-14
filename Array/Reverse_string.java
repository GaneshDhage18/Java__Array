import java.util.Scanner;
public class Reverse_string 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the element you want");
        int size = s.nextInt();
        char[] name = new char[size];

        System.out.print("Enter the name: ");

        for(int i=0; i < name.length; i++)
        {
           name[i] = s.next().charAt(0);
        }
       
        for(int i=name.length-1; i >= 0; i--)
        {
            System.out.print(name[i]+" ");
        }
        System.out.println();
        System.out.println(name.length);
       // s.close();
    }    

}
