package lecture4.practic.improvedTranslator;

import lecture4.practic.IColor;

import java.util.Scanner;

public class Translator {
    public static String answer;
    public static String translation(String word, String continuum){
        String ans = null;
        Scanner sc = new Scanner(System.in);
        String YELLOW = "\u001B[33m";
        String RESET = "\u001B[0m";

        switch (word) {
            case "сонячно":
                ans = "Sunny";
                answer = sc.next().toLowerCase();
                break;
            case "дощ":
                ans = "Rain";
                answer = sc.next().toLowerCase();
                break;
            case "сніг":
                ans = "Snow";
                answer = sc.next().toLowerCase();
                break;
            case "хмарно":
                ans = "Cloudy";
                answer = sc.next().toLowerCase();
                break;
            case "вітряно":
                ans = "Windy";
                answer = sc.next().toLowerCase();
                break;
            case "гроза":
                ans = "Thunderstorm";
                answer = sc.next().toLowerCase();
                break;
            case "торнадо":
                ans = "Tornado";
                answer = sc.next().toLowerCase();
                break;
            case "ураган":
                ans = "Hurricane";
                answer = sc.next().toLowerCase();
                break;
            case "туман":
                ans = "Fog";
                answer = sc.next().toLowerCase();
                break;
            case "злива":
                ans = "Downpour";
                answer = sc.next().toLowerCase();
                break;
            default:
                System.out.print("Такого слова немає в нашому словнику\n" + continuum);
                answer = sc.next().toLowerCase();
        }
        return word + " перекладаеться як " + IColor.ANSI_YELLOW +
                ans + IColor.ANSI_RESET + "\n" + continuum;
    }
}