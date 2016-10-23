/**
 * Created by ScorpionOrange on 2016/10/17.
 */
public class ShuffleArrayTest {
    public static void main(String[] args){
        String[] array = {"A", "B", "C", "D", "E",
                          "F", "G", "H", "I", "J"};
        for(String s : array){
            System.out.print(s + " ");
        }
        System.out.println();

        String temp = "";
        for(int i = 0; i < array.length; i++){
            int j = (int)(Math.random() * array.length);
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        for(String s : array){
            System.out.print(s + " ");
        }
        System.out.println();

        // 使用匿名对象调用洗牌方法；
        new ShuffleArray().Fiseher_Yates_Shuffle(array);

        for(String s : array){
            System.out.print(s + " ");
        }
        System.out.println();

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];
        int[] D = new int[10];
        int[] E = new int[10];
        int[] F = new int[10];
        int[] G = new int[10];
        int[] H = new int[10];
        int[] I = new int[10];
        int[] J = new int[10];

        int times = 100000;
        
        for(int i = 1; i <= times; i++){
            new ShuffleArray().Fiseher_Yates_Shuffle(array);
            for(int j = 0; j < array.length; j++){
                if (array[j].equals("A")){ A[j]++; }
                if (array[j].equals("B")){ B[j]++; }
                if (array[j].equals("C")){ C[j]++; }
                if (array[j].equals("D")){ D[j]++; }
                if (array[j].equals("E")){ E[j]++; }
                if (array[j].equals("F")){ F[j]++; }
                if (array[j].equals("G")){ G[j]++; }
                if (array[j].equals("H")){ H[j]++; }
                if (array[j].equals("I")){ I[j]++; }
                if (array[j].equals("J")){ J[j]++; }
            }
        }

        System.out.println("   1 2 3 4 5 6 7 8 9 10");
        System.out.print("A: ");for(int i : A){System.out.print(i + " ");}System.out.println();
        System.out.print("B: ");for(int i : B){System.out.print(i + " ");}System.out.println();
        System.out.print("C: ");for(int i : C){System.out.print(i + " ");}System.out.println();
        System.out.print("D: ");for(int i : D){System.out.print(i + " ");}System.out.println();
        System.out.print("E: ");for(int i : E){System.out.print(i + " ");}System.out.println();
        System.out.print("F: ");for(int i : F){System.out.print(i + " ");}System.out.println();
        System.out.print("G: ");for(int i : G){System.out.print(i + " ");}System.out.println();
        System.out.print("H: ");for(int i : H){System.out.print(i + " ");}System.out.println();
        System.out.print("I: ");for(int i : I){System.out.print(i + " ");}System.out.println();
        System.out.print("J: ");for(int i : J){System.out.print(i + " ");}System.out.println();
    }
}
