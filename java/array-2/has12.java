//Programmer: Malcolm Milton

/* Given an array of ints, return true if there is a 1 in the array with a
 * 2 somewhere later in the array.
 */
public boolean has12(int[] nums) {
    boolean one = false;
    boolean two = false;

    for(int x=0; x<nums.length; x++)
        if(nums[x] == 1)
            one = true;
        else if(one && nums[x] == 2)
            two = true;

    return two;
}
