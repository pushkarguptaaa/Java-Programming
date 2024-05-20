package JavaFundamentals;

import java.util.HashMap;
// import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
// import java.util.List;
import java.util.Set;

public class CollectionApi {
    public static void main(String[] args) {
        // List<Integer> nums= new ArrayList<>();
        Set<Integer> nums= new HashSet<>();
        nums.add(3);
        nums.add(5);
        nums.add(7);
        nums.add(5);

        // System.out.println(nums.get(2));
        System.out.println(nums); 

        for(int i: nums){
            System.out.println(i);
        }

        Map<Integer, String> map= new HashMap<>();

        map.put(1, "Hi");
        map.put(2, "Hii");
        map.put(3, "Hiii");

        System.out.println(map);


    }
    
    
}
