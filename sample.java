

// import java.util.Scanner;

// public class ToDoList{
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }


// HelloWorld.java
// public class HelloWorld{
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }
//


import java.util.ArrayList;
import java.util.Scanner;

public class sample {
    private ArrayList<String> tasks = new ArrayList<>();

    // 可変長のメンバー変数を作る　tasks

    public void addItem(String task) {
        tasks.add(task);

    //　変数に対してタスク（文字列）を追加するメソッドを用意する
    }

    public void removeItem(int index) {
        if (index >= 0 && index < tasks.size()) {
    //　もしも引数が0（タスクの番号）以上かつ、入力された数よりも変数のリスト数の方が大きい場合
            tasks.remove(index);
    // 可変長のメンバー変数であるtasksから入力された番号のタスクを削除する
        } else {
    //　異なる場合、保存されたリストの範囲外として警告メッセージを表示させる
            System.out.println("無効な選択です。");
        }
    }

    public void displayItems() {
        System.out.println("ToDoリスト:");
// コンソールにToDoリストを表示させる
        for (int i = 0; i < tasks.size(); i++) {
//　繰り返し処理でtasksに保存されたリスト分の情報を表示させる
            System.out.println(i + 1 + ". " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        sample todoList = new sample();
    //　インスタンス化することで　ToDoListクラスのメソッドを使用することができる
        Scanner scanner = new Scanner(System.in);
    //　インスタンス化することで　Scannerクラスのメソッドを使用することができる
    // Scannerクラスはユーザーからのテキスト入力を実施するクラスです

        while (true) { //trueを引数に与えると無限ループになります
            System.out.println("操作を選択してください:");
            System.out.println("1. タスクを追加");
            System.out.println("2. タスクを削除");
            System.out.println("3. タスクを表示");
            System.out.println("4. 終了");

            int choice = scanner.nextInt(); //コンソールで整数値の入力処理を実行します
            scanner.nextLine(); // 改行を消費

            switch (choice) {
                case 1:
                    System.out.print("新しいタスクを入力してください: ");
                    String task = scanner.nextLine();
                    //　コンソールの次の行に入力されたテキストを取得します
                    todoList.addItem(task);
                    // ToDoListクラスのaddItemメソッドを実施します
                    //　コンソールで入力したテキストがaddItemの引数になり
                    // tasksのリストに追加されます
                    break;
                    // switch処理を抜けます
                case 2:
                    System.out.print("削除するタスクのインデックスを入力してください: ");
                    int index = scanner.nextInt();
                    // 次の行に入力された整数値を変数に代入します
                    // 整数値以外の情報を入力した場合はアプリが終了（停止）します
                    scanner.nextLine(); // 改行を消費（誤操作防止のため）
                    todoList.removeItem(index - 1);
                    // 配列と同じくリストの番号は　0から数えるため
                    // -1した番号のタスクを削除します
                    break;
                case 3:
                    todoList.displayItems();
                    // ToDoListクラスのdisplayItemsメソッドを実行します
                    // コンソールにToDoリストを繰り返し処理で表示します
                    break;
                case 4:
                    System.out.println("アプリケーションを終了します。");
                    scanner.close();
                    // 入力処理の終了を自死して、リソースの確保や誤操作を防ぎます
                    System.exit(0);
                    //アプリを終了します
                    break;
                default:
                    System.out.println("無効な選択です。もう一度試してください。");
                    //1~4以外の数値を入力した場合の警告メッセージ
            }
        }
    }
}


