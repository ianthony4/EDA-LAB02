public class Ejercicio3{
  public static void main(String[] args){
    int base = 5;
    trianguloRecursivo(base, "");
  }
  public static void trianguloRecursivo(int base, String res){
    res += "*";
    if(base <= 1){
      System.out.println(res);
    }
    System.out.println(res);
    res += "*";
    trianguloRecursivo(base - 1, res);
  }
}
