public class Sum 
{
    public static void main(String[] args) 
    {
        int[] num = {3,4,5,7,9,10};
        int sum=0;

        for(int i=0; i < num.length; i++)
        {
            sum = sum+num[i];
        }
        System.out.println("The sum is "+sum);
    }    
}
