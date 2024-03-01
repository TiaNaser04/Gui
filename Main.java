package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		VBox v= new VBox(25);
        v.setPadding(new Insets(5,5, 5,5));

        Image image = new Image("me.jpg");
        ImageView show= new ImageView(image);
        show.setFitHeight(250);
        show.setFitWidth(250);



        Label lblIntro = new Label("My name is Tia Naser. I'm 19 years old. I'm Palestinian, and I live in Ramallah. I go to Birzeit University.\n " +
                "My major is Computer Science (regretting my choice right now x_x ). In the future, I'm planning on becoming a game developer,\n and create new fun games <3.");
        lblIntro.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 24));


        Label lblList = new Label("Things I like:\n -Reading\n -Watching shows\n -FOOD :P\n -Cats ");
        lblList.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 18));
        
        Image image2 = new Image("smiley.jpg");
        ImageView show2= new ImageView(image2);
        show2.setFitHeight(50);
        show2.setFitWidth(50);

        v.getChildren().addAll(show, lblIntro, lblList, show2);
        v.setAlignment(Pos.CENTER);
        v.setStyle("-fx-background-color: lightblue;");

        Scene scene = new Scene(v, 600, 600);
        primaryStage.setTitle("Who Am I?!");
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
