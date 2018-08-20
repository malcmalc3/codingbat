//Programmer: Malcolm Milton

/* Given an array of ints, return true if it contains no 1's or it contains
 * no 4's.
 */
public boolean no14(int[] nums) {
    boolean one = true;
    boolean four = true;

    for(int j=0; j<nums.length; j++){
        if(nums[j] == 1){
            one=false;
        }
        if(nums[j] == 4){
            four=false;
        }
    }

    if(!one && !four){
        return false;
    }
    return true;
}
