//Programmer: Malcolm Milton

/* Given three ints, a b c, one of them is small, one is medium and one is
 * large. Return true if the three values are evenly spaced, so the 
 * difference between small and medium is the same as the difference between 
 * medium and large.
 */
public boolean evenlySpaced(int a, int b, int c) {
    int small=0;
    int medium=0;
    int large=0;

    if(a>b&&a>c){
        large=a;
    }
    if(b>a&&b>c){
        large=b;
    }
    if(c>a&&c>b){
        large=c;
    }
    if(a<b&&a<c){
        small=a;
    }
    if(b<a&&b<c){
        small=b;
    }
    if(c<a&&c<b){
        small=c;
    }
    if(a<large&&a>small){
        medium=a;
    }
    if(b<large&&b>small){
        medium=b;
    }
    if(c<large&&c>small){
        medium=c;
    }
    if((a==b)&&(a!=c)){
        return false;
    }
    if(Math.abs(medium-small) == Math.abs(large-medium)){
        return true;
    }

    return false;
}
