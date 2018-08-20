//Programmer: Malcolm Milton

/* Return a version of the given array where all the 10's have been removed.
 * The remaining elements should shift left towards the start of the array as 
 * needed, and the empty spaces a the end of the array should be 0. So 
 * {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given 
 * array or make a new array.
 */
public int[] withoutTen(int[] nums) {
    int temp;

    for(int x=nums.length-1; x>=0; x--)
        if(nums[x] == 10)
            for(int y=x+1; y<nums.length; y++)
                if(nums[y] != 10)
                {
                    temp = nums[y];
                    nums[y] = nums[y-1];
                    nums[y-1] = temp;
                }

    for(int x=0; x<nums.length; x++)
        if(nums[x] == 10)
            nums[x] = 0;

    return nums;
}
