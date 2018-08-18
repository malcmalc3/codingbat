//Programmer: Malcolm Milton

/* Suppose the string "yak" is unlucky. Given a string, return a version where
 * all the "yak" are removed, but the "a" can be any char. The "yak" strings 
 * will not overlap.
 */
public String stringYak(String str) {
    String str2="";
    String str3="";
    String str4="";
    int j = str.indexOf("yak");

    str2=str.substring(0,j);
    str3=str.substring(j+3,str.length());
    str4+=str2+str3;
    j = str4.indexOf("yak");

    if(str4.indexOf("yak")==-1)
    {
        return str4;
    }

    String str5=str4.substring(j+3,str4.length());
    String str6=str4.substring(0,j);
    String str7="";
    str7+=str6+str5;

    return str7;
}
