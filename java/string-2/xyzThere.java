//Programmer: Malcolm Milton

/* Return true if the given string contains an appearance of "xyz" where the
 * xyz is not directly preceeded by a period (.). So "xxyz" counts but 
 * "x.xyz" does not.
 */
public boolean xyzThere(String str) {
    String word = "xyz";
    int cout = 0;

    for(int x=0; x<str.length(); x++)
    {
        if(x+3<=str.length() && str.substring(x,x+3).equals(word))
        {
            if(x==0 || str.charAt(x-1) != '.')
            {
                return true;
            }
        }
    }

    return false;
}
