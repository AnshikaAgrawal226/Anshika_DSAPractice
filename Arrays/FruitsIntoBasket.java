import java.util.HashMap;

public class FruitsIntoBasket {
    public int totalFruit(int[] fruits) {
        if(fruits.length==0){
            return 0;
        }
        if(fruits.length==1){
            return 1;
        }
        HashMap <Integer, Integer> map = new HashMap<>();
        int count =0;
        int maxcount =0;
        int start =0;
        for(int i =0; i<fruits.length; i++){
            if(map.containsKey(fruits[i])){
                map.put(fruits[i],map.get(fruits[i])+1);
                count++;
            }
            else{
                map.put(fruits[i],1);
                count++;
            }

            if(map.size()>2){
                if(map.get(fruits[start])==1){
                    map.remove(fruits[start]);
                    
                }
                else{
                    map.put(fruits[start],map.get(fruits[start])-1);
                }
                count--;
                start++;
                
            }
            if(map.size()<=2){
                maxcount = Math.max(count,maxcount);
            }
        }
        return maxcount;
    }
}
