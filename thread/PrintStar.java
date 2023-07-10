package thread;

public class PrintStar {
	public static void main(String[] args) {
		//하나의 프로세스내에서 독립적으로 실행될 수 있는 세부 실행 단위를 가리켜
		//쓰레드라 부른다.
		MyThread mt1= new MyThread();//별도이 실행부 생성
		mt1.start();//run() 을 간접 호출
		
		MyThread2 mt2 = new MyThread2();//별도의 샐행부 생성
		mt2.start();
		
		System.out.println("메인메서드에 의한 코드");
		

		
	}
}
