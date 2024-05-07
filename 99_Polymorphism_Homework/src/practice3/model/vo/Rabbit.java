package practice3.model.vo;

// Animal extends
public class Rabbit extends Animal {
// �ʵ�
	private int weight;
	private String color;
// �޼���
	// Setter
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setColor(String color) {
		this.color = color;
	}
	// Getter	
	public int getWeight() {
		return weight;
	}
	public String getColor() {
		return color;
	}

	// ������ : �⺻
	public Rabbit() {
	}
	// ������ : �ʼ�
	public Rabbit(String name, String kinds, int weight, String color) {
		super(name, kinds);
		this.weight = weight;
		this.color = color;
	}
	// @Override speak ������ �ͼ� ����ϱ�
	@Override
	public void speak() {
		System.out.println(super.toString() + " �䳢�� ���� : " + weight
											+ ", �䳢�� ���� : " + color);
	}
}
