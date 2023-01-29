package lesson43;

public class Task3 {
    public static void main(String[] args) {
        int x = Integer.valueOf(args[0]);
        if ((x >= 1) & (x <= 30000)) {
            if (x % 4 == 0 && x % 100 != 0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }else {
            System.out.println("Данное число не входит в указанный диапазон");
        }
    }
}
