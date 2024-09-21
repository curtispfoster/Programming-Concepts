package TaxCalculator;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class CalculatorInterface extends Application{
	
	@Override
	public void start(Stage primaryWindow) {
		String title = "Tax Calculator";
		BorderPane subRoot = new BorderPane();
		StackPane root = new StackPane(subRoot);
		TextField income = new TextField();
		TextField taxValue = new TextField();
		Button calculateButton = new Button("Calculate");
		
		Logic taxChart = new Logic();
		
		
		
		//first is width
		root.setPrefSize(800, 500);
		root.setBackground(new Background
						  (new BackgroundFill
						  (Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
		subRoot.setMaxSize(500, 200);
		
		subRoot.setBackground(new Background
				  (new BackgroundFill
				  (Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		
		
		
		
		VBox statusSubRoot = new VBox();
		statusSubRoot.setSpacing(20);
		statusSubRoot.setPadding(new Insets(20));
		RadioButton single = new RadioButton("Single filers"),
				married = new RadioButton("Married filing jointly or widower(er)"),
				separated = new RadioButton("Married filing separately"),
				headOfHouse = new RadioButton("Head of Household");
		statusSubRoot.getChildren().addAll(single, married, separated, headOfHouse);
		
		married.setOnAction(e -> {
			if (married.isSelected())
				taxChart.getMarriedChart();
		});
		
		
		//root.getChildren().add(statusSubRoot);
	
		VBox chartSubRoot = new VBox();
		chartSubRoot.setBackground(new Background
						  (new BackgroundFill
						  (Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
		chartSubRoot.setSpacing(10);
		chartSubRoot.setPadding(new Insets(20));
		chartSubRoot.getChildren().add(new Label(taxChart.getStatusTitle()));
		chartSubRoot.getChildren().add(new Label(taxChart.getSubTitle()));
		chartSubRoot.getChildren().add(new Label(taxChart.getTen()));
		chartSubRoot.getChildren().add(new Label(taxChart.getTwentyFive()));
		chartSubRoot.getChildren().add(new Label(taxChart.getTwentyEight()));
		chartSubRoot.getChildren().add(new Label(taxChart.getThirtyThree()));
		chartSubRoot.getChildren().add(new Label(taxChart.getThirtyFive()));
	
		GridPane calculateSubRoot = new GridPane();
		calculateSubRoot.setBackground(new Background
				  (new BackgroundFill
				  (Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
		chartSubRoot.setSpacing(10);
		chartSubRoot.setPadding(new Insets(20));
		
		calculateSubRoot.setHgap(10);
		calculateSubRoot.setVgap(10);
		calculateSubRoot.setPadding(new Insets(20));
		calculateSubRoot.add(new Label("Taxable Income "), 0, 0);
		calculateSubRoot.add(income, 1, 0);
		calculateSubRoot.add(new Label("Taxable Income "), 0, 1);
		calculateSubRoot.add(taxValue, 1, 1);
		calculateSubRoot.add(calculateButton, 1, 3);
		
		
		
		
		//subRoot.getChildren().addAll(statusSubRoot);
		subRoot.setBottom(calculateSubRoot);
		subRoot.setCenter(statusSubRoot);
		subRoot.setRight(chartSubRoot);
		primaryWindow.setTitle(title);
		Scene scene = new Scene(root);
		primaryWindow.setScene(scene);
		primaryWindow.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	
	
	
	/**
	Label amountLabel = new Label("Investment Amount ");
	Label yearsLabel = new Label("Years ");
	Label rateLabel = new Label("Annual Interest Rate");
	Label totalLabel = new Label("Future value ");
	

	taxChartPane.setAlignment(Pos.CENTER);
	taxChartPane.add(amountLabel, 0, 0);
	//taxChartPane.add(tfInvestmentAmount, 1, 0);
	taxChartPane.add(yearsLabel, 0, 1);
	//taxChartPane.add(tfYears, 1, 1);
	taxChartPane.add(rateLabel, 0, 2);
	//taxChartPane.add(tfAn8uinualInterestRate, 1, 2);
	taxChartPane.add(totalLabel, 0, 3);
	//gridPane.add(tfTotalInvestmentAmount, 1, 3);
	//gridPane.add(calculateButton, 1, 4);
	
	taxChartPane.setPadding(new Insets(10));
	taxChartPane.setVgap(10);
	taxChartPane.setHgap(10);
	taxChartPane.setMaxHeight(400);
	taxChartPane.setMaxWidth(500);
	taxChartPane.setAlignment(Pos.CENTER);
	taxChartPane.setBackground(new Background
			  (new BackgroundFill
			  (Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
			  
			  @SuppressWarnings("exports")
	public Node addLabel(String text) {
		Label newLabel = new Label(text);
		newLabel.setTextFill(Color.GRAY);
		newLabel.setFont(Font.font("Arial", FontWeight.BOLD, 12));
		return newLabel;
		
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
	
	*/
	
}
