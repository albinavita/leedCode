package easy.palindromNumber;

/**
 * 9 . Число палиндрома
 * Легкий
 * 10,2 К
 * 2,5 К
 * Компании
 * Учитывая целое число x, вернуть, trueесли xэто
 * палиндром
 * , и falseв противном случае .
 *
 *
 *
 * Пример 1:
 *
 * Ввод: x = 121
 *  Вывод: true
 *  Объяснение: 121 читается как 121 слева направо и справа налево.
 * Пример 2:
 *
 * Ввод: x = -121
 *  Вывод: false
 *  Объяснение: Слева направо читается -121. Справа налево получается 121-. Следовательно, это не палиндром.
 * Пример 3:
 *
 * Ввод: x = 10
 *  Вывод: false
 *  Объяснение: 01 читается справа налево. Следовательно, это не палиндром.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        String value = String.valueOf(x);
        StringBuilder builder = new StringBuilder(value);

        return builder.reverse().toString().equals(value);
    }
}
