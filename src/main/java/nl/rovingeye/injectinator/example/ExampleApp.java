package nl.rovingeye.injectinator.example;

import nl.rovingeye.injectinator.example.config.MyInjectableConfig;
import nl.rovingeye.injectinator.example.service.ExampleConstructorService;
import nl.rovingeye.injectinator.example.service.ExampleFieldService;
import nl.rovingeye.injectinator.framework.Injectinator;

public class ExampleApp {

    public static void main(final String[] args) throws Exception {

        final Injectinator injectinator = Injectinator.getInjectinator(new MyInjectableConfig());
        final ExampleConstructorService exampleConstructorService = injectinator.inject(ExampleConstructorService.class);
        final ExampleFieldService exampleFieldService = injectinator.inject(ExampleFieldService.class);

        exampleConstructorService.doStuff();
        exampleFieldService.doStuff();

    }
}