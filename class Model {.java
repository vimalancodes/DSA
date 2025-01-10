class Model {
 void Pattern_print(int n)
    {
        for (int i=1; i<=n;i++){
            for (int j=1; j<=n-i; j++){
            System.out.print(" ");
            }
            for (int k=1; k<= 2*i-1; k++){
            System.out.print("*");
            }
        System.out.println();
        }
    }
public class Main {
    public static void main(String[] args) {
       Model m1 = new Model();
       m1.Pattern_print(5);
       System.out.println("Thank you");
    }
}
}