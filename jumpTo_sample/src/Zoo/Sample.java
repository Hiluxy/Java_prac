package Zoo;

class Animal{
    String name;

    void setName(String name){
        this.name=name;
    }
}

class Rabbit extends Animal{
}

class Monkey extends Animal{
}

class Zookeeper{
    void feed(Rabbit rabbit){
        System.out.println("feed carrot!");
    }
    void feed(Monkey monkey){
        System.out.println("feed banana!");
    }
}
public class Sample {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();
        Rabbit rabbit=new Rabbit();
        Monkey monkey=new Monkey();
        zookeeper.feed(rabbit);
        zookeeper.feed(monkey);
    }
}
