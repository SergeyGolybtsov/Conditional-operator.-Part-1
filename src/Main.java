public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int years = 17;
        if (years >= 18 ) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        else {
            System.out.println("К сожелению вам ещё нет 18, нужно немного подождать");
        }

        System.out.println("Задание 2");
     int years1 = 22;
     if ((years1 >= 7)&&(years1 < 18)) {
         System.out.println("Ребенок ходит в школу");
     }
     if ((years1 >=18)&&(years1 < 24)) {
         System.out.println("Человек ходит в университет");
     }
     if (years1 >=24) {
         System.out.println("Человек окончил университет и ищет работу");
     }
        System.out.println("Задание 3");
     int chel = 102; //человек в вагоне
        int s1 = 60; //сидячих мест
        int s2 =123;
        if (s2 <= s1)
            System.out.println("Сидячие места есть");
        else
            if ((s2 >s1)&&(s2<=chel))
                System.out.println("Осталисть только стоячие места");
            else
                System.out.println("Вагон полностью забит");


        System.out.println("Задание 4");
    int a = 26;
    if ((a>=2)&&(a<7))
        System.out.println("Если возраст человека равен " + a + " , то ему нужно ходить в детский сад");
    else
        if ((a>=7)&&(a<19))
            System.out.println("Если возраст человека равен " + a + " , то ему нужно ходить в школу");
        else
            if ((a>=19)&&(a<24))
                System.out.println("Если возраст человека равен " + a + " , то ему нужно ходить в университет");
            else
                System.out.println("Если возраст человека равен " + a + " , то ему нужно ходить на работу");

        System.out.println("Задание 5");
    int b = 3;
        if (b<5)
            System.out.println("Ребенок не может кататься на аттракционе");
        else
        if ((b>5)&&(b<14))
            System.out.println("Ребенок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        else
        if (b>14) {
            System.out.println("Ребенок может кататься без сопровождения взрослого");
        }

        System.out.println("Задание 6");
    int one = 1;
    int two = 2;
    int three  = 3;
    if ((one>two)&&(one>three))
        System.out.println(one + " самое большое число");
    else
        if ((two>one)&&(two>three))
            System.out.println(two + " самое большое число");
        else
            if ((three>one)&&(three>two)) {
                System.out.println(three + " самое большое число");
            }





    }
}