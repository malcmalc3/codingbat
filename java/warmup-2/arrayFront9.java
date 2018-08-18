//Programmer: Malcolm Milton

/* Given an array of ints, return true if one of the first 4 elements in the
 * array is a 9. The array length may be less than 4.
 */
public boolean arrayFront9(int[] nums) {
    for(int j=0; j<nums.length; j++)
    {
        if(j<=3&&nums[j]==9)
        {
            return true;
        }
    }
    return false;
}
