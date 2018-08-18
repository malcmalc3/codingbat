//Programmer: Malcolm Milton

/* Given a string, return a new string made of every other char starting with
 * the first, so "Hello" yields "Hlo".
 */
public String stringBits(String str) {
    String str2 = "";

    for(int j=0; j<str.length(); j+=2)
    {
        str2+= str.charAt(j);
    }

    return str2;
}
