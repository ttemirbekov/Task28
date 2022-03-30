package com.company;

import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {


        System.out.println(sqrt.apply(11025.25));
    }

    public static UnaryOperator<Double> sqrt = Math::sqrt;
}
