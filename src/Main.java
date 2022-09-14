public class Main {
    public static void main(String[] args) {
        //incremento de 1 até 10
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        System.out.println("\n \n");

        //números impares
        for (int a = 1; a <= 10; a+=2){
                System.out.println(a);
        }

        System.out.println("\n \n");

        //números pares
        for (int b = 1; b <= 10; b+=1){
            if (b % 2 == 0){
            System.out.println(b);
            }
        }
    }
}