package inorder;

public class No_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] indexs=new int[2];
        for(int i =0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        indexs[0]=i;
                        indexs[1]=j;
                    }
            }
        }
        return indexs;
    }


    public static void main(String[] args){
        No_1 a=new No_1();
        int[] indexs1=new int[]{2,7,11,12};
        System.out.print(a.twoSum(indexs1,9));

    }
};