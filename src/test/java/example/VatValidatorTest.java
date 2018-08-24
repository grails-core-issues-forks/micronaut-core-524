package example;

import io.micronaut.context.ApplicationContext;
import io.micronaut.context.env.Environment;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class VatValidatorTest {

    @Test
    public void testFunctionClientReplacement() {
        ApplicationContext context = ApplicationContext.run(Environment.TEST);

        VatValidator bean = context.getBean(VatValidator.class);
        assertTrue(bean instanceof MockVatValidator);

        context.close();
        context.stop();
    }
}
