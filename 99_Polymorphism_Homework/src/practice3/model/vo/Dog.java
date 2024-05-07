package practice3.model.vo;

// 추상 클래스 가져오기
public class Dog extends Animal {
	public static final String PLACE = "애견카페";
	private int weight;
// 메서드
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
		super(name, kinds); // Animal 밑에 이미있는 name, kinds를 바라보게 하기 위해서
		this.weight = weight;
	}
	
	// @Override speak ctrl + space  enter
	@Override
	public void speak(){
		System.out.println(super.toString() + "몸무게는 " + weight + "kg 입니다.");
	}
	
	
}
