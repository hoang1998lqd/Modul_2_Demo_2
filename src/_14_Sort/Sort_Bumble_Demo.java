package _14_Sort;

import java.util.Arrays;

public class Sort_Bumble_Demo {
    static int [] list = {1,4,8,6,2,0,47,9,11,46,35,18,23,20,37};


    public static void sortBubble(int[] list) {
        for (int  i = 0; i < list.length - 1; i++){
            for (int j = list.length - 1 ; j > i; j--){
                if (list[j] < list[j - 1]){
                    swap(list, j);

                }
            }
        }
    }

    private static void swap(int[] list, int j) {
        int temp = list[j];
        list[j] = list[j -1];
        list[j -1] = temp;
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    System.out.println("Swap " + list[i] + " with " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; /* Next pass still needed */
                }
            }
            /* Array may be sorted and next pass not needed */
            if (!needNextPass) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            /* Show the list after sort */
            System.out.print("List after the  " + k + "' sort: ");
            for (int i : list) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        sortBubble(list);
//        System.out.println(Arrays.toString(list));
//        int [] list = {1,4,8,6,2,0,47,9,11,46,35,18,23,20,37};
//        for (int i = 0; i < (list.length - 1); i++) {
//            for (int j = 0; j <( list.length - i - 1) ; j++) {
//                if (list[j] > list[j+1]){
//                   swap(list[j],list[j+1] );
//                }
//            }
//        }
//        System.out.println(Arrays.toString(list));

        Arrays.sort(list);

        System.out.println(Arrays.toString(list));

    }
}
