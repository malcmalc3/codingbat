//Programmer: Malcolm Milton

/* Given a string, return a string made of the first 2 chars (if present),
 * however include first char only if it is 'o' and include the second only if 
 * it is 'z', so "ozymandias" yields "oz".
 */
public String startOz(String str) {
    if(str.length()>1)
    {
        char first = str.charAt(0);
        char second = str.charAt(1);

        boolean yes1=false;
        if(first=='o'){yes1=true;}

        boolean yes2=false;
        if(second=='z'){yes2=true;}

        if(yes1&&!yes2)
            return ""+first;
        if(!yes1&&yes2)
            return ""+second;
        if(yes1&&yes2)
            return ""+first+second;
    }
    if(str.length()==1 && str.charAt(0)=='o')
    {
        return "o";
    }
    return "";
}
