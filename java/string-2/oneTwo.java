//Programmer: Malcolm Milton

/*Given a string, compute a new string by moving the first char to come after
 *the next two chars, so "abc" yields "bca". Repeat this process for each
 *subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group
 *of fewer than 3 chars at the end.
 */

public String oneTwo(String str) {
    String str2 = "";

    for(int x=2; x<str.length(); x+=3)
    {
        str2 += str.substring(x-1,x+1) + str.charAt(x-2);
    }

    return str2;
}