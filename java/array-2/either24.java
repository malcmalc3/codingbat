//Programmer: Malcolm Milton

/* Given an array of ints, return true if the array contains a 2 next to
 * a 2 or a 4 next to a 4, but not both.
 */
public boolean either24(int[] nums) {
    boolean next = false;

    for(int x=0; x<nums.length-1; x++)
        if(nums[x] == nums[x+1])
            if(nums[x] == 2 || nums[x] == 4)
                next = next ? false : true;

    return next;
}
