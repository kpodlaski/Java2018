package zaj8;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by Krzysztof Podlaski on 08.05.2018.
 */
public class ReflectionExample {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String s = new String("Ala ma Kota");
        Class c = s.getClass();
        Field[] f = c.getDeclaredFields();
        System.out.println(Arrays.toString(f));
        Field fHash = c.getDeclaredField("hash");
        System.out.println(fHash);
        System.out.println(s.hashCode());
        fHash.setAccessible(true);
        fHash.set(s,12);
        int i = (int) fHash.get(s);
        System.out.println(i);
        System.out.println(s.hashCode());
        Method m = c.getMethod("hashCode");
        System.out.print("--"+m.invoke(s,null));
    }

    @Override
    @SuppressWarnings("deprecation")
    public int hashCode() {
        return super.hashCode();
    }
}
