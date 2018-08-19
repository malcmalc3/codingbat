//Programmer: Malcolm Milton

/* Given an array of ints length 3, return an array with the elements
 * "rotated left" so {1, 2, 3} yields {2, 3, 1}.
 */
public int[] rotateLeft3(int[] nums) {
    int first = nums[0];
    int last = nums[2];

    nums[0] = nums[1];
    nums[1] = last;
    nums[2] = first;

    return nums;
}
