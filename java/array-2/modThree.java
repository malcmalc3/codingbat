//Programmer: Malcolm Milton

/* Given an array of ints, return true if the array contains either 3 even
 * or 3 odd values all next to each other.
 */
public boolean modThree(int[] nums) {
    if(nums.length<3){
        return false;
    }

    for(int j=0; j<nums.length-2; j++){
        if( (nums[j]%2==0 && nums[j+1]%2==0) && nums[j+2]%2==0){
            return true;
        }
    }

    for(int j=0; j<nums.length-2; j++){
        if(nums[j]%2==1&&nums[j+1]%2==1&&nums[j+2]%2==1){
            return true;
        }
    }
    return false;
}
