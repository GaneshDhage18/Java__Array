public class Evenodd_Array
{
    public static void main(String[] args) 
    {
        int a[] ={2,5,6,7,8};

        for(int i=0; i<=5; i++)
        {
            if(a[i] % 2 == 0)
            {
                System.out.println(a[i]+" is even");
            }
            else
            {
                System.out.println(a[i]+" is odd");
            }
        }
    }
}
