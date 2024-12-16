import sysMonstros.controller.MonstrosController;
import sysMonstros.view.MonstrosView;

public class Main {
    public static void main(String[] args) {
        MonstrosView view = new MonstrosView();
        MonstrosController controller = new MonstrosController(view);
        controller.iniciarMenu();
    }
}
