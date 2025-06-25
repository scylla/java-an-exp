package example;

public interface MyService {
    int add(int a, int b);

    @UpperCase(prefix = "Prefix: ")
    String process(String input);

    default boolean isTransformEnabled() {
        return false;
    }
}
