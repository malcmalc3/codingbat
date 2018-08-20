//Programmer: Malcolm Milton

/* Given n>=0, create an array with the pattern
 * {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the 
 * grouping). Note that the length of the array will be 1 + 2 + 3 ... + n,
 * which is known to sum to exactly n*(n + 1)/2.
 */
public int[] seriesUp(int n) {
    int[] nums= new int[n*(n+1)/2]; //The array to be returned
    int currentMax=1; //The current number to go up to
    int index = 0; //The current index of the array

    while(currentMax <= n) //Stops when the current number to go up to is more than n
    {
        for(int i=1; i<=currentMax; i++, index++) //Increments index every loop
        {
            nums[index] = i; //Sets current index to
        }
        currentMax++; //Goes on to the next round of numbers
    }

    return nums;
}
