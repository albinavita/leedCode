package leedCode;
/*Вы поднимаетесь по лестнице. Требуется n несколько шагов, чтобы достичь вершины.
Каждый раз можно либо подняться 1, либо 2 сделать шаг. Сколькими различными способами вы можете подняться на вершину?
Пример 1:
Вход: n = 2
 Выход: 2
 Объяснение: Есть два способа взобраться на вершину.
1. 1 шаг + 1 шаг
2. 2 шага

Пример 2:
Вход: n = 3
 Выход: 3
 Объяснение: Есть три способа подняться на вершину.
1. 1 шаг + 1 шаг + 1 шаг
2. 1 шаг + 2 шага
3. 2 шага + 1 шаг

Ограничения:
1 <= n <= 45
*/

public class Climbing {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(climbStairs(n));
    }
    public static int climbStairs(int n) {
        int result = 1;
        int oldResult = 0;
      //  int currResult = 1;
        if (n < 2){
            return n;
        } else {
            for (int i = 0; i < n; i++) {
                result += oldResult;// + currResult;
                oldResult = result - oldResult;
               // oldResult = currResult;
               // currResult = result;
            }

        }
        return result;
    }
}
