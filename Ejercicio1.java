public class Ejercicio1 {
    public static void main(String[] args){
              
        int [][] matriz = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        
        System.out.println("Matriz");
        mostrarMatriz(matriz);

        int[][] matrizIn = invMatriz(matriz);
        
        System.out.println("Matriz invertida:");
        mostrarMatriz(matrizIn);

    }
       
    public static int[][] invMatriz(int[][] matriz) {
        int filas = matriz.length;
        int colum = matriz[0].length;
        
        int[][] matrizInv = new int[filas][colum];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < colum; j++) {
                matrizInv[i][j] = matriz[filas - 1 - i][colum - 1 - j];
            }
        }
        
        return matrizInv;
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.print("]");
            System.out.println();
            
        }
        
    }
}
