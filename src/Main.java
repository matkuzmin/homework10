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

    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task2() {
        System.out.println("Задача 2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName.toUpperCase());
    }

    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task4() {
        System.out.println("Задача 4");
        String fullName = "Семенов-Иван-Семёнович";
        int first = fullName.indexOf('-');
        int midle = fullName.lastIndexOf('-');
        String firstName = fullName.substring(0, first);
        String middleName = fullName.substring(first+1, midle);
        String lastName = fullName.substring(midle+1, fullName.length());
        System.out.println("Имя сотрудника — " + middleName);
        System.out.println("Фамилия сотрудника — " + firstName);
        System.out.println("Отчество сотрудника — " + lastName);
    }

    public static void task5() {
        System.out.println("Задача 5");
        String fullName = "ivanov ivan ivanovich";
        char[] result = fullName.toCharArray();
        Character.toUpperCase('I');
        result[0]=Character.toUpperCase(result[0]);
        for (int i = 0; i < result.length; i++) {
        if(result[i]==' ')
            result[i+1]=Character.toUpperCase(result[i+1]);

            System.out.print( "Верное написание Ф. И. О. сотрудника с заглавных букв — " + result[i]);

        }
        System.out.println();
    }
    public static void task6() {
        System.out.println("Задача 6");
       String one = "135";
       String two = "246";
        char[] result = two.toCharArray();
        StringBuilder all = new StringBuilder(one);
        int a = 1;
        for (int i = 0; i < one.length(); i++) {
            all.insert(a, result[i]);
            a+=2;
        }
        System.out.println( all);

        }
    public static void task7() {
        System.out.println("Задача 7");
        String one = "aabccddefgghiijjkk";
        char[] result = one.toCharArray();
        for (int i = 0; i < result.length-1; i++) {
            if (result[i]==result[i+1]){
                System.out.print(result[i]);
            }

        }
        }
    }

