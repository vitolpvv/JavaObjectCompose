package JavaObjectCompose;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by vitol_000 on 24.11.2014.
 * java2uml
 *
 * Класс объекта java-метод
 */
public class JOCMethod extends JOCBase {
    //Тип возвращаемого значения
    private String typeOfReturn;

    //Список аргументов
    private ArrayList<JOCField> arguments;

    //Список модификаторов для метода
    private HashMap<String, Boolean> modifiers = JOCModifiersFactory.createModifiersFor(this);
}
