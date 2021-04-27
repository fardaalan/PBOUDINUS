package UTS;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Character> firstStack =  new Stack<Character>();
        Stack<Character> secStack =  new Stack<Character>();
        boolean cekValidasi = true;
        boolean isInRight = false;
        boolean cekOperator = false;
        boolean cekValidasiKarakter = false;
        boolean cekValidasiOperator = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan data = ");
        String dataInput = scanner.nextLine();
        char[] dataCharArray = dataInput.toCharArray();

        for (int i = 0; i < dataCharArray.length; i++) {
            char dataChar = dataCharArray[i];
            if(dataChar == ' '){
                continue;
            }
            if(dataChar != '1' && dataChar != '+' && dataChar != '=') {
                cekValidasiKarakter = true;
                break;
            }
            if(dataChar == '=' ) {
                if(cekOperator) {
                    cekValidasiOperator = true;
                    break;
                }
                isInRight = true;
                continue;
            }
            if(dataChar == '+') {
                continue;
            }
            if(!isInRight) {
                firstStack.add(dataChar);
            }
            if(isInRight) {
                secStack.add(dataChar);
                if(firstStack.size() == 0) {
                    cekValidasi = false;
                } else if(firstStack.size() > 1 && i == (dataCharArray.length - 1)) {
                    cekValidasi = false;
                } else {
                    firstStack.pop();
                }
            }
        }
        if(cekValidasiKarakter) {
            System.out.println("Data Tidak valid : Karakter yang diperbolehkan hanya 1, +, dan =");
        }
        else if (cekValidasiOperator) {
            System.out.println("Data Tidak valid : Hanya satu operator sama dengan yang diperbolehkan");
        }
        else if(cekValidasi) {
            System.out.println("Data Valid");
        } else {
            System.out.println("Data Tidak Valid");
        }
    }
}
