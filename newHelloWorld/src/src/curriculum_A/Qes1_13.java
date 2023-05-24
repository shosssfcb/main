package src.curriculum_A;

public class Qes1_13 {
	public static void main(String[] args) {
        // 下記9個をローカル変数として宣言のみしてください
          byte b; //バイト型
          short s; //ショート型
          int i; //イント型
          long l; //ロング型
          float f; //フロート型
          double d; //ダブル型
          char c; //チャー型
          String str; //ストリング型
          boolean bo; //ボーリーン型

        // それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
          b = 0; //バイト型を初期化
          s = 0; //ショート型を初期化
          i = 0; //イント型を初期化
          l = 0l; //ロング型を初期化
          f = 0.0f; //フロート型を初期化
          d = 0.0d; //ダブル型を初期化
          c = '\u0000'; //チャー型を初期化
          str = null; //ストリング型を初期化
          bo = false; //ボーリーン型を初期化

        // 初期化をしたそれぞれの変数に下記の値を代入してください
          b = 10; //バイト型に10を代入
          s = 100; //ショート型に100を代入
          i = 1000; //イント型に1000を代入
          l = 10000; //ロング型に10000を代入
          f = 9.5f; //フロート型に9.5fを代入
          d = 10.5; //ダブル型に10.5を代入
          c = 'a'; //チャー型にaを代入
          str = "ハロー"; //ストリング型にハローを代入
          bo = true; //ボーリーン型にtrueを代入

        /* 下記の通りにコンソール出力されるようにしてください
           上記で作成した変数を必ず使用すること
           11110
           20
           a ハロー true
           11130         数字を全て足す
           10000000000   小数点以外の数字を全てかける
           0.105         10.5割る100をする
           -90          10引く100をする
        */

          System.out.println(b + s + i + l);
          System.out.println(b + b);
          System.out.println(c + str + bo);
          System.out.println(b + s + i + l + b + b);
          System.out.println(b * s * i * l);
          System.out.println(d / s);
          System.out.println(b - s);


        /* 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
           String num = "20";
           int num1 = 23;
           System.out.println("ハローJAVA" + (num + num1));
           「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
        */
          int num = 20;
          int num1 = 23;
          System.out.println("ハローJAVA" + (num + num1));

        /* 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
           ローカル変数に代入し○○に入れてください
           『山田太郎 18歳 170.5cm 62.2kg 寿司』
           ↓↓format↓↓
           「初めまして○○です」
           「年齢は○○歳です」
           「身長は○○cmです」
           「体重は○○kgです」
           「好きな食べ物は○○です」
        */

          String name = "山田太郎";
          int old = 18;
          double height = 170.5;
          double weight = 62.2;
          String name1 = "寿司";

          System.out.println("初めまして\r\n" + name + "\r\nです");
          System.out.println("年齢は\r\n" + old + "歳\r\nです");
          System.out.println("身長は\r\n" + height + "cm\r\nです");
          System.out.println("体重は\r\n" + weight + "kg\r\nです");
          System.out.println("好きな食べ物は\r\n" + name1 + "\r\nです");


        /* 6で作成した自己紹介に続いてBMIが出力されるようにしてください
		   「BMIは○○です」
		   ただし計算は数値を直書きせず、全て変数を使ってすること
		*/
          String name2 = "BMIは";
          double bmi = weight / ((height / 100) * (height / 100));
          String name3 = "です";
          System.out.println(name2 + bmi + name3);


        /* 6で宣言した変数に再代入し下記の通りコンソールに出力してください
           初めまして鈴木一郎です
           年齢は24歳です
           身長168.5cmです
           体重は64.2kgです
           好きな食べ物はオムライスです
           BMIは22.6です
        */

          name = "鈴木一郎";
          old = 24;
          height = 168.5;
          weight = 64.2;
          name1 = "オムライス";
          bmi = 22.6;

          System.out.println("初めまして\r\n" + name + "\r\nです");
          System.out.println("年齢は\r\n" + old + "歳\r\nです");
          System.out.println("身長は\r\n" + height + "cm\r\nです");
          System.out.println("体重は\r\n" + weight + "kg\r\nです");
          System.out.println("好きな食べ物は\r\n" + name1 + "\r\nです");
          System.out.println("BMIは\r\n" + bmi + "\r\nです");


        /* 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
           初めまして鈴木一郎です
           年齢は48歳です
           身長337.0cmです
           体重は128.4kgです
           好きな食べ物はオムライスです
           BMIは11.31です
        */

          name = "鈴木一郎";
          old += 24;
          height += 168.5;
          weight += 64.2;
          name1 = "オムライス";
          bmi = 11.31;

          System.out.println("初めまして\r\n" + name + "\r\nです");
          System.out.println("年齢は\r\n" + old + "歳\r\nです");
          System.out.println("身長は\r\n" + height + "cm\r\nです");
          System.out.println("体重は\r\n" + weight + "kg\r\nです");
          System.out.println("好きな食べ物は\r\n" + name1 + "\r\nです");
          System.out.println("BMIは\r\n" + bmi + "\r\nです");

        // 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません

          old = 24;
          bo = (old >= 25);

          System.out.println(bo);

        // 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください

          old = 24;
          String strsh = String.valueOf(old);

          height = 168.5;
          String strs = String.valueOf(height);

          weight = 64.2;
          String st = String.valueOf(weight);

          System.out.println(strsh + strs + st);

        // 11で変換した【年齢・身長】を整数型に変換して出力してください

          strsh = "24";
          int number = Integer.parseInt(strsh);
          System.out.println(number);


          strs = "168.5";
          float fl = Float.parseFloat(strs);
          int number1 = Math.round(fl);
          System.out.println(number1);


        // 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
        // ただしif文は使わないでください

          number = 24;
          fl = (float) 168.5;
          boolean result;
          result = (number == 25) || (fl >= 160);
          System.out.println(result);
        }
	}