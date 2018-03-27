package zaj5;

import java.io.*;
import java.net.URL;

/**
 * Created by Krzysztof Podlaski on 27.03.2018.
 */
public class ReadFromStream {

    public static void main(String[] args) throws IOException {
        File f = new File("plik.txt");
        //Podstawowy odczyt ze strumienia
        InputStream is = new FileInputStream(f);
        countXesInStream(is);
        is.close();
        System.out.println("\n=============");
        //Odczyt zsformatowany
        BufferedReader fr = new BufferedReader(
                new FileReader(f));
        String line;
        while ( (line=fr.readLine())!=null ){
            System.out.println(line);
        }

        fr.close();

        URL url = new URL("http://www.uni.lodz.pl");
        is = url.openStream();
        int xes =countXesInStream(is);
        is.close();
        System.out.println("\n=============");
        System.out.println(xes);
    }

    private static int countXesInStream(InputStream is) throws IOException {
        int z;
        int x =(int) 'x';
        int X = (int) 'X';
        int result =0;
        while( (z=is.read())>-1 ){
            System.out.print((char)z);
            if (z==x || z==X) result++;
        }
        return result;
    }
}
