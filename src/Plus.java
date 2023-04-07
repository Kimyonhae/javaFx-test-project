import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Plus extends Application {

    @Override
    public void start(Stage stage) {
        try {
            // node text
            Label text = new Label();
            text.setText("누르면 +1 씩 증가합니다.");
            text.setStyle("-fx-font-size : 18;");

            // node text
            Label countTextLabel = new Label();
            countTextLabel.setText(Integer.toString(count));
            countTextLabel.setStyle("-fx-font-size : 14;");
            // node button
            Button button = new Button();
            button.setText("+ 1");
            button.setStyle("-fx-font-size : 15; -fx-text-fill : blue;");
            button.setOnAction(event -> {
                count++; // count 의 증가
                countTextLabel.setText(Integer.toString(count)); // 상태가 변화하기위해서는 countTextLabel을 업데이트 해줘야 합니다. state
                                                                 // ReBuilding

                if (count >= 50) { // count 가 50보다 커지면 0으로 초기화 하겠습니다.
                    count = 0;
                }
            });

            // Container StackPane
            StackPane pane = new StackPane();
            // pane.getChildren().add(text); // 현재 text가 가운데로 고정되있다.. 이걸 한번 위로 이동시켜봅시다.
            // pane.getChildren().add(button);// add 를 통해 넣어줄수 있지만 귀찮게 많은 node 들을 넣어야할때는
            // addAll을 쓰시오.
            pane.getChildren().addAll(text, button, countTextLabel); // 깔끔하게 동시에 여러게 넣을수 있음.
            StackPane.setAlignment(text, Pos.TOP_CENTER); // scene에 위쪽으로 text를 올림.
            StackPane.setAlignment(button, Pos.BOTTOM_CENTER); // scene에 위쪽으로 text를 올림.

            // Scene 관련 / Stage
            Scene scene = new Scene(pane, 300, 300);
            stage.show();
            stage.setScene(scene);
            stage.setTitle("3번째 plust GUI 입니다!!");
            stage.setResizable(false);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    int count = 0; // 변수 count 설정.

    public static void main(String[] args) {
        launch(args);
    }
}
