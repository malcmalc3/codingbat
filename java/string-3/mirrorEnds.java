//Programmer: Malcolm Milton

/* Given a string, look for a mirror image (backwards) string at both the
 * beginning and end of the given string. In other words, zero or more 
 * characters at the very begining of the given string, and at the very end 
 * of the string in reverse order (possibly overlapping). For example, the 
 * string "abXYZba" has the mirror end "ab".
 */
public String mirrorEnds(String string) {
    int end=0;

    for(int x=0, y=string.length()-1; x<string.length(); x++, y--)
    {
        if(string.charAt(y)==string.charAt(x))
            end++;
        else
            break;
    }

    return string.substring(0, end);
}
