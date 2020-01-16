package ls3.task3;

import static ls3.task3.Calculator.calc;
import static ls3.task3.Calculator.getInt;

public class Runner {
    public static void main(String[] args) {
    Calculator myNewCalc = new Calculator();

        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Результат операции: "+result);
    }

    private static char getOperation() {
        return 0;
    }
}
