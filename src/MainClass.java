
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal1 = new Calculator(10, 20);
		Calculator cal2 = new Calculator(10, 20);		
		
		int result1 = cal1.add(); // 10+20=30 이 반환
		
		System.out.println(cal1.firstNum); // 10
		
		Calculator.thirdNum = 10;
		cal1.thirdNum = 10;
		
		Calculator.minus(20, 10);
		
		// TestSingleTon test1 = new TestSingleTon(); // 생성자가 private 이므로 new 연산자로 객체 선언 불가
		TestSingleTon testSingle1 = TestSingleTon.getInstance();
		
		TestSingleTon testSingle2 = TestSingleTon.getInstance();
		
		System.out.println(Calculator.PI); // final로 선언된 상수 불러오기
		

	}

}
