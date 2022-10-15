package Homework.one_for_11_10_22;

public class RunOurGrup {
    public static void main(String[] args) {
        OurGrup grupOne = new OurGrup();
        grupOne.setName("Irina");
        grupOne.setEmail("java@gmail.com");
        grupOne.setAge(38);
        grupOne.setId(7);
        grupOne.setGropNumber(31);
        System.out.println("Имя : " + grupOne.getName());
        System.out.println("email : " + grupOne.getEmail());
        System.out.println("Возраст : " + grupOne.getAge());
        System.out.println("id студента: " + grupOne.getEmail());
        System.out.println("Номер группы : " + grupOne.getGropNumber());
    }
}
