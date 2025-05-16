package org.example;

import java.util.function.BiPredicate;
import java.util.function.Function;

public class LambdaRunner {
    public static <A, B> B run(Function<A, B> function, A a) {
        return function.apply(a);
    }

    public static <A, B> boolean run(BiPredicate<A, B> biPredicate, A a, B b) {
        return biPredicate.test(a, b);
    }

    public static <A, B, C, D> boolean run(IHumanLambda<A, B, C, D> humanLambda, A a, B b, C c, D d) {
        return humanLambda.apply(a, b, c, d);
    }
}
