//Programmer: Malcolm Milton

/* Given an array of positive ints, return a new array of length "count"
 * containing the first even numbers from the original array. The original 
 * array will contain at least "count" even numbers.
 */
public int[] copyEvens(int[] nums, int count) {
    int[] evens = new int[count];
    int y=0, x=0;

    while(y<count && x<nums.length){
        if(nums[x]%2 == 0){
            evens[y] = nums[x];
            y++;
        }
        x++;
    }
    return evens;
}
