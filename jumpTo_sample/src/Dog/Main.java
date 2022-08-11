package Dog;

class Animal {
    String name;

    void setName(String name) { //매개변수 name
        this.name = name; //객체.객체변수
    }
}

/*상속*/
class Dog extends Animal {
    void say(){
        System.out.println("왈왈");
    }
}
class Pome extends Dog{

    //생성자 (이거 무조건 설정해야 Pome객체 생성가능)
    Pome(String name){
        this.setName(name);
    }

    void say(){
        System.out.println(this.name+" 깽깽");
    }
    void say(int hour){
        System.out.println(this.name+"이 "+hour+"시간동안 계속 운다");
    }

}

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal(); //객체 cat
        cat.setName("bobby"); //인수 bobby

        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);  // poppy 출력
        dog.say();

//        Pome pome = new Pome();
//        pome.setName("Dally");
//        pome.say();
//        pome.say(3);

        Pome pome2 = new Pome("Dally2");
        pome2.say();
    }
}
