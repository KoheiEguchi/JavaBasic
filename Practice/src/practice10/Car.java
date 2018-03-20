package practice10;

public class Car {
	int serialNo;
	String color;
	int gasoline;

	int run() {
		int random=0;
		int limitNumber=15;

		if(gasoline>0) {
			gasoline--;
			random = new java.util.Random().nextInt(limitNumber);
			return random+1;
		}else {
			return -1;
		}
	}

}
