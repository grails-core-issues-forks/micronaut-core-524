package example;

import io.micronaut.context.annotation.Replaces;
import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;

import javax.inject.Singleton;

@Requires(env = Environment.TEST)
@Replaces(VatClient.class)
@Singleton
public class MockVatValidator implements VatValidator {
    @Override
    public String hello() {
        return null;
    }
}
