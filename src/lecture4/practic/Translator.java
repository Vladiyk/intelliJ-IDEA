package lecture4.practic;

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {

        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        String word;
        String answer;
        String continuum = "Перекласти ще одне слово? (Так/Ні) ";

        while (!exit){
            System.out.print("Введить слово: ");
            word = sc.next();

            switch (word) {
                case "Сонячно":
                    System.out.println(word + " перекладаеться як Sunny");
                    System.out.print(continuum);
                    answer = sc.next();
                    break;
                case "Дощ":
                    System.out.println(word + " перекладаеться як Rain");
                    System.out.print(continuum);
                    answer = sc.next();
                    break;
                case "Сніг":
                    System.out.println(word + " перекладаеться як Snow");
                    System.out.print(continuum);
                    answer = sc.next();
                    break;
                case "Хмарно":
                    System.out.println(word + " перекладаеться як Cloudy");
                    System.out.print(continuum);
                    answer = sc.next();
                    break;
                case "Вітряно":
                    System.out.println(word + " перекладаеться як Windy");
                    System.out.print(continuum);
                    answer = sc.next();
                    break;
                case "Гроза":
                    System.out.println(word + " перекладаеться як Thunderstorm");
                    System.out.print(continuum);
                    answer = sc.next();
                    break;
                case "Торнадо":
                    System.out.println(word + " перекладаеться як Tornado");
                    System.out.print(continuum);
                    answer = sc.next();
                    break;
                case "Ураган":
                    System.out.println(word + " перекладаеться як Hurricane");
                    System.out.print(continuum);
                    answer = sc.next();
                    break;
                case "Туман":
                    System.out.println(word + " перекладаеться як Fog");
                    System.out.print(continuum);
                    answer = sc.next();
                    break;
                case "Злива":
                    System.out.println(word + " перекладаеться як Downpour");
                    System.out.print(continuum);
                    answer = sc.next();
                    break;
                default:
                    System.out.println("Такого слова немає в нашому словнику");
                    System.out.print(continuum);
                    answer = sc.next();
            }
            switch (answer){
                case "Так":
                    continue;
                case "Ні":
                    exit = true;
                    break;
            }
        }
    }
}