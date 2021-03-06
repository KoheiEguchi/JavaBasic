package practice10;
/*
 * PTra10_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_04 {

	/*
	 * PTra10_01で作成したUserクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ User型の変数が3つ入る配列usersを宣言・確保してください
		User[] users=new User[3];

		// ★ java.util.Scannerクラスをインスタンス化し、変数scannerに代入してください
		java.util.Scanner scanner=new java.util.Scanner(System.in);

		// ★ usersのサイズ分繰り返す制御構文を記述してください
		//----------- ループ start

		for(int i=0;i<users.length;i++) {
		System.out.println((i+1)+"人目の情報を入力します");		/* ##には、カウントを入れてください */
			System.out.println("ユーザID（数字）、 ユーザ名、メールアドレス、パスワードをカンマ区切りで入力してください");

			// ★ コマンドプロンプトに入力された値を、String型の変数lineに格納してください
			String line=scanner.nextLine();

			// ★ 変数lineに格納されている値を','で区切り、配列にしてください（Stringクラスのメソッドを使用します）
			String[] list=line.split(",",0);

			// ★ 配列にした値を、users[カウント]の各フィールドに代入してください
			// ★ ユーザIDに該当する値が数値でなかった場合は、エラーでプログラムが止まっても良いです
			User us1=new User();
			us1.userId=Integer.parseInt(list[0]);
			us1.userNm=list[1];
			us1.mail=list[2];
			us1.password=list[3];
			User us2=new User();
			us2.userId=Integer.parseInt(list[0]);
			us2.userNm=list[1];
			us2.mail=list[2];
			us2.password=list[3];
			User us3=new User();
			us3.userId=Integer.parseInt(list[0]);
			us3.userNm=list[1];
			us3.mail=list[2];
			us3.password=list[3];

			users[0]=us1;
			users[1]=us2;
			users[2]=us3;

		//----------- ループ end

		// ★ usersに格納されている全てのインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください
			System.out.println(users[i]);
		}
	}
}
