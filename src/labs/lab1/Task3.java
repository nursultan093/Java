package Tasks.lab1;// Код добавляющий в новый список 3 данные 2 списка и добавляющий
// неповторяющиеся числа в 1 и во 2 списке в 3 список.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        Integer[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Integer[] nums2 = {0, 2, 1, 9, 7};

        List<Integer> nums1List = Arrays.asList(nums1);
        List<Integer> nums2List = Arrays.asList(nums2);
        List<Integer> nums3 = new ArrayList<>(nums2List);

        for (Integer num : nums1List) {
            if (!nums2List.contains(num)) {
                nums3.add(num);
            }
        }

        System.out.println("nums3: " + nums3);
    }
}