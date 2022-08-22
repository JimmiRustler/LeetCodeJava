class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++){
            int currentNum = nums[i];
            for (int j=i+1; j<nums.length; j++){
                int twoSumResults = currentNum + nums[j];
                if (twoSumResults == target){
                    int[] winner = {i,j};
                    System.out.print("Positions " + i + " and " + j + " are correct!");
                    return winner;
                    
                }
            }
        }
        System.out.print("No matches found!");
        return nums;
    }
}