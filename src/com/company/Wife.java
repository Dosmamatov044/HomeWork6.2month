package com.company;

public class Wife <T,B> implements Husband <Number,Number> {
private T children;
private  B grandfather;

    public Wife(T children,B grandfather) {
        this.children = children;
        this.grandfather = grandfather;
    }

    public Wife(T children) {
        this.children = children;
    }

    public Wife() {

    }

    public T getChildren() {
        return children;
    }

    public void setChildren(T children) {
        this.children = children;
    }

    public B getGrandfather() {
        return grandfather;
    }

    public void setGrandfather(B grandfather) {
        this.grandfather = grandfather;
    }

    @Override
    public Number getId() {
        int i;
        int d=777;
        int c=6;
        int r=8;          //Бессмысленный
        i=d-r*c;
        return i;
    }

    @Override
    public Number getSum() {

        int i=1000;
        int d=1000;
        int c=5;
                                       //также
        d=d+i*c;
        return d;



    }
}
