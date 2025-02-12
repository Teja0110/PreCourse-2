/* Time Complexity O(logn) since we are not iterating through all the values
   Space complexity O(1)
*/
class BinarySearch { 
    // Returns index of x if it is present in arr[l.. r], else return -1 
    int binarySearch(int arr[], int l, int r, int x) 
    { 
        if(r >=1){
            int middle = l + (r-1) /2 ;
            if (arr[middle] ==x)
                return middle;
            if (arr[middle]>x)
                return binarySearch(arr, l , middle-1, x);
            return binarySearch(arr, middle+1, r,x);

        }
        return -1;
        //Write your code here
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
} 