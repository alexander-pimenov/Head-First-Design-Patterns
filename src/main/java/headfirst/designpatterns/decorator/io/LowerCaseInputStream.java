package headfirst.designpatterns.decorator.io;

import java.io.*;

/**
 * Давайте напишем декоратор, который преобразует все
 * символы верхнего регистра во входном потоке к нижне-
 * му регистру. Другими словами, если из потока читается
 * строка «I know the Decorator Pattern therefore I RULE!», то
 * наш декоратор преобразует ее к виду «i know the decorator
 * pattern therefore i rule!»
 * Нет проблем. Нужно расширить класс FilterInputStream и
 * переопределить метод read().
 */
public class LowerCaseInputStream extends FilterInputStream {

	public LowerCaseInputStream(InputStream in) {
		super(in);
	}

	/**
	 * Теперь необходимо реализовать два метода read. Они
	 * получают байт (или массив байтов) и преобразуют каж-
	 * дый символ к нижнему регистру.
	 *
	 * @return число
	 * @throws IOException возможно исключение
	 */
	public int read() throws IOException {
		int c = in.read();
		return (c == -1 ? c : Character.toLowerCase((char)c));
	}
		
	public int read(byte[] b, int offset, int len) throws IOException {
		int result = in.read(b, offset, len);
		for (int i = offset; i < offset+result; i++) {
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}
}
