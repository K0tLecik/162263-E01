package Z1;

import java.time.LocalDate;

public class main
{
    public static void main(String[] args)
    {
        Integer[] sortedInteger = new Integer[]{6,5,4,3,2,1};
        Integer[] unsortedInteger = new Integer[]{1,5,6,3,2,4};
        LocalDate[] sortedLocalDate = new LocalDate[]{LocalDate.of(2002, 1, 1), LocalDate.of(2001, 2,2), LocalDate.of(2000, 3, 3)};
        LocalDate[] unsortedLocalDate = new LocalDate[]{LocalDate.of(2001, 2, 2), LocalDate.of(2000, 1, 1), LocalDate.of(2002, 3, 3)};
        String[] sortedString = new String[]{"c", "b", "a"};
        String[] unsortedString = new String[]{"b", "a", "c"};

        System.out.println(ArrayUtil.isSorted(sortedInteger));
        System.out.println(ArrayUtil.isSorted(unsortedInteger));
        System.out.println(ArrayUtil.isSorted(sortedLocalDate));
        System.out.println(ArrayUtil.isSorted(unsortedLocalDate));
        System.out.println(ArrayUtil.isSorted(sortedString));
        System.out.println(ArrayUtil.isSorted(unsortedString));
    }

    static class ArrayUtil
    {
        public static <T extends Comparable<T>>boolean isSorted(T[] array)
        {
            for(int i = 0; i < array.length - 1; i++)
            {
                if (array[i + 1].compareTo(array[i]) > 0)
                {
                    return false;
                }
            }
            return true;
        }
    }

}
