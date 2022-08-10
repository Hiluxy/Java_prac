package Sample2;

public class Sample {
    public static void main(String[] args) {
        //new는 객체생성시 사용. Animal클래스의 Cat 인스턴스가 만들어짐
        Animal cat = new Animal();
        cat.setName("NAMI"); //메소드 호출
        Animal dog = new Animal();
        dog.setName("BBOBBI");

        //객체변수의 값이 공유되지 않는다. (static을 이용하면 공유 가능)
        System.out.println(cat.name);//cat.name으로 접근
        System.out.println(dog.name);
    }
}
