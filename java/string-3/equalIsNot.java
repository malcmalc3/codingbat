//Programmer: Malcolm Milton

/* Given a string, return true if the number of appearances of "is" anywhere
 * in the string is equal to the number of appearances of "not" anywhere in 
 * the string (case sensitive).
 */
public boolean equalIsNot(String str) {
    int is = 0;
    int not = 0;
    boolean equal = false;

    for(int x=0; x<str.length()-1; x++)
    {
        if(x<str.length()-2 && str.substring(x,x+3).equals("not"))
        {
            not++;
        }
        else if(str.substring(x,x+2).equals("is"))
        {
            is++;
        }
    }

    if(is == not)
    {
        equal = true;
    }

    return equal;
}
