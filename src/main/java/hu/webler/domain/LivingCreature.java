package hu.webler.domain;

import java.util.Arrays;

public abstract class LivingCreature {

    private static int creatureCounter;
    private String name;
    private int age;
    private String[] colors;

    public LivingCreature() {
        this("", 0, null);
    }

    public LivingCreature(String name, int age, String[] colors) {
        creatureCounter++;
        this.name = name;
        this.age = age;
        this.colors = colors;
    }

    // ez lehetne String. most egyszerű kiiratás miatt adtam neki void-ot!
    // abstract String feed(); -> tipus igényfüggő :)
    public abstract void feed();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public static int getCreatureCounter() {
        return creatureCounter;
    }

    public static void setCreatureCounter(int num) {
        creatureCounter = num;
    }

    @Override
    public String toString() {
        return "LivingCreature{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", colors='" + Arrays.toString(this.getColors()) + '\'' +
                '}';
    }
}