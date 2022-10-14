package BinarySearch;

import javax.lang.model.util.ElementScanner14;

public class First_LastPosition 
{
    public static int getfirstposition(int arr[], int size, int key)
    {
        int s = 0;
        int e = size;

        int mid = s + (e - s)/2;
        int ans = -1;

        while(s <= e)
        {
            if(arr[mid] == key)
            {
                ans = mid;
                e = mid-1;
            }
            else if(arr[mid] < key)
            {
                s = mid + 1;
            }
            else
            {
                e = mid - 1;
            }
            mid = s + (e - s)/2;
        }
        return ans;
    }

    public static int getlastposition(int arr[], int size, int key)
    {
        int s = 0;
        int e = size;

        int mid = s + (e - s)/2;
        int ans = 0;

        while(s <= e)
        {
            if(arr[mid] == key)
            {
                ans = mid;
                s = mid+1;
            }
            else if(arr[mid] < key)
            {
                s = mid + 1;
            }
            else
            {
                e = mid - 1;
            }
            mid = s + (e - s)/2;
        }
        return ans;
    }

    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,3,3,4};
        int size = arr.length;
        System.out.println(getfirstposition(arr, size, 3));
        System.out.println(getlastposition(arr, size, 3));
    }
}
