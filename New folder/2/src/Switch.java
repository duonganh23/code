public class Switch{
    public static void main(String[] args){
        int a = 13;
        //int b = 8;
        /*switch (a){
            case 13:
                System.out.println("a is 1");
                break;
            case 2:
                System.out.println("a is 2");
                break;
            case 3:
                System.out.println("a is 3");
                break;
            default:
                System.out.println("default");
        }*/
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
            if (i > 3){
                break;
            } else {
                continue;
            }
        }
    }

    int test() {
        for (int i = 1; i < 5; i++){
            System.out.println(i);
            if (i > 3){
                return 10; 
            }
        }
        return 10;
    }
}