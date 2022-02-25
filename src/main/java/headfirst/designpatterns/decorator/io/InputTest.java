package headfirst.designpatterns.decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Количество классов в пакете java.io... устрашает. Если вы сказали «ого!» при первом
 * взгляде на этот API (а также при втором и третьем), не огорчайтесь, вы не одиноки.
 * Но теперь, когда вы знакомы с паттерном Декоратор, классы ввода/вывода смотрятся
 * более осмысленно, потому что пакет java.io в основном базируется на паттерне Декора-
 * тор.
 * Библиотека ввода/вывода Java также подчеркивает один из недостатков паттер-
 * на Декоратор: иерархии, построенные с использованием этого паттерна, часто
 * состоят из множества мелких классов, в которых трудно разобраться разработ-
 * чику, пытающемуся использовать API. Но теперь вы знаете, как работает Деко-
 * ратор, представляете общую картину и при использовании чужого API на базе
 * паттерна Декоратор разберетесь в структуре его классов, чтобы получить доступ
 * к нужному поведению.
 */
public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        InputStream in = null;
        //нужно в блоке finally позаботиться о закрытии потока
        try {
            /*Создаем объект FileInputStream и декорируем его — сначала
            декоратором BufferedInputStream, затем нашим фильтром LowerCaseInputStream.*/
            in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
        }

        System.out.println();
        //try-with-resources - можно не заботиться о закрытии потока
        /*Создаем объект FileInputStream и декорируем его — сначала
        декоратором BufferedInputStream, затем нашим фильтром UpperCaseInputStream.*/
        try (InputStream in2 =
                     new UpperCaseInputStream(
                             new BufferedInputStream(
                                     new FileInputStream("test.txt")))) {
            while ((c = in2.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
