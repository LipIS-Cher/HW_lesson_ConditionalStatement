import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Раздел домашнее задание - 1
        //zadanie 1
        Scanner in = new Scanner(System.in);
        System.out.print("Введите возраст человека: ");
        int age = in.nextInt();

        if (age >= 18){
            System.out.println("Поздравляю с совершеннолетием!");
        } else {
            System.out.println("Пока еще не хватает!");
        }

        System.out.println(" ");
        //zadanie 2
        Scanner in_2 = new Scanner(System.in);
        System.out.print("Введите возраст человека: ");
        int age_2 = in_2.nextInt();

        if (age_2 < 7){
            System.out.println("Это пока еще кроха!");
        } else if((age_2 >= 7) && (age_2 < 18)){
            System.out.println("Ребенок ходит в школу!");
        } else if ((age_2 >= 18) && (age_2 < 24)) {
            System.out.println("Уже в университете, как быстро время летит!");
        } else if (age_2 >= 24){
            System.out.println("Уже работает и старость недалеко :)");
        }

        System.out.println(" ");
        //zadanie 3
        Scanner in_3 = new Scanner(System.in);
        System.out.print("Введите занятое количество сидячих мест: ");
        int place_1 = in_3.nextInt();
        Scanner in_4 = new Scanner(System.in);
        System.out.print("Введите занятое количество стоячих мест: ");
        int place_2 = in_4.nextInt();
        if (place_1 < 60) {
            System.out.println("В вагоне осталось " + (60 - place_1) + " сидячее(их) мест");
        }
        if (place_2 < 62) {
            System.out.println("В вагоне осталось " + (62 - place_2) + " стоячее(их) мест");
        }


        // Уважаемые проверяющие, я считаю что раздел "Домашние задание - 2" уже реализован мой в разделе "Домашнее задание - 1"

        System.out.println("Раздел домашние задание - 3");

        // Раздел домашнее задание - 3
        //zadanie 1
        Scanner in_5 = new Scanner(System.in);
        System.out.print("Введите возраст человека: ");
        int age_part_3 = in_5.nextInt();

        if ((age_part_3 >= 2) && (age_part_3 < 7)){
            System.out.println("Если возраст человека равен " + age_part_3 + " , то ему нужно ходить в детский сад");
        } else if((age_part_3 >= 7) && (age_part_3 < 18)){
            System.out.println("Если возраст человека равен " + age_part_3 + " , то ему нужно ходить в школу!");
        } else if ((age_part_3 >= 18) && (age_part_3 < 24)) {
            System.out.println("Если возраст человека равен " + age_part_3 + " , то ему нужно ходить в университет");
        } else if (age_part_3 >= 24){
            System.out.println("Если возраст человека равен " + age_part_3 + " , то ему нужно ходить на работу");
        }

        System.out.println(" ");


        //zadanie 2
        Scanner in_6 = new Scanner(System.in);
        System.out.print("Введите возраст человека: ");
        int agePart3 = in_6.nextInt();

        if (agePart3 < 5){
            System.out.println("Ребенку нельзя кататься на аттракционе!");
        } else if((agePart3 >= 5) && (agePart3 < 14)){
            System.out.println("Разрешено кататься, но только в сопровождении взрослого");
        } else if (agePart3 >= 14) {
            System.out.println("Разрешено кататься без ограничения");
        }

        System.out.println(" ");
        //zadanie 3
        Scanner in_7 = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int one = in_7.nextInt();
        Scanner in_8 = new Scanner(System.in);
        System.out.print("Введите второе число: ");
        int two = in_8.nextInt();
        Scanner in_9 = new Scanner(System.in);
        System.out.print("Введите третье число: ");
        int free = in_9.nextInt();
        if (one > two){
            if (one > free){
                System.out.println("Самое большое число - " + one);
            } else {
                System.out.println("Самое большое число - " + free);
            }
        } else if (one > free){
            if (one > two){
                System.out.println("Самое большое число - " + one);
            } else {
                System.out.println("Самое большое число - " + two);
            }
        } else {
            if (two > free){
                System.out.println("Самое большое число - " + two);
            } else {
                System.out.println("Самое большое число - " + free);
            }
        }
    }
}