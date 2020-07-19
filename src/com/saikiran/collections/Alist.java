package com.saikiran.collections;

import java.util.*;

public class Alist {

    public static void  toUpper(Iterable<String> itr){
        Iterator<String> iterator = itr.iterator();
        while(iterator.hasNext()){
            String up =  iterator.next();

            System.out.printf("%s, ",up.toUpperCase());
        }
    }

    public static void main(String[] args) {
        List<String> someColors = new ArrayList<>(3);
        someColors.add("Yellow");
        someColors.add("Red");
        someColors.add("Green");
        someColors.add("Blue");
        someColors.add("Violet");

        System.out.println(someColors);
        System.out.print("Perform Operations :");

        someColors.add(0,"Black");
        someColors.add(4,"White");
        for(String color: someColors){
            System.out.printf("%s , ", color);
        }

        System.out.printf("\nElement at 2nd Index : %s \n", someColors.get(2));
        //Remove 2nd Pos
        someColors.remove(2);
        someColors.add(2,"Blood Red");
        System.out.printf("\nElement at 2nd Index : %s \n", someColors.get(2));

        //Just Update back it
        someColors.set(2,"Red");
        System.out.printf("\nElement at 2nd Index : %s \n", someColors.get(2));
        System.out.print("PROMPT: Enter color to find: ");
        Scanner scanner = new Scanner(System.in);
        String toLookFor = scanner.next();
        System.out.printf("\nYour color is at %d position.",someColors.indexOf(toLookFor) + 1);
        Collections.sort(someColors);
        System.out.print("\nAfter  Sorting Colors: "+someColors );

        //Copy into Array List
        List<String> copyOfColors = new ArrayList<>(someColors);
        System.out.println("\nCopy of the same: "+ copyOfColors.toString() );
        Collections.shuffle(copyOfColors);
        System.out.println("\nCopy of the same after Shuffling: "+ copyOfColors.toString() );

        //Two ways to reverse
        for(int i = 0; i < copyOfColors.size()/2; i++){
//            String tempColor = copyOfColors.get( );
//            copyOfColors.set(copyOfColors.size() -i -1 , copyOfColors.get(i));
//            copyOfColors.set(i,tempColor);
            Collections.swap(copyOfColors, i, copyOfColors.size() -i -1 );
        }

        System.out.println("After Reversing: "+ copyOfColors.toString());

        // Or You could have just done
        Collections.reverse(copyOfColors);
        System.out.println("After Reversing: "+ copyOfColors.toString());
        //subList is always upperBound
        System.out.print("First 3 elements are : "+ copyOfColors.subList(0,3));

        //Finally Merging lists
        someColors.addAll(copyOfColors);
        System.out.println("After Adding lists: "+ ((ArrayList<String>) someColors).clone());
        //To Empty the list
        someColors.removeAll(someColors);
        System.out.printf("\nIs the List Empty now? %s \n",someColors.isEmpty());
        someColors = (List<String>) ((ArrayList<String>) copyOfColors).clone();
        ((ArrayList<String>) someColors).trimToSize();
        ((ArrayList<String>) someColors).ensureCapacity(12);

        //Iterator print
        toUpper(someColors);
    }
}
