package ru.ivan.sapronov;

//Класс, отвечающий за корретный запуск приложения
public class Launcher {
    public static void start() {
        printHeading();
        try{
            while (true){
                printEnterExpression();
                String str = ConsoleReader.getUserInput();
                if(str.matches("exit")){
                    printGoodBye();
                    break;
                }
                byte versionExpr = Parser.getVersionExpr(str);
                int rezult = Calculator.computation(Parser.parse(str, versionExpr));
                if(versionExpr == 1) System.out.println(rezult);
                else System.out.println(Converter.convertArabicToLatin(rezult));
            }
        }catch (CalcException e) {
            System.out.println("\n" + e.getMessage());
            return;
        } catch (Exception e){
            System.out.println("\nАварийное завершение работы! Брошено исключение: "
                    + e.getMessage());
            return;
        }
    }

    private static void printHeading(){
        System.out.println("Добро пожаловать в Консольный калькулятор!");
        System.out.println("******************************************");
    }

    private static void printEnterExpression(){
        System.out.println("\nНапишите, что нужно посчитать.\n" +
                "Или введите \"exit\" для выхода из приложения...\n");
    }

    private static void printGoodBye(){
        System.out.println("\nДо скорых встреч!");
        System.out.println("******************************************");
    }
}