package sample.Veiw;

import javafx.scene.control.TextField;

public class ViewResultCalculate {

    public void viewResult(TextField field, String sum) {
        field.clear();
        field.setText(sum);
    }

    public void setOne(TextField fieldText) {
        fieldText.setText(fieldText.getText() + "1");
    }

    public void setTwo(TextField fieldText) {
        fieldText.setText(fieldText.getText() + "2");
    }

    public void setFree(TextField fieldText) {
        fieldText.setText(fieldText.getText() + "3");
    }

    public void setFour(TextField fieldText) {
        fieldText.setText(fieldText.getText() + "4");
    }

    public void setFive(TextField fieldText) {
        fieldText.setText(fieldText.getText() + "5");
    }

    public void setSix(TextField fieldText) {
        fieldText.setText(fieldText.getText() + "6");
    }

    public void setSeven(TextField fieldText) {
        fieldText.setText(fieldText.getText() + "7");
    }

    public void setEight(TextField fieldText) {
        fieldText.setText(fieldText.getText() + "8");
    }

    public void setNine(TextField fieldText) {
        fieldText.setText(fieldText.getText() + "9");
    }

    public void setZero(TextField fieldText) {
        fieldText.setText(fieldText.getText() + "0");
    }

    public void setPoint(TextField fieldText) {
        fieldText.setText(fieldText.getText() + ".");
    }

    public void setPlus(TextField fieldText) {
        fieldText.setText(fieldText.getText() + "+");
    }

    public void setMinus(TextField fieldText) {
        fieldText.setText(fieldText.getText() + "-");
    }

    public void setMultiply(TextField fieldText) {
        fieldText.setText(fieldText.getText() + "*");
    }

    public void setDiv(TextField fieldText) {
        fieldText.setText(fieldText.getText() + "/");
    }

    public void setDelete(TextField fieldText) {
        fieldText.clear();
    }

    public void setLeftBracket(TextField fieldText) {
        fieldText.setText(fieldText.getText() + "(");
    }

    public void setRightBracket(TextField fieldText) {
        fieldText.setText(fieldText.getText() + ")");
    }
}
