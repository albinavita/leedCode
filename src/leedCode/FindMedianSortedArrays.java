package leedCode;

import java.util.Arrays;

/**
 *Учитывая два отсортированных массива nums1и nums2размер mи nсоответственно, вернуть медиану двух отсортированных массивов.
 *
 * Общая сложность времени выполнения должна быть O(log (m+n)).
 *
 * Пример 1:
 *
 * Ввод: nums1 = [1,3], nums2 = [2]
 *  Вывод: 2,00000
 *  Объяснение: объединенный массив = [1,2,3] и медиана равна 2.
 * Пример 2:
 *
 * Ввод: nums1 = [1,2], nums2 = [3,4]
 *  Вывод: 2,50000
 *  Объяснение: объединенный массив = [1,2,3,4] и медиана (2 + 3) / 2 = 2,5.
 */
public class FindMedianSortedArrays {
    public static void main(String[] args) {
        double mediana = 0.0;
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4 };
        int[] result = findMedianSortedArrays(nums1, nums2);
        int index = result.length / 2;
        System.out.println(result[index]);
        if (result.length % 2 == 0) {
            mediana = (result[index - 1] + result[index]) / 2.0;
        } else {
            mediana = result[index];
        }

        System.out.println(mediana);
        System.out.println(Arrays.toString(result));
    }
    public static int[] findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int index1 = 0;
        int index2 = 0;
        int indexRes = 0;
        int m = nums1.length;
        int n  = nums2.length;
        int length = m + n;

        while (indexRes < length ) {
            if(index1 >= nums1.length) {
                result[indexRes] = nums2[index2];
                index2++;
            } else
            if (index2 >= nums2.length) {
                result[indexRes] = nums1[index1];
                index1++;
            } else
            if ( nums1[index1] < nums2[index2]) {
                if(index1 < nums1.length) {
                    result[indexRes] = nums1[index1];
                    index1++;
                }
            } else {
                if (index2 < nums2.length) {
                    result[indexRes] = nums2[index2];
                    index2++;
                }
            }
            indexRes++;
        }
        return result;
    }
}
