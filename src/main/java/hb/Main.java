package hb;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.BreakIterator;
import java.util.Scanner;

/**
 * @author Raphael Paquin
 * @version 01
 * 2024-09-09
 */
public class Main {

    public static int Quiz() {
        int resultat = 0;
        try {
            File fichier = new File("src/main/resources/input.txt");
            Scanner lecteur = new Scanner(fichier);

            while (lecteur.hasNextLine()) {
                String ligne = lecteur.nextLine();
                String chiffres = "";

                for (char c : ligne.toCharArray())  {
                    if (Character.isDigit(c)) {
                        chiffres = chiffres + c;

                    }

                }

                String finalChiffre = String.valueOf(chiffres.charAt(0)) + chiffres.charAt(chiffres.length() - 1);
                chiffres.charAt(chiffres.length() - 1);

                resultat = resultat + Integer.parseInt(finalChiffre);

                System.out.println(finalChiffre);

            }

            lecteur.close();
        } catch (FileNotFoundException e) {
            System.out.println("Le fichier n'a pas été trouvé.");
        }
        return resultat;
    }

    public static void main(String[] args) {
        int result = Quiz();
        if (result == 54159) {
            System.out.println("BRAVO");;
        } else {
            System.out.println("Incorrect answer: " + result + "The expected output is 54159");
        }
    }
}