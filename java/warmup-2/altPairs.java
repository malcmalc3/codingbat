//Programmer: Malcolm Milton

/* Given a string, return a string made of the chars at indexes
 * 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
 */
public String altPairs(String str)
{
    String str2 = "";
    for(int j=0; j<str.length(); j+=4)
    {
        str2 += str.charAt(j);
        if(j+1<str.length())
        {
            str2 += str.charAt(j+1);
        }
    }
    return str2;
}
