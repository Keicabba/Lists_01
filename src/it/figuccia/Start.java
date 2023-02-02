package it.figuccia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Start {

    public static void main(String[] args) {

//        List<String> cityNames = List.of("Roma","Palermo","Napoli"); funziona uguale
        List<String> cityNames = Arrays.asList("Roma","Palermo","Napoli");
        cityNames = (cityNames);
        cityNames = Collections.unmodifiableList(cityNames);
//        cityNames.add("Catania");                 unmodifiableList
//        cityNames.set(1, "Tegucigalpa");          unmodifiableList
        System.out.println(cityNames);
        List<String> kingsOfRome = new ArrayList<String>();
        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Anco Marco");
        kingsOfRome.add("Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");
        kingsOfRome.add("Tarquinio il Superbo");
        System.out.println(kingsOfRome);

        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);
        kingsOfRomeArray[6]= "Lucius Tarquinius Supercar";
        System.out.println(Arrays.toString(kingsOfRomeArray));
    }
}


/*
public class Start {

    public static List<String> asList(List<String> nList){
        return nList = Collections.unmodifiableList(nList);
    }
    public static void main(String[] args) {

        String[] listCitys = new String[]{"Roma","Palermo","Napoli"};
        List<String> cityNames = Arrays.asList(listCitys);

        cityNames = asList(cityNames);
//        cityNames.add("Catania");                 unmodifiableList
//        cityNames.set(1, "Tegucigalpa");          unmodifiableList
        System.out.println(cityNames);

        List<String> kingsOfRome = new ArrayList<String>();
        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Anco Marco");
        kingsOfRome.add("Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");
        kingsOfRome.add("Tarquinio il Superbo");
        System.out.println(kingsOfRome);

        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);
        kingsOfRomeArray[6]= "Lucius Tarquinius Supercar";
        System.out.println(Arrays.toString(kingsOfRomeArray));
    }
}
*/