//Programmer: Malcolm Milton

/* Given 2 positive int values, return the larger value that is in the range
 * 10..20 inclusive, or return 0 if neither is in that range.
 */
public int max1020(int a, int b) {
    int a20=0;
    int b20=0;

    if(a>9&&a<21)
    {
        a20=a;
    }

    if(b>9&&b<21)
    {
        b20=b;
    }

    return Math.max(a20,b20);
}
