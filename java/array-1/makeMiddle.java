//Programmer: Malcolm Milton

/* Given an array of ints of even length, return a new array length 2
 * containing the middle two elements from the original array. The original 
 * array will be length 2 or more.
 */
public int[] makeMiddle(int[] nums) {
    int x = nums[(nums.length/2)-1];
    int y = nums[(nums.length/2)];
    int[] nums2 = new int[2];

    nums2[0]=x;
    nums2[1]=y;

    return nums2;
}
