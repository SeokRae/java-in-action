package kr.seok.bigO;

public class Ex2 {
    /*
        1, 1
        1, 2
        1, 3
        1, 4

        2, 1
        2, 2
        2, 3
        2, 4

        3, 1
        3, 2
        3, 3
        3, 4

        4, 1
        4, 2
        4, 3
        4, 4
     */
    void printPairs(int[] array) {
        for (int i = 0; i < array.length; i++) { // O(n)
            for (int j = 0; j < array.length; j++) { // O(n)
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }

    public static void main(String[] args) {
        new Ex2().printPairs(new int[]{1, 2, 3, 4});
    }
}
