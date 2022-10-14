public class Findsmallest 
{
    public static void main(String[] args) 
    {
        int[] a = {10,5,4,11,30,20};    

        int small = a[0];
        for(int i=0; i < a.length; i++)
        {
            if(a[i] < small)
            {
                small = a[i];
            }
            
        }
        System.out.println("The smallest number is: "+small);
    }    
}
