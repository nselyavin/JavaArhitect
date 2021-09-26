package tmp;

public class Main {
    public static void main(String[] args) {
        int[] A = new int[3];
        A[0] = 0;
        A[1] = 1;
        A[2] = 2;





        int[] B = new int[A.length + 1];
        for(int i = 0; i < 3; i++){
            B[i] = A[i];
        }

        A = B;
        A[A.length -1] = 3;

        System.out.println(A);
    }
}
