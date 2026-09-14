import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-(k-1)];
        int index =0;
        //Creating deque
        Deque <Integer> deque = new ArrayDeque<>();

        //traverse and check each element
        //NOTE: Here, in deque we are adding the indices not the elements
        for(int i =0; i<nums.length; i++){
            //Remove the elements outside the window
            while(!deque.isEmpty() && deque.peekFirst()<=i-k){
                deque.pollFirst();
            }
            //Remove the elements smaller than the current element
            while(!deque.isEmpty() && nums[deque.peekLast()]<=nums[i]){
                deque.pollLast();
            }
            //Add current element index in last of dequeue
            deque.offerLast(i);

            //Add the max element in the ans array
            //Maximum element will be found at the first index of the deque because it is storing the indices of (the element in decresing order)
            if(i-k>=-1){
                ans[index] = nums[deque.peekFirst()];
                index++;
            } 
            
        }
        return ans;
    }
}
