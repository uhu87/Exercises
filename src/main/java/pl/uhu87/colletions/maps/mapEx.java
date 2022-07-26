package pl.uhu87.colletions.maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class mapEx{

    public static void main(String[] args) {
  
      
        HashMap<String, Integer> myMap = new HashMap<>();

        myMap.put("Lukasz", 10);
        myMap.put("Sonny", 30);
        myMap.put("Valery", 20);
        myMap.put("Valery", 60);
        myMap.put("Sonny", 5);

        
        String key = null;
        Integer value = 0;
        if (myMap.containsKey("Valery")){
            value = myMap.get("Valery");
        }

        Set<String>keys = myMap.keySet();


        for (String string : keys) {
            //System.out.println(myMap.get(string));            
        }

        for (Integer v : myMap.values()){
            //System.out.println(v);
        }
    
        //System.out.println(keys);
        //System.out.println(myMap);



        for (Map.Entry<String, Integer> entry : myMap.entrySet()){

            String klucz = entry.getKey();
            Integer wartosc = entry.getValue();
            System.out.println(klucz + "" + wartosc);
        }

    }  
    
}