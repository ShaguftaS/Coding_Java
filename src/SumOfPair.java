public class SumOfPair {
    static boolean check ( int[] A, int size, int x ){
        for( int i =0; i < (size -1); i++ ){
            for( int j = (i+1); j < size; j++){
                if(A[i] + A[j] == x) return true;
            }
        }
        return false ;
    }
    public static void main( String[] args ){
        int[] A = new int[]{0, -1, 2, -3, 1};
        int x = -2;
        int size = A.length;

        if ( check (A, size, x)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
