package validators;

import java.io.*;
import java.util.Scanner;

/**
 * Абстрагированный для системы ввода
 * @author Илья Петровский
 * @since 04.02.2021
 */
public abstract class AbstractIO implements IO, Closeable {
    /**
     * Объект Scanner для организации ввода данных
     */
    Scanner scanner;
    /**
     * Объект PrintWriter для организации вывода данных
     */
    PrintStream pw;

    /**
     * Конструктор
     * @param in поток ввода
     * @param out поток вывода
     */
    public AbstractIO(InputStream in, OutputStream out) throws UnsupportedEncodingException {
        this.scanner=new Scanner(in);

        this.pw=new PrintStream(out,false,"Cp866");

    }

    /**
     * {@inheritDoc}
     * @return прочитанный токен
     */
    @Override
    public String read(){
        return scanner.next();
    }

    /**
     * {@inheritDoc}
     * @param o выводимый объект
     */
    @Override
    public void println(Object o){
        pw.println(o);
        pw.flush();
    }


    /**
     * {@inheritDoc}
     * @throws IOException - если не удалось закрыть ресурсы
     */
    @Override
    public void close(){
        scanner.close();
        pw.close();
    }
}
