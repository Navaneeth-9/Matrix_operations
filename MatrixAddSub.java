import java.util.Scanner; 
public class MatrixAddSub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the no.of columns:");
        int cols=sc.nextInt();
        int[][] matrix1=new int[rows][cols];
        int[][] matrix2=new int[rows][cols];
        int[][] addition=new int[rows][cols];
        int[][] substraction=new int[rows][cols];
        System.out.println("Enter elements of 1st matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements of 2nd matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                addition[i][j]=matrix1[i][j]+matrix2[i][j];
                substraction[i][j]=matrix1[i][j]-matrix2[i][j];
            }
            System.out.println();
        }
        System.out.println("Matrix Addition:");
        // System.out.println(add);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(addition[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix Substraction:");
        // System.out.println(sub);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(substraction[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
        
    }
}
