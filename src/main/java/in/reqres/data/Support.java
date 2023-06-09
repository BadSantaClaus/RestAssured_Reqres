package in.reqres.data;

import lombok.Getter;
import lombok.Setter;
/**
 * Класс используется для сериализации аттрибута support
 *
 * @author Горячев Роман Юрьевич
 */
@Getter
@Setter
public class Support {
    /**
     * Адрес страницы
     *
     * @author Горячев Роман Юрьевич
     */
    private String url;
    /**
     * Отображаемый текст
     *
     * @author Горячев Роман Юрьевич
     */
    private String text;
}
