package Practice;

public class Employee {
	static final String company="テストカンパニー";
	String name;
	int age;

	Employee(){
		this("名無し");
	}

	Employee(String name){
		this(name,20);
	}

	Employee(String name,int age){
		this.name=name;
		this.age=age;
	}

	String getProfile() {
		return"会社は"+this.company+"、名前は"+this.name+"、年齢は"+this.age;
	}


}
