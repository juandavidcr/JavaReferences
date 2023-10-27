package org.jdcrtek;


import java.util.HashMap;
import java.util.Map;

public class PracticaMaps {
    public static void main(String[] args) {
        Map<Integer,String> criptoMonedas = new HashMap<>();
        Map<Integer,String> criptoMonedas2 = new HashMap<>();

        criptoMonedas.put(1,"BTC");
        criptoMonedas.put(2,"PEPE");
        criptoMonedas.put(3,"ETH");
        criptoMonedas.put(4,"SOL");
        criptoMonedas.put(5,"CAR");
        criptoMonedas.put(6,"XRP");

        criptoMonedas2.put(1,"BTC");
        criptoMonedas2.put(2,"PEPE");
        criptoMonedas2.put(3,"ETH");
        criptoMonedas2.put(4,"SOL");
        criptoMonedas2.put(5,"CAD");
        criptoMonedas2.put(6,"XRP");

        System.out.println("Method keySet(): Imprime las keys del Map \n");
        System.out.println("Claves: "+criptoMonedas.keySet());
        System.out.println("--------------------------------------------");
        System.out.println("Valores: "+criptoMonedas.values());
        System.out.println("--------------------------------------------");
        System.out.println("Method get(valor de la key): "+criptoMonedas.get(3));
        System.out.println("--------------------------------------------");
        System.out.println("Method isEmpty() {return boolean}: "+criptoMonedas.isEmpty());
        System.out.println("--------------------------------------------");
        System.out.println("Method size() {return int}: "+criptoMonedas.size());
        System.out.println("--------------------------------------------");
        System.out.println("Method containsKey(<valor a buscar del lado de las key>) {return boolean} -> Te dice si la key existe o no existe: "+criptoMonedas.containsKey(2));
        System.out.println("--------------------------------------------");
        System.out.println("Method .containsValue(\"CAr\") originalmente se ingreso CAR y compara las cadenas de manera estricta {return boolean}: "+criptoMonedas.containsValue("CAr"));
        System.out.println("--------------------------------------------");
        System.out.println("Method equals(<obj>) {return true|false} Si el obj es del mismo tipo.->> objetos diferentes o iguales"+criptoMonedas.equals(criptoMonedas2));
        System.out.println("Method getOrDefault(Object key String defaultValue) {return el valor si no existe la clave previamente en el map }"+criptoMonedas.getOrDefault(8,"SHIBA INU"));
        System.out.println("Claves: "+criptoMonedas.keySet());
        System.out.println("Valores: "+criptoMonedas.values());
        System.out.println("Recorrer un Map: \n");
        criptoMonedas.forEach((k,v)-> System.out.println("clave: "+k+"  val: "+v+"\n"));

        //criptoMonedas2.forEach((k,v)-> System.out.println("clave: "+k+"  val: "+v));
        System.out.println("method remove(<key>) ");
        criptoMonedas2.remove(2);
        criptoMonedas2.forEach((k,v)-> System.out.println("clave: "+k+"  val: "+v));
        System.out.println("method replace");
        criptoMonedas2.replace(5,"SHIBA");
        criptoMonedas2.forEach((k,v)-> System.out.println("clave: "+k+"  val: "+v));

    }
}
