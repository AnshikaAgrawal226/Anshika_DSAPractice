public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //example: nums1- [1,3,8,9,15] and nums2 - [7,11,18,19,21,25]

        //If nums2 have smaller number of Elements
        if(nums2.length<nums1.length){
            return findMedianSortedArrays(nums2,nums1);
        }

        //If nums1 has smaller number of elements
        int m = nums1.length; //m=5
        int n = nums2.length; //n =6

        //to calculate partitions
        //for 5 elements there will be 6 partitions
        int low = 0;
        int high = m;

        while(low<=high){
            //patition in nums1 array
            int i  = (low+high)/2;  //i=2
            //From this partition, we can say that there are 2 elements in the left side of the partition
            // Now, we want atleast half of total elements in the left side including nums1 and nums2

            //total elements : (m+n+1)  +1 is for odd total number of elements
            //half of total elements : (m+n+1)/2 =6. 

            //out of these 6 elements, 2 are present in the left partition of nums1. The remaining will be in the left partition of nums2

            int j = (m+n+1)/2-i;

            int lnums1 = (i==0)? Integer.MIN_VALUE : nums1[i-1];
            int lnums2 = (j==0)? Integer.MIN_VALUE : nums2[j-1];

            int rnums1 = (i==m)? Integer.MAX_VALUE : nums1[i];
            int rnums2 = (j==n)? Integer.MAX_VALUE : nums2[j];

            //Condiditon of correct partitons
            if(lnums1<=rnums2 && lnums2<=rnums1){
                //if total numer of elements are odd, return largest element in left partition
                if((m+n)%2==1){
                    return Math.max(lnums1,lnums2);
                }
                else{
                    double maxleft = Math.max(lnums1,lnums2);
                    double minright = Math.min(rnums1,rnums2);
                    double ans = (maxleft+minright)/2;
                    return ans;
                }
                
            }

            else if(lnums1>rnums2 ){
                //it means there are more than required number of elements in the left partition of nums1. so, move pointer to left
                high = i-1;
            }

            else{
                //it means there are more than required number of elements in the left partition of nums2. so, move pointer to right
                low = i+1;
            }



        }
        return 0.00;

    }
    
}