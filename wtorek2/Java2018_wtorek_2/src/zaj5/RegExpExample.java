package zaj5;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Krzysztof Podlaski on 27.03.2018.
 * http://www.vogella.com/tutorials/JavaRegularExpressions/article.html
 * https://docs.oracle.com/javase/tutorial/essential/regex/
 * https://www.regular-expressions.info/tools.html
 */
public class RegExpExample {

    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.uni.lodz.pl");
        BufferedReader br = new BufferedReader(
                new InputStreamReader( url.openStream()));
        StringBuilder sb = new StringBuilder();
        String line;
        while ( (line = br.readLine()) !=null){
            sb.append(line+"\n");
        }
        br.close();

        Pattern pattern = Pattern.compile("(src)=\"([\\S]+)\"");
        System.out.println(pattern.pattern());
        Matcher matcher = pattern.matcher(sb);
        int i=0;
        while(matcher.find()){
            System.out.println(matcher.group()+" - "+
            matcher.group(1)+" - "+matcher.group(2));
            i++;
        }
        System.out.println(i);
        //System.out.println(sb.toString());
    }
}
