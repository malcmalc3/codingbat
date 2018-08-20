//Programmer: Malcolm Milton

/* Return an array that contains the exact same numbers as the given array,
 * but rearranged so that all the zeros are grouped at the start of the array. 
 * The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes 
 * {0 ,0, 1, 1}. You may modify and return the given array or make a new array.
 */
public int[] zeroFront(int[] nums) {
    int temp;

    for(int x=0; x<nums.length; x++)
        if(nums[x]==0)
            for(int y=x-1; y>-1; y--)
                if(nums[y]!=0)
                {
                    temp = nums[y];
                    nums[y] = nums[y+1];
                    nums[y+1] = temp;
                }

    return nums;
}
