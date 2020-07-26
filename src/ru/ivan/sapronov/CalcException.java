package ru.ivan.sapronov;

//Класс, представляющий исключения, относящиеся к работе приложения "Калькулятор"
class CalcException extends Exception{
    public CalcException(String message){
        super("Ошибка Калькулятора: " + message);
    }
}