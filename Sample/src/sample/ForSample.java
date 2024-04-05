package sample;

public class ForSample {
    
//    public static void main(String[] args) {
//        for(var i =1; i<= 10; i++) {
//            System.out.println(i);
//        }
        
//    public static void main(String[] args) {
//        for(int i =2; i <= 20; i+=2) {
//            System.out.println(i);
//        }
    
//    public static void main(String[] args) {
//        for(int i =1; i <=20; i++) {
//            if(i%2 == 0) {
//                System.out.println(i);
//            }
//        }
    
//    public static void main(String[] args) {
//        for(int i=2;i <= 10; i++) {
//            System.out.println(i*2);
//        }

//    public static void main(String[] args) {
//        for(int i= 1; i <= 20; i++) {
//            if(i%2 != 0) {
//                //現在の処理をスキップして、次の繰り返しに進む
//                continue;
//            }
//            System.out.println(i);
//        }
//    }
    
//    public static void main(String[] args) {
//        for(int i=2; i <= 100; i+=2) {
//            if(i>20) {
//                //繰り返しから抜け出す
//                break;
//            }
//            System.out.println(i);
//        }
//    }
    
    public static void main(String[] args) {
        var numbers = new int[] {1,2,3,4,5};
        
        for(var number : numbers) {
            System.out.println(number);
        }
    }

}
