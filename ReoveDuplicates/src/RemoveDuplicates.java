public class RemoveDuplicates {
    public static int removeIt(int[] nums){
        int start=1;
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]!=nums[i+1]){
                nums[start++]=nums[i+1];
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] myarr={1,1,2,33,3,4,5,5,6};
        int y=removeIt(myarr);
        System.out.println("The array is "+y);
    }
}
