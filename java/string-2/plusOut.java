//Programmer: Malcolm Milton

/* Given a string and a non-empty word string, return a version of the
 * original String where all chars have been replaced by pluses ("+"), except 
 * for appearances of the word string which are preserved unchanged.
 */
public String plusOut(String str, String word) {
    String word2 = "";
    int length = word.length();

    for(int x=0; x<str.length(); x++)
    {
        if(x+length <= str.length() && str.substring(x,x+length).equals(word))
        {
            word2 += word;
            x += length-1;
        }
        else
        {
            word2 += "+";
        }
    }
    return word2;
}
