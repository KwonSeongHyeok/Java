package practice3.model.vo;

// �߻� Ŭ���� ��������
public class Dog extends Animal {
	public static final String PLACE = "�ְ�ī��";
	private int weight;
// �޼���
	// Setter
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public static String getPlace() {
		return PLACE;
	}
	
	// Getter
	public int getWeight() {
		return weight;
	}
	
	
	public Dog() {
	}
	public Dog(String name, String kinds, int weight) {
		super(name, kinds); // Animal �ؿ� �̹��ִ� name, kinds�� �ٶ󺸰� �ϱ� ���ؼ�
		this.weight = weight;
	}
	
	// @Override speak ctrl + space  enter
	@Override
	public void speak(){
		System.out.println(super.toString() + "�����Դ� " + weight + "kg �Դϴ�.");
	}
	
	
}
