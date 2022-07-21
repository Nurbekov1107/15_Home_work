import com.company.Dancer;
import com.company.Programmer;
import com.company.Singer;

public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Asan", "Coder", "Meta");
        System.out.println(programmer);
        programmer.coding();
        programmer.eat();
        programmer.learn();
        programmer.walk();
        System.out.println();

        Dancer dancer = new Dancer("Jan Voinov", "Dancer", "KG Dancers");
        System.out.println(dancer);
        dancer.dancing();
        dancer.eat();
        dancer.learn();
        dancer.walk();
        System.out.println();

        Singer singer = new Singer("Dua Lipa", "Sing", "USA Band");
        System.out.println(singer);
        singer.singing();
        singer.playGuitar();
        singer.eat();
        singer.learn();
        singer.walk();
    }
}