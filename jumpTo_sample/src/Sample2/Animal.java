package Sample2;


//보통 클래스는 파일단위로 단독작성함. 이 경우는 예시를 위해
class Animal{
    String name; //객체(인스턴스)변수=멤버변수=속성

    //setName()
    public void setName(String name){
        this.name=name; //this=Animal class에 의해 생성된 해당 객체(cat)
    }

}