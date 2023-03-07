import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);

        System.out.println("Вас приветствует приложение 'Розыгрыш игрушек'");
        Lottery lottery = new Lottery();
        lottery.put(new Toys(1, "Машинка на пульте управления", 35.0));
        lottery.put(new Toys(2, "Конструктор LEGO", 40.0));
        lottery.put(new Toys(3, "Настольная игра 'Мафия'",24.0));
        lottery.put(new Toys(4, "Магнитный конструктор", 55.0));
        lottery.put(new Toys(5, "Гоночный трек", 100.0));
        lottery.put(new Toys(6, "Футбольный мяч", 34.0));
        lottery.put(new Toys(7, "Хоккейная клюшка", 11.0));
        lottery.put(new Toys(8, "Goodjitsu", 25.0));
        lottery.put(new Toys(9, "Кукла Барби", 85.0));
        lottery.put(new Toys(10, "Мягкая игрушка", 50.0));

        try {
            FileWriter writer = new FileWriter("lottery.txt");
            for (int i = 0; i < 10; i++) {
                Toys toys = lottery.get();
                writer.write(toys.getID() + " " + toys.getName() + " " + toys.getWeight() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }
}