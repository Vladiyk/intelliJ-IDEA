package lecture4.practic.improvedTranslator;

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
                System.out.print(word + " перекладаеться як " + YELLOW +
                        ans + RESET +"\n" + continuum);
                answer = sc.next().toLowerCase();
                break;
            case "дощ":
                ans = "Rain";
                System.out.print(word + " перекладаеться як " + YELLOW +
                        ans + RESET + "\n" + continuum);
                answer = sc.next().toLowerCase();
                break;
            case "сніг":
                ans = "Snow";
                System.out.print(word + " перекладаеться як " + YELLOW +
                        ans + RESET + "\n" + continuum);
                answer = sc.next().toLowerCase();
                break;
            case "хмарно":
                ans = "Cloudy";
                System.out.print(word + " перекладаеться як " + YELLOW +
                        ans + RESET + "\n" + continuum);
                answer = sc.next().toLowerCase();
                break;
            case "вітряно":
                ans = "Windy";
                System.out.print(word + " перекладаеться як " + YELLOW +
                        ans + RESET + "\n" + continuum);
                answer = sc.next().toLowerCase();
                break;
            case "гроза":
                ans = "Thunderstorm";
                System.out.print(word + " перекладаеться як " + YELLOW +
                        ans + RESET + "\n" + continuum);
                answer = sc.next().toLowerCase();
                break;
            case "торнадо":
                ans = "Tornado";
                System.out.print(word + " перекладаеться як " + YELLOW +
                        ans + RESET + "\n" + continuum);
                answer = sc.next().toLowerCase();
                break;
            case "ураган":
                ans = "Hurricane";
                System.out.print(word + " перекладаеться як " + YELLOW +
                        ans + RESET + "\n" + continuum);
                answer = sc.next().toLowerCase();
                break;
            case "туман":
                ans = "Fog";
                System.out.print(word + " перекладаеться як " + YELLOW +
                        ans + RESET + "\n" + continuum);
                answer = sc.next().toLowerCase();
                break;
            case "злива":
                ans = "Downpour";
                System.out.print(word + " перекладаеться як " + YELLOW +
                        ans + RESET + "\n" + continuum);
                answer = sc.next().toLowerCase();
                break;
            default:
                System.out.print("Такого слова немає в нашому словнику\n" + continuum);
                answer = sc.next().toLowerCase();
        }
        return YELLOW + ans + RESET;
    }
}