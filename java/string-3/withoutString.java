//Programmer: Malcolm Milton

/* Given two strings, base and remove, return a version of the base string
 * where all instances of the remove string have been removed (not case 
 * sensitive). You may assume that the remove string is length 1 or more. 
 * Remove only non-overlapping instances, so with "xxx" removing "xx" 
 * leaves "x".
 */
public String withoutString(String base, String remove) {
    String remove2 = remove.toLowerCase();
    String remove3 = remove.toUpperCase();
    String word = "";
    String temp = "";
    int size = remove.length();

    for(int x=0; x<base.length(); x++)
    {
        if(x+size <= base.length())
            temp = base.substring(x,x+size);

        if(x+size > base.length())
            word += base.charAt(x);
        else if(temp.equals(remove)||temp.equals(remove2)||temp.equals(remove3))
            x += size-1;
        else
            word += base.charAt(x);
    }
    return word;
}
