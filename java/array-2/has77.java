//Programmer: Malcolm Milton

/* Given an array of ints, return true if the array contains two 7's next
 * to each other, or there are two 7's separated by one element, such as 
 * with {7, 1, 7}.
 */
public boolean has77(int[] nums) {
    for(int x=1, y=2; y<nums.length; x++, y++)
    {
        if(nums[x]==7 && nums[y]==7)
            return true;
        else if(nums[x-1]==7 && nums[y-1]==7)
            return true;
        else if(nums[x-1]==7 && nums[y]==7)
            return true;
    }
    return false;
}
