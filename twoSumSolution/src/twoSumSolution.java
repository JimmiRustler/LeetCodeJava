class Solution {
    public int[] twoSum(int[] nums, int target) {
        //inital loop to pass through the array
        for (int i=0; i<nums.length; i++){
            //Takes the current number we are checking against all others to and assigns to currentNum
            int currentNum = nums[i];
            /* 
            * Nested loop to add currentNum to each elemt of the array. The position always starts at one higher than the previous by assigning the secondary loop
            * value J with I+1 making sure it doesn't add the current element to itself.
            * Also, any element we already checked does not need to be rechecked EG
            * we know element nums[0] is 2 and numes[1] is 3. 2+3 = 5 as well as 3+2, if the solution isn't right once, can't be right again. This makes it so the loop
            * does not iterate through the entire array over and over, but rather only the combinations of values we haven't checked
            */
            for (int j=i+1; j<nums.length; j++){
                //Takes the saved number and adds it to the currnetly checked value
                int twoSumResults = currentNum + nums[j];
                //If the target is found, loop breaks and returns the positions in the array winner;
                if (twoSumResults == target){
                    int[] winner = {i,j};
                    System.out.print("Positions " + i + " and " + j + " are correct!");
                    return winner;
                }
            }
        }
        //If it passes through the entire loop, it returns nums unaltered and outputs no matches
        //Could add an earlier check possibly based on prediction
        System.out.print("No matches found!");
        return nums;
    }
}