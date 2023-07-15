package leedCode.longestPalindrome;
/**Идея проста и эффективна — для каждого символа в заданной
 * строке считать его серединой палиндрома и расширять в обоих направлениях,
 * чтобы найти палиндром максимальной длины.
 * Для палиндрома четной длины считайте каждую соседнюю пару символов
 * средней точкой.
 * */
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babbad"));
    }
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
