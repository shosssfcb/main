package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        // 下記9個をローカル変数として宣言のみしてください
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		char c;
		String str;
		boolean bo;

        //それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		 b = 0;
		 s = 0;
	     i = 0;
		 l = 0l;
		 f = 0.0f;
		 d = 0.0d;
		 c = '$';
		 str = "";
		 bo = false;

        //初期化をしたそれぞれの変数に下記の値を代入してください
		 b = 10;
		 s = 100;
	     i = 1000;
		 l = 10000;
		 f = 9.5f;
		 d = 10.5;
		 c = 'a';
		 str = "ハロー";
		 bo = true;

		 /*
		  * 下記の通りにコンソール出力されるようにしてください
		  * 上記で作成した変数を必ず使用すること
		  * 11110
		  * 20
		  * a ハロー true
		  * 11130         数字を全て足す
		  * 10000000000   小数点以外の数字を全てかける
		  * 0.105         10.5割る100をする
		  * -90           10引く100をする
                                          */

		 System.out.println(b+s+i+l);
		 System.out.println(b+b);
		 System.out.println(c+str+bo);
		 System.out.println(b+s+i+l+b+b);
		 System.out.println(b*s*i*l);
		 System.out.println(d/s);
		 System.out.println(b-s);

         }
         }

