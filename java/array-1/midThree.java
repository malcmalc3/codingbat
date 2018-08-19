//Programmer: Malcolm Milton

/* Given an array of ints of odd length, return a new array length 3
 * containing the elements from the middle of the array. The array length 
 * will be at least 3.
 */
public int[] midThree(int[] nums) {
    int[] nums2 = new int[3];

    if(nums.length==3)
    {
        nums2[0]=nums[0];
        nums2[1]=nums[1];
        nums2[2]=nums[2];
    }
    else
    {
        nums2[0]=nums[nums.length/3];
        nums2[1]=nums[nums.length/3+1];
        nums2[2]=nums[nums.length/3+2];
    }

    return nums2;
}
