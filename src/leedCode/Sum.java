package leedCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Учитывая массив целых чисел nums и целое число target, верните индексы двух чисел так, чтобы они составляли в суммеtarget .

Вы можете предположить, что каждый вход будет иметь ровно одно решение , и вы не можете использовать один и тот же элемент дважды.

Вы можете вернуть ответ в любом порядке.



Пример 1:

Ввод: nums = [2,7,11,15], target = 9
 Вывод: [0,1]
 Объяснение: Поскольку nums[0] + nums[1] == 9, мы возвращаем [0, 1].
Пример 2:

Ввод: числа = [3,2,4], цель = 6
 Вывод: [1,2]
Пример 3:

Ввод: числа = [3,3], цель = 6
 Вывод: [0,1]

Ввод: числа = [3,2,3], цель = 6
Вывод: [0,2]

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Существует только один правильный ответ.


Дополнение:  можете ли вы придумать алгоритм,  сложность которого меньше временной?O(n2) */
public class Sum {
    public static void main(String[] args) {
        int[] nums = {2,71,11,7,15};
        int[] indexs = twoSum(nums, 9);
        for (int i : indexs) {
            System.out.println(i);
        }
    }
    //т.о.можно проверить двы соседних числа
    public static int[] twoSum1(int[] nums, int target) {
        int[] indexs = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            int result = nums[i] + nums[i + 1];
            if (result == target){
                indexs[0] = i;
                indexs[1] = i + 1;
            }
        }
        return indexs;
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
        map.put(numbers[i], i);
    }
    return result;
    }
}
