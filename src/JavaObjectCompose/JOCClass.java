package JavaObjectCompose;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by vitol_000 on 24.11.2014.
 * java2uml
 *
 * Класс объекта java-класс
 */
public class JOCClass extends JOCBase {
    //Список параметров класса
    private ArrayList<JOCField> fields;

    //Список методов класса
    private ArrayList<JOCMethod> methods;

    //Внутренние классы
    ArrayList<JOCClass> innerClasses;

    //Класс-родитель
    private JOCClass extentionOf;

    //Список реализованных интерфейсов
    private ArrayList<JOCClass> implementationOf;

    //Список модификаторв для класса
    private HashMap<String, Boolean> modifiers = JOCModifiersFactory.createModifiersFor(this);
}
