// Create a char[] initialize with character and print the elements in reverse order.

public class Reverse_Char 
{
    public static void main(String[] args) 
    {
        char[] a = {'a','b','c','d'};

        for(int i=a.length-1; i>=0; i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}