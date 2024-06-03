package ch01;

public class MainTest1 {
	
	public static void main(String[] args) {
		
		ThreeDPrinter dPrinter1 = new ThreeDPrinter();
		dPrinter1.setMaterail(new Plastic());		
		System.out.println(dPrinter1.material.toString());
		
		// 위 ThreeDPrinter 한계는 재료가 플라스틱에 종속 되어 있다.
		// 하지만 사용자 입장에서 재료를 파우더로 변경한다면
		// 코드의 수정이나 새로운 클래스가 필요하다.
		
		System.out.println("-----------------------");
		
		ThreeDPrinter2 dPrinter2 = new ThreeDPrinter2();
		dPrinter2.setMaterail(new Powder());	
		System.out.println(dPrinter2.material.toString());
		
		System.out.println("-----------------------");
		
		ThreeDPrinter3 dPrinter3 = new ThreeDPrinter3();
		dPrinter3.setMaterail(new Plastic());
		System.out.println(dPrinter3.material.toString());

		System.out.println("-----------------------");
				
		ThreeDPrinter3 dPrinter3_2 = new ThreeDPrinter3();
		dPrinter3_2.setMaterail(new Powder());
		System.out.println(dPrinter3_2.material.toString());
		
		Plastic plastic01 = (Plastic)dPrinter3.getMaterial(); // 다운 캐스팅
		Powder powder01 = (Powder)dPrinter3.getMaterial(); // 오류나는 코드가 된다.
		
		
	} // end of main

} // end of class