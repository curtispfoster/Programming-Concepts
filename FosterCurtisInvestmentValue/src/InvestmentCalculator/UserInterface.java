package InvestmentCalculator;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.geometry.Insets;

public class UserInterface extends Application {
	private TextField tfInvestmentAmount = new TextField();
	private TextField tfYears = new TextField();
	private TextField tfAnnualInterestRate = new TextField();
	private Button calculateButton = new Button("Calculate");
	private TextField tfTotalInvestmentAmount = new TextField();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		GridPane gridPane = new GridPane();
		GridPane.setHalignment(calculateButton, HPos.RIGHT);
		Scene scene = new Scene(gridPane);
		Image icon = new Image("20240408_151032.jpg");
		
		primaryStage.getIcons().add(icon);
		primaryStage.setTitle("Investment Value Calculator");
		primaryStage.setScene(scene);
		primaryStage.setWidth(400);
		primaryStage.setHeight(250);
		primaryStage.show();
		
		Label amountLabel = new Label("Investment Amount ");
		Label yearsLabel = new Label("Years ");
		Label rateLabel = new Label("Annual Interest Rate");
		Label totalLabel = new Label("Future value ");
		
		changeFont(amountLabel);
		changeFont(yearsLabel);
		changeFont(rateLabel);
		changeFont(totalLabel);
		
		calculateButton.setTextFill(Color.BLACK);
		calculateButton.setFont(Font.font("Arial", FontWeight.BOLD, 12));

		
		gridPane.setBackground(new Background
							  (new BackgroundFill
							  (Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
		
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		gridPane.setAlignment(Pos.CENTER);
		gridPane.add(amountLabel, 0, 0);
		gridPane.add(tfInvestmentAmount, 1, 0);
		gridPane.add(yearsLabel, 0, 1);
		gridPane.add(tfYears, 1, 1);
		gridPane.add(rateLabel, 0, 2);
		gridPane.add(tfAnnualInterestRate, 1, 2);
		gridPane.add(totalLabel, 0, 3);
		gridPane.add(tfTotalInvestmentAmount, 1, 3);
		gridPane.add(calculateButton, 1, 4);
		
		tfInvestmentAmount.setAlignment(Pos.BOTTOM_RIGHT);
		tfYears.setAlignment(Pos.BOTTOM_RIGHT);
		tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
		
		calculateButton.setOnAction(e -> processTotalInvestment());
		
		changeBackground(tfInvestmentAmount);
		changeBackground(tfYears);
		changeBackground(tfAnnualInterestRate);
		changeBackground(tfTotalInvestmentAmount);
		calculateButton.setBackground(new Background
							         (new BackgroundFill
							         (Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
		
	}

	private void processTotalInvestment() {

		// add exception handling here
		double amount = Double.parseDouble(tfInvestmentAmount.getText());
		int years = Integer.parseInt(tfYears.getText());
		double interest = Double.parseDouble(tfAnnualInterestRate.getText());

		Investment investment = new Investment(amount, years, interest);
		// call pass to interest class with constructor    
		tfTotalInvestmentAmount.setText(String.format("$%.2f", investment.getTotalInvestment()));

	}
	
	private void changeFont(Label newFont) {		
		newFont.setTextFill(Color.GRAY);
		newFont.setFont(Font.font("Arial", FontWeight.BOLD, 12));
	}
	
	private void changeBackground(TextField newText) {
		newText.setBackground(new Background
							 (new BackgroundFill
							 (Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
}
