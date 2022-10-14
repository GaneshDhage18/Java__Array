package BinarySearch;

public class Painters_Partition 
{
    public static boolean isPossible(int arr[] , int n , int m, int mid)
    {
        int painter = 1;
        int posterSum = 0;

        for(int i = 0; i < n; i++)
        {
            if(posterSum + arr[i] <= mid)
            {
                posterSum+=arr[i];
            }

            else{
                painter++;
                if(painter > m || arr[i] > mid)
                {
                    return false;
                }
                posterSum = arr[i];
            }
        }
        return true;
    }

    public static int findMid(int arr[] , int n, int m)
    {
        int s = 0; 
        int sum = 0;
        for(int  i= 0; i < n; i++)
        {
            sum+=arr[i];
        }
        int e = sum;
        int ans = -1;

        int mid = s + (e -s)/2;

        while(s <= e)
        {
            if(isPossible(arr,n,m,mid))
            {
                ans = mid;
                e = mid-1;
            }
            else
            {
                s = mid+1;
            }
            mid = s + (e - s)/2;
        }
        return ans;
    }

    public static void main(String[] args) 
    {
        int arr[] = {5,5,5,5};
        System.out.println(findMid(arr, 4, 2));
    }
}
