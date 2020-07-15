import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    private String title;

    private Map<Integer, String> menuItems = new HashMap<>();

    public Menu(String title) {
        this.title = title;
    }

    public void addItem(int index, String name) {
        menuItems.put(index, name);
    }

    public int menu() {
        Scanner input = new Scanner(System.in);
        System.out.println(title);
        for (Map.Entry<Integer, String> entry : menuItems.entrySet()) {
            System.out.println(entry.getKey() + ")" + entry.getValue());
        }
        int numberInput = input.nextInt();
        return numberInput;
    }
}
