package sample;

public class IFSample {
    public static void main(String[] args) {
        var score = 55;
        
        if (score == 100) {
            System.out.println("満点です");
        }else if(score >= 70){
            System.out.println("よくできました！");
        }else if(score >= 60){
            System.out.println("合格です");
        }else{
            System.out.println("赤点です...");
        }
        
    }

}
