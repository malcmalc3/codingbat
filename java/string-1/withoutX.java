//Programmer: Malcolm Milton

/* Given a string, if the first or last chars are 'x', return the string
 * without those 'x' chars, and otherwise return the string unchanged.
 */
public String withoutX(String str) {
    String str2="";
    if(str.length()>1)
    {
        if(str.charAt(0)!='x')
        {
            str2+=str.charAt(0);
        }

        str2 += str.substring(1,str.length()-1);

        if(str.charAt(str.length()-1)!='x')
        {
            str2+=str.charAt(str.length()-1);
        }
    }
    return str2;
}
