public class Menu {
    private String item;
    public Menu(String nameItem){
        this.item = nameItem;

    }

    public  void addItem(){
        System.out.println("1. Add  "  + item);

    }

    public  void deleteItem(){
       System.out.println("2.Delete " + item);
    }

    public void visitItem(){
        System.out.println("3.Visit " + item);
    }

    public void quitGame(){
        System.out.println("0.Quit");
    }

}
