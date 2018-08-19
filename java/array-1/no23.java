//Programmer: Malcolm Milton

/* Given an int array length 2, return true if it does not contain a 2 or 3.
 */
public boolean no23(int[] nums) {
    for(int j=0; j<2; j++)
    {
        if(nums[j]==2||nums[j]==3)
        {
            return false;
        }
    }
    return true;
}
