import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IceCreamParlor {
    public static void main(String[] args) {
        System.out.println(icecreamParlor(4,  List.of(1, 4 ,5 ,3, 2)));

    }
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        Map<Integer, Integer> items = new HashMap<>();
        List<Integer> resultIndices = new ArrayList<>();
        int index = 0;
        for (Integer item: arr) {

            int diff = Math.abs(m - item);
            if(items.get(diff) !=null && (item + diff == m)) {
                resultIndices.add(items.get(diff) +1 );
                resultIndices.add(index + 1 );
                break;
            }
            if(items.get(item) == null){
                items.put(item, index);
            }
            index++;
        }
        return resultIndices;

    }

}
