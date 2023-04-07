import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        try {
            // stage > Scene > Container > node 이 순서가 중요함
            Pane pane = new Pane(); // Scene 바로 아래 하위 객체입니다.
            Scene scene = new Scene(pane, 800, 500); // stage 바로 하위 객체입니다.
            stage.setResizable(false); // size를 user가 맘대로 크기를 조절 못하게 함.
            stage.setTitle("나의 javafx 첫 GUI");
            stage.show(); // 화면 보여주는 메소드.
            stage.setScene(scene); // show 다음에 적어주세요.. 안하면 에러뜸.
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}