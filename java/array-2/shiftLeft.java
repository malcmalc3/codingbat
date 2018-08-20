//Programmer: Malcolm Milton

/* Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns
 * {2, 5, 3, 6}. You may modify and return the given array, or return a new 
 * array.
 */
public int[] shiftLeft(int[] nums) {
    int temp = 0;
    if(nums.length>0){
        temp = nums[0];
    }

    for(int j=0; j<nums.length-1; j++){
        nums[j]=nums[j+1];
    }

    if(nums.length>0){
        nums[nums.length-1]=temp;
    }

    return nums;
}
