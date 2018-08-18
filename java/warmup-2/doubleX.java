//Programmer: Malcolm Milton

/* Given a string, return true if the first instance of "x" in the string is
 * immediately followed by another "x".
 */
boolean doubleX(String str) {
    int y = str.indexOf("x");

    if(y != str.length()-1 && str.charAt(y+1) == 'x')
    {
        return true;
    }
    return false;
}
