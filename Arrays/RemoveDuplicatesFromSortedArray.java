import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
       HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        //count keys or unique elements
        int k =0;
        for(int i:map.keySet()){
            k++;
        }

        //converting into array
        int index =0;
        for(int i:map.keySet()){
            nums[index] = i;
            index++;
        }
        //sort elements upto k elements b/c hashmap do not guarantee insertion order
        Arrays.sort(nums, 0, k);
        System.out.println(Arrays.toString(nums));
        return k;
    }
}
