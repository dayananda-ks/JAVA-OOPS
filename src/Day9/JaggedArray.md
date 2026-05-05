### Jagged Arrays
A jagged array, also known as an array of arrays, is a data structure that allows for the creation of arrays with different lengths. Unlike traditional multi-dimensional arrays, where each row has the same number of columns, jagged arrays can have rows of varying lengths. This flexibility makes jagged arrays useful for situations where the data being stored does not fit into a regular grid.   
#### Example of a Jagged Array in Java:
```java
public class JaggedArrayExample {
    public static void main(String[] args) {
        // Creating a jagged array with 3 rows
        int[][] jaggedArray = new int[3][]; 
