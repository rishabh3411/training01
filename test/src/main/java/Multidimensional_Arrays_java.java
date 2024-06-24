public class Multidimensional_Arrays_java {
    public static void main(String[] args) {
        int[] marks;
        int[][] flats;  // Declaration of a 2 - D array.
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
          System.out.println(flats[1][2]);
          System.out.println(flats[0][0]);
//        cars = new int[4][][]
        System.out.println("Printing the elements of the 2-D Array in reversed order");
        for (int i = 0; i < flats.length; i++) { // way for execution / printing of a 2 -D array
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}