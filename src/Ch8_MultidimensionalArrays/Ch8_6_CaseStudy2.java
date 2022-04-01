package Ch8_MultidimensionalArrays;

import java.util.Arrays;

public class Ch8_6_CaseStudy2 {
    public static void main(String[] args) {
        // Finding the Closest Pair
        System.out.println("Finding the Closest Pair");
        /*
        x   y
        –1  3
        –1  –1
        1   1
        2   0.5
        2   –1
        3   3
        4   2
        4   –0.5
         */
        double[][] points = getPoints();
        double[][] closestPair = findClosestPair(points);
        printResult(closestPair);
    }

    private static void printResult(double[][] closestPair) {
        for (double[] row : closestPair) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static double[][] findClosestPair(double[][] points) {
        double min = Double.MAX_VALUE;
        double dist;
        double[] point1 = new double[2];
        double[] point2 = new double[2];
        for (int currPoint = 0; currPoint < points.length-1; currPoint++) {
            for (int nextPoint = currPoint+1; nextPoint < points.length-1; nextPoint++) {
                dist = getDistance(points[currPoint], points[nextPoint]);
                if (dist < min) {
                    min = dist;
                    point1 = points[currPoint];
                    point2 = points[nextPoint];
                }
            }
        }

        return new double[][]{
                point1, point2
        };
    }

    private static double getDistance(double[] point1, double[] point2) {
        double xDiff = point1[0] - point2[0];
        double yDiff = point1[1] - point2[1];
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    private static double[][] getPoints() {
        return new double[][]{
                {-1, 3},
                {-1, -1},
                {1, 1},
                {2, 0.5},
                {2, -1},
                {3, 3},
                {4, 2},
                {4, 0.5},
        };
    }
}
