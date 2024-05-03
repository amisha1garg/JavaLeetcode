package dsaJavaPrograms.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        System.out.println(arrayList.get(2));

        arrayList.set(2, 50);
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        arrayList.add(1, 140);   // similar to insert
        System.out.println(arrayList);

        arrayList.remove(1);   // similar to insert
        System.out.println(arrayList);
    }
}
