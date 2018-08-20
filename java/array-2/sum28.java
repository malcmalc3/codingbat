//Programmer: Malcolm Milton

/* Given an array of ints, return true if the sum of all the 2's in the array
 * is exactly 8.
 */
public boolean sum28(int[] nums) {
    int sum=0;
      for(int x=0; x<nums.length; x++)
         if(nums[x] == 2)
            sum += 2;
    return sum == 8 ? true : false;
}
