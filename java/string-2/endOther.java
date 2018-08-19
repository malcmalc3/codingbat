//Programmer: Malcolm Milton

/* Given two strings, return true if either of the strings appears at the
 * very end of the other string, ignoring upper/lower case differences (in 
 * other words, the computation should not be "case sensitive").
 */
public boolean endOther(String a, String b) {
    a = a.toLowerCase();
    b = b.toLowerCase();
    String c = a;

    if(b.length()>a.length())
    {
        a=b;
        b=c;
    }

    int start = a.length()-b.length();

    if(a.substring(start,a.length()).equals(b))
    {
        return true;
    }

    return false;
}
