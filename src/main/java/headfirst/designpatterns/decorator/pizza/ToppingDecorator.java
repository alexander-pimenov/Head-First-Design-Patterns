package headfirst.designpatterns.decorator.pizza;

/**
 * Второй базовый класс.
 * Абстрактный класс для дополнений - для Декораторов.
 * Объекты должны быть взаимозаменяемы с Pizza, поэтому
 * расширяем класс Pizza (так происходит согласование типов).
 * И обязательно содержит ссылку на объект Pizza (композиция).
 */
public abstract class ToppingDecorator extends Pizza {
    //содержит ссылку на Pizza (композиция)
    Pizza pizza;

    public abstract String getDescription();
}
