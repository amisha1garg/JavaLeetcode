package array;

import java.util.*;

public class TraxnTest {

    public static void main(String[] args) throws Exception {
        StringBuilder inputData = new StringBuilder();
//        String thisLine = null;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        while ((thisLine = br.readLine()) != null) {
//            inputData.append(thisLine + "\n");
//        }
        // Output the solution to the console
        inputData.append("6  1 2  1 4  1  3  1  2  2 -1  2 -1");
        System.out.println(codeHere(inputData));
    }

    public static String codeHere(StringBuilder inputData) {
        // Use this function to write your solution;
        char[] charArray = inputData.toString().toCharArray();
        int Q = Integer.parseInt(String.valueOf(charArray[0]));
//        List<List<Integer>> queries = new ArrayList<>();

        int numRows = charArray.length / 2;

        // Initialize the 2D integer array
        int[][] queries = new int[numRows][2];

        // Fill the 2D integer array
        int index = 1;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < 2; j++) {
                queries[i][j] = charArray[index++] - '0'; // Convert char to integer
            }
        }

        List<Integer> removedElements = new ArrayList<>();
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));

        for (int[] query : queries) {
            int X = query[0];
            int N = query[1];

            if (X == 7) {
                frequencyMap.put(N, frequencyMap.getOrDefault(N, 0) + 1);
                maxHeap.offer(N);
            } else if (X == 2) {
                if (!maxHeap.isEmpty()) {
                    int numToRemove = maxHeap.poll();
                    removedElements.add(numToRemove);
                    frequencyMap.put(numToRemove, frequencyMap.get(numToRemove) - 1);
                    if (frequencyMap.get(numToRemove) == 0) {
                        frequencyMap.remove(numToRemove);
                    }
                } else {
                    removedElements.add(-1);
                }
            }
        }


        // Print the 2D integer array
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(queries[i][j] + " ");
            }
            System.out.println();
        }
        return removedElements.toString();
//        return inputData.toString();
    }

}
