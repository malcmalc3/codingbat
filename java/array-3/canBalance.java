//Programmer: Malcolm Milton

/* Given a non-empty array, return true if there is a place to split the
 * array so that the sum of the numbers on one side is equal to the sum of 
 * the numbers on the other side.
 */
public boolean canBalance(int[] nums) {
    int total = 0;
    int sum = 0;

    for(int j=0; j<nums.length; j++){
        total+=nums[j];
    }

    for(int i=0; i<nums.length; i++){
        sum+=nums[i];

        if(sum==total-sum){
            return true;
        }
    }

    return false;
}
