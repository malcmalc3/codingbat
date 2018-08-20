//Programmer: Malcolm Milton

/* Given a non-empty array of ints, return a new array containing the
 * elements from the original array that come after the last 4 in the 
 * original array. The original array will contain at least one 4. Note that 
 * it is valid in java to create an array of length 0.
 */
public int[] post4(int[] nums) {
    int start=0;

    for(int j=0; j<nums.length; j++){
        if(nums[j]==4){
            start=j+1;
        }
    }

    int[] nums2 = new int[nums.length-start];

    for(int j=0; j<nums2.length; j++){
        nums2[j]=nums[start];
        start++;
    }

    return nums2;
}
