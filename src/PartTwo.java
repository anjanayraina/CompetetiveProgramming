
public class PartTwo{


    /** Finds ALL runs of X consecutive positive integers that sum to a given number for all X in a specified range.
     * The range bounds are inclusive.
     *
     * Examples:
     *     runs(9,2,3) -> [ [4,5], [2,3,4] ]   // two runs found
     *     runs(9,1,1) -> [ [9] ]              // one run found
     *     runs(9,4,8) -> [ ]                  // no runs found!
     *     runs(125,1,8) -> [ [125], [62,63], [23,24,25,26,27]]   // 3 runs!
     *
     * @param number must be a positive integer
     * @param start is lower bound for the range (of consecutive numbers in the sum). It is a positive integer.
     * @param end is the upper bound for the range (of consecutive numbers in the sum). It is a positive
     *        integer that is not smaller than start.
     * @return an array of arrays. Each inner array is a sequence of consecutive positive
     *         integers that sum to the input number. The ordering inside the arrays is that
     *         is the natural ordering (increasing order by value), and the ordering of the inside arrays
     *         is by increasing length.
     */
    public static int[][] runs(int number, int start, int end){
        return null;
    }

    /** finds the locations of all local maximum values in a list of numbers.
     *
     * A (local) maximum value is greater than both values adjacent to it. You can assume
     * The numbers at either end of the list (start or end) are maximal if the single number adjacent
     * to it is smaller.
     *
     * Examples:
     *   int[] data1 = {1,7,1,24,15};
     *   peaks(data1) -> [1,3] since 7 and 24 are local maximal values
     *   int[] data2 = {20,1,-3,2,0,25,1,24,15,25,4,-2,-25};
     *   peaks(data2) -> [0,3,5,7,9]
     *   int[] data3 = {-123455};
     *   peaks(data3) -> [0]
     *
     *  @param data is an array of integers with at least one number in it
     *  @return an array storing the locations (index values) of all local maxima in the input array.
     *          The size of this array will match the number of local maxima.
     */
    public static int[] peaks(int[] data){
        return null;
    }

    /** find a local minimum position in a 2-d grid of numbers using a steepest descent
     * approach finds the location.
     *
     * Starting with the provided startingRow and startingColumn, repeatedly take steps
     * inside the grid in the direction that gives the greatest decrease in value.
     * Consider the four (4) grid locations surrounding the current position (up, down, left, right)
     * and keep going until you can no longer make any progress. Do not take any "diagonal" steps.
     *
     * If there is a tie to move, break the tie as follows: UP before RIGHT before DOWN before LEFT.
     *
     * The method returns the row and column of the local minimum found in an array [row,col]
     *
     * Examples:
     *   int[][] data1 = { {6,4,3,0},
     *                     {3,2,1,3},
     *                     {3,4,2,4},
     *                     {3,3,0,2}}; // four rows and four columns
     *   findMin(data1,0,0) -> [1,2]  (this makes it way to the number 1)
     *   findMin(data1,2,1) -> [1,2]  (this makes it way to the number 1)
     *   findMin(data1,3,2) -> [3,2]  (it does not move at all)
     *
     *   int[][] data2 = { {42} }; // one row and one column
     *   findMin(data2,0,0) -> [0,0] (there is only location so it must be the min!)
     *
     *   int[][] data3 = { {1,2,3,4,5,6,7,8,9,10} };  // one row, ten columns
     *   findMin(data3,0,3) -> [0,0]
     *
     *   int[][] data4 = { {1}, {-2}, {3}, {4}, {5}, {6}, {70}, {800} }; // eight rows, one column
     *   findMin(data4,6,0) -> [1,0] (there is only location so it must be the min!)
     *
     *  @param data is a 2-d array of integers with at least 1 row and 1 column.
     *  @param startingRow is the row to start with
     *  @param startingColumn is the column to start with
     *  @return an array [row,col] of size two that stores the row and column of the
     *          local minimum found (using the rules described above)
     */
    public static int[] findMin(int[][] data, int startingRow, int startingColumn){
        return null;
    }

    /* I might be a program! */
    public static void main(String[] args){
        // use this for testing your methods if you wish...
    }

}