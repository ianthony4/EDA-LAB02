public class Ejercicio3{
  public static void main(String[] args){
    int base = 5;
    trianguloRecursivo(base);
  }
  public static void trianguloRecursivo(int base){
    String res = "*";
    if(base >= 1){
      System.out.println(res);
    }
    res += "*";
    System.out.print(res);
    trianguloRecursivo(base - 1);
  }
}
