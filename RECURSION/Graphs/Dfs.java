package Graphs;

import java.util.*;

public class Dfs {

    public static void dftraversal(int adjMatrix[][], int currentVertex, boolean visited[]) {
        visited[currentVertex] = true;
        System.out.print(currentVertex + " ");

        for (int i = 0; i < adjMatrix.length; i++) {
            if (adjMatrix[currentVertex][i] == 1 && visited[i] == false) {
                // i is neighbor of currentVertex
                dftraversal(adjMatrix, i, visited);
            }
        }
    }

    public static void dftraversal(int adjMatrix[][]) {
        boolean visited[] = new boolean[adjMatrix.length];

        for (int i = 0; i < adjMatrix.length; i++) {
            if (!visited[i]) {
                dftraversal(adjMatrix, i, visited);
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int e = s.nextInt();

        int adjMatrix[][] = new int[n][n];

        for (int i = 0; i < e; i++) {
            int v1 = s.nextInt();
            int v2 = s.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }
        dftraversal(adjMatrix);

    }
}
