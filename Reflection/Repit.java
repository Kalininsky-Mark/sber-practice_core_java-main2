import java.lang.annotation.Repeatable;

@Repeatable(Repits.class)
public @interface Repit {
    int value();
    String descriptions() default "";
}