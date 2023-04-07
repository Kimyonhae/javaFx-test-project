import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        try {
            Label textLabel = new Label(); // 리벨객체는 node에 속해있으며 text를 가진다.
            textLabel.setText("Hello world!"); // 객체에 text를 붙이는 명령어.
            textLabel.setStyle("-fx-font-size : 30;"); // css 사용해보기..
            StackPane pane = new StackPane(); // Container중 다른 class 로 Pane 말고 StackPane이 있다.
            pane.getChildren().add(textLabel); // Container에 node를 추가 할려면 이런 방식을 쓴다.
            Scene scene = new Scene(pane, 500, 300); // 알지?
            stage.setTitle("나의 두번째 javafx GUI 입니다~"); // window Or Mac 에 제목 설정.
            stage.show(); // display를 보여주는 부분.
            stage.setScene(scene); // stage에 Scene을 붙이는 부분. 이건 항상 show 뒤로...
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
