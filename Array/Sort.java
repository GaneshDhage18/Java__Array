public class Sort 
{
    public static void sort123(int a[],int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int  j = i+1; j < n; j++)
            {
                if(a[i] >= a[j])
                {
                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }
            }
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) 
    {
        int a[] = {1,2,0,0,1,2,0};
        int n = a.length;
        sort123(a, n);
    }
}
