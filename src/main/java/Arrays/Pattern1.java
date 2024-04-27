package Arrays;

public class Pattern1 {

    public static  void func1(){
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                System.out.print("* * *");
            } else {
                System.out.print("*    *");
            }
            System.out.println();
        }
    }

    public static void func2(){
        for(int i=0; i < 5; i++){
            if(i == 4){
                for(int j = 0; j<5; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println("*");
        }
    }

    public static void func3() {
        int k = 4;
        for (int i = 0; i < 5; i++) {
            if (i == 0 || i == 4) {
                for (int j = 0; j < 5; j++) {
                    System.out.print("*");
                }
            }
            else{
                for(int j=0; j<5; j++){
                    if((i+j)==4){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {

        System.out.println();
        func1();
        System.out.println();
        func2();
        System.out.println();
        func3();




    }
}
