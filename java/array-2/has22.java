//Programmer: Malcolm Milton

/* Given an array of ints, return true if the array contains a 2 next to a 2
 * somewhere.
 */
public boolean has22(int[] nums) {
    boolean twotwo = false;

    for(int x=1; x<nums.length; x++)
        if(nums[x] == nums[x-1] && nums[x] == 2)
            twotwo = true;

    return twotwo;
}
