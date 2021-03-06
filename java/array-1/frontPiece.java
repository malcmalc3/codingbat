//Programmer: Malcolm Milton

/* Given an int array of any length, return a new array of its first 2
 * elements. If the array is smaller than length 2, use whatever elements are 
 * present.
 */
public int[] frontPiece(int[] nums) {
    int count = nums.length;

    if(count>2)
    {
        count=2;
    }

    int[] next = new int[count];

    for(int j=0; j<count; j++)
    {
        next[j]=nums[j];
    }

    return next;
}
