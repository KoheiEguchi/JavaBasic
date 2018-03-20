package Practice;

public class Merchant {
	final int PRICE=100;
	int stock=100;
	int money=0;

	void sellItem(int count) {
		this.stock-=count;
		this.money+=this.PRICE*count;
	}
	String confirmMoney() {
		return("売り上げは"+money+"円です。");
	}

}
