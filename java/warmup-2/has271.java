//Programmer: Malcolm Milton

/* Given an array of ints, return true if it contains a 2, 7, 1 pattern --
 * a value, followed by the value plus 5, followed by the value minus 1. 
 * Additionally the 271 counts even if the "1" differs by 2 or less from the 
 * correct value.
 */
public boolean has271(int[] nums) {
    for (int j=0; j<nums.length-2;j++)
    {
        if(nums[j+1]-nums[j]==5 && Math.abs(nums[j+2]-(nums[j]-1))<=2)
        {
            return true;
        }
    }
    return false;
}
