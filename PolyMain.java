class Animal {
    String name;
    String sound;

    Animal() {
        this("", "");
    }

    Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    void getInfo() {
        System.out.println("Name = " + name);
        System.out.println("Sound = " + sound);
    }

    void getInfo(String name, String sound, int legs) {
        System.out.println("Name = " + name);
        System.out.println("Sound = " + sound);
        System.out.println("No of Legs = " + legs);
    }
}

class Cat extends Animal {
    Cat(String name, String sound) {
        super(name, sound);
    }

    @Override
    void getInfo() {
        System.out.println("Name = " + name);
        System.out.println("Sound = " + sound);
    }
}

public class PolyMain {
    public static void main(String[] args) {

        Animal an1 = new Animal("Horse", "Heeeee");
        an1.getInfo();

        an1.getInfo("Cat", "Meow", 4);

        Animal an2 = new Cat("Cat2", "Meow");
        an2.getInfo();//
    }
}
