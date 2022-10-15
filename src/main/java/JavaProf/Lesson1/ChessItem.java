package JavaProf.Lesson1;
//инкапсуляция 37-38 be
//наследовани
//полиморфизм (класс авто )
public class ChessItem {
    boolean colour;
    String name;

    int x;
    int y;//org.springframework /пагиация
    //наследование свойство класса
    //полиморфизм возможности класса
    //Overide -версия переопеределена / наша версия - почитать про него alt + Insert выбрать toString сгенерируется автоматически
   //абстрактные классы

    int move(int x, int y) {
        return  x+y;
    }
    int eat(int x, int y ) {
        return  x * y;
    }


}
class Rook {

}