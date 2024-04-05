package sample;

public class ExceptionExample1 {
    public static void main(String[] args) {
       System.out.println("処理開始");
       
       try {
           //ここに例外が発生するコードを書く
           System.out.println("割り算開始");
           int a = 10/0;
           System.out.println(a);
       }catch(ArithmeticException e) {
           //"ArithmenticExcaptionが発生した場合の処理を書来ます
           System.out.println("ArithmeticExceptionが発生" + e.getMessage());
                                                          //発生した例外によって異なるメッセージを発してくれるのだろうか
       }finally {
           //例外の有無にかかわらず、実行されるコードを書きます
           System.out.println("割り算終了");
       }
       
       System.out.println("処理終了");
       
    }
    
}

       


