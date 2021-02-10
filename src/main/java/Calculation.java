/**
 * Класс с основными операциями калькулятора
 * @author Илья Петровский
 * @since 04.02.2021
 */
public class Calculation {

    /**
     * Считает результат с переданными параметрами
     * @param num1 первое число
     * @param num2 второе число
     * @param operation операция
     * @return результат выражения
     */
    public double calc(double num1,double num2,char operation){
        switch(operation){
            case '+':
                return add(num1,num2);
            case '-':
                return sub(num1,num2);
            case '*':
                return multiply(num1,num2);
            case '/':
                return div(num1,num2);
            default:
                return 0d;
        }
    }

    /**
     * Считает результат выражения переданный строкой
     * @param args список параметров
     * @return результат выражения
     */
    public double calc(String[] args){
        switch(args[1].charAt(0)){
            case '+':
                return add(Double.parseDouble(args[0]),Double.parseDouble(args[2]));
            case '-':
                return sub(Double.parseDouble(args[0]),Double.parseDouble(args[2]));
            case '*':
                return multiply(Double.parseDouble(args[0]),Double.parseDouble(args[2]));
            case '/':
                return div(Double.parseDouble(args[0]),Double.parseDouble(args[2]));
            default:
                return 0d;
        }
    }
    /**
     * Считает сумму чисел
     * @param num1 слогаемое
     * @param num2 слогаемое
     * @return сумма
     */
    private double add(double num1,double num2){
        return num1+num2;
    }

    /**
     * Считает разность чисел
     * @param num1 исходное
     * @param num2 вычитаемое
     * @return разница
     */
    private double sub(double num1, double num2){
        return num1-num2;
    }

    /**
     * Считает деление чисел
     * @param num1 делимое
     * @param num2 делитель
     * @return частное
     */
    private double div(double num1,double num2){
        return num1/num2;
    }

    /**
     * Считает произведение чисел
     * @param num1 множитель
     * @param num2 множитель
     * @return результат умножения
     */
    private double multiply(double num1,double num2){
        return num1*num2;
    }
}
