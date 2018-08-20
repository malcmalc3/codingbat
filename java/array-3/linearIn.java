//Programmer: Malcolm Milton

/* Given two arrays of ints sorted in increasing order, outer and inner,
 * return true if all of the numbers in inner appear in outer. The best 
 * solution makes only a single "linear" pass of both arrays, taking 
 * advantage of the fact that both arrays are already in sorted order.
 */
public boolean linearIn(int[] outer, int[] inner) {
    boolean allIn = false;
    int i, j;

    for(i=0, j=0; i<inner.length && j<outer.length; j++)
    {
        if(inner[i] == outer[j])
        {
            i++;
        }
    }
    if(i < inner.length)
    {
        allIn = false;
    }
    else
    {
        allIn = true;
    }

    return allIn;
}
