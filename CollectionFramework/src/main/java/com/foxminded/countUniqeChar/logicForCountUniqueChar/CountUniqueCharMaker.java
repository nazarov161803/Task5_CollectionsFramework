package com.foxminded.countUniqeChar.logicForCountUniqueChar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
 
public class CountUniqueCharMaker {

    public void writeCountUniqueSymbols(String input) {

        Map<String, String> cache = new HashMap<>();
        System.out.println(cache.computeIfAbsent(input, key -> makeCountUniqueSymbols(input)));
    }

    public String makeCountUniqueSymbols(String input) {
        String[] symbols = input.split("");
        ArrayList<String> listOfSymbols = new ArrayList<>(Arrays.asList(symbols));
        Map<String, Integer> map = listOfSymbols.stream().collect(LinkedHashMap::new,
                (newMap, key) -> newMap.merge(key, 1, Integer::sum), HashMap::putAll);

        return changeMapToString(map);
    }

    public String changeMapToString(Map<String, Integer> map) {
        return map.keySet().stream().map(key -> "\"" + key + "\"" + " - " + map.get(key) + "\n")
                .collect(Collectors.joining());
    }
}
