/* websockets - key code & terms
    - URI class
        - Represents resource identifiers
    - websocket
        - 
 */

package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class websockets {
    public static final String URL = 
    "https://www.cs.rhul.ac.uk/home/uxac009/example.txt";

    public static void main(String[] args) {
        try {
            URI uri = new URI(URL);
            URL url = uri.toURL();
            URLConnection conn = url.openConnection();
            try (BufferedReader r = new BufferedReader(
                new InputStreamReader(conn.getInputStream())
            )) { 
                String line = r.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = r.readLine();
                }
            }
        } catch (URISyntaxException | IOException e) {
            System.out.println("An error occured!"); 
            System.out.println(e);
        }
    } 
}
