package org.example;

@FunctionalInterface
public interface IHumanLambda<A, B, C, D> {
    boolean apply(A a, B b, C c, D d);
}
