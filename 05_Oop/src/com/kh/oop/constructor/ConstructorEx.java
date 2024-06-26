package com.kh.oop.constructor;
/* 持失切
痕呪研 据馬澗 葵生稽 段奄鉢拝 呪 赤製

段奄葵戚 = 0; 生稽 鞠嬢赤聖 凶 段奄葵拭 1聖 隔嬢爽檎
段奄葵戚 1稽 段奄鉢喫

1. 鋼発葵戚 蒸製(return 紫遂 x, void x 是 砧鯵稽 識情馬走 省製)
2. 梓端(適掘什)研 段奄鉢 馬澗 号狛戚 弦聖 井酔 乞砧 紫遂 亜管

	識情 森薦
		1. 奄沙 持失切 - 琶呪亜 蒸製
			public 適掘什戚硯() {
		    
		    }
		2. 琶呪 持失切 - 琶呪稽 閤焼醤馬澗 葵戚 糎仙敗
					- 琶呪稽 閤焼醤馬澗 葵精 琶球拭 旋微 葵幻 亜管
			public 適掘什戚硯(String しし, int けけ, char ぞぞ){
				(食奄辞 痕呪誤引 琶球葵精 旭製)
				this.痕呪誤1 = しし;
				this.琶球葵2 = けけ;
				this.琶球葵3 = ぞぞ;
			}
		3. 葵戚 走舛吉 持失切
			琶球蟹 持失切拭辞 葵聖 走舛背層 持失切
* */
public class ConstructorEx {
	// 琶球 痕呪誤 舛税
	public String name; // 搾嬢赤製
	public String phone; // 搾嬢赤製
	public 	  int idNo; // 搾嬢赤製
	public 	  int money; // 搾嬢赤製
	
	// 持失切 奄沙  / 琶呪 / 葵聖 走舛廃 持失切
	// 奄沙持失切 : 琶呪稽 焼巷依亀 隔走省精 持失切
	public ConstructorEx() {
		
	}
	// 琶呪持失切 : 胤硲 照拭 古鯵痕呪亜 琶呪稽 級嬢亜醤馬澗 持失切
	// 憙 古(掻古) 某 鯵(鯵脊) 棣 痕(痕馬陥) 皃 呪(収切亜)
	//					(胤硲照拭 級嬢亜澗 痕呪 : 古鯵痕呪)
	
	
	//					琶呪稽 戚硯 
	public ConstructorEx(String inputName) {
		this.name = inputName;
	}
	// 					琶呪稽 戚硯 輩球肉腰硲
	public ConstructorEx(String inputName, String inputNumber) {
		this.name = inputName;
		this.phone = inputNumber;
	}	

	// 					琶呪稽 戚硯 輩球肉腰硲 焼戚巨腰硲
	public ConstructorEx(String inputName, String inputNumber, int inputID) {
		this.name = inputName;
		this.phone = inputNumber;
		this.idNo = inputID;
	}
	// 					琶呪稽 戚硯 輩球肉腰硲 焼戚巨腰硲 榎衝
	public ConstructorEx(String inputName, String inputNumber, int inputId, int inputMoney) {
		this.name = inputName;
		this.phone = inputNumber;
		this.idNo = inputId;
		this.money = inputMoney;
	}
	
	// 葵聖 走舛廃 持失切
	/* 葵聖 走舛廃 持失切澗 段奄税 葵幻 走舛背爽奄 凶庚拭
	   古惟痕呪研 琶呪稽 隔嬢爽走 省焼亀 鞠走幻
	   奄沙 持失切人 持沿歯亜 業旭焼辞 察娃匝戚 蟹奄 凶庚拭
	   薄仙澗 績税稽 古鯵痕呪研 隔嬢捜
	   左搭精 public ConstructorEx() { } 紫遂拝 呪 赤製
	   紫遂 弦戚 馬走 省製
	*/ 
	public ConstructorEx(int a) {
		// 奄沙生稽 葵聖 走舛背辞 穿含馬澗 持失切
		// 持失拝 凶採斗 葵聖 走舛背爽壱 蓄板 葵聖 痕井拝 呪 赤亀系 背捜
		name = "戚硯聖 脊径背爽室推."; // String戚奄 凶庚拭 庚切伸聖 隔嬢醤敗
		phone = "輩球肉 腰硲研 脊径背爽室推."; // String戚奄 凶庚拭 庚切伸聖 隔嬢醤敗
		idNo = 1; // int戚奄 凶庚拭 収切葵聖 隔嬢醤敗.
		money = 0; // int戚奄 凶庚拭 収切葵聖 隔嬢醤敗.
	}
	
	
	public static void main(String[] args) {

	}

}
