public class Unique_Number 
{
    public static int unique(int arr[],int n)
    {
        int ans = 0;
        for(int i=0; i < n; i++)
        {
            ans=ans^arr[i];
            //System.out.println(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,8,1,5,5};

        int n = arr.length;
        unique(arr, n);
        int ans = unique(arr, n);
        System.out.println(ans);
    }
}
