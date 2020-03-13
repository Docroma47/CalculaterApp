package sample.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.Model.LogicCalculate;
import sample.Veiw.*;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button_1;

    @FXML
    private Button button_2;

    @FXML
    private Button button_3;

    @FXML
    private Button button_4;

    @FXML
    private Button button_5;

    @FXML
    private Button button_6;

    @FXML
    private Button button_7;

    @FXML
    private Button button_8;

    @FXML
    private Button button_9;

    @FXML
    private Button button_0;

    @FXML
    private Button buttonMultiply;

    @FXML
    private Button buttonRightBracket;

    @FXML
    private Button buttonPlus;

    @FXML
    private Button buttonMinus;

    @FXML
    private Button buttonLeftBracket;

    @FXML
    private Button buttonDiv;

    @FXML
    private Button buttonEqually;

    @FXML
    private Button buttonPont;

    @FXML
    private Button buttonDelete;

    @FXML
    private TextField fieldText;

    @FXML
    void initialize() {
        ViewResultCalculate view = new ViewResultCalculate();
        LogicCalculate calculate = new LogicCalculate();

        button_1.setOnAction(actionEvent -> {
            view.setOne(fieldText);
        });

        button_2.setOnAction(actionEvent -> {
            view.setTwo(fieldText);
        });

        button_3.setOnAction(actionEvent -> {
            view.setFree(fieldText);
        });

        button_4.setOnAction(actionEvent -> {
            view.setFour(fieldText);
        });

        button_5.setOnAction(actionEvent -> {
            view.setFive(fieldText);
        });

        button_6.setOnAction(actionEvent -> {
            view.setSix(fieldText);
        });

        button_7.setOnAction(actionEvent -> {
            view.setSeven(fieldText);
        });

        button_8.setOnAction(actionEvent -> {
            view.setEight(fieldText);
        });

        button_9.setOnAction(actionEvent -> {
            view.setNine(fieldText);
        });

        button_0.setOnAction(actionEvent -> {
            view.setZero(fieldText);
        });

        buttonPont.setOnAction(actionEvent -> {
            view.setPoint(fieldText);
        });

        buttonPlus.setOnAction(actionEvent -> {
            view.setPlus(fieldText);
        });

        buttonMinus.setOnAction(actionEvent -> {
            view.setMinus(fieldText);
        });

        buttonMultiply.setOnAction(actionEvent -> {
            view.setMultiply(fieldText);
        });

        buttonDiv.setOnAction(actionEvent -> {
            view.setDiv(fieldText);
        });

        buttonDelete.setOnAction(actionEvent -> {
            view.setDelete(fieldText);
        });

        buttonLeftBracket.setOnAction(actionEvent -> {
            view.setLeftBracket(fieldText);
        });

        buttonRightBracket.setOnAction(actionEvent -> {
            view.setRightBracket(fieldText);
        });

        buttonEqually.setOnAction(actionEvent -> {
            calculate.operation(fieldText.getText());
            view.viewResult(fieldText, calculate.SUM);
        });

    }
}
