public class Matrizes {
    public static void main(String[] args) {
        int matriza [] [] = {{1,2}, {4,5}};
        int matrizb [] [] = {{7,8}, {10,11}};

        int matrizsoma [] [] = new int[2] [2];
        int matrizmulti [] [] = new int[2] [2];

        //soma
        for (int i = 0; i < matriza.length; i++) {
            for (int j = 0; j < matriza.length; j++) {
        }
    }
        //multi
        for (int i = 0; i < matrizb.length; i++) {
            for (int j = 0; j < matrizb.length; j++) {
            }
        }
        //imprimir soma
        for (int i = 0; i < matrizsoma.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < matrizsoma.length; j++) {
                matrizsoma [i] [j] = matrizsoma[i] [j] + ("\t");
            }
        }
        //imprimir multiplicação
        for (int i = 0; i < matrizmulti.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < matrizmulti.length; j++) {
                matrizmulti [i] [j] = matrizmulti[i] [j] + ("\t");
            }
        }
}
