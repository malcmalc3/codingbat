//Programmer: Malcolm Milton

/* Given a string, return true if it ends in "ly".
 */
public boolean endsLy(String str) {
    if(str.length()>1 && str.substring(str.length()-2,str.length()).equals("ly"))
    {
        return true;
    }
    return false;
}
