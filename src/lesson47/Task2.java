package lesson47;

public class Task2 {
    public static void main(String[] args) {

        int mowers = Integer.valueOf(args[0]);
        int workingHours = Integer.valueOf(args[1]);
        if (mowers > 0 && workingHours > 0){

            int totalMinutes = 0;
            int totalHours = 0;
            do{
                totalMinutes += (totalHours != 0) ? 10 : 0;
                totalHours += workingHours;
                mowers--;
            } while (mowers != 0);

            if(totalMinutes > 60){
                int min = totalMinutes % 60;
                totalHours += totalMinutes / 60;
                totalMinutes = min;
            }
            System.out.println(String.format("Бригада работало %d часов %d минут", totalHours, totalMinutes));
        } else {
            System.out.println("Введены некорректные данные");
        }
    }
}
