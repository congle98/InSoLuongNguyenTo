import java.util.Scanner;

public class demo {
    static boolean checknguyento(int number){
        boolean check = true;
        if(number <= 1){
            check = false;
        }
        else if (number<=3){
            check = true;
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
        int count = 1;
        for (int number = 0;count<=amount;number++){
            if(checknguyento(number)){
                System.out.println("số nguyên tố thứ "+count+" là: " +number);
                count++;
            }
        }
    }
}
