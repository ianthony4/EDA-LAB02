public class Ejercicio3{
  public static void main(String[] args){
    int base = 5;
    trianguloRecursivo(base);
  }
  public static void trianguloRecursivo(int base){
    if(base != 1){
      System.out.println("*");
      trianguloRecursivo(base - 1);
    }
    System.out.print("*");
  }
}
