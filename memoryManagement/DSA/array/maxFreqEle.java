//HASH map
// find the maximim frequency element in ana array.

import java.util.*;
public class maxFreqEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> map= new HashMap();
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                int value = map.get(arr[i]);
                map.put(arr[i],value+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        

        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            max = Math.max(max, e.getValue());
        }
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue()==max){
                System.out.println(e.getKey());
            }
        }
    }
}