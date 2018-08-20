//Programmer: Malcolm Milton

/* Given an array of ints, return true if the number of 1's is greater than
 * the number of 4's
 */
public boolean more14(int[] nums) {
    int ones = 0;
    int fours = 0;

    for(int x=0; x<nums.length; x++)
    {
        if(nums[x]==1)
            ones++;
        else if(nums[x]==4)
            fours++;
    }

    return ones > fours ? true : false;
}
