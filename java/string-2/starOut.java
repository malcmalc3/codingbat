//Programmer: Malcolm Milton

/* Return a version of the given string, where for every star (*) in the
 * string the star and the chars immediately to its left and right are gone. 
 * So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
 */
public String starOut(String str) {
    String str2 = "";

    if(str.length()>1&&str.charAt(1)!='*'&&str.charAt(0)!='*')
    {
        str2 += str.charAt(0);
    }

    if(str.length()==1&&str.charAt(0)!='*')
    {
        str2 += str.charAt(0);
    }

    for(int j=1; j<str.length()-1; j++)
    {
        if(str.charAt(j-1)!='*'&&str.charAt(j)!='*'&&str.charAt(j+1)!='*')
        {
            str2 += str.charAt(j);
        }
    }
    if(str.length()>1&&str.charAt(str.length()-1)!='*'&&str.charAt(str.length()-2)!='*')
    {
        str2 += str.charAt(str.length()-1);
    }
    return str2;
}
