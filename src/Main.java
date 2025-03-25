import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //تعداد مقسوم علیه هایی که میخوایم
        int count = scn.nextInt();

        //گرفتم مقسوم علیه ها از کاربر
        int[] divisors = new int[count];
        for ( int i = 0; i <= count-1; i++){
            System.out.println("Enter the divisor:");
            divisors[i] = scn.nextInt();
        }

        for(int j = 1; j <= 100; j++){
            var output = "";
            for (int divisor : divisors){
                if(j % divisor == 0){
                    if(divisor == 3){
                        output += "Fizz";
                    }
                    else if (divisor == 5){
                        output += "Buzz";
                    }
                }
            }
            if(output.isEmpty()){
                System.out.println(j);
            }
            else {
                System.out.println(output);
            }
        }
    }
}