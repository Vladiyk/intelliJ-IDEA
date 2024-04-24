package lecture4.practic;

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        System.out.print("Введить слово: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        switch (word){
            case ("Сонячно"):{
                System.out.println(word + " перекладаеться як Sunny");
                break;
            }
            case ("Дощ"):{
                System.out.println(word + " перекладаеться як Rain");
                break;
            }
            case ("Сніг"):{
                System.out.println(word + " перекладаеться як Snow");
                break;
            }
            case ("Хмарно"):{
                System.out.println(word + " перекладаеться як Cloudy");
                break;
            }
            case ("Вітряно"):{
                System.out.println(word + " перекладаеться як Windy");
                break;
            }
            case ("Гроза"):{
                System.out.println(word + " перекладаеться як Thunderstorm");
                break;
            }
            case ("Торнадо"):{
                System.out.println(word + " перекладаеться як Tornado");
                break;
            }
            case ("Ураган"):{
                System.out.println(word + " перекладаеться як Hurricane");
                break;
            }
            case ("Туман"):{
                System.out.println(word + " перекладаеться як Fog");
                break;
            }
            case ("Злива"):{
                System.out.println(word + " перекладаеться як Downpour");
                break;
            }
            default:
                System.out.println("Такого слова немає в нашому словнику");
        }
    }
}
