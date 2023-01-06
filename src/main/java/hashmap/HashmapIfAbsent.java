package hashmap;

import java.util.HashMap;

public class HashmapIfAbsent {
    public static void main(String[] args) {

        HashMap<String, String> catOwners = new HashMap<>();
        catOwners.put("Tom", "Mira");
        catOwners.put("Garfield", "Aisuluu");
        catOwners.put("Akzholtoi", "Saikal");
        catOwners.put("MyiMyi", "Myrzakhan");

        System.out.println("cat owners: " + catOwners);
        System.out.println("size: " + catOwners.size());

        catOwners.putIfAbsent("Arti", "Alina");
        System.out.println("cat owners: " + catOwners);
        System.out.println("size: " + catOwners.size());

        catOwners.putIfAbsent("MyiMyi", "Meerim"); // it will not add this value since coz we have same key in hashmap

        catOwners.putIfAbsent("Ginger", "Alina");
        System.out.println("cat owners: " + catOwners);

        int i = 1;
        for(String key : catOwners.keySet()){
            System.out.println("cat #" + i + ": " + key);
            i++;
        }

        // =============================

        int j = 1;
        for(String key : catOwners.keySet()){
            System.out.println("cat #" + j + ": " + key + ", owner #" + j + ": " + catOwners.get(key));
            j++;
        }

        // ======================
        for(String catOwnerName : catOwners.values()){
            System.out.println("cat owner's name: " + catOwnerName);
        }


        Object copy = null;
        copy = catOwners.clone();
        System.out.println(copy);

        catOwners.replace("Arti", "Ilgiz");
        System.out.println(catOwners);

    }
}
