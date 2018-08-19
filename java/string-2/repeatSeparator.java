//Programmer: Malcolm Milton

/* Given two strings, word and a separator, return a big string made of count
 * occurences of the word, separated by the separator string.
 */
public String repeatSeparator(String word, String sep, int count) {
    String str="";

    for(int j=0; j<count-1; j++)
    {
        str += word;
        str += sep;
    }

    str+=word;

    if(count==0)
    {
        return "";
    }

    return str;
}
