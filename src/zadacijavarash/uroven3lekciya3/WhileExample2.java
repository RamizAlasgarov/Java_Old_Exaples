package zadacijavarash.uroven3lekciya3;

import java.util.Scanner;

/*
Ввести с клавиатуры имя и, используя цикл while, 10 раз вывести: <имя> любит меня (переменная text).
Каждый вывод - с новой строки.
Пример вывода на экран для имени Света:


Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
...
...

Требования:
•	Программа должна считывать имя c клавиатуры.
•	Программа должна выводить текст на экран.
•	Программа должна выводить 10 раз текст, указанный в задании. Каждый вывод - с новой строки.
•	В программе необходимо использовать цикл while.
 */
public class WhileExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userinputname = scanner.nextLine();
        String text = " любит меня.";
        int i = 1;
        while (i <= 10 ){
            System.out.println(i + userinputname + text);
            i++;

}
    }
}
