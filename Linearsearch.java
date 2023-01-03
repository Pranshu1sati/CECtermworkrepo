public class Linearsearch {
    public static void main(String[] args) {
        int[] nums ={2,3,4,5,7,6};
        int key =2;
        // int key = 20;
        System.out.println(linearsearch(key, nums));
    }
    public static int linearsearch(int key, int [] nums) {
        if (nums.length==1|| nums.length == 0) 
            return -1;
        for(int i =0 ; i<nums.length;i++){
            if(key==nums[i]) return i;
            
        }
        return -1;
    }
}
