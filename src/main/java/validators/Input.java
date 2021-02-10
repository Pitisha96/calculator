package validators;

/**
 * Интерфейс описывает систему ввода
 * @author Илья Петровский
 * @since 04.02.2021
 */
public interface Input {
    /**
     * Читает токен из потока ввода
     * @return прочитанный токен
     */
    String read();
}
