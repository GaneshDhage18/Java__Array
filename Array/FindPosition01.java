// Find First and last position an element in sorted array

public class FindPosition01 
{

    public static int firstOcc(int arr[], int size, int key)
    {
        int start = 0;
        int end = size-1;

        int mid = start + (end-start)/2;
        int ans=0;

        while(start <= end)
        {
            if(arr[mid] == key)
            {
                ans = mid;
                end = mid - 1;
            }

            else if(arr[mid] < key)
            {
                start = mid+1;
            }
            else if(arr[mid] > key)
            {
                end = mid-1;
            }
            mid = start + (end-start)/2;
        }
        return ans;
    }

    public static int lastOcc(int arr[], int size, int key)
    {
        int start = 0;
        int end = size-1;

        int mid = start + (end-start)/2;
        int ans=0;

        while(start <= end)
        {
            if(arr[mid] == key)
            {
                ans = mid;
                start = mid+1;
            }

            else if(arr[mid] < key)
            {
                start = mid+1;
            }
            else if(arr[mid] > key)
            {
                end = mid-1;
            }
            mid = start + (end-start)/2;
        }

        return ans;
    }

    public static void main(String[] args) 
    {
        int index[] = {1,2,3,3,3,3,3,4,5};
        int size = index.length;

        System.out.println(" FIrst Occurrence of 3 is: "+firstOcc(index, 9, 3));
        System.out.println(" Last Occurrence of 3 is: "+lastOcc(index, 9, 3));
    }
}

