package cadence.stride;

import java.util.HashMap;

public class JvMap extends AbstractStride {
    @Override
    public void run() {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities.get("Germany") + " is the capital of " + "Germany");
        capitalCities.remove("Germany");
        for (String i: capitalCities.keySet()) {
            System.out.println(capitalCities.get(i));
        }
        capitalCities.forEach( (key, value) -> { System.out.println("key " + key + " value " + value); } );
    }
}
