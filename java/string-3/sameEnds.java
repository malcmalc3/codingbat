//Programmer: Malcolm Milton

/* Given a string, return the longest substring that appears at both the
 * beginning and end of the string without overlapping. For example, 
 * sameEnds("abXab") is "ab".
 */
public String sameEnds(String string) {
    if(string.length()<2)
    {
        return "";
    }
    else
    {
        int x = string.length()/2;
        int y = x;

        if(string.length()%2 == 1)
            y++;

        String string1;
        String string2;

        for(; x>0; x--, y++)
        {
            string1 = string.substring(0,x);
            string2 = string.substring(y, string.length());

            if(string1.equals(string2))
                return string1;
        }
    }

    return "";
}
