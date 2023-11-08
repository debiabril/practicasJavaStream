package org.example;


import java.util.*;
import java.util.stream.Collectors;

// EJERCICIOS DE STEAM DE LA PÁGINA https://www.w3resource.com/java-exercises/stream/index.php
public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        int[] listaEnteros = {2,5,4,7};
        //System.out.println(averageCalculate(listaEnteros));

        //Ejercicio2
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("COsas");
        stringList.add("MAYusculas");
        stringList.add("minUSCULAS");
        stringList.add("TODO junto");
        stringList.add("LO QUE venga");
        stringList.add("DONT WORRY");
        stringList.add("be happy");
        stringList.add("TODO junto");
        stringList.add("DONT WORRY");
        //System.out.println(convertToLowercase(stringList));
        //System.out.println(convertToUppercase(stringList));

        //Ejercicio3
        List < Integer > numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> listaEnteros1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        //sumadeTodo(numbers);
        //sumadeTodo(listaEnteros1);

        //Ejercicio4
        //System.out.println(sacarDuplicados(stringList));

        //Ejercicio5
        cantStringsConXletra(stringList, "m");

        //Ejercicio6
        ordenarAlfabeticamente(stringList);
    }

    // Ejercicio1 Write a Java program to calculate the average of a list of integers
    // using streams
    public static double averageCalculate(int[]integerList){
        return Arrays.stream(integerList).average().orElse(0.0);
    }

    //Ejercicio 2 Write a Java program to convert a list of strings to uppercase
    // or lowercase using streams.
    public static List<String> convertToLowercase (ArrayList<String> listaStrings){
        return  listaStrings.stream().map(String::toLowerCase).collect(Collectors.toList());
    }
    public static List<String> convertToUppercase (ArrayList<String> listaStrings){
        return  listaStrings.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    //Ejercicio3 Write a Java program to calculate the sum of all even,
    // odd numbers in a list using streams.
    public static void sumadeTodo (List<Integer> integerList){
        int sumaPares = integerList.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("La suma de los numeros pares es: " + sumaPares);
        int sumaImpares = integerList.stream().filter(num -> num % 2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println("La suma de los numeros impares es: " + sumaImpares);
    }

    //Ejercicio4 Write a Java program to remove all duplicate elements
    // from a list using streams.
    public static List<String> sacarDuplicados(List<String> listaStrings){
        return listaStrings.stream().distinct().collect(Collectors.toList());
    }

    //Ejercicio5 Write a Java program to count the number of strings in a list
    // that start with a specific letter using streams.
    public static void cantStringsConXletra (List<String> listaStrings, String x){
         List<String> lista = listaStrings.stream().filter(s -> s.startsWith(x)).collect(Collectors.toList());
        int count = lista.size();
        System.out.println(count);
    }

    //Ejercicio6 Write a Java program to sort a list of strings in alphabetical order,
    // ascending and descending using streams.
    public static void ordenarAlfabeticamente (List<String> listaString){
        List<String> listaOrdenada = listaString.stream().sorted().collect(Collectors.toList());
        System.out.println(listaOrdenada);
        List<String> listDesordenada = listaString.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(listDesordenada);
    }

}