package ru.ivan.sapronov;

//Класс, выполняющий арифметические вычисления
public class Calculator {
    static int computation(Object[] calcArgs) throws CalcException {
        int num1 = (int) calcArgs[0];
        int num2 = (int )calcArgs[1];
        String operation = (String) calcArgs[2];
        int result = 0;
            switch (operation){
                case "+":
                    result = num1+num2;
                    break;
                case "-":
                    result = num1-num2;
                    break;
                case "*":
                    result = num1*num2;
                    break;
                case "/":
                    result = num1/num2;
                    break;
                default:
                    throw new CalcException(StringConstants.ExceptionMessages.UNKNOWN_OPERATION);
            }
        return result;
    }
}