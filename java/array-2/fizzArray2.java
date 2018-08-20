//Programmer: Malcolm Milton

/* Given a number n, create and return a new string array of length n,
 * containing the strings "0", "1" "2" .. through n-1. N may be 0, in which 
 * case just return a length 0 array.
 */
public String[] fizzArray2(int n) {
    String nums[] = new String[n];

    for(int x=0; x<n; x++)
        nums[x] = "" + x;

    return nums;
}
