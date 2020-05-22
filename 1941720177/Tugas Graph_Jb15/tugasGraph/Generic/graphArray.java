/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasGraph.Generic;

/**
 *
 * @author rasyed
 */
public class graphArray {

    private final int vertices;
    private String[][] twoD_array;
    private int[][] edges;

    public graphArray(int v) {
        vertices = v;
        twoD_array = new String[vertices + 1][vertices + 1];
        edges = new int[v + 1][v + 1];
    }

    public void makeVertices(int to, int from, String vertices) {
        twoD_array[to][from] = vertices;
    }

    public void makeEdge(int to, int from, int edge) {
        try {
            edges[to][from] = edge;
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("vertex tidak ada");
        }
    }

    public int getEdge(int to, int from) {
        try {
            return edges[to][from];
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("vertex tidak ada");
        }
        return -1;
    }

    public String getVertices(int to, int from) {
        try {
            return twoD_array[to][from];
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("vertex tidak ada");
        }
        return "";
    }
}
