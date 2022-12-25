package leedCode;/*
        3 . Самая длинная подстрока без повторяющихся символов
        Середина
        31К
        1,3 К
        Компании
        Дана строка s, найдите длину самой длинной
        подстрока
        без повторяющихся символов.

        Пример 1:

        Ввод: s = "abcabcbb"
         Вывод: 3
         Объяснение: Ответ "abc", длина 3.
        Пример 2:

        Вход: s = "bbbb"
         Выход: 1
         Объяснение: Ответ "b" с длиной 1.
        Пример 3:

        Ввод: s = "pwwkew"
         Вывод: 3
         Объяснение: Ответ "wke" с длиной 3.
        Обратите внимание, что ответ должен быть подстрокой,
        «pwke» — это подпоследовательность, а не подстрока.

        Ограничения:

        0 <= s.length <= 5 * 104
        sсостоит из английских букв, цифр, символов и пробелов.
 */

import java.util.ArrayList;

public class longestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbbvbnmjh";
       int size = lengthOfLongestSubstring(s);
        System.out.println(size);
    }
    public static int lengthOfLongestSubstring(String s) {
        int index = 0;
        int number = 0;
        int lenght = 0;
        char[]arrays = s.toCharArray();
        ArrayList<Character> lists  = new ArrayList<>();
        for (int i = 0; i < arrays.length; i++) {
            if (lists.contains(arrays[i])) {
                if (lenght < lists.size()) {
                    lenght = lists.size();
                }
                index = lists.indexOf(arrays[i]);//первое совпадение в списке
                number += index + 1;
                i = number;
                lists  = new ArrayList<>();
            }
            lists.add(arrays[i]);
        }
        if (lenght < lists.size()) {
            lenght = lists.size();
        }
        return lenght;

    }
}
