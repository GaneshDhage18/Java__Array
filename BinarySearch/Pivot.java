package BinarySearch;

public class Pivot
{
    public static int isPivot(int arr[], int size)
    {
        int s = 0;
        int e = size-1;

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
    public static void main(String[] args) 
    {
        int arr[] = {9,1,4,5,8};
        int size = arr.length;
        System.out.println("Pivot is "+isPivot(arr, size));
    }
}