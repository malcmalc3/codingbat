//Programmer: Malcolm Milton

/* Given an array of ints, return true if every 2 that appears in the array
 * is next to another 2.
 */
public boolean twoTwo(int[] nums) {
    if(nums.length == 0)
        return true;
    else if(nums.length==1 && nums[0]!=2)
        return true;
    else if(nums.length==1 && nums[0]==2)
        return false;
    else if(nums[0] == 2 && nums[1] != 2)
        return false;
    else if(nums[nums.length-1] == 2 && nums[nums.length-2] != 2)
        return false;
    else
        for(int x=1; x<nums.length-1; x++)
            if(nums[x]==2 && (nums[x-1])!=2 && nums[x+1]!=2)
                return false;
    return true;
}
