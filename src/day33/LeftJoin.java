package day33;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeftJoin {

    public static Map<Object, List<String>> LeftJoin(Map<String, String> mapOne, Map<String, String> mapTwo){

        Map<Object, List<String>> Joined = new HashMap<>();

        for (String keys : mapOne.keySet()){
            List<String> newValue = new ArrayList();

            newValue.add(mapOne.get(keys));
            newValue.add(mapTwo.get(keys));

            Joined.put(keys, newValue);
        }

        return Joined;
    }

}
