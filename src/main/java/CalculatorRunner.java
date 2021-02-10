import validators.ConsoleIO;
import validators.Validator;

import java.io.IOException;
import java.util.Locale;

/**
 * Главный класс для входа в программу
 * @since 04.02.2021
 * @author Илья Петровский
 */
public class CalculatorRunner {
    public static void main(String[] args) throws IOException {
        Calculation calculation=new Calculation();
        double num1,num2;
        char op;
        try(Validator validator=new Validator(new ConsoleIO())){
            if(args.length>=3){
                validator.println(String.format("%s %s %s = %s",args[0],args[1],args[2],
                        calculation.calc(args)));
            }else{
                do{
                    num1=validator.getNumber("введите первое число: ");
                    op=validator.getOperation();
                    num2=validator.getNumber("введите второе число: ");
                    validator.println(String.format("%s %s %s = %s",num1,op,num2,
                            calculation.calc(num1,num2,op)));
                }while(validator.getAnswer("хотите повторить?(Y/N)").toUpperCase(Locale.ROOT).equals("Y"));
            }
        }
    }
}
