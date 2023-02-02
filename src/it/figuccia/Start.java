package it.figuccia;

import java.util.*;

public class Start {

    public static List<String> asList(List<String> nList){
        return nList = Collections.unmodifiableList(nList);
    }


    public static void main(String[] args) {
/*
        String[] cityNames = new String[]{"Roma","Palermo","Napoli"};
        List<String> listCitys = Arrays.asList(cityNames);
*/
        List<String> cityNames = List.of("Roma","Palermo","Napoli");
        cityNames = asList(cityNames);
//        listCitys.add("Catania");                 unmodifiableList
//        listCitys.set(1, "Tegucigalpa");          unmodifiableList
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
