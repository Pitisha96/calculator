package validators;

import java.io.Closeable;
import java.io.IOException;

/**
 * Валидатор для ввода данных разного типа
 * @author Илья Петровский
 * @since 04.02.2021
 */
public class Validator implements Closeable {
    AbstractIO io;

    /**
     * КОнструктор. Принимает нужную систему ввода вывода
     * @param io система ввода/вывода
     */
    public Validator(AbstractIO io){
        this.io = io;
    }

    /**
     * Получает число из системы ввода/вывода
     * @param text запрос на число
     * @return число прочитанное из консоли
     */
    public double getNumber(String text){
        io.println(text);
        return Double.parseDouble(io.read());
    }

    /**
     * Получает символ операции из системы ввода/вывода
     * @return символ операции
     * @throws UnsupportedOperationException - если операция не поддерживается
     */
    public char getOperation()
    throws UnsupportedOperationException{
        io.println("введите операцию: ");
        char op = io.read().charAt(0);
        if(op!='+'&& op!='-'&&op!='*'&&op!='/'){
            throw new UnsupportedOperationException("операция не поддерживается");
        }else{
            return op;
        }
    }

    /**
     * Запрашивает ответ из системы ввода/вывода
     * @param text запрос
     * @return ответ на вопрос
     */
    public String getAnswer(String text){
        io.println(text);
        return io.read();
    }

    /**
     * Вывод через систему ввода/вывода
     * @param o объект для вывода
     */
    public void println(Object o){
        io.println(o);
    }

    @Override
    public void close() throws IOException {
        this.io.close();
    }
}
