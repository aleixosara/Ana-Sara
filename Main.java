import sys.controller.MonstrosController;
import sys.view.MonstrosView;

public class Main {
    public static void main(String[] args) {
        MonstrosView view = new MonstrosView();
        MonstrosController controller = new MonstrosController();
        controller.iniciarMenu();
    }
}
