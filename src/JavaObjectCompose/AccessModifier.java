package JavaObjectCompose;

/**
 * Created by vitol_000 on 24.11.2014.
 * java2uml
 */
public enum AccessModifier {
    PRIVATE("private"),
    PROTECTED("protected"),
    PUBLIC("public"),
    DEFAULT("package-private");

    private String name;

    AccessModifier(String s) {
        name = s;
    }

    @Override
    public String toString() {
        return name;
    }
}
