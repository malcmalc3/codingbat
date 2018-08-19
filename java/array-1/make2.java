//Programmer: Malcolm Milton

/* Given 2 int arrays, a and b, return a new array length 2 containing, as
 * much as will fit, the elements from a followed by the elements from b. The 
 * arrays may be any length, including 0, but there will be 2 or more 
 * elements available between the 2 arrays.
 */
public int[] make2(int[] a, int[] b) {
    int[] c = new int[2];
    int j=0;

    if(a.length > 0)
    {
        c[j]=a[0]; j++;
    }
    if(a.length > 1)
    {
        c[j]=a[1]; j++;
    }
    if(j<2 && b.length>0)
    {
        c[j]=b[0]; j++;
    }
    if(j<2 && b.length>1)
    {
        c[j]=b[1]; j++;
    }

    return c;
}
