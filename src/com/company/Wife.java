package com.company;

public class Wife   <T extends Number> implements Husband {
private T children;
private  T grandfather;

    public Wife(T children,T grandfather) {
        this.children = children;
        this.grandfather = grandfather;
    }


    public T getChildren() {
        return children;
    }

    public void setChildren(T children) {
        this.children = children;
    }

    public T getGrandfather() {
        return grandfather;
    }

    public void setGrandfather(T grandfather) {
        this.grandfather = grandfather;
    }

    @Override
    public Number getFamily() {


        System.out.println("Мама , Папа ,Сын , Дочь ");

        return children;

    }

    @Override
    public Number getWhereDoTheyLive() {
        System.out.println(" Родители живут " + " Отдельно в Оше ");



        return grandfather ;


    }
}






