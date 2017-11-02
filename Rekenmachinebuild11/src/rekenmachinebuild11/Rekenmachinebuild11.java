/*
 * 'Rekenmachine' door Wouter Honselaar (17053994) en Peter Ng (17065186)
 * Klas 2A
 * build 11
 * versie 1.0
 * features:
 * - Gebruiker heeft keuze uit optrekken, aftrekken, vermenigvuldigen. delen, machtsverheffen, worteltrekken, logaritmen berekenen en berekening intypen
 * - Programma blijft draaien totdat gebruiker aangeeft niet meer verder te willen
 * - Decimaalnotatie is op de Nederlandse wijze
 */
package rekenmachinebuild11;
import java.util.Scanner;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Rekenmachinebuild11 {
    

    /**
     * @param Array
     * @param hoeveel
     * @return 
     */
    public static double optellen(double[] Array, int hoeveel) {
            int teller = 0;
            double som = 0;
            while (hoeveel > teller) {
                som = som + Array[teller];
                teller++;
            }
        return som;
    }
    public static double aftrekken(double[] Array, int hoeveel) {
            int teller = 1;
            double verschil = Array[0];
            while (hoeveel > teller) {
                verschil = verschil - Array[teller];
                teller++;
            }
            return verschil;
    }
    public static double vermenigvuldigen(double[] Array, int hoeveelheid) {
            int teller = 1;
            double vermenigvuldiging = Array[0];
            while (hoeveelheid > teller) {
                vermenigvuldiging = vermenigvuldiging * Array[teller];
                teller++;
            }
            return vermenigvuldiging;
    }
    public static double delen(double[] Array, int hoeveel) {
            int teller = 1;
            double deling = Array[0];
            while (hoeveel > teller) {
                deling = deling / Array[teller];
                teller++;
            }
            return deling;
    }
    public static void afdrukken(double antwoord)
    {
        String antwoordStr;
        if(antwoord == (int) antwoord)
            System.out.println((int) antwoord);
        else {           
           antwoordStr = String.valueOf(antwoord);
           antwoordStr = antwoordStr.replace(".",",");
           System.out.println(antwoordStr);
        }
    }
    public static void main(String[] args) throws ScriptException {
        // TODO code application logic here
    String verder="J";
    Scanner invoer = new Scanner(System.in);
    while (verder.equalsIgnoreCase("J")) {
        System.out.println("Hoi, wat wil je doen?\nType 'optellen', 'aftrekken', 'vermenigvuldigen', 'delen', 'machtsverheffen', 'worteltrekken' of 'logaritmen'.\nJe kunt er ook voor kiezen om een berekening in te typen. Type hiervoor 'rekenen'.");
        String keuze = invoer.nextLine();
        int teller = 0;
        boolean optieJuist = true;
        {
            switch (keuze) {
                // <editor-fold defaultstate="collapsed" desc=" optellen ">
                case "optellen": {
            System.out.println("Hoeveel getallen wil je optellen?");
            int hoeveel = invoer.nextInt();
            System.out.println("Type de getallen die je in wilt voeren. Druk na elk getal op 'enter'.");
            double[] Array;
            Array = new double[100];
            
            while (hoeveel > teller) {
                Array[teller] = invoer.nextDouble();
                teller++;
            }
            afdrukken(optellen(Array, hoeveel));
            break;
        }
        // </editor-fold>
                // <editor-fold defaultstate="collapsed" desc=" aftrekken ">
                case "aftrekken": {
            System.out.println("Hoeveel getallen wil je van elkaar aftrekken?");
            int hoeveel = invoer.nextInt();
            System.out.println("Type de getallen die je in wilt voeren. Druk na elk getal op 'enter'.");
            double[] Array;
            Array = new double[100];
            teller = 0;
            
            while (hoeveel > teller) {
                Array[teller] = invoer.nextDouble();
                teller++;
            }
            afdrukken(aftrekken(Array, hoeveel));
            break;
        }
            // </editor-fold>
                // <editor-fold defaultstate="collapsed" desc=" delen ">
                case "delen":
                    {
                        System.out.println("Hoeveel getallen wil je door elkaar delen?");
                        int hoeveel = invoer.nextInt();
                        System.out.println("Type de getallen die je in wilt voeren. Druk na elk getal op 'enter'.");
                        double[] Array;
                        Array = new double[100];
                        teller = 0;
                        while (hoeveel > teller) {
                            Array[teller] = invoer.nextDouble();
                            teller++;
                        }           afdrukken(delen(Array, hoeveel));
                        break;
                    }
        // </editor-fold>            
                // <editor-fold defaultstate="collapsed" desc=" vermenigvuldigen ">            
                case "vermenigvuldigen":
                    {
                        System.out.println("Hoeveel getallen wil je met elkaar vermenigvuldigen?");
                        int hoeveel = invoer.nextInt();
                        System.out.println("Type de getallen die je in wilt voeren. Druk na elk getal op 'enter'.");
                        double[] Array;
                        Array = new double[100];
                        teller = 0;
                        while (hoeveel > teller) {
                            Array[teller] = invoer.nextDouble();
                            teller++;
                        }           afdrukken(vermenigvuldigen(Array, hoeveel));
                        break;
                    }
        // </editor-fold>            
                // <editor-fold defaultstate="collapsed" desc=" machtsverheffen ">            
                case "machtsverheffen":
                    {
                        System.out.println("Welk getal wil je machtsverheffen?");
                        double getal = invoer.nextDouble();
                        System.out.println("En tot welke macht wil je " + getal + " verheffen?");
                        double macht = invoer.nextDouble();
                        afdrukken(Math.pow(getal, macht));
                        break;
                    }
        // </editor-fold>            
                // <editor-fold defaultstate="collapsed" desc=" worteltrekken ">            
                case "worteltrekken":
                    {
                        System.out.println("Van welk getal wil je de wortel weten?");
                        double getal = invoer.nextDouble();
                        System.out.println("En welke machtswortel?");
                        double macht = invoer.nextDouble();
                        afdrukken((Math.pow(getal, 1.0/macht)));
                        break;
                    }
        // </editor-fold>            
                // <editor-fold defaultstate="collapsed" desc="logaritmen ">            
                case "logaritmen":
                    {
                        System.out.println("Van welk getal wil je het logaritme berekenen?");
                        double getal = invoer.nextDouble();
                        System.out.println("Welk grondtal wil je gebruiken?");
                        double macht = invoer.nextDouble(); //kijken of grondtal met decimalen überhaupt kan
                        afdrukken(Math.log(getal) / Math.log(macht));
                        break;
                    }
        // </editor-fold>            
                // <editor-fold defaultstate="collapsed" desc=" rekenen ">            
                case "rekenen":
                {
                    ScriptEngineManager mgr = new ScriptEngineManager();
                    ScriptEngine engine = mgr.getEngineByName("JavaScript");
                    System.out.println("Type in wat je wilt berekenen.\nJe kunt deze rekenkundige operatoren gebruiken: + - * / () %");
                    Object berekening;
                    String invoerberekening = invoer.nextLine();
                    invoerberekening = invoerberekening.replaceAll(",",".");
                    berekening = engine.eval(invoerberekening);
                    String antwoord = berekening.toString();
                    System.out.println(antwoord);
                    System.out.println(antwoord);
                    afdrukken(Double.parseDouble(antwoord));
                    break;
                }
        // </editor-fold>
                // <editor-fold defaultstate="collapsed" desc=" default ">        
                default:
                    System.out.println(keuze);
                    System.out.println("Dat is geen optie.");
                    optieJuist = false;
                    break;
            }
        }
        // </editor-fold>
        System.out.println("Wil je nog meer berekenen? Type 'J' als je verder wilt en 'N' als je niet verder wilt.");
            if (!(keuze.equals("rekenen")) && optieJuist == true) {
                invoer.nextLine();
            }
            verder = invoer.nextLine();
            while ( !(verder.equals("J")) && !(verder.equals("N"))) {
                System.out.println("Dat is geen optie.\nProbeer het nog een keer.");
                System.out.println(verder);
                verder = invoer.nextLine();
            }
    }
    System.out.println("Oké, da's goed! Doei!");
    }    
}