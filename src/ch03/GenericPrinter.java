package ch03;

// Material 를 상속받은 자식 클래스만 대체 문자에 들어올 수 있다.
public class GenericPrinter<T extends Material> {

	private T material;
	
	// get, set
	public T getMaterial() {
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return material.toString();
	}
	
}
