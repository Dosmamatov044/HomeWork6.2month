package com.company;

public class Wife implements Husband <Number> {
private int children;
private  double grandfather;

    public Wife(int children,double grandfather) {
        this.children = children;
        this.grandfather = grandfather;
    }

    public Wife(int children) {
        this.children = children;
    }

    public Wife() {

    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public double getGrandfather() {
        return grandfather;
    }

    public void setGrandfather(double grandfather) {
        this.grandfather = grandfather;
    }

    @Override
    public Number getId() {
        return 0;
    }

    @Override
    public int getSum() {
        return 0;
    }
}
