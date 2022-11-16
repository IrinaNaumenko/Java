package Lesson_001;

public class Hero {
    String name;
    private int age;
    float f;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void walk() {

    }
    //function == methods

    void  say() {           //методы

    }

        class  Main {
        public static void main(String[] args) {

            Hero hero = new Hero();
            hero.walk();
            hero.getName();
            hero.getAge();
            System.out.println(hero);

        }
    }}
