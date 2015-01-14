import java.util.HashMap;

public class GraphUnitTest {
	public static void main (String [] args) {
		// needs to be constructed this way to avoid problems with 
		// unchecked types
//		UndirectedGraph<Integer,Boolean,Integer> G = new UndirectedGraph<Integer,Boolean,Integer>();
//
//		// add some nodes
//		for (int i=1; i<8; i++) {
//			G.addNode(i,true);
//		}
//
//
//		// connect them up (someloops topology)
//		G.addEdge(1,2,100);
//		G.addEdge(1,6,100);
//		G.addEdge(2,5,100);
//		G.addEdge(2,3,100);
//		G.addEdge(3,6,100);
//		G.addEdge(3,4,100);
//		G.addEdge(4,5,100);
//		// bogus edges
//		G.addEdge(5,7,100);
//		G.addEdge(6,7,100);
//		
//		// should get rid of edges
//		G.removeNode(7);
//
//		// seems to pass the tests so far...
//		System.out.format("Nodes: %s%n", G.getNodes().toString());
//		System.out.format("Number of Nodes is: %d%n", G.getNumNodes());
//		System.out.format("Number of Edges is: %d%n", G.getNumEdges());		
//		System.out.println("Hello World");
//
//		// run Dijkstra's Algorithm
//		SinglePaths<Integer> paths = Dijkstra.getSingleShortestPaths(G);	
//		paths.printPaths();
//		System.out.println("Done");
//		
//		// try a star network
//		UndirectedGraph<Integer,Boolean,Integer> G2 = new UndirectedGraph<Integer,Boolean,Integer>();
//
//		// add some nodes
//		for (int i=1; i<6; i++) {
//			G2.addNode(i,true);
//		}
//		for (int i=1; i<6; i++) {
//			for (int j=1; j<6; j++) {
//				G2.addEdge(i, j, 100);
//			}
//		}
//
//		// seems to pass the tests so far...
//		System.out.format("Nodes: %s%n", G.getNodes().toString());
//		System.out.format("Number of Nodes is: %d%n", G.getNumNodes());
//		System.out.format("Number of Edges is: %d%n", G.getNumEdges());		
//		System.out.println("Hello World");
//
//		// run Dijkstra's Algorithm
//		SinglePaths<Integer> paths2 = Dijkstra.getSingleShortestPaths(G2);	
//		paths2.printPaths();
//		System.out.println("Done");
//		
//		// test!
		UndirectedGraph<Integer,Boolean,Integer> G3 = new UndirectedGraph<Integer,Boolean,Integer>();
		for (int i=1; i<4; i++) {
			G3.addNode(i,true);
		}
		G3.addEdge(1, 2, 100);
		G3.addEdge(2, 1, 100);

		// run Dijkstra's Algorithm
		G3.printGraph();
		SinglePaths<Integer> paths3 = Dijkstra.getSingleShortestPaths(G3);	
		paths3.printPaths();
		System.out.println("Done");
		
	}
}
