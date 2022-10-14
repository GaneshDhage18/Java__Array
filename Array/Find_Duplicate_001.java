public class Find_Duplicate_001 
{
    public static int unique(int arr[],int n)
    {
        int ans = 0;
        for(int i=0; i < n; i++)
        {
            ans=ans^arr[i];
            System.out.print(arr[i]+" ");

        }
        System.out.println();

        for(int i =1; i < n-1; i++)
        {
            ans = ans^i;
            System.out.print(arr[i]+" ");
            break;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,4};

        int n = arr.length;
        unique(arr, n);
    }
}

