/*Aidan Border
* Module 4 Assignment 4
* Implementing a depth-first search algorithm */

/*ALGORITHM:
* DFS(G)
* Implements a depth-first search traversal of a given graph
* Input: Graph G = {V, E}
* Output: Graph G with its vertices marked with consecutive integers
* In the order they've been first encountered by the DFS traversal mark each vertex in V with 0 as a mark of being
* "unvisited"
* count <- 0
* for each vertex in V do
*   if v is marked with 0
*       dfs(v)
* print the order in which vertices are visited.
*
* dfs(v)
* Visits recursively all the unvisited vertices connected to vertex v by a path and numbers them in the order they
* are encountered.
* via global variable count
* count <- count + 1; mark v with count
*
* for each vertex w in V adjacent to v do
*   if w is marked with 0
*       dfs(w)*/

public class Main {
    static int count = 0;

    /*main()
    * Params: String[] args
    * Returns N/A (main does not return)
    * Description: Method to support running/testing of program code
    * Special: main() is called by java at runtime and only exits on program exit*/
    public static void main(String[] args) {

        char[] vertArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        String[] edgeArray = {"ab", "ac", "ad", "bc", "bd", "cd", "de", "eh", "ef", "hg", "hf", "fg"};
        byte[][] graf = generateGraph(vertArray, edgeArray);

        for (int i = 0; i < graf.length; i++) {
            
        }

    }

    /*dfs()
    * Parameters: Graph g
    * Returns: N/A (void) for now
    * Description: Recursively visits all unvisited vertices connected to a vertex v by a valid path and numbers them
    *  in the order they're encountered
    * Special: Method is recursive*/
    public static void dfs(byte[][] graf, char[] vertArray, String[] edgeArray) {
        count += 1;
        for (String edge : edgeArray) {

        }

    }

    /*generateGraph()
     * Parameters: char[] vertices, String[] edges
     * Returns: btye[][]
     * Description: Generate us a graph*/
    public static byte[][] generateGraph(char[] vertices, String[] edges){
        byte[][] graph = new byte[vertices.length][vertices.length];
        for(String edge : edges){
            int sourceIndex = Character.getNumericValue(edge.charAt(0)) - 10;
            int destIndex = Character.getNumericValue(edge.charAt(1)) - 10;
            graph[sourceIndex][destIndex] = 1;
            graph[destIndex][sourceIndex] = 1;
        }
        return graph;
    }


}
