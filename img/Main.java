/**
 * Created by ���� on 13.09.2015.
 */
public class Main {


    public static double[][] matrix = {{4,1000,2,3,1009},{3,-1,1,-3,0},{100,-3,-2,0,95}, {2,2,0,-1,3}};
    public static double[][] matrix1 = {{4,50,2,3,5},{3,-1,1,-3,-1},{100,-3,-2,0,-3}, {2,2,0,-1,-1}};
    public static double[] B = {1009,0,95,3};
    public static double[] C = {5,-1,-3,-1};
    public static double[] X = new double[4];
    private static double[] F  = new double[4];
    private static final int size = 4;
    public static void main(String[] args) {


        double R;

        printMatrix();
        System.out.println();
        System.out.println();

        for (int k = 0; k < size; k++) {
            for (int i = 0; i < size; i++) {
                if (i == k) {
                    continue;
                }
                R = matrix[i][k] / matrix[k][k];
                for (int j = k; j < size; j++) {
                    matrix[i][j] = matrix[i][j] - matrix[k][j]*R;
                }
                B[i] = B[i]-B[k] * R;
            }

        }
        matrix[0][1] = 0;
        matrix[0][4] = B[0];
        matrix[1][4] = B[1];
        matrix[2][4] = B[2];
        matrix[3][4] = B[3];


        X[0] = B[0] / matrix[0][0];
        X[1] = B[1] / matrix[1][1];
        X[2] = B[2] / matrix[2][2];
        X[3] = B[3] / matrix[3][3];






        printMatrix();
        System.out.format("X1 = %f,X2 = %f,X3 = %f,X4 = %f \n", X[0], X[1], X[2], X[3]);

        nevyazka();


        System.out.format("%1.17f", x1);





}





private static void printMatrix() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                 System.out.format("%8.1f", matrix[i][j]);
             }
        System.out.println();
        }

        }

    private static  void nevyazka() {

        float test = 0;
        System.out.println("Vect nevyazky");
        for (int i=0; i < size; i++) {
            for (int j = 0; j  < size; j++) {
                test += matrix1[i][j] * X[j];
            }
            F[i] = C[i]-test;
            System.out.println(F[i]);
            test = 0;
        }

    }



        }
