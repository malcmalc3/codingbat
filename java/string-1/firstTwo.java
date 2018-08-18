//Programmer: Malcolm Milton

/* Given a string, return the string made of its first two chars, so the
 * String "Hello" yields "He". If the string is shorter than length 2, return 
 * whatever there is, so "X" yields "X", and the empty string "" yields the 
 * empty string "".
 */
public String firstTwo(String str) {
    int length=str.length();

    if(length>2)
    {
        length=2;
    }

    return str.substring(0,length);
}
