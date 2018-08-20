//Programmer: Malcolm Milton

/* Consider the leftmost and righmost appearances of some value in an array.
 * We'll say that the "span" is the number of elements between the two 
 * inclusive. A single value has a span of 1. Returns the largest span found 
 * in the given array. (Efficiency is not a priority.)
 */
public int maxSpan(int[] nums) {
    int max=0;
    int left=0;
    int right=0;

    for(int j=0;j<nums.length;j++){
        left=nums[j];
        for(int i=0;i<nums.length; i++){
            right=nums[i];

            if(left==right&&i-j+1>max){
                max=i-j+1;
            }
        }
    }
    return max;
}
