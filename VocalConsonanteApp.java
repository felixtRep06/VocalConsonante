package vocalconsonanteapp;

/**
 *
 * @author Oem
 */
public class VocalConsonanteApp {

    public static void main(String[] args) {
    char ch = args[0].charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " es una vocal.");
        else 
            System.out.println(ch + " es una consonante.");
    }
    
}
