//Programmer: Malcolm Milton

/* Given an array of ints length 3, figure out which is larger between the
 * first and last elements in the array, and set all the other elements to be 
 * that value. Return the changed array.
 */
public int[] maxEnd3(int[] nums) {
    if(nums[0] == nums[2])
    {
        nums[1] = nums[0];
    }
    if(nums[0] > nums[2])
    {
        nums[1] = nums[0];
        nums[2] = nums[0];
    }
    if(nums[2] > nums[0])
    {
        nums[1] = nums[2];
        nums[0] = nums[2];
    }

    return nums;
}
