
public class TestSingleTon {
	
//	Calculator cal1 = new Calculator();
//	Calculator cal2 = new Calculator();
//	Calculator cal3 = new Calculator();
	
	private static TestSingleTon single1 = new TestSingleTon();
	
	private TestSingleTon() {
		
	}
	
	public static TestSingleTon getInstance() {
		return single1;
	}
	
	

}
