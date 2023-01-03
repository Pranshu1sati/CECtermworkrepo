public class BinarySearch {
    public static void main(String[] args) {
        int[] nums ={2,3,4,5,7,6};
        int key =2;
        // int key = 20;
        // System.out.println(binarySearch(key, nums));
        System.out.println(recbinarySearch(nums,0,nums.length-1,key));
    }
    public static int binarySearch(int key, int [] nums) {
        if (nums.length==1|| nums.length == 0) 
            return -1;
        int l =0;
        int r= nums.length-1;
        
        while (l<=r){
            int mid = (l+r)/2;
            if(key==nums[mid]) return mid;
            else if(key > nums[mid]) l = l+1;
            else r=r-1;
            
        }
        return -1;
    }
public static int recbinarySearch(int arr[], int l, int r, int x)
{
if (arr.length==1|| arr.length == 0) return -1;
if (r >= l) {
int mid = l + (r - l) / 2;
if (arr[mid] == x)
return mid;
if (arr[mid] > x)
return recbinarySearch(arr, l, mid - 1, x);
else
return recbinarySearch(arr, mid + 1, r, x);
}
return -1;
}
}
