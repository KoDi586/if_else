
public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }
    public static void task1(){
        System.out.println("\nЗадание 1\n");
        byte maxim = 16;
        byte oleg = 23;

        if (maxim >= 18){
            System.out.println("Maxim, вы достигли совершеннолетия!");

        } else {
            System.out.println("Maxim, возраст совершеннолетия еще не наступил и нужно немного подождать.");
        }

        if (oleg >= 18){
            System.out.println("Oleg, вы достигли совершеннолетия!");

        } else {
            System.out.println("Oleg, возраст совершеннолетия еще не наступил и нужно немного подождать.");
        }
    }
    public static void task2(){
        System.out.println("\nЗадание 2\n");
        byte temperature1 = -3;
        byte temperature2 = 6;

        if (temperature1 < 5){
            System.out.println("На улице " + temperature1 + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature1 + " градусов, можно идти без шапки.");
        }

        if (temperature2 < 5){
            System.out.println("На улице " + temperature2 + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature2 + " градусов, можно идти без шапки.");
        }

    }
    public static void task3() {
        System.out.println("\nЗадание 3\n");

        byte speed = 60;
        float speed1 = 60.001f;
        byte maxSpeed = 60;

        if (speed <= maxSpeed) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        }

        if (speed1 <= maxSpeed) {
            System.out.println("Если скорость " + speed1 + ", то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed1 + ", то придется заплатить штраф.");
        }

    }

    public static void task4() {
        System.out.println("\nЗадание 4\n");

        byte personsAge = 39;


        if (personsAge < 2) System.out.println("Если возраст человека равен " + personsAge + ", то ему пора спать.");

        if (personsAge > 2 && personsAge <= 6) System.out.println("Если возраст человека равен " + personsAge + ", то ему нужно ходить в детский сад.");

        if (personsAge > 6 && personsAge <= 18) System.out.println("Если возраст человека равен " + personsAge + ", то ему нужно ходить в школу.");

        if (personsAge > 18 && personsAge <= 24) System.out.println("Если возраст человека равен " + personsAge + ", то его место в университете.");

        if (personsAge > 24 && personsAge <= 60) System.out.println("Если возраст человека равен " + personsAge + ", то ему пора ходить на работу.");

        else System.out.println("Если возраст человека равен " + personsAge + ", то он может отдохнуть.");
    }

    public static void task5() {
        System.out.println("\nЗадание 5\n");

        byte childAge = 15;

        if (childAge < 5) System.out.println("Если возраст ребенка равен " + childAge + ", то он не может кататься на аттракционе.");

        else if (childAge <= 14) System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");

        else if (childAge > 14) System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься без сопровождения взрослого.");
    }

    public static void task6() {
        System.out.println("\nЗадание 6\n");

        byte maxVolume = 102;
        byte seat = 60;
        byte countPersons = 103;

        if (countPersons < seat) System.out.println("Если количество человек в вагоне равно " + countPersons + ", то есть сидячее место.");

        else if (countPersons < maxVolume) System.out.println("Если количество человек в вагоне равно " + countPersons + ", то есть стоячее место.");

        else System.out.println("Если количество человек в вагоне равно " + countPersons + ", то вагон полность забит и мест нет.");


    }

    public static void task7() {
        System.out.println("\nЗадание 7\n");

        int one = 10;
        int two = 5;
        int three = 3;

        if (one > two && one > three) System.out.println("Наибольшее число из трех данных равно " + one);

        else if (two > one && two > three) System.out.println("Наибольшее число из трех данных равно " + two);

        else System.out.println("Наибольшее число из трех данных равно " + three);

    }





}
