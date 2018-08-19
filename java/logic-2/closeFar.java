//Programmer: Malcolm Milton

/* Given three ints, a b c, return true if one of b or c is "close"
 * (differing from a by at most 1), while the other is "far", differing from 
 * both other values by 2 or more. Note: Math.abs(num) computes the absolute 
 * value of a number.
 */
public boolean closeFar(int a, int b, int c) {
    int ab = Math.abs(a-b);
    int ac = Math.abs(a-c);
    int cb = Math.abs(b-c);

    if( (ab<=1 && cb>1) && ac>1)
    {
        return true;
    }
    if( (ac<=1 && cb>1) && ab>1)
    {
        return true;
    }

    return false;
}
