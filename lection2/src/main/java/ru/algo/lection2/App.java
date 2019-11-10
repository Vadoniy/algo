package ru.algo.lection2;

import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import ru.algo.lection2.factors.FactorsFinder;

@ComponentScan
@PropertySource("classpath:application.yml")
@AllArgsConstructor
public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        final var factorsFinder = (FactorsFinder) context.getBean("factors");
//        final var factors = factorsFinder.factoringSimple(1558465);
//        factors.forEach(System.out::println);
        final var factors2 = factorsFinder.factoringModified(1558465);
        factors2.forEach(System.out::println);
    }

}
