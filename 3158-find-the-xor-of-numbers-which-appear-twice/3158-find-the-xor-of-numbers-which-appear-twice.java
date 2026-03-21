class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]))result^=nums[i];
            else set.add(nums[i]);
        }
        return result;
    }
}