package day4;


public class ArrayAdjacentProduct {

//    int main(int argc)
//    public int largestProduct(int[][] aa) {
//        for (int row = 0; row < aa.length; row++) {
//            for (int col = 0; col < aa.length; col++) {
//                helper(aa, row, col);
//            }
//        }
//    }

    public int helper(int[][] aa, int row, int col){

        int sum = 0;

        for(int rr = 0; rr < aa.length; rr ++) {

            for( int cc = 0; cc < aa.length; cc++){

                if ( (rr + row) < 0 || (rr >= row)){
                    continue;
                } if ( (cc + col) < 0 || (cc >= col)) {
                    continue;
                }
                sum += aa[rr + row][cc + col];
            }
        }
        return sum;
    }

}
