//Programmer: Malcolm Milton

/* Given 2 int values, return whichever value is nearest to the value 10, or
 * return 0 in the event of a tie. Note that Math.abs(n) returns the absolute 
 * value of a number.
 */
public int close10(int a, int b) {
    int aa = Math.abs(10-a);
    int bb = Math.abs(10-b);

    if(aa==bb)
        return 0;

    if(aa>bb)
        return b;

    return a;
}
