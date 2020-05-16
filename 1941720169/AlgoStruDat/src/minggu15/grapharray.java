/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu15;

/**
 *
 * @author ANGGA
 */
public class grapharray {

    private final int vertices;
    private int[][] twoD_array;

    public grapharray(int v) {
        vertices = v;
        twoD_array = new int[vertices+1][vertices+1];
    }
    public void makeEdge(int to, int from, int edge){
        try{
            twoD_array[to][from] = edge;
        }catch (ArrayIndexOutOfBoundsException index){
            System.out.println("Vertex tidak ada");
        }
    }
    public int getEdge(int to, int from){
        try{
            return twoD_array[to][from];
        }catch (ArrayIndexOutOfBoundsException index){
            System.out.println("Vertex tidak ada");
        }
        return -1;
    }
}
