//Programmer: Malcolm Milton

/* Given 2 int arrays, a and b, of any length, return a new array with the
 * first element of each array. If either array is length 0, ignore that array.
 */
public int[] front11(int[] a, int[] b) {
    int count=0;

    if(a.length>0)
    {
        count++;
    }
    if(b.length>0)
    {
        count++;
    }

    int[] c = new int[count];

    if(a.length==0&&b.length!=0)
    {
        c[0] = b[0];
    }
    if(b.length==0&&a.length!=0)
    {
        c[0] = a[0];
    }
    if(a.length>0&&b.length>0)
    {
        c[0] = a[0];
        c[1] = b[0];
    }

    return c;
}
