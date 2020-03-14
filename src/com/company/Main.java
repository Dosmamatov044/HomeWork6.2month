package com.company;

public class Main {

    public static void main(String[] args) {


        Wife wife = new Wife(2, 3.3);
        System.out.println(wife.getChildren() + " " + wife.getGrandfather());
        Wife wife1 = new Wife(3);
        System.out.println(wife1.getChildren());
        Wife<Integer, Double> wife2 = new Wife(4, 6.3);
        System.out.println(wife2.getChildren() + "  " + wife2.getGrandfather());


        wife.getId();

        System.out.println(wife.getId());

        wife.getSum();
        System.out.println(wife.getSum());

    }
}
