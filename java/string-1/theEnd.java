//Programmer: Malcolm Milton

/* Given a string, return a string length 1 from its front, unless front is
 * false, in which case return a string length 1 from its back. The string 
 * will be non-empty.
 */
public String theEnd(String str, boolean front) {
    if(str.length()==0)
    {
        return "";
    }
    if(!front)
    {
        return "" + str.charAt(str.length()-1);
    }
    return "" + str.charAt(0);
}
