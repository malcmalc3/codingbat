//Programmer: Malcolm Milton

/* Return true if the given string contains a "bob" string, but where the
 * middle 'o' char can be any char.
 */
public boolean bobThere(String str) {
    boolean count = false;

    for(int j=0; j<str.length()-2;j++)
    {
        if(str.charAt(j)=='b' && str.charAt(j+2)=='b')
        {
            count=true;
        }
    }

    return count;
}
