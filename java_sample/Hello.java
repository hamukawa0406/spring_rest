public class Hello{
    public static void main(String[] args){
        System.out.println("Hello World!!");
        test:
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i*j + " ");
                if (j == 5) {
                    break test;
                }
            }
            System.out.println("");
        }
    }
}