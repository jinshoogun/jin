package ex09_11;

public class ClothingInfo {
	enum Season {
		SPRING, SUMMER, FALL, WINTER
	}
// bin ������ ���� ClothingInfo$Season $��� ǥ��� (Ŭ���� ���� ����Ŭ������ �ֽ��ϴ�!!!!!!! ���־־־־�!!)
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
