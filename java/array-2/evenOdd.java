//Programmer: Malcolm Milton

/* Return an array that contains the exact same numbers as the given array,
 * but rearranged so that all the even numbers come before all the odd 
 * numbers. Other than that, the numbers can be in any order. You may modify 
 * and return the given array, or make a new array.
 */
public int[] evenOdd(int[] nums) {
    int currentNum;
    int evenIndex = 0;
    int oddIndex = nums.length-1;
    int[] sorted = new int[nums.length];

    for(int x=0; x<nums.length; x++)
    {
        if(nums[x]%2 == 0)
            sorted[evenIndex++] = nums[x];
        else
            sorted[oddIndex--] = nums[x];
    }

    return sorted;
}
