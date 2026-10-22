package Stack;
import java.util.Stack;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr2 = new int[nums2.length];
        int[] arr = new int[nums1.length];
        Stack<Integer> st = new Stack<>();
        //firstly, create an array(arr2) for the next element for every element in nums2
        for(int i =nums2.length-1; i>=0; i--){
            if(st.isEmpty()){
                arr2[i] = -1;
                st.push(nums2[i]);
            }
            else{
                while(!st.isEmpty() && st.peek()<nums2[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    arr2[i] = -1;
                    st.push(nums2[i]);
                }
                else if(st.peek()>nums2[i]){
                    arr2[i] = st.peek();
                    st.push(nums2[i]);
                }
            }
        }

        //Check for each element in nums1 to find next greater element in nums2 with the help of arr2
        for(int i =0; i<nums1.length; i++){
            for(int j =0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    arr[i] = arr2[j];
                    break;
                }
            }
        }
        return arr;
    }
}
