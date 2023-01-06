// 3. Write a function that rotates an array by k elements. For example, [1,2,3,4,5,6] rotated by two becomes [3,4,5,6,1,2]. Try solving this without creating a copy of the array.

public class rotatearray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int arrlen = arr.length;
        int ktime = 2;
        rt(arr, ktime, arrlen);
    }

    public static void rt(int arr[], int ktime, int arrlen) {
        int position = 1;
        
        // till the value of ktime satisfy with the postion

        while (position <= ktime) {
            int lastelement = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arrlen - 1] = lastelement;
            position++;
        }
        for (int i = 0; i < arrlen; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
