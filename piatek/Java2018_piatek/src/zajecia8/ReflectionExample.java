package zajecia8;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by Krzysztof Podlaski on 11.05.2018.
 */
public class ReflectionExample {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException {
        String str = "Coś tam";
        Class cls = str.getClass();
        cls = String.class; //literał klasy
        cls = Class.forName("java.lang.String");
        System.out.println(Arrays.toString(
                        cls.getDeclaredFields()));
        Field field = cls.getDeclaredField("hash");
        field.setAccessible(true);
        int h = field.getInt(str);
        System.out.println(h);
        System.out.println(str.hashCode());
        h = field.getInt(str);
        System.out.println(h);
        field.set(str,123);
        System.out.println(str.hashCode());
        cls = ReflectionExample.class;
        Method m = cls.getDeclaredMethod("doSomething");
        System.out.println(Arrays.toString(m.getDeclaredAnnotations()));

    }

    @Deprecated
    public void doSomething(){

    }
}
