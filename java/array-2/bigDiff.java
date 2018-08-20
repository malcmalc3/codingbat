//Programmer: Malcolm Milton

/* Given an array length 1 or more of ints, return the difference between the
 * largest and smallest values in the array.
 */
public int bigDiff(int[] nums) {
    int max = 0;
    int min = nums[0];

    for(int x=0; x<nums.length-1; x++)
    {
        if(Math.max(nums[x], nums[x+1]) > max)
            max = Math.max(nums[x], nums[x+1]);
        if(Math.min(nums[x], nums[x+1]) < min)
            min = Math.min(nums[x], nums[x+1]);
    }

    if(nums.length == 1)
        max=min;

    return max-min;
}
