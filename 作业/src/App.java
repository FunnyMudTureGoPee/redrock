import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //String operators="(+|-|*|/)";
        String str = null;
        System.out.println("输入【数字】【符号】【数字】来计算结果，例：1+1=2.000");
        if (sc.hasNext("([0-9]+\\.?[0-9]*)?(\\+|\\-|\\*|\\/)?([0-9]+\\.?[0-9]*)?")) {
            str = sc.next("([0-9]+\\.?[0-9]*)?(\\+|\\-|\\*|\\/)?([0-9]+\\.?[0-9]*)?");
        }else{
            throw new Exception("输入不符合规范！");
        }
        if(str.matches("([0-9]+\\.?[0-9]*)?(\\+)?([0-9]+\\.?[0-9]*)?")){
            String[] strArr = str.split("\\+");
            //System.out.println("1");
            double start = Double.parseDouble(strArr[0]);
            double end =Double.parseDouble(strArr[1]);
            double result=start+end;
            System.out.printf("%.3f",result);
        }
        if(str.matches("([0-9]+\\.?[0-9]*)?-?([0-9]+\\.?[0-9]*)?")){
            String[] strArr = str.split("-");
            double start = Double.parseDouble(strArr[0]);
            double end =Double.parseDouble(strArr[1]);
            double result=start-end;
            System.out.printf("%.3f",result);
        }
        if(str.matches("([0-9]+\\.?[0-9]*)?\\*?([0-9]+\\.?[0-9]*)?")){
            String[] strArr = str.split("\\*");
            double start = Double.parseDouble(strArr[0]);
            double end =Double.parseDouble(strArr[1]);
            double result=start*end;
            System.out.printf("%.3f",result);
        }
        if(str.matches("([0-9]+\\.?[0-9]*)?/?([0-9]+\\.?[0-9]*)?")){
            String[] strArr = str.split("/");
            double start = Double.parseDouble(strArr[0]);
            double end =Double.parseDouble(strArr[1]);
            double result=start/end;
            System.out.printf("%.3f",result);
        }
    }
}
