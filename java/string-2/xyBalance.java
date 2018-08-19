//Programmer: Malcolm Milton

/* We'll say that a String is xy-balanced if for all the 'x' chars in the
 * string, there exists a 'y' char somewhere later in the string. So "xxy" is 
 * balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true 
 * if the given string is xy-balanced.
 */
public boolean xyBalance(String str) {
    int xcount=-1;
    int ycount=-1;

    for(int j=0; j<str.length();j++)
    {
        if(str.charAt(j)=='x')
        {
            xcount=j;
        }
    }

    for(int j=0; j<str.length();j++)
    {
        if(str.charAt(j)=='y'
        {
            ycount=j;
        }
    }

    if(ycount>xcount || xcount==-1)
    {
        return true;
    }

    return false;
}
