package BinarySearch;


class BinarySearch
{
    public int isBinary(int arr[], int size, int key)
    {
        int start = 0;
        int end = size-1;

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
}

class Binary
{
    public static void main(String[] args) 
    {
        int index[] = {10,9,8,-1,7,6,5,4,2};
        int key=-1;

        BinarySearch b = new BinarySearch();
         
        int array = b.isBinary(index, 8, -1);
        System.out.println(key+" is found at index "+array);
    }
}