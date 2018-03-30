/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad4;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 *
 * @author kp
 */
class Osoba
{
    private String imie = "John";
}

public class Przyklad4_12 {
    public static void main(String[] a) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException
    {
        Osoba o = new Osoba();
        Class osobaClass = o.getClass();
        System.out.println(Arrays.toString( 
                                osobaClass.getDeclaredFields()
                           ));
        Field f  = osobaClass.getDeclaredField("imie");
        f.setAccessible(true);
        System.out.println(f.get(o));
        f.set(o, "Edward");
        System.out.println(f.get(o));
    }
}
