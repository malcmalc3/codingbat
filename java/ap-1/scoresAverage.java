//Programmer: Malcolm Milton

/* Given an array of scores, compute the int average of the first half and the
 * second half, and return whichever is larger. We'll say that the second half 
 * begins at index length/2. The array length will be at least 2. To practice 
 * decomposition, write a separate helper method <br>int average(int[] scores, 
 * int start, int end) { which computes the average of the elements between 
 * indexes start..end. Call your helper method twice to implement 
 * scoresAverage().
 */
public int scoresAverage(int[] scores) {
    int count1=0;
    int count2=0;
    int length=scores.length;

    for(int j=0; j<length; j++){
        if(j<length/2){
            count1 += scores[j];
        }
        if(j>=length/2){
            count2 += scores[j];
        }
    }
    return Math.max(count1/(length/2),count2/(length/2));
}
