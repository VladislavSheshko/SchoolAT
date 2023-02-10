package lesson43;

public class Task1 {
    public static void main(String[] args) {
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        int c = Integer.valueOf(args[2]);
        if (a >= b){
            if (a >= c){
                System.out.println(a);
            }else {
                System.out.println(c);
            }
        }else if (b > c){
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
