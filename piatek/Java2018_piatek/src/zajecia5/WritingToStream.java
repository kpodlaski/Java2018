package zajecia5;

import java.io.*;

/**
 * Created by Krzysztof Podlaski on 23.03.2018.
 */
public class WritingToStream {

    public static void main(String[] args) {
        //meta opis pliku, katalogu
        File file = new File("plik.txt");
        OutputStream oStream = null;
        try {
            oStream = new FileOutputStream(file);
            oStream.write("Ala Ma kota".getBytes());
            oStream.write(73);
            oStream.write('\n');
            oStream.write(12);
            BufferedOutputStream buff =
                    new BufferedOutputStream(oStream);

            //Dodany bufor javowy
            OutputStreamWriter ow =
                    new OutputStreamWriter(
                            oStream);
            //new FileOutputStream(file));
            ow.write("A kot ma myszki");
            ow.flush();
            oStream.close();
            ow.write("Cos");  //Exception bo strumień zamknięty
            ow.close();
        }
        catch (FileNotFoundException e){
            //Do Something
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
