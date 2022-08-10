
//보통 클래스는 파일단위로 단독작성함. 이 경우는 예시를 위해
class Animal{
    String name; //객체(인스턴스)변수=멤버변수=속성

    //setName()
    public void setName(String name){
        this.name=name; //this=Animal class에 의해 생성된 해당 객체(cat)
    }

}

public class Sample {
    public static void main(String[] args) {
        //new는 객체생성시 사용. Animal클래스의 Cat 인스턴스가 만들어짐
        Animal cat = new Animal();
        cat.setName("NAMI"); //메소드 호출
        System.out.println(cat.name);//cat.name으로 접근
    }
}
