//Programmer: Malcolm Milton

/* Given a string, does "xyz" appear in the middle of the string? To define
 * middle, we'll say that the number of chars to the left and right of the 
 * "xyz" must differ by at most one. This problem is harder than it looks.
 */
public boolean xyzMiddle(String str) {
    int length = str.length();

    if(length<3)
    {
        return false;
    }

    if(str.substring(length/2-1,length/2+2).equals("xyz"))
    {
        return true;
    }

    if(length%2==0&&str.substring(length/2-2,length/2+1).equals("xyz"))
    {
        return true;
    }

    return false;
}
