//Programmer: Malcolm Milton

/* Given an array of ints, return true if .. 1, 2, 3, .. appears in the array
 * somewhere.
 */
public boolean array123(int[] nums) {
    for(int j = 0; j<nums.length-2; j++)
    {
        if(nums[j]==1 && nums[j+1]==2 && nums[j+2]==3)
        {
            return true;
        }
    }
    return false;
}
