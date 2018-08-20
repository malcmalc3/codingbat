//Programmer: Malcolm Milton

/* Return the "centered" average of an array of ints, which we'll say is the
 * mean average of the values, except ignoring the largest and smallest 
 * values in the array. If there are multiple copies of the smallest value, 
 * ignore just one copy, and likewise for the largest value. Use int division 
 * to produce the final average. You may assume that the array is length 3 
 * or more.
 */
public int centeredAverage(int[] nums) {
    int min=nums[0];
    int max=nums[0];
    int total=0;

    for(int x=0; x<nums.length-1; x++)
    {
        if(nums[x+1]<min){
            min=nums[x+1];
        }
        if(nums[x+1]>max){
            max=nums[x+1];
        }
        total+=nums[x];
    }

    total += nums[nums.length-1];
    total-=(min + max);
    total /= nums.length-2;

    return total;
}
