package leedCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Учитывая строку s, содержащую только символы '(', ')', '{', и , определите '}',
 * допустима ли входная строка.'['']'
 *
 * Входная строка действительна, если:
 *
 * Открытые скобки должны быть закрыты однотипными скобками.
 * Открытые скобки должны быть закрыты в правильном порядке.
 * Каждой закрывающей скобке соответствует открытая скобка того же типа.
 *
 *
 * Пример 1:
 *
 * Ввод: s = "()"
 *  Вывод: правда
 * Пример 2:
 *
 * Ввод: s = "()[]{}"
 *  Вывод: правда
 * Пример 3:
 *
 * Ввод: s = "(]"
 *  Вывод: ложь
 */

public class ValidParentheses {
    private static String str = "(()[]{})";
    public static void main(String[] args) {
        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }

        Map<Character, Character> maps = new HashMap<>();
        maps.put(')', '(');
        maps.put('}', '{');
        maps.put(']', '[');
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray())  {
            if (maps.containsValue(c)) {
                stack.push(c);
            } else
           if (maps.containsKey(c)) {
               if(stack.isEmpty() || stack.pop() != maps.get(c)) {
                   return  false;
               }
           } else return true;
        }
        return stack.isEmpty();
    }

//    public boolean isValid(String s) {
//        if (s.length() % 2 != 0) {
//            return false;
//        }
//
//        Stack<Character> stack = new Stack<Character>();
//        for (char c : s.toCharArray()) {
//            if (c == '(')
//                stack.push(')');
//            else if (c == '{')
//                stack.push('}');
//            else if (c == '[')
//                stack.push(']');
//            else if (stack.isEmpty() || stack.pop() != c)
//                return false;
//        }
//        return stack.isEmpty();
//    }
}