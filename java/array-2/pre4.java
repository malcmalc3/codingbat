//Programmer: Malcolm Milton

/* Given a non-empty array of ints, return a new array containing the
 * elements from the original array that come before the first 4 in the 
 * original array. The original array will contain at least one 4. Note that 
 * it is valid in java to create an array of length 0.
 */
public int[] pre4(int[] nums) {
    int count = 0;

    while(nums[count] != 4)
        count++;

    int[] newNums = new int[count];

    for(int x=0; x<count; x++)
        newNums[x] = nums[x];

    return newNums;
}
