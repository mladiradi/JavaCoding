package JavaCoding;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    int x = Integer.parseInt(scan.nextLine());
    int y = Integer.parseInt(scan.nextLine());
    char oper = scan.nextLine().charAt(0);
    // if(y != 0){...  (този if може да се замени с последващия if- по кратко)
    if (y == 0 && (oper =='/' || oper =='%')){
        System.out.printf("Cannot divide %d by zero",x);
    }else {


    double result = 0.0;

    switch (oper){
        case '+':
            result = x + y;
            break;
        case '-':
            result = x - y;
            break;
        case '*':
            result = x * y;
            break;
        case '/':
            result = (double)x / y;
            break;
        case '%':
            result = x % y;
            break;
        }
// 1 Заменен с тримерен оператор
//        String type= "";
//   if (result % 2 ==0){
//        type = "even";
//    } else {
//        type = "odd";
//    }

// 2 String formatResult =
//    oper =='/' ? String.format("%.2f",result) : String.format("%.0f",result);
// изтриваме целия else-if , във if и else %.0f заменяме с %s, сменяме result с formatResult


if (oper == '+' || oper == '-' || oper =='*'){
    System.out.printf("%d %c %d = %.0f - %s",x,oper,y,result,result % 2 ==0 ? "even" :"odd");
                                                                 // 1 Тук е мястото на type
}else if (oper == '/'){
    System.out.printf("%d %c %d = %.2f",x,oper,y,result);
}else{
    System.out.printf("%d %c %d = %.0f",x,oper,y,result);
}

    }
}}
// 2