package zajecia5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Krzysztof Podlaski on 23.03.2018.
 */
public class ReadFromNet {
    public static void main(String[] args) throws IOException {
        String url = "http://lodz.pl";
        URL uRL = new URL(url);
        URLConnection conn = uRL.openConnection();

        BufferedReader fr = new BufferedReader(
                new InputStreamReader(conn.getInputStream()));
        String line;
        while ( (line = fr.readLine())!=null ){
            System.out.println(line);
        }
        fr.close();
    }
}
