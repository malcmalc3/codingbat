//Programmer: Malcolm Milton

/* Given a string, if one or both of the first 2 chars is 'x', return the
 * string without those 'x' chars, and otherwise return the string unchanged. 
 * This is a little harder than it looks.
 */
public String withoutX2(String str) {
    String str2="";

    if(str.length()>0&&str.charAt(0)=='x')
    {
        str2+="";
    }
    else if(str.length()>0)
    {
        str2+=str.charAt(0);
    }

    if(str.length()>1&&str.charAt(1)=='x')
    {
        str2+="";
    }
    else if(str.length()>1)
    {
        str2+=str.charAt(1);
    }

    if(str.length()>2)
    {
        str2+=str.substring(2,str.length());
    }

    return str2;
}
