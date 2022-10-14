package BinarySearch;

public class Rotated_Sorted 
{
  
    public static int getpivot(int arr[] , int n) 
    {
        int s = 0;
        int e = n-1;

        int mid = s + (e - s)/2;

        while(s < e)
        {
            if(arr[mid] >= arr[0])
            {
                s = mid + 1;
            }
            else
            {
                e = mid;
            }
            mid = s + (e - s)/2;
        }
        return s;
    }

    public static int isBinary(int arr[],int s, int e, int key)
    {
        int start = s;
        int end = e;

      //  int mid = (start + end)/2;

        int mid = start + (end - start)/2;

        while(start <= end)
        {
            if(arr[mid] == key)
            {
                return mid;
            }
    
            if(arr[mid] >= key)
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }

            mid = start + (end - start)/2;
        }
        return -1;
    }

    public static int findPosition(int arr[], int n , int k)
    {
        int pivot = getpivot(arr, n);
        if(k >= arr[pivot] && k <= arr[n-1])
        {
            return isBinary(arr, pivot, n-1, k);
        }
        else
        {
            return isBinary(arr, 0, pivot-1, k);
        }
    }

    public static void main(String[] args) 
    {
        int arr[] = {7,9,1,2,3};

        System.out.println(findPosition(arr, 5, 2));
    }
}
