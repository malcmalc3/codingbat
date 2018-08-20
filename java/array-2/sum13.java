//Programmer: Malcolm Milton

/* Return the sum of the numbers in the array, returning 0 for an empty
 * array. Except the number 13 is very unlucky, so it does not count and 
 * numbers that come immediately after a 13 also do not count.
 */
public int sum13(int[] nums) {
    int count=0;

    for(int j=0; j<nums.length; j++){
        if(nums[j]==13){
            j++;
        }
        else{
            count+=nums[j];
        }
    }

    return count;
}
