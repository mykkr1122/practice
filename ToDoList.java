import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    
    public static void main(String[] args) {

        // boolean flag = true;
        List<String> list = new ArrayList<>();

        // while (flag) {
          for (int i = 0; i == 0;) {
            
            System.out.println("1.タスクの追加");
            System.out.println("2.タスクの削除");
            System.out.println("3.タスクの表示");
            System.out.println("4.アプリの終了");

            Scanner scanner = new Scanner(System.in);
            System.out.println("実行したい処理を入力してください > ");
            int choice = scanner.nextInt();
            scanner.nextLine();
        
            if (choice == 1) {
            System.out.println("タスクを追加してください:");

            String task = scanner.nextLine();
        
            list.add(task);
            // System.out.println(list);

            }else if (choice == 2) {
            System.out.println("削除したいタスクを入力してください:");
            String deleteTask = scanner.nextLine();
            
            list.remove(deleteTask);
            System.out.println("削除しました");
            
            }else if (choice == 3) {
            // リストを表示する
            System.out.println("ToDoリスト");
            // System.out.println(i + 1 + ". " + list.get(i));

            System.out.println(list);
            
            }else if (choice == 4) {
            System.out.println("アプリを終了しました。");
            // flag = false;
            // i = 1;
            i++;

            }else if ((choice == 0) || (choice >= 5)) {
            System.out.println("無効なインデックスです");
            }

        }

    }
   
    // public static int menu() {
    //     System.out.println("1.タスクの追加");
    //     System.out.println("2.タスクの削除");
    //     System.out.println("3.タスクの表示");
    //     System.out.println("4.アプリの終了");

    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("実行したい処理を入力してください > ");
    //     int choice = scanner.nextInt();
        
    //     return choice;
    // }
    
    // public static void cases(int x) {
    //     System.out.println(x);
    //     Scanner scanner = new Scanner(System.in);
    //     String[] task;

    //    if (x == 1) {
    //     System.out.println("タスクを追加してください:");
    //     scanner.nextLine();


    //    }else if (x == 2) {
    //     System.out.println("削除したいタスクを入力してください:");
    //     scanner.nextInt();
        
    //    }else if (x == 3) {
    //     System.out.println("削除したいタスクを入力してください");
        
    //    }else if (x == 4) {
    //     System.out.println("削除したいタスクを入力してください");
        
    //    }else if ((x == 0) || (x <= 5)) {
    //     System.out.println("無効なインデックスです");
    //    }
    // }
}
