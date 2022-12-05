package Lab2;

import java.io.Serializable;

public class Ex33 implements Serializable {
    private  String name;
    private int age;

    public Ex33(String name,int age){
        this.age=age;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Ex33{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
