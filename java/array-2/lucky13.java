//Programmer: Malcolm Milton

/* Given an array of ints, return true if the array contains no 1's and
 * no 3's.
 */
public boolean lucky13(int[] nums) {
    for(int j=0; j<nums.length; j++){
        if(nums[j]==1||nums[j]==3){
            return false;
        }
    }
    return true;
}
