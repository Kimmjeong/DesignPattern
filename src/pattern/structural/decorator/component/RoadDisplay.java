package pattern.structural.decorator.component;



public class RoadDisplay extends Display { // 기본 기능

	@Override
	public void draw() {
		System.out.println("기본 도로 표시");
	}

}
