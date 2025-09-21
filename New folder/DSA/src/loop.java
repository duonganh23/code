public class loop {
    public static void main(String[] args) {
        int i = 10;
        do{
            System.out.println(i--);
        } while (i > 0);

            /*while (i > 0){
                System.out.println(i--);
            }
        }*/

        System.out.println("+++++++");
        for (i = 0; i < 10;){
            System.out.println(i);
            i++;
        }
        //for-each
        System.out.println("-----------");
        int[] array = {1,2,3,4,5};
        for (int j : array){
            System.out.println(j);
        }
    }
}
