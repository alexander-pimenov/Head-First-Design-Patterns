package headfirst.designpatterns.decorator.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Давайте напишем декоратор, который преобразует все
 * символы во входном потоке к верхнему регистру.
 * Другими словами, если из потока читается
 * строка «I know the Decorator Pattern therefore I RULE!», то
 * наш декоратор преобразует ее к виду «I KNOW THE DECORATOR
 * PATTERN THEREFORE I RULE!»
 * Нет проблем. Нужно расширить класс FilterInputStream и
 * переопределить метод read().
 */
public class UpperCaseInputStream extends FilterInputStream {

    public UpperCaseInputStream(InputStream in) {
        super(in);
    }

    /**
     * Теперь необходимо реализовать два метода read. Они
     * получают байт (или массив байтов) и преобразуют каж-
     * дый символ к верхнему регистру.
     *
     * @return число
     * @throws IOException возможно исключение
     */
    public int read() throws IOException {
        int c = in.read();
        return (c == -1 ? c : Character.toUpperCase((char) c));
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = in.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toUpperCase((char) b[i]);
        }
        return result;
    }
}
