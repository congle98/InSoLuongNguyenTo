import java.util.Scanner;

public class demo {
    static boolean checknguyento(int number){
        boolean check = true;
        if(number <= 2){
            check = false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(number); i++){
                if(number%i==0){
                    check = false;
                }
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập số lượng số nguyên tố cần in ra");
        int amount = scanner.nextInt();
        int count = 0;
        for (int number = 0;count<amount;number++){
            if(checknguyento(number)){
                System.out.println(number);
                count++;
            }
        }
    }
}
