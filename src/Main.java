import javafx.application.Application;
import javafx.stage.Stage;

import java.util.ArrayList;


public class Main extends Application {

    static Router router;

    static String currentUsername;
    static String serverIp;
    static boolean canDraw = false;
    static int INITIAL_CMD;

    static HandleServerCommandThread t;

    static ArrayList<String> playerNames = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) throws Exception{
        t = new HandleServerCommandThread();

        router = new Router(primaryStage);
        router.showPage("Main Menu", "mainmenu.fxml");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
