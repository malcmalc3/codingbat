//Programmer: Malcolm Milton

/* Given an array of ints, return the number of times that two 6's are next to
 * each other in the array. Also count instances where the second "6" is 
 * actually a 7.
 */
public int array667(int[] nums)
{
    int count = 0;
    boolean second = false;

    for(int j=0; j<nums.length-1; j++)
    {
        if(nums[j+1]==6 || nums[j+1]==7)
        {
            second = true;
        }
        if(nums[j]==6 && second)
        {
            count ++;
        }
        second = false;
    }

    return count;
}
