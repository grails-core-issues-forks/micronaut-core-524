package example;

import io.micronaut.function.client.FunctionClient;

import javax.inject.Singleton;

//@Singleton
public class VatClient implements VatValidator {
    @Override
    public String hello() {
        return null;
    }
}
