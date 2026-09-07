import java.util.Arrays;

public class BoatstoSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int start =0;
        int end = people.length-1;
        int count =0;
        //int weight =0;
        while(start<=end){
            if(start==end){
                count++;
                start++;
            }
            else if(people[end]+people[start]<=limit){
                count++;
                start++;
                end--;
                //weight= 0;
            }
            else if(people[end]<=limit){
                count++;
                end--;
                //weight =0;
            }
            else{
                //weight += people[start];
                count++;
                start++;
            }
        }
        return count;
    }
}
