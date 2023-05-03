import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        /**СОЗДАЙТЕ КЛАСС STUDENT С
         ПОЛЯМИ (NAME, AGE, GROUP), В MAIN
         МЕТОДЕ СОЗДАЙТЕ 5 ОБЬЕКТОВ
         КЛАССА STUDENT , ДАЙТЕ ЗНАЧЕНИЕ
         ПОЛЯМ, ГРУППА МОЖЕТ БЫТЬ ТОЛЬКО
         "JAVA" ИЛИ "JS" ВСЕ 5 СТУДЕНТОВ
         ДОЛЖНЫ БЫТЬ В МАССИВЕ. ТЕПЕРЬ
         ПОСЧИТАЙТЕ СКОЛЬКО СТУДЕНТОВ ИЗ
         "JAVA" И "JS"
         2). А ТЕПЕРЬ ПОСЧИТАЙТЕ И ВЫВЕДИТЕ
         СРЕДНЕЕ АРИФМЕТИЧЕСКОЕ ЗНАЧЕНИЕ
         ВОЗВРАСТОВ ВСЕХ СТУДЕНТОВ*/

        String[] group = {"Java"};
        String[] group1 = {"Js"};
        String[] group2 = {"Java"};
        String[] group3 = {"js"};
        String[] group4 = {"java"};

        Student student = new Student("Eldan", 18, group);
        Student student1 = new Student("erbol", 19, group1);
        Student student2 = new Student("Aizat", 30, group2);
        Student student3 = new Student("Ernazar", 21, group3);
        Student student4 = new Student("Aidar", 20, group4);

        System.out.println(student.name + "\n" + student.age + "\n" + Arrays.toString(group));
        System.out.println(student1.name + "\n" + student1.age + "\n" + Arrays.toString(group1));
        System.out.println(student2.name + "\n" + student2.age + "\n" + Arrays.toString(group2));
        System.out.println(student3.name + "\n" + student3.age + "\n" + Arrays.toString(group3));
        System.out.println(student4.name + "\n" + student4.age + "\n" + Arrays.toString(group4));

        int count = 0;
        for (String a : group) {
            if (a.equals("Java") || a.equals("Js")) {
                count++;
            }
        }
        System.out.println("Количество студентов в группах Java: " + count);
        System.out.println("Количество студентов в группах Js: " + count);
    }
}