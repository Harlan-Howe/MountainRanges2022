import java.util.InputMismatchException;
import java.util.Scanner;

public class MountainRange
{
    // private variable declarations --------------------------------------------
    private Scanner keyboardReader;

    private int mountainAPosition, mountainAHeight;
    private int mountainBPosition, mountainBHeight;
    private int mountainCPosition, mountainCHeight;

    // The command "final" means these variables are constants for our program. They cannot be changed within the program.
    // (You, the programmer, could change them, of course!) Final constants are traditionally in ALL_CAPS.
    private final int MAX_HEIGHT = 10; // the height of our picture/graph
    private final int MAX_WIDTH = 20; // the width of our picture/graph
    // --------------------------------------------------------------------------
    // public methods -----------------------------------------------------------
    /**
     * Constructor. This automatically gets called when the runner creates an instance of this class.
     */
    public MountainRange()
    {
        System.out.println("Creating Mountain Range.");
    }

    /**
     * Prompts the user for a number and asks for it from the keyboard. If the number is within (min, max), inclusive,
     * returns that number, otherwise it will keep asking until it gets a valid response.
     * @param min
     * @param max
     * @param prompt
     * @return
     */
    public int getIntInRange(int min, int max, String prompt)
    {
        while (true)
        {
            System.out.print(prompt+" ");
            try
            {
                int result = keyboardReader.nextInt();
                if (result < min || result > max)
                {
                    System.out.println("The value you entered was out of range. Pick a number within "+min+" and "+max+", inclusive.");
                }
                else
                    return result;
            }
            catch (InputMismatchException imExp)
            {
                System.out.println("You need to answer with an integer value. Please try again.");
                keyboardReader.nextLine(); // clear the buffer.

            }
        }
    }


    /**
     * determines the height of a _part_ of a mountain, specifically the part at horizontal location x.
     * For example, here is a mountain with peak height 7 and peak position 8, and we would like to find out how
     * high the mountain is at x = 5:
     * 10|
     * 9 |
     * 8 |
     * 7 |       *
     * 6 |      * *
     * 5 |     *   *
     * 4 +----*     *
     * 3 |   *|      *
     * 2 |  * |       *
     * 1 | *  |        *
     * 0 +––––+–––––––––––––––
     *             11111111112
     *   012345678901234567890
     *
     *   So at x = 5, the height of the mountain is 4.
     *
     *   For the same mountain, if we want the height at x = 9:
     * 10|
     * 9 |
     * 8 |
     * 7 |       *
     * 6 +------*-*
     * 5 |     *  |*
     * 4 |    *   | *
     * 3 |   *    |  *
     * 2 |  *     |   *
     * 1 | *      |    *
     * 0 +––––––––+–––––––––––
     *             11111111112
     *   012345678901234567890
     *
     *   So at x = 9, the height of the mountain is 6.
     *
     *   I hope you can see that at x = 14, the height is 1.
     *                           at x = 1,  the height is 0.
     *                           at x = 19, the height is -4.
     *                           at x = 8,  the height is 7.
     * @param peakPosition - the horizontal position of the peak of the mountain
     * @param peakHeight - the vertical position of the peak of the mountain
     * @param x - the horizontal position of the point we are looking for
     * @return - the vertical position of the point we are looking for... the height of this mountain at position x.
     */
    public int heightOfMountainAtX(int peakPosition, int peakHeight, int x)
    {
        //TODO: (Optional/Recommended) You write this!


        return -1; // replace this value. I just put it here so program will compile.
    }


    public void run()
    {

        keyboardReader = new Scanner(System.in);
        mountainAPosition = getIntInRange(0-MAX_HEIGHT,MAX_WIDTH+MAX_HEIGHT,"What is the horizontal location of Mountain A's peak?");
        mountainAHeight = getIntInRange(1,MAX_HEIGHT, "What is the height of Mountain A's peak?");

        mountainBPosition = getIntInRange(0-MAX_HEIGHT,MAX_WIDTH+MAX_HEIGHT,"What is the horizontal location of Mountain B's peak?");
        mountainBHeight = getIntInRange(1,MAX_HEIGHT, "What is the height of Mountain B's peak?");

        mountainCPosition = getIntInRange(0-MAX_HEIGHT,MAX_WIDTH+MAX_HEIGHT,"What is the horizontal location of Mountain C's peak?");
        mountainCHeight = getIntInRange(1,MAX_HEIGHT, "What is the height of Mountain C's peak?");

        System.out.println("Mountain A");
        printOneMountain(mountainAPosition, mountainAHeight);

        System.out.println("Mountain B");
        printOneMountain(mountainBPosition, mountainBHeight);

        System.out.println("Mountain C");
        printOneMountain(mountainCPosition, mountainCHeight);

        System.out.println("Overlapping");
        printOverlappingMountains();

        System.out.println("Silhouette");
        printSilhouette();
    }

    /**
     * prints a picture of this mountain. For instance (assuming that MAX_HEIGHT is 10 and MAX_WIDTH is 20), if
     * peakLocation is given as 4 and peakHeight is given as 7, this would look like:
     * |
     * |
     * |
     * |   *
     * |  * *
     * | *   *
     * |*     *
     * |       *
     * |        *
     * |         *
     * +––––––––––––––––––––
     * Example 2: If peakLocation is given as -2 and peakHeight is 6:
     * |
     * |
     * |
     * |
     * |
     * |
     * |
     * |*
     * | *
     * |  *
     * +––––––––––––––––––––
     * Example 3: If peakLocation is given as 15 and peakHeight is 12:
     * |            *   *
     * |           *     *
     * |          *       *
     * |         *         *
     * |        *
     * |       *
     * |      *
     * |     *
     * |    *
     * |   *
     * +––––––––––––––––––––
     * @param peakLocation - the horizontal position of the peak of this mountain
     * @param peakHeight -  the vertical position of the peak of this mountain
     */
    public void printOneMountain(int peakLocation, int peakHeight)
    {
        //TODO: You write this!!!
        System.out.println("Printing a mountain at "+peakLocation+" with height "+peakHeight+
                ". This hasn't been written yet."); // Please replace this with your code!!!

    }


    /**
     * Prints a drawing of all three mountains, overlapping.
     * (Again, let's assume that MAX_HEIGHT is 10 and MAX_WIDTH is 20.)
     * Example: Suppose we find mountainAPosition = 4 and mountainAHeight = 8 and
     *                          mountainBPosition = 9 and mountainBHeight = 6 and
     *                          mountainCPosition = 16 and mountainCHeight = 5
     * Output would look like:
     * |
     * |
     * |   *
     * |  * *
     * | *   *  *
     * |*     ** *     *
     * |      **  *   * *
     * |     *  *  * *   *
     * |    *    *  *     *
     * |   *      ** *
     * +–––––––––––––––––––
     */
    public void printOverlappingMountains()
    {

        //TODO: You write this!!!
        System.out.println("Printing an overlapping mountain range, but this hasn't been written yet."); // Please replace this with your code!!!

    }

    /**
     * Prints a drawing of all three mountains, but only topmost edge.
     * (Again, let's assume that MAX_HEIGHT is 10 and MAX_WIDTH is 20.)
     * Example: Suppose we find mountainAPosition = 4 and mountainAHeight = 8 and
     *                          mountainBPosition = 9 and mountainBHeight = 6 and
     *                          mountainCPosition = 16 and mountainCHeight = 5
     * Output would look like:
     * |
     * |
     * |   *
     * |  * *
     * | *   *  *
     * |*     ** *     *
     * |          *   * *
     * |           * *   *
     * |            *     *
     * |
     * +–––––––––––––––––––
     */
    public void printSilhouette()
    {
        //TODO: You write this!!!
        System.out.println("Printing a silhouette of a mountain range, but this hasn't been written yet."); // Please replace this with your code!!!

    }




}
