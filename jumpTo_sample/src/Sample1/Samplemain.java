package Sample1;

public class Samplemain {
    public static void main(String[] args) {

        //계산기 여러개 만들기
        Caculator cal1 = new Caculator();
        Caculator cal2 = new Caculator();

        System.out.println(cal1.add(3));
        System.out.println(cal1.add(4));

        System.out.println(cal2.add(3));
        System.out.println(cal2.add(7));

    }
}
