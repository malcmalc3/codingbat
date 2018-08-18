//Programmer: Malcolm Milton

/* Given a string, if the string begins with "red" or "blue" return that
 * color string, otherwise return the empty string.
 */
public String seeColor(String str) {
    if(str.indexOf("red")==0)
    {
        return "red";
    }
    if(str.indexOf("blue")==0)
    {
        return "blue";
    }
    return "";
}
