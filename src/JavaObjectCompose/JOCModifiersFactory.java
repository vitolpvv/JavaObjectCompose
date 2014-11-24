package JavaObjectCompose;

import java.util.HashMap;

/**
 * Created by vitol_000 on 24.11.2014.
 * java2uml
 *
 * Класс для создания списка модификаторов кроме модификатора доступа.
 */
final class JOCModifiersFactory {
    //Список всех возможных модификаторов
    private static enum Modifier {
        STATIC("static"),
        ABSTRACT("abstract"),
        FINAL("final"),
        NATIVE("native"),
        TRANSIENT("transient"),
        VOLATILE("volatile"),
        SYNCHRONIZED("synchronized"),
        STRICTFP("strictfp");

        String name;

        Modifier(String s) {
            name = s;
        }
    }

    //Здесь хранится создаваемый список модификаторов
    private static HashMap<String, Boolean> modifiersMap;

    private JOCModifiersFactory() {}

    //Метод инициирует создание списка и возвращает сформированный список.
    //В качестве аргумента передается объект, для которого строится список модификаторов.
    public static HashMap<String, Boolean> createModifiersFor(Object o) {
        modifiersMap = new HashMap<String, Boolean>();
        if (o.getClass() == JOCField.class) {
            createModifiersForField();
        } else if (o.getClass() == JOCMethod.class) {
            createModifiersForMethod();
        } else if (o.getClass() == JOCClass.class) {
            createModifiersForClass();
        }
        return modifiersMap;
    }

    //Создает список модификаторов для переменной
    private static void createModifiersForField() {
        add(Modifier.STATIC);
        add(Modifier.FINAL);
        add(Modifier.TRANSIENT);
        add(Modifier.VOLATILE);
    }

    //Создает список модификаторов для метода
    private static void createModifiersForMethod() {
        add(Modifier.STATIC);
        add(Modifier.ABSTRACT);
        add(Modifier.FINAL);
        add(Modifier.NATIVE);
        add(Modifier.SYNCHRONIZED);
        add(Modifier.STRICTFP);
    }

    //Создает список модификаторов для класса
    private static void createModifiersForClass() {
        add(Modifier.STATIC);
        add(Modifier.ABSTRACT);
        add(Modifier.FINAL);
        add(Modifier.STRICTFP);
    }

    //Метод добавления модификатора.
    private static void add(Modifier modifier) {
        if (modifier != null) {
            modifiersMap.put(modifier.name, false);
        }
    }
}
