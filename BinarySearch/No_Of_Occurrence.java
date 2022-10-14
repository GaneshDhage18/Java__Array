package BinarySearch;

public class No_Of_Occurrence 
{

    public static int firstOcc(int arr[], int size, int key)
    {
        int start = 0;
        int end = size-1;

        int mid = start + (end-start)/2;
        int first=0;

        while(start <= end)
        {
            if(arr[mid] == key)
            {
                first = mid;
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
        return first;
    }

    public static int lastOcc(int arr[], int size, int key)
    {
        int start = 0;
        int end = size-1;

        int mid = start + (end-start)/2;
        int last=0;

        while(start <= end)
        {
            if(arr[mid] == key)
            {
                last = mid;
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

        return last;
    }

    public static void main(String[] args) 
    {
        int index[] = {1,2,3,3,3,3,3,3,5};
        int size = index.length;

        System.out.println(" FIrst Occurrence of 3 is: "+firstOcc(index, 9, 3));
        System.out.println(" Last Occurrence of 3 is: "+lastOcc(index, 9, 3));

        int sum =(lastOcc(index, size, 3) - firstOcc(index, 9, 3) )+1;
        System.out.println("No of Occurrence is: "+sum);
    }
}

