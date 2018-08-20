//Programmer: Malcolm Milton

/* Given an array of ints, return true if the value 3 appears in the array
 * exactly 3 times, and no 3's are next to each other.
 */
public boolean haveThree(int[] nums) {
    int count = 0;

    for(int x=1; x<nums.length-1; x++)
    {
        if(nums[x] == 3)
        {
            if(nums[x-1] == 3 || nums[x+1] == 3)
                return false;
            else
                count++;
        }
    }

    if(nums.length > 0 && nums[0] == 3)
        count++;

    if(nums.length > 0 && nums[nums.length-1] == 3)
        count++;

    return count == 3? true : false;
}
