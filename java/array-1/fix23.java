//Programmer: Malcolm Milton

/* Given an int array length 3, if there is a 2 in the array immediately
 * followed by a 3, set the 3 element to 0. Return the changed array.
 */
public int[] fix23(int[] nums) {
    for(int j=0; j<nums.length; j++)
    {
        if(nums[j]==2)
        {
            if(nums[j+1]==3)
            {
                nums[j+1]=0;
            }
        }
    }
    return nums;
}
