package ex19_11;
// ����ȭ ���� Ŭ������ ���� ��ȣ ���̱�
// �ٿ��� ���� ��ȣ�� Ŭ������ ������Ҹ� �߰��ϰų� �����ϵ� �ٲ��� �ʽ��ϴ�.��
public class Rectangle implements java.io.Serializable {
	static final long serialVersionID = 100; // 100 : ���� ��ȣ
	public int width, height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	int getArea() {
		return width * height;
	}

}
// ������
// 1. �Ʒ� getArea �޼ҵ��� �ּ��� �ް� �����ϴ� ��� ������ ����
// ObjectOutputExample7.java�� ����
// ObjectInputExample7.java�� ����


// 2. �Ʒ� �޼ҵ��� �ּ��� Ǭ�� - ���� �߻�
// ObjectInputExample7.java�� ����

// ex19_10.Rectangle;
// local class incompatible: // Ŭ������ ȣȯ�� ���� �ʴ´�.
// ��Ʈ���� ���� �о���� ���� �ȿ��� ��ϵǾ� �ִ� ���� ��ȣ
// stream classesc serialVersionUID = 3385310283108755664,
// �� ����ȭ ���α׷��� ����� Ŭ������ ���� ��ȣ
// local class serialVersionUID = 897037298772490158

// �̷� ���� ��ȣ�� �ڹ��� ����ȭ ��Ŀ����� ������ȭ ��Ŀ������ ������ ���� �ڵ����� �ο��Ǵµ� ����ȭ ��� Ŭ������ ������ �״�� �ϸ� ���� ��ȣ�� 
// �ο��ǰ� Ŭ������ ������Ұ� �ϳ��� �ٲ�� ������ �ٸ� ������ȣ�� �ο��ȴ�.

// int getArea(){
// return width*height;
// }