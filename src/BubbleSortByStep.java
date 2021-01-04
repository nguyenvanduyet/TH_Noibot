import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập kích thước danh sách:");
        int size = scanner.nextInt();
        int []list = new int[size];
        System.out.println("Enter"+list.length+"values");
        for (int i = 0; i < list.length; i++) {
            list[i]=scanner.nextInt();
        }
        System.out.println("danh sách đầu vào:");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]+"\t");
        }
        System.out.println("sử lý xắp xếp");
        bubbleSortByStep(list);

    }
    public static void bubbleSortByStep(int[]list){
        boolean needNextPass=true;
        for (int k = 1; k <list.length&&needNextPass ; k++) {
            needNextPass =false;
            for (int i = 0; i < list.length-k; i++) {
                if (list[i]>list[i+1]){
                    int temp=list[i];
                    list[i]=list[i+1];
                    list[i+1]=temp;
                    needNextPass=true;
                }

            }
            if (needNextPass==false){
                System.out.println("mảng có thể đã được xắp xếp và không cần chuyển tiếp");
                break;
            }
            System.out.println("liệt kê"+ k+"sort:");
            for (int j =0;j<list.length;j++){
                System.out.print(list[j]+"\t");
            }
            System.out.println();
        }
    }
}
