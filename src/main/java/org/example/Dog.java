package org.example;

public class Dog extends Animal {
    private static int count;
    private static int countClone;

    public Dog(String type, String name, int flying, int swims, int goes, int run, int crawling) {
        this.type = type;
        this.name = name;
        this.swims = swims;
        this.run = run;
        this.crawling = crawling;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static int getCountClone() {
        return countClone;
    }

    protected Object clone(String m) throws CloneNotSupportedException {
        countClone++;
        Dog clon = (Dog) super.clone();
        clon.type = "(КЛОН - мутант) " + type;
        clon.name = "КЛОН (М) №" + countClone + "_" + name;
        return clon;
    }

    protected Object clone() throws CloneNotSupportedException {
        countClone++;
        Dog clon = (Dog) super.clone();
        clon.type = "(КЛОН) " + type;
        clon.name = "КЛОН " + name;
        return clon;
    }
}

