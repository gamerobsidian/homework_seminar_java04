/*
 * 3. В калькулятор добавьте возможность отменить последнюю операцию.
Пример

1
+
2
ответ:
3

+
4
ответ:
7

Отмена
3
*
3

ответ:
9

Пример 2
Ввод: 1
Ввод: +
Ввод: 2
Вывод: 3
Ввод:+
Ввод:4
Вывод 7
Ввод:*
Ввод:3
Вывод 21
Отмена
Вывод 7
Отмена
Вывод 3
Ввод:-
Ввод:1
Вывод 2

Дополнительно каскадная отмена - отмена нескольких операций

*/

package homework_seminar_java04;

import java.util.Scanner;
import java.util.Stack;

public class task3 {
    public static void main(String[] args) throws Exception {

        Scanner scaner = new Scanner(System.in);
        String input = scaner.next();
        Stack<Integer> calc = new Stack<Integer>();
        while (scaner.hasNext()) {
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                int x = 0;
                int y = 0;
                int r = 0;
                if (Character.isDigit(c)) {
                    int t = Character.getNumericValue(c);
                    calc.push(t);
                } else if (c == '+') {
                    x = calc.pop();
                    y = calc.pop();
                    r = x + y;
                    calc.push(r);
                } else if (c == '-') {
                    x = calc.pop();
                    y = calc.pop();
                    r = x - y;
                    calc.push(r);
                } else if (c == '*') {
                    x = calc.pop();
                    y = calc.pop();
                    r = x * y;
                    calc.push(r);
                } else if (c == '/') {
                    x = calc.pop();
                    y = calc.pop();
                    r = x / y;
                    calc.push(r);
                }
            }
        }
        int a = calc.pop();
        System.out.println(a);
     }     
}
