package ex09_11;

public class ClothingInfo {
	enum Season {
		SPRING, SUMMER, FALL, WINTER
	}
// bin 폴더에 보면 ClothingInfo$Season $라고 표기됨 (클래스 내에 내부클래스가 있습니다!!!!!!! 뺴애애애애액!!)
	String code;
	String name;
	String material;
	Season season;


	ClothingInfo(String code, String name, String material, Season season) {
		this.code = code;
		this.name = name;
		this.material = material;
		this.season = season;
	}

}
