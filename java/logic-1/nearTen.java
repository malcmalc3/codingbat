//Programmer: Malcolm Milton

/* Given a non-negative number "num", return true if num is within 2 of a
 * multiple of 10.
 */
public boolean nearTen(int num) {
    if(num%10==1 || num%10==2 || num%10==8 || num%10==9 || num%10==0)
    {
        return true;
    }
    return false;
}
