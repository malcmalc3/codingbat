//Programmer: Malcolm Milton

/* Given an array of ints, return the number of 9's in the array.
 */
public int arrayCount9(int[] nums) {
    int count =0;
    for(int j=0; j<nums.length; j++)
    {
        if(nums[j]==9)
        {
            count++;
        }
    }
    return count;
}
