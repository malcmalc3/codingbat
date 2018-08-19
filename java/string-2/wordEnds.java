//Programmer: Malcolm Milton

/* Given a string and a non-empty word string, return a string made of each
 * char just before and just after every appearance of the word in the 
 * string. Ignore cases where there is no char before or after the word, and 
 * a char may be included twice if it is between two words.
 */
public String wordEnds(String str, String word) {
    String str2 = "";
    int length = word.length();

    for(int x=0; x<str.length(); x++)
    {
        if(x+length<=str.length() && str.substring(x,x+length).equals(word))
        {
            if(x!=0)
            {
                str2+=str.substring(x-1,x);
            }
            if(x+length<str.length())
            {
                str2 += str.substring(x+length,x+length+1);
            }
        }
    }

    return str2;
}
