//Programmer: Malcolm Milton

/* Return true if the given string contains between 1 and 3 'e' chars.
 */
public boolean stringE(String str) {
    int count = 0;

    for(int j=0; j<str.length(); j++)
    {
        if(str.charAt(j)=='e'){count++;}
    }

    if(count>0 && count<4)
    {
        return true;
    }
    return false;
}
