//Programmer: Malcolm Milton

/* Given three ints, a b c, return true if one of them is 10 or more less
 * than one of the others.
 */
public boolean lessBy10(int a, int b, int c) {
    return Math.abs(a-b)>9 || Math.abs(a-c)>9 || Math.abs(b-c)>9;
}
