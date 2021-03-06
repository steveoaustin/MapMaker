package model;

import java.util.ArrayList;
import java.util.List;

/*
 * Abstraction function: DijkPath is represented as a list of edges which leads to 
 * the dest node and the cost to travel that path
 * 
 * Representation invariant: dest is the last node in path. path is a unique list of edges 
 * which leads to dest from some node. cost represents the sum of all edge labels in path
 */
public class DijkPath implements Comparable<DijkPath> {
	
	private final Double cost;
	private final Node<Location> dest;
	private final List<Edge<Location>> path;
	
	/**
	 * Instantiates a new DijkPath 
	 * @effects this Sets cost, dest, and path
	 * @param cost Cost of traversing path
	 * @param dest The node path leads to
	 * @param path A list of edges leading to dest
	 * @requires cost, node, and path are not null. dest represents the last node in  path
	 * and cost represents the sum of edge labels in path
	 */
	public DijkPath (Double cost, Node<Location> dest, List<Edge<Location>> path) {
		this.path = path;
		this.cost = cost;
		this.dest = dest;
	}
	
	/**
	 * Instantiates a new DijkPath representing the start of a path
	 * @effects this Sets dest to dest, cost to 0.0, and path to a new list
	 * @param dest The node to be stored
	 * @requires dest is not null
	 */
	public DijkPath (Node<Location> dest) {
		this(0.0, dest, new ArrayList<Edge<Location>>());
	}

	/**
	 * Compares the cost of other to the cost of this
	 * @param other The DijkPath to be compared
	 * @return an int representation of the comparison. 
	 */
	public int compareTo(DijkPath other) {
		return (int) (100000 * (this.cost - other.cost)); //lower values are "larger"
	}
	
	/**
	 * Returns the dest node
	 * @return dest The last node represented in path
	 */
	public Node<Location> getDest() {
		return dest;
	}
	
	/**
	 * Returns the path of edges
	 * @return path A list of edges leading to dest
	 */
	public List<Edge<Location>> getPath() {
		return path;
	}
	
	/**
	 * Returns the cost
	 * @return cost The cost of traveling path
	 */
	public Double getCost() {
		return cost;
	}
}



















