package sample.Model;

import sample.Veiw.ViewResultCalculate;

public class LogicCalculate {
    String[] saveLine2 = new String[1];
    String[] saveLine1 = new String[1];
    String[] saveLine3 = new String[1];
    String[] saveLine4 = new String[1];
    String[] saveLine5 = new String[1];

    String A = null;
    String B = null;
    String sing = null;

    public String SUM = null;
    int operation2 = 0;
    int allOperation = 0;
    int multi = 0;
    int multi2 = 0;

    int charAtOne = 0;
    int charAtTwo = 0;
    int singBackets = 0;

    int charAtOneBrakets = 0;
    int charAtTwoBrakets = 0;

    Boolean yesPrioryti = false;

    private void plus(String A, String B) {
        double a;
        double b;
        int C;
        int D;
        if (doubleOrInteger(A) && doubleOrInteger(B)) {
            a = Double.parseDouble(A);
            b = Double.parseDouble(B);
            SUM = String.valueOf(a + b);
        } else if (!doubleOrInteger(A) && !doubleOrInteger(B)){
            C = Integer.parseInt(A);
            D = Integer.parseInt(B);
            SUM = String.valueOf(C + D);
        } else if (doubleOrInteger(A) || doubleOrInteger(B)) {
            if (doubleOrInteger(A)) {
                a = Double.parseDouble(A);
                C = Integer.parseInt(B);
                SUM = String.valueOf(a + C);
            }  else if (doubleOrInteger(B)) {
                C = Integer.parseInt(A);
                a = Double.parseDouble(B);
                SUM = String.valueOf(C + a);
            }
        }
    }
    private void minus(String A, String B) {
        double a;
        double b;
        int C;
        int D;
        if (doubleOrInteger(A) && doubleOrInteger(B)) {
            a = Double.parseDouble(A);
            b = Double.parseDouble(B);
            SUM = String.valueOf(a - b);
        } else if (!doubleOrInteger(A) && !doubleOrInteger(B)){
            C = Integer.parseInt(A);
            D = Integer.parseInt(B);
            SUM = String.valueOf(C - D);
        } else if (doubleOrInteger(A) || doubleOrInteger(B)) {
            if (doubleOrInteger(A)) {
                a = Double.parseDouble(A);
                C = Integer.parseInt(B);
                SUM = String.valueOf(a - C);
            }  else if (doubleOrInteger(B)) {
                C = Integer.parseInt(A);
                a = Double.parseDouble(B);
                SUM = String.valueOf(C - a);
            }
        }
    }
    private void mul(String A, String B) {
        double a;
        double b;
        int C;
        int D;
        if (doubleOrInteger(A) && doubleOrInteger(B)) {
            a = Double.parseDouble(A);
            b = Double.parseDouble(B);
            SUM = String.valueOf(a * b);
        } else if (!doubleOrInteger(A) && !doubleOrInteger(B)){
            C = Integer.parseInt(A);
            D = Integer.parseInt(B);
            SUM = String.valueOf(C * D);
        } else if (doubleOrInteger(A) || doubleOrInteger(B)) {
            if (doubleOrInteger(A)) {
                a = Double.parseDouble(A);
                C = Integer.parseInt(B);
                SUM = String.valueOf(a * C);
            }  else if (doubleOrInteger(B)) {
                C = Integer.parseInt(A);
                a = Double.parseDouble(B);
                SUM = String.valueOf(C * a);
            }
        }
    }
    private void div(String A, String B) {
        double a;
        double b;
        int C;
        int D;
        if (doubleOrInteger(A) && doubleOrInteger(B)) {
            a = Double.parseDouble(A);
            b = Double.parseDouble(B);
            SUM = String.valueOf(a / b);
        } else if (!doubleOrInteger(A) && !doubleOrInteger(B)){
            C = Integer.parseInt(A);
            D = Integer.parseInt(B);
            SUM = String.valueOf(C / D);
        } else if (doubleOrInteger(A) || doubleOrInteger(B)) {
            if (doubleOrInteger(A)) {
                a = Double.parseDouble(A);
                C = Integer.parseInt(B);
                SUM = String.valueOf(a / C);
            }  else if (doubleOrInteger(B)) {
                C = Integer.parseInt(A);
                a = Double.parseDouble(B);
                SUM = String.valueOf(C / a);
            }
        }
    }

    private void scanSafe(int length, String text) {
        int i;
        int t = 0;

        for (int j = 0; j < length; j++) {
            i = 0;
            if (!String.valueOf(text.charAt(j)).equals(" ")) {
                if (t == 1 && !(String.valueOf(text.charAt(j)).equals("+") || String.valueOf(text.charAt(j)).equals("-") ||
                        String.valueOf(text.charAt(j)).equals("/") || String.valueOf(text.charAt(j)).equals("*"))) {
                    t = 0;
                }
                if (saveLine2[0] == null) { // Запись значения.
                    saveLine2[0] = String.valueOf(text.charAt(j));
                } else {
                    saveLine2[0] = saveLine2[0] + text.charAt(j);
                }
            } else if (String.valueOf(text.charAt(j)).equals(" ") && saveLine2[0] != null && t == 0) {
                while (i == 0 || j == length) {
                    if (String.valueOf(text.charAt(j)).equals("+") || String.valueOf(text.charAt(j)).equals("-") ||
                            String.valueOf(text.charAt(j)).equals("/") || String.valueOf(text.charAt(j)).equals("*")) {
                        i = 1;
                        j--;
                        t++;
                    } else if (String.valueOf(text.charAt(j)).equals(" ") && j != length - 1) {
                        j++;
                    } else if (j != length){
                        break;
                    }
                    //else if (j == length - 1) {
                    // throw new IllegalArgumentException("Error 1: Add a character between the required variables.");
                    //}
                }
            }
        }

    }
    private Boolean doubleOrInteger(String A) {
        if (A.length() > 2) {
            for (int i = 0; i < A.length(); i++) {
                if (String.valueOf(A.charAt(i)).equals(".")) {
                    return true;
                }
            }
        }

        return false;
    }

    private void countingOperations(Boolean bool, Boolean bool2) {
        multi = 0;
        operation2 = 0;
        multi2 = 0;

        for (int j = 0; j < saveLine2[0].length(); j++) {
            if (bool) {
                if (String.valueOf(saveLine2[0].charAt(j)).equals("+") || String.valueOf(saveLine2[0].charAt(j)).equals("-")) {
                    operation2++;
                } else if (String.valueOf(saveLine2[0].charAt(j)).equals("/") || String.valueOf(saveLine2[0].charAt(j)).equals("*")) {
                    operation2++;
                    multi2++;
                }
            } else {
                int i = 0;
                if (String.valueOf(saveLine2[0].charAt(j)).equals("(")) {
                    i++;
                    j++;
                    while (i != 0) {
                        if (String.valueOf(saveLine2[0].charAt(j)).equals("+") || String.valueOf(saveLine2[0].charAt(j)).equals("-")) {
                            j++;
                            if (i == 1 && bool2) {
                                allOperation++;
                            }
                        } else if (String.valueOf(saveLine2[0].charAt(j)).equals("/") || String.valueOf(saveLine2[0].charAt(j)).equals("*")) {
                            j++;
                            if (i == 1 && bool2) {
                                allOperation++;
                            }
                        } else if (String.valueOf(saveLine2[0].charAt(j)).equals("(")) {
                            i++;
                            j++;
                        } else if (String.valueOf(saveLine2[0].charAt(j)).equals(")")) {
                            i--;
                            if (i != 0) {
                                j++;
                            }
                        } else {
                            j++;
                        }
                    }
                } else if (String.valueOf(saveLine2[0].charAt(j)).equals("+") || String.valueOf(saveLine2[0].charAt(j)).equals("-")) {
                    if (bool2) {
                        allOperation++;
                    }
                } else if (String.valueOf(saveLine2[0].charAt(j)).equals("/") || String.valueOf(saveLine2[0].charAt(j)).equals("*")) {
                    if (bool2) {
                        allOperation++;
                    }
                    multi++;
                }
            }
        }

    }


    private void priorityOperations() {
        for (int j = 0; j < saveLine2[0].length(); j++) {
            if (String.valueOf(saveLine2[0].charAt(j)).equals("(")) {
                singBackets = 1;
                break;
            }
        }

        if (singBackets > 0) {
            if (saveLine4[0] == null) {
                brackets(true);
                copyingExpression();
                doubleParenthesisCheck();
                countingOperations(true, false);
            }
            if (multi2 > 0) {
                yesPrioryti = true;
            } else {
                yesPrioryti = false;
            }
        } else {
            countingOperations(false, false);
            if (multi > 0) {
                yesPrioryti = true;
            } else {
                yesPrioryti = false;
            }
        }
    }

    private void brackets(Boolean bool) {
        int I = 0;
        for (int j = 0; j < saveLine2[0].length(); j++) {
            if (String.valueOf(saveLine2[0].charAt(j)).equals("(")) {
                charAtOne = j + 1;
                if (bool) {
                    charAtOneBrakets = j + 1;
                }
                for (int q = j + 1; q < saveLine2[0].length() + 1; q++) {
                    if (q == saveLine2[0].length()) {
                        charAtTwo = q - 1;
                        if (bool) {
                            charAtTwoBrakets = q - 1;
                        }
                        break;
                    }

                    if (String.valueOf(saveLine2[0].charAt(q)).equals("(")) {
                        I++;
                    }

                    if (String.valueOf(saveLine2[0].charAt(q)).equals(")") && I == 0) {
                        charAtTwo = q - 1;
                        if (bool) {
                            charAtTwoBrakets = q - 1;
                        }
                        break;
                    } else if (String.valueOf(saveLine2[0].charAt(q)).equals(")") && I != 0) {
                        I--;
                    }
                }
                break;
            }
        }
    }

    private void findBeginAndEnd() {
        priorityOperations();

        if (yesPrioryti) {
            for (int j = 0; j < saveLine2[0].length(); j++) {
                if ((String.valueOf(saveLine2[0].charAt(j)).equals("/") || String.valueOf(saveLine2[0].charAt(j)).equals("*"))) {
                    for (int q = j; q >= 0; q--) {
                        if (q == 0) {
                            charAtOne = q;
                            break;
                        }

                        if (String.valueOf(saveLine2[0].charAt(q)).equals("+") || String.valueOf(saveLine2[0].charAt(q)).equals("-")) {
                            charAtOne = q + 1;
                            break;
                        }
                    }

                    for (int q = j + 1; q < saveLine2[0].length() + 1; q++) {
                        if (q == saveLine2[0].length()) {
                            charAtTwo = q;
                            break;
                        }
                        if ((String.valueOf(saveLine2[0].charAt(q)).equals("+") || String.valueOf(saveLine2[0].charAt(q)).equals("*") || String.valueOf(saveLine2[0].charAt(q)).equals("/")
                                || String.valueOf(saveLine2[0].charAt(q)).equals("-"))) {
                            charAtTwo = q;
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }

    private void copyingExpression() {
        saveLine4[0] = saveLine2[0];
        saveLine2[0] = null;

        for (int j = 0; j < saveLine4[0].length(); j++) {
            if (j >= charAtOne && j <= charAtTwo) {
                if (saveLine2[0] == null) {
                    saveLine2[0] = String.valueOf(saveLine4[0].charAt(j));
                    ;
                } else {
                    saveLine2[0] = saveLine2[0] + saveLine4[0].charAt(j);
                }
            }
        }

        saveLine3[0] = saveLine2[0];
    }

    private void highPriority(int I, int G, int g) {
        for (int j = charAtOne; j < charAtTwo; j++) {
            if (String.valueOf(saveLine2[0].charAt(j)).equals("/") || String.valueOf(saveLine2[0].charAt(j)).equals("*")) {
                G++;
                if (I == 0) {
                    sing = String.valueOf(saveLine2[0].charAt(j));
                    g++;
                    I++;
                }
            }

            if (g == 0) {
                if (!(String.valueOf(saveLine2[0].charAt(j)).equals("/") || String.valueOf(saveLine2[0].charAt(j)).equals("*"))) {
                    if (A == null) {
                        A = String.valueOf(saveLine2[0].charAt(j));
                    } else {
                        A = A + (saveLine2[0].charAt(j));
                    }
                }
            } else {
                if (!(String.valueOf(saveLine2[0].charAt(j)).equals("/") || String.valueOf(saveLine2[0].charAt(j)).equals("*"))) {
                    if (B == null) {
                        B = String.valueOf(saveLine2[0].charAt(j));
                    } else {
                        B = B + (saveLine2[0].charAt(j));
                    }
                }
            }
        }
    }

    private void lowPriority(int I, int G, int g) {
        for (int j = 0; j < saveLine2[0].length(); j++) {
            if ((String.valueOf(saveLine2[0].charAt(j)).equals("+") || String.valueOf(saveLine2[0].charAt(j)).equals("-"))) {
                G++;
                if (I == 0) {
                    sing = String.valueOf(saveLine2[0].charAt(j));
                    g++;
                    I++;
                }
            }

            if (G < 2) {
                if (g == 0) {
                    if (!(String.valueOf(saveLine2[0].charAt(j)).equals("+") || String.valueOf(saveLine2[0].charAt(j)).equals("-"))) {
                        if (A == null) {
                            A = String.valueOf(saveLine2[0].charAt(j));
                        } else {
                            A = A + (saveLine2[0].charAt(j));
                        }
                    }
                } else {
                    if (!(String.valueOf(saveLine2[0].charAt(j)).equals("+") || String.valueOf(saveLine2[0].charAt(j)).equals("-"))) {
                        if (B == null) {
                            B = String.valueOf(saveLine2[0].charAt(j));
                        } else {
                            B = B + (saveLine2[0].charAt(j));
                        }
                    }
                }
            } else {
                if (saveLine1[0] == null) {
                    saveLine1[0] = String.valueOf(saveLine2[0].charAt(j));
                } else {
                    saveLine1[0] = saveLine1[0] + saveLine2[0].charAt(j);
                }
            }
        }
    }

    private void variableSelection() {
        int I = 0;
        int G = 0;
        int g = 0;
        if (yesPrioryti) {
            highPriority(I, G, g);
        } else {
            lowPriority(I, G, g);
        }
    }

    private void operation() {
        switch (sing) {
            case "+":
                plus(A, B);
                break;
            case "-":
                minus(A, B);
                break;
            case "*":
                mul(A, B);
                break;
            case "/":
                div(A, B);
                break;
        }

        A = null;
        B = null;
    }

    private void recordResult() {
        if (operation2 == 1 && saveLine4[0] != null) {
            for (int j = 0; j < saveLine4[0].length(); j++) {
                if (j == charAtOneBrakets - 1) {
                    if (saveLine2[0] == null) {
                        saveLine2[0] = SUM;
                    } else {
                        saveLine2[0] = saveLine2[0] + SUM;
                    }
                } else if (j < charAtOneBrakets || j > charAtTwoBrakets + 1) {
                    if (saveLine2[0] == null) {
                        saveLine2[0] = String.valueOf(saveLine4[0].charAt(j));
                    } else {
                        saveLine2[0] = saveLine2[0] + saveLine4[0].charAt(j);
                    }
                }
            }

            operation2--;
            saveLine3[0] = saveLine2[0];
            saveLine4[0] = null;
            singBackets = 0;
        } else {
            if (yesPrioryti) {
                for (int j = 0; j < saveLine3[0].length(); j++) {
                    if (j == charAtOne + 1) {
                        if (saveLine2[0] == null) {
                            saveLine2[0] = SUM;
                        } else {
                            saveLine2[0] = saveLine2[0] + SUM;
                        }
                    } else if (j < charAtOne || j >= charAtTwo) {
                        if (saveLine2[0] == null) {
                            saveLine2[0] = String.valueOf(saveLine3[0].charAt(j));
                        } else {
                            saveLine2[0] = saveLine2[0] + saveLine3[0].charAt(j);
                        }
                    }
                }

                if (operation2 > 0) {
                    multi2--;
                    operation2--;
                } else {
                    multi--;
                }

                saveLine3[0] = saveLine2[0];
            } else {
                for (int j = 0; j < saveLine1[0].length(); j++) {
                    if (j == 0) {
                        saveLine2[0] = SUM;
                        saveLine2[0] = saveLine2[0] + saveLine1[0].charAt(j);
                    } else {
                        saveLine2[0] = saveLine2[0] + saveLine1[0].charAt(j);
                    }
                }
                if (operation2 > 0) {
                    operation2--;
                }

            }
        }
    }

    private void doubleParenthesisCheck() {
        int counBackets = 0;
        String[] lane;
        for (int j = 0; j < saveLine2[0].length(); j++) {
            if (String.valueOf(saveLine2[0].charAt(j)).equals("(")) {
                counBackets++;
            }
        }

        if (counBackets > 0) {
            lane = new String[counBackets + 1];
            lane[0] = saveLine2[0];
            int G = 1;

            for (int i = 0; i < lane.length - 1; i++) {
                brackets(false);

                for (int j = 0; j < lane[i].length(); j++) {
                    if (j >= charAtOne && j <= charAtTwo) {
                        if (lane[G] == null) {
                            lane[G] = String.valueOf(lane[i].charAt(j));
                        } else {
                            lane[G] = lane[G] + lane[i].charAt(j);
                        }
                    }
                }
                saveLine2[0] = lane[G];
                G++;

            }
            beginDoubleBrackets(lane);
        }

    }


    private void beginDoubleBrackets(String[] lane) {
        for (int i = lane.length - 1; i > 0 ; i--) {
            saveLine2[0] = lane[i];
            countingOperations(true, false);
            while (operation2 > 0) {
                findBeginAndEnd();
                variableSelection();
                operation();

                if (operation2 == 1) {
                    saveLine2[0] = lane[i - 1];
                    brackets(false);
                    operation2--;
                    lane[i - 1] = null;
                    for (int j = 0; j < saveLine2[0].length(); j++) {
                        if (j == charAtOne - 1) {
                            if (lane[i - 1] == null) {
                                lane[i - 1] = SUM;
                            } else {
                                lane[i - 1] = lane[i - 1] + SUM;
                            }
                        } else if (j < charAtOne || j > charAtTwo + 1) {
                            if (lane[i - 1] == null) {
                                lane[i - 1] = String.valueOf(saveLine2[0].charAt(j));
                            } else {
                                lane[i - 1] = lane[i - 1] + saveLine2[0].charAt(j);
                            }
                        }
                    }
                } else {
                    saveLine5[0] = saveLine4[0];
                    saveLine4[0] = null;
                    recordResult();
                    saveLine4[0] = saveLine5[0];
                }
            }
        }
        saveLine2[0] = lane[0];
        doubleParenthesisCheck();
    }

    public void operation(String text) {
        SUM = null;
        allOperation = 0;
        int length = text.length();
        scanSafe (length, text);
        countingOperations (false, true);
        saveLine3[0] = saveLine2[0];
        for (int i = 0; i < allOperation; i++) {
            saveLine1[0] = null;
            findBeginAndEnd ();
            variableSelection();
            operation();
            saveLine2[0] = null;
            if (i != allOperation - 1) {
                recordResult();
            }
        }
    }
}