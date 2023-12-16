package operator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello"); //리터럴 비교
        boolean resutl2 = str1.equals("문자열1");//문자열 변수, 리터럴 비교
        boolean reuslt3 = str1.equals(str2); //문자열 변수 비교

        System.out.println("result1 = " + result1);
        System.out.println("resutl2 = " + resutl2);
        System.out.println("reuslt3 = " + reuslt3);


    }
}
