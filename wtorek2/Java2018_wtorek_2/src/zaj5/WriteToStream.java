package zaj5;

import java.io.*;

/**
 * Created by Krzysztof Podlaski on 27.03.2018.
 */
public class WriteToStream {


    public static void main(String[] s) throws IOException {
        File file = new File("plik.txt");
        //Prosty strumień
        OutputStream os = new FileOutputStream(file);
        writeToStream(os,"Ala ma kota".getBytes());
        for (int i=70; i<120; i++)
            writeToStream(os,i);
        os.close();
        os = new FileOutputStream(file, true);
        //Strumień formatowany
        OutputStreamWriter _sw = new OutputStreamWriter(os);
        BufferedWriter sw = new BufferedWriter(_sw);
        sw.write("\nAla Ma drugiego kota");
        for (int i=70; i<120; i++)
            sw.write(""+i);
        sw.newLine();
        sw.close();
        //Zapis binarny
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(file, true)
        );
        for (int i=70; i<120; i++) {
            oos.writeInt(i);
            oos.writeDouble(i*1.0);
        }
        oos.close();
    }

    static void writeToStream(OutputStream os, byte[] bytes ) throws IOException {
        os.write(bytes);
    }

    static void writeToStream(OutputStream os, int bytes ) throws IOException {
        os.write(bytes);
    }
}
