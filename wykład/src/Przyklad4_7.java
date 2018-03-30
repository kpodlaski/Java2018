/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author kp
 */
public class Przyklad4_7 {

    public static void main(String[] a)
    {
        //Lista na Stringi, tak samo by bylo z Set
        ArrayList<String> imiona = new ArrayList<String>();
        imiona.add("Helena");
        imiona.add("Maurycy");
        imiona.add("Hawranek");
        //Spróbujmy dodać coś innego niż String
        //imiona.add('A');
        System.out.println(imiona);
        //HashMap na int, String
        HashMap<Integer,String> mapa = new HashMap<Integer, String>();
        mapa.put(1,"Alojzy");
        mapa.put(2, "Natasza");
        mapa.put(3, "Bonifacy");
        System.out.println(mapa);


    }
}
