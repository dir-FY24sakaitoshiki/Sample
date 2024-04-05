package sample;

public class MwthodSample {
    public static void main(String[] args) {
        var number1 = 100;
        var number2 = 10;
        
        sumMethod(number1,number2);
        
        var result = sumMethod2(number1,number2);
        System.out.println("sumMethodの結果は" + result);
    }
    
    public static void sumMethod(int num1,int num2) {
        var result = num1 + num2;
        System.out.println("sumMethod1の結果は"+result);
//        戻り値を返しているのではく、結果の出力までをメソッドの中で完結させている。
    }
    
    public static int sumMethod2(int num1, int num2) {
                  //⇒(この位置は戻り値の値の種類を記述する。）//
        var result = num1 + num2;
        return result;

}
}

