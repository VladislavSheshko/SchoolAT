package lesson39.task2;

public class Summa {
    public int a, b, c;
    public double x, y, z;

    public int getSumma(int a, int b) {
        this.a = a;
        this.b = b;
        int sum = a + b;
        return sum;
    }

    public double getSumma(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        double sum1 = a + b + c;
        return sum1;
    }

    public double getSumma(double x, double y) {
        this.x = x;
        this.y = y;
        double sum2 = x + y;
        return sum2;
    }

    public double getSumma(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        double sum3 = x + y + z;
        return sum3;
    }

    public double getSumma(int a, double x, double y) {
        this.a = a;
        this.x = x;
        this.y = y;
        double sum4 = a + x + y;
        return sum4;
    }

    //    Так сделать не получается из-за конфликта, как я понимаю, тк  тип возвращаемого значения
//    к сигнатуре метода отношения не имеет, а метод с такой игнатурой уже имеется
//    public double getSumma(int a, int b){
//        this.a = a;
//        this.b = b;
//        double sum1 = a + b;
//        return sum1;
//    }
    public double getSumma(Integer a, Integer b) {
        this.a = a;
        this.b = b;
        int sum5 = a + b;
        return sum5;
    }

    public static void main(String[] args) {
        Summa summa = new Summa();
        System.out.println(summa.getSumma(5, 7));
        Summa summa1 = new Summa();
        System.out.println(summa1.getSumma(3, 3, 5));
        Summa summa2 = new Summa();
        System.out.println(summa2.getSumma(7.0, 8.0));
        Summa summa3 = new Summa();
        System.out.println(summa3.getSumma(4.0, 6.0, 7.0));
        Summa summa4 = new Summa();
        System.out.println(summa4.getSumma(1, 3.0, 4.0));
        Summa summa5 = new Summa();
        System.out.println(summa.getSumma(4, 1)); // Отрабатывает, как я понимаю метод с сигнатурой
        // getSumma(int a, int b), а как вызвать метод с сигнатурой getSumma(Integer a, Integer b), не понял
    }
}
