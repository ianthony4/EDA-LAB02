package LAB02;
public class Ejercicio2{
    //Main (opcional debido a que el problema no indica colocarlo)
    //Creamos la funcion que rotara a la izquierda el arreglo
    public int[] rotarIzquierdaArray(int[] A){
        int[] Aiz = new int[A.length];
        //Modificable
        int d = 2;
        int aux;
        //for que recorra el arreglo A
        for(int i = 0; i < A.length ; i++){
            aux = A[i];
            if(i - d >= 0){
                //Debemos colocarlo al inicio
                Aiz[i - d] = aux;

            }else{
                //Lo colocamos al final
                Aiz[A.length - d + i] = aux;
            }
        }
        return A;
    }
}