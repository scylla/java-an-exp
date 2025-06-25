package example;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TransformAspectTest {
    @Test
    public void processAddsPrefixAndUppercases() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyService service = context.getBean(MyService.class);
        String result = service.process("abc");
        assertEquals("Prefix: ABC", result);
        context.close();
    }
}
