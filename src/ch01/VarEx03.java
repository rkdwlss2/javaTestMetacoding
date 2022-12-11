package ch01;


//MyVar은 클래스 자료형 = 개발자 만드는 커스텀 자료형
// 여러가지 데이터를 가지고 있는 클래스를 Beans 라고 부름.
class MyVar{ // 두가지를 들고있는 자료형
 static int n1 = 10;
 static char c1 = 'A';
}

public class VarEx03 {

    static int num = 500;

    public static void main(String[] args) {
        System.out.println(MyVar.n1); // .이라는 연결 연산자
        System.out.println(MyVar.c1);
        System.out.println(VarEx03.num); // 앵간하면 위치를 알려주는게 좋음
    }
}
