//Programmer: Malcolm Milton

/* Given a string, return a version without the first 2 chars. Except keep
 * the first char if it is 'a' and keep the second char if it is 'b'. The 
 * string may be any length. Harder than it looks.
 */
public String deFront(String str) {
    String str2="";

    if(str.length()>0&&str.charAt(0)=='a')
    {
        str2+=str.charAt(0);
    }
    if(str.length()>1&&str.charAt(1)=='b')
    {
        str2+=str.charAt(1);
    }
    if(str.length()>2)
    {
        str2+=str.substring(2,str.length());
    }

    return str2;
}
