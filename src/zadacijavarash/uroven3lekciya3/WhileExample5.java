package zadacijavarash.uroven3lekciya3;
/*
Используя вложенные циклы while (цикл в цикле) выведи на экран незаполненный прямоугольник
 (его контур) размером 10 (высота) на 20 (ширина) из букв 'Б'.
Незаполненная часть состоит из пробелов.
Пример вывода:
ББББББББББББББББББББ
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
ББББББББББББББББББББ
Требования:
•	Программа должна выводить текст на экран.
•	Программа должна выводить контур прямоугольника высотой 10 и шириной 20 из буквы 'Б'.
•	В программе необходимо использовать вложенные циклы while (цикл в цикле).
•	Вывод на экран должен происходить в цикле while.
 */
public class WhileExample5 {
    public static void main(String[] args) {
        int visota = 1;
        while (visota <= 10) {
            int dlina = 1;
            while (dlina <= 20) {
                if (visota == 1 || visota == 10) {
                    System.out.print('Б');
                } else if (dlina == 1 || dlina == 20) {
                    System.out.print('Б');
                } else {
                    System.out.print(' ');
                }
                dlina++;
            }
            System.out.println();
            visota++;

        }
    }

    }
