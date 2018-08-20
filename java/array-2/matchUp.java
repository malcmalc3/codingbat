//Programmer: Malcolm Milton

/* Given arrays nums1 and nums2 of the same length, for every element in
 * nums1, consider the corresponding element in nums2 (at the same index). 
 * Return the count of the number of times that the two elements differ by 2 
 * or less, but are not equal.
 */
public int matchUp(int[] nums1, int[] nums2) {
    int count=0;

    for(int j=0; j<nums1.length; j++){
        if(Math.abs(nums1[j]-nums2[j])==1 || Math.abs(nums1[j]-nums2[j])==2){
            count++;
        }
    }
    return count;
}
