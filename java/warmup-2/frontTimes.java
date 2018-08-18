//Programmer: Malcolm Milton

/* Given a string and a non-negative int n, we'll say that the front of the
 * string is the first 3 chars, or whatever is there if the string is less 
 * than length 3. Return n copies of the front.
 */
public String frontTimes(String str, int n) {
    String str2 = "";

    if(str.length()==2)
    {
        str=str.substring(0,2);
    }
    if(str.length()==1)
    {
        str=str.substring(0,1);
    }
    if(str.length()==0)
    {
        return "";
    }
    if(str.length()>2)
    {
        str=str.substring(0,3);
    }
    for(int j=0; j<n; j++)
    {
        str2+=str;
    }
    return str2;
}
