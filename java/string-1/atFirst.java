//Programmer: Malcolm Milton

/* Given a string, return a string length 2 made of its first 2 chars. If the
 * string length is less than 2, use '@' for the missing chars.
 */
public String atFirst(String str) {
    String str2="";

    if(str.length()>0)
    {
        str2+=str.charAt(0);
    }
    else
    {
        str2+="@";
    }

    if(str.length()>1)
    {
        str2+=str.charAt(1);
    }
    else
    {
        str2+="@";
    }

    return str2;
}
