public class ArrayBidimensional {
    public static void main(String[] args) {

        int[][] array = {
                { 3, 4, 5, 76, 56 },
                { 67, 5, 7, 5, 34 },
                { 4, 7, 8, 4, 2, 8 }
        };




        for (int[] is : array) {
                System.out.println();
                
                for (int is2 : is) {
                    System.out.println(is2);
                    
                }
        }   
    }
}
