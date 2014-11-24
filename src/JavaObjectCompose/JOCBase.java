package JavaObjectCompose;

/**
 * Created by vitol_000 on 24.11.2014.
 * java2uml
 *
 * Базовый абстрактный класс.
 * Содержит имя и модификатор доступа.
 * Наследуется классами JCCClass, JCCMethod, JCCParameter.
 */
abstract class JOCBase {
    //Название. По-умолчанию анонимный.
    private String name = "";

    //Модификатор доступа. По-умолчанию package-private.
    private AccessModifier accessModifier = AccessModifier.DEFAULT;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(AccessModifier accessModifier) {
        this.accessModifier = accessModifier;
    }
}
