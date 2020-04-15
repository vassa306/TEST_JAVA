public class Matrixes {
    public static void main(String[] args) {
        int[][] matrix = generateMatrix(4, 6);
        //System.out.print(vypisMatici(generateMatrix(3,10)));
        vypisMatici(matrix);


    }

    static int[][] generateMatrix(int m, int n) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = NumbersTest.generateNumber(10);
            }

        }
        return matrix;

    }

    static void vypisMatici(int[][] matrix) {
        // pro
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();


        }

    }

    static int[][] secti(int[][] matrixA, int[][] matrixB) {
        int[][] matrixC = new int[4][4];
        for (int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixC[i].length; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        System.out.println("soucet matic je:");
        vypisMatici(matrixC);
        return matrixC;
    }

    /**
     * Odecte matice A a B.
     * Odcitani matic funguje analogicky jako scitani.
     *
     * @param matrixA
     * @param matrixB
     * @return
     */
    static int[][] odecti(int[][] matrixA, int[][] matrixB) {
        int[][] matrixC = new int[4][4];
        for (int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixC[i].length; j++) {
                matrixC[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        System.out.println("Rozdil matic je:");
        vypisMatici(matrixC);
        return null;
    }


    /**
     * Vynasob matici koustantou.
     * Kazde cislo v matici vynasob konstantou.
     *
     * @param konstanta
     * @param matrixA
     * @return
     */
    static int[][] vynasobKonstantou(int konstanta, int[][] matrixA) {
        int[][] matrixC = new int[4][4];
        for (int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixC[i].length; j++) {
                matrixC[i][j] = matrixA[i][j] * konstanta;
            }
        }
        System.out.println("Nasobeni matic je:");
        vypisMatici(matrixC);
        return null;
    }


    //  ---- MATICE ADVANCED ----

    /**
     * Spocita transpozici ctvrcove matice.
     * Transpozice se pocita tak, ze se prohodi cisla na pozici (i,j) a (j,i).
     *
     * @param matrix
     * @return
     */
    static int[][] transpozice(int[][] matrix) {


        //nejdříve vytvříme matici do které budeme transponovat
        int[][] tmatrix = new int[4][4];
        //v tomto foru se vytvari matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                //prehozeni tedy transpovani radku a sloupcu matice
                tmatrix[i][j] = matrix[j][i];
            }
        }
        System.out.println("Transpozice je");
        vypisMatici(tmatrix);
        return null;
    }

    /**
     * Vynasob dve ctvercove matice. Pokud nevite, jak se nasobi matice, pouzijte Google nebo si to vysvetlime.
     *
     * @param matrixA
     * @param matrixB
     * @return
     */
    static int[][] vynasob(int[][] matrixA, int[][] matrixB) {
        return null;
    }
}















