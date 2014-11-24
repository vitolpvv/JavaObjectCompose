package JavaObjectCompose;

import java.util.HashMap;

/**
 * Created by vitol_000 on 24.11.2014.
 * java2uml
 *
 * Класс объекта java-переменной
 */
public class JOCField extends JOCBase {
    //Тип переменной
    private String type;

    //Значение по-умолчанию
    private String defaultValue;

    //Список модификаторов для переменной
    private HashMap<String, Boolean> modifiers = JOCModifiersFactory.createModifiersFor(this);
}
