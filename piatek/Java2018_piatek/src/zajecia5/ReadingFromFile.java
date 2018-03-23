package zajecia5;

import java.io.*;

/**
 * Created by Krzysztof Podlaski on 23.03.2018.
 */
public class ReadingFromFile {
    public static void main(String[] args) {
        File f = new File("plik.txt");
        InputStream in;
        try  {
            in = new FileInputStream(f);
            int b;
            while ( (b= in.read()) >-1)
            {
                System.out.print((char) b);
                System.out.print(" ");
            }
            in.close();

            BufferedReader fr = new BufferedReader(
                    new InputStreamReader(new FileInputStream(f)));
                    //new FileReader(f));
            String line;
            while ( (line = fr.readLine())!=null ){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
