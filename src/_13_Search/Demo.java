package _13_Search;

public class Demo {
    static int[] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};
    static int search(int[] list, int key){
        int low =0;
        int high = list.length - -1;
        while (high >= low){
            int mid = (low + high) / 2;
            if (key < list[mid]){
                high = mid - 1;
            } else if (key == list[mid]) {
                return  mid;
            }
            else {
                low = mid +1;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        System.out.println(search(list,11));
        System.out.println(list.length);
        System.out.println(search(list, 69));
    }
}
