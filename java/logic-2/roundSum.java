//Programmer: Malcolm Milton

/* For this problem, we'll round an int value up to the next multiple of 10
 * if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, 
 * round down to the previous multiple of 10 if its rightmost digit is less 
 * than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of 
 * their rounded values. To avoid code repetition, write a separate helper 
 * "public int round10(int num) {" and call it 3 times. Write the helper 
 * entirely below and at the same indent level as roundSum().
 */
public int roundSum(int a, int b, int c) {
    int aa = a%10;
    int aaa = 10-aa;
    int bb = b%10;
    int bbb = 10-bb;
    int cc = c%10;
    int ccc =10-cc;

    if(aa<5)
    {
        a=(a-aa);
    }
    else
    {
        a = a + aaa;
    }

    if(bb<5)
    {
        b = b - bb;
    }
    else
    {
        b = b + bbb;
    }

    if(cc<5)
    {
        c = c - cc;
    }
    else
    {
        c = c + ccc;
    }

    return a + b + c;
}
