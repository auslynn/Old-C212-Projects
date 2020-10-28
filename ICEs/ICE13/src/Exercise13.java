/*
 * Author: Austin Lynn User: auslynn
 * Assignment: ICE 13
 * Date Last Updated: 4/24/20
 */

import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;

public class Exercise13 {

    public static void linearSearch()
    {
        int[] arr = new int[1000000];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int) ((Math.random() * ((2000 - 1000) + 1)) + 1000);
        }

        Map<Integer, Integer> listOfTimesFound = new HashMap<>();

        int times = 0;

        long start = System.currentTimeMillis();
        for(int i = 0; i < 10; i++)
        {
            ArrayList<Integer> locations = new ArrayList<>();
            int rand = (int) ((Math.random() * ((2000 - 1000) + 1)) + 1000);

            for(int j = 0; j < arr.length; j++)
            {

                if(rand == arr[j])
                {
                    times = times + 1;
                    locations.add(j);
                }

                listOfTimesFound.put(rand, times);

            }

            System.out.println("Number " + rand + ":");
            System.out.println("Locations: " + locations);
            System.out.println("List of Times Found: " + listOfTimesFound);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken for a linear search: " + (end - start));

        System.out.println("\n");
    }

    public static void binarySearch()
    {
        int[] array = new int[1000000];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) ((Math.random() * ((2000 - 1000) + 1)) + 1000);
        }

        Arrays.sort(array);
        Map<Integer, Integer> listOfLocations = new HashMap<>();

        int times = 0;

        long begin = System.currentTimeMillis();
        
        for(int i = 0; i < 10; i++)
        {

            int rand = (int) ((Math.random() * ((2000 - 1000) + 1)) + 1000);

            int index = Arrays.binarySearch(array, rand);

            while(rand == array[index])
            {
                listOfLocations.put(rand , Arrays.binarySearch(array, rand));
                times = times + 1;

                index = index + 1;
            }

            System.out.println("Number " + rand + ":");
            System.out.println("List of Locations: " + listOfLocations);
            System.out.println("Times Found: " + times);


        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken for binary search: " + (end - begin));
        System.out.println("\n");
    }

    public static void linearSearchArrayList()
    {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 1000000; i++)
        {
            arr.add((int) ((Math.random() * ((2000 - 1000) + 1)) + 1000));
        }

        Map<Integer, Integer> listOfTimesFound = new HashMap<>();

        int times = 0;

        long begin = System.currentTimeMillis();
        for(int i = 0; i < 10; i++)
        {
            ArrayList<Integer> locations = new ArrayList<>();
            int rand = (int) ((Math.random() * ((2000 - 1000) + 1)) + 1000);

            for(int j = 0; j < arr.size(); j++)
            {

                if(rand == arr.get(j))
                {
                    times = times + 1;
                    locations.add(j);
                }

                listOfTimesFound.put(rand, times);

            }

            System.out.println("Number " + rand + ":");
            System.out.println("Locations: " + locations);
            System.out.println("List of Times Found: " + listOfTimesFound);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken for a linear search: " + (end - begin));

        System.out.println("\n");
    }

    public static void binarySearchArrayList()
    {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 1000000; i++)
        {
            arr.add((int) ((Math.random() * ((2000 - 1000) + 1)) + 1000));
        }

        Collections.sort(arr);
        Map<Integer, Integer> listOfLocations = new HashMap<>();

        int times = 0;

        long begin = System.currentTimeMillis();
        for(int i = 0; i < 10; i++)
        {

            int rand = (int) ((Math.random() * ((2000 - 1000) + 1)) + 1000);

            int index = Collections.binarySearch(arr, rand);

            while(rand == arr.get(index))
            {
                listOfLocations.put(rand, Collections.binarySearch(arr, rand));
                times = times + 1;

                index = index + 1;
            }

            System.out.println("Number " + rand + ":");
            System.out.println("List of locations: " + listOfLocations);
            System.out.println("Times Found: " + times);


        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken for a binary search: " + (end - begin));
    }

    public static void main(String[] args)
    {
       linearSearch();
       System.out.println("\n");
       System.out.println("\n");
       binarySearch();
       System.out.println("\n");
       System.out.println("\n");

       linearSearchArrayList();
       System.out.println("\n");
       System.out.println("\n");
       binarySearchArrayList();
       System.out.println("\n");
       System.out.println("\n");


    }
}
