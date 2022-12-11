package ch01;

// int n3= 30; 1. 자바의 모든 코드는 클래스 내부에 존재해야한다.

public class VarEx02 {

    static int n2 = 20; // 2. 자바는 실행전에 static이라는 키워들르 가지고 있는 모든 친구들을 static공간에 로드한다.

    public static void main(String[] args) {
        int n1 = 10; // 10 번 라인이 실행 될때 n1이라는 메모리 공간에 할당 된다. 3. 자바를 실행하면 main 이라는 친구의 내부{} 실행하고,
        // 내부가 끝나면 종료 된다.(자바 프로그램)
        System.out.println(n1); // 모니터 화면에 출력이 됨
        System.out.println(n2); // varEx02라는 static공간의 n2를 실행한적 없어서 당연히 에러가 뜸
    } // 4. {}내부가 끝나면 종료된다.
} // java 파일 쟈장 (컴파일) class 파일을 jvm이 실행을 시킴
