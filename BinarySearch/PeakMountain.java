package BinarySearch;

public class PeakMountain 
{
    public static void main(String[] args) 
    {
        int arr[] = {3,4,5,1};
       System.out.println("The index is "+peakMountain(arr, 4));
    }

    public static int peakMountain(int[] arr, int size) 
    {
        int s = 0;
        int e = arr.length - 1;

        int mid = s + (e-s)/2;

        while(s < e)
        {
            if(arr[mid] < arr[mid+1])
            {
                s = mid + 1;
            }
            else
            {
                e = mid;
            }
            mid = s + (e-s)/2;
        }
        return s;
    }

}
