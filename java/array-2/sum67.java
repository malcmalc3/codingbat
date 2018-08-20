//Programmer: Malcolm Milton

/* Return the sum of the numbers in the array, except ignore sections of
 * numbers starting with a 6 and extending to the next 7 (every 6 will be 
 * followed by at least one 7). Return 0 for no numbers.
 */
public int sum67(int[] nums) {
    int sum = 0;
    boolean range = false;

    for(int x=0; x<nums.length; x++){
        if(!range && nums[x] != 6)
            sum += nums[x];
        else if(!range && nums[x] == 6)
            range = true;
        else if(range && nums[x] == 7)
            range = false;
    }

    return sum;
}
