//Programmer: Malcolm Milton

/* Return the number of even ints in the given array.
 */
public int countEvens(int[] nums) {
    int count=0;

    for(int j=0; j<nums.length; j++){
        if(nums[j]%2==0){
            count++;
        }
    }
    return count;
}
