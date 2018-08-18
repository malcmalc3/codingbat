//Programmer: Malcolm Milton

/* Given an array of ints, we'll say that a triple is a value appearing 3
 * times in a row in the array. Return true if the array does not contain any 
 * triples.
 */
public boolean noTriples(int[] nums) {
    for(int j=0; j<nums.length-2; j++)
    {
        if(nums[j]==nums[j+1] && nums[j+1]==nums[j+2])
        {
            return false;
        }
    }
    return true;
}
