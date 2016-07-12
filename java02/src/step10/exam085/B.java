package step10.exam085;

// 컴파일 오류!
// => A 클래스는 final로 상속을 막았다. 
// => 왜? 서브 클래스가 A를 상속받아 A인 것처럼 행동할까봐.
//    왜? 
//    A p;  <--- p 변수는 A의 서브클래스 객체도 저장할 수 있다.
//    문제는 A를 상속 받은 B가 보안을 건너뛰는 코드를 추가하여
//    프로그램의 보안을 깨뜨릴까봐.
public class B extends A {

}
