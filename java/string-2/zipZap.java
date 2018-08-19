//Programmer: Malcolm Milton

/* Look for patterns like "zip" and "zap" in the string -- length-3, starting
 * with 'z' and ending with 'p'. Return a string where for all such words, 
 * the middle letter is gone, so "zipXzap" yields "zpXzp".
 */
public String zipZap(String str) {
    String str2="";

    if(str.length()>0)
    {
        str2 = "" + str.charAt(0);
    }

    for(int j=1; j<str.length()-1; j++)
    {
        if(str.charAt(j-1)=='z' && str.charAt(j+1)=='p')
        {
            j += 0;
        }
        else
        {
            str2 += str.charAt(j);
        }
    }

    if(str.length()>1)
    {
        str2 += str.charAt(str.length()-1);
    }

    return str2;
}
