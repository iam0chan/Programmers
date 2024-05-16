import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputData = sc.nextLine();
        String answer = "";
        for(int i=0; i<inputData.length();i++){
            if(inputData.charAt(i)>='A' && inputData.charAt(i)<='Z'){
                answer += String.valueOf(inputData.charAt(i)).toLowerCase();
            }else{
                answer += String.valueOf(inputData.charAt(i)).toUpperCase();
            }
        }
        System.out.println(answer);
    }
}