//Programmer: Malcolm Milton

/* Return a version of the given array where each zero value in the array is
 * replaced by the largest odd value to the right of the zero in the array. If 
 * there is no odd value to the right of the zero, leave the zero as a zero.
 */
public int[] zeroMax(int[] nums) {
    for(int x=0; x<nums.length-1; x++)
        if(nums[x] == 0)
            for(int y=x+1; y<nums.length; y++)
                if(nums[y]%2 == 1 && nums[y] > nums[x])
                    nums[x] = nums[y];

    return nums;
}
