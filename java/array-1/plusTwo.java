//Programmer: Malcolm Milton

/* Given 2 int arrays, each length 2, return a new array length 4 containing
 * all their elements.
 */
public int[] plusTwo(int[] a, int[] b) {
    int[] c = new int[4];

    c[0]=a[0];
    c[1]=a[1];
    c[2]=b[0];
    c[3]=b[1];

    return c;
}
