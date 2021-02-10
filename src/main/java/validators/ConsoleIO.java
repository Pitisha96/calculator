package validators;

import java.io.UnsupportedEncodingException;

/**
 * Консольная система ввода/вывода
 * @author Илья Петровский
 * @since 04.02.2021
 */
public class ConsoleIO extends AbstractIO{
    /**
     * Конструктор. В качестве системы ввода/вывода испльзует системную консоль
     */
    public ConsoleIO()throws UnsupportedEncodingException {
        super(System.in,System.out);
    }
}
