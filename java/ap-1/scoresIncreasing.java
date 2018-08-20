//Programmer: Malcolm Milton

/* Given an array of scores, return true if each score is equal or greater
 * than the one before. The array will be length 2 or more.
 */
public boolean scoresIncreasing(int[] scores) {
    boolean yes = true;

    for(int j=0; j<scores.length-1; j++){
        if(scores[j+1]<scores[j]){
            yes=false;
        }
    }
    return yes;
}
