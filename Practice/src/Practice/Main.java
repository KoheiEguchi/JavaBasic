package Practice;

public class Main {
	public static void main(String[] args) {
		Merchant merchant=new Merchant() ;
		merchant.sellItem(50);
		System.out.println(merchant.confirmMoney());
	}
}
