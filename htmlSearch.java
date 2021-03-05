import java.awt.Robot;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

//Matan Kedar
//12.31.20


public class htmlSearch {
    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the full url");
        String link = sc.next();

        URL url = new URL(link);
        URLConnection urlConn = url.openConnection();
        InputStreamReader inStream = new InputStreamReader(urlConn.getInputStream());
        BufferedReader buff = new BufferedReader(inStream);
        String line = buff.readLine();

        while (line != null) {


            System.out.println(line);
            line = buff.readLine();

        }
            }
        }




