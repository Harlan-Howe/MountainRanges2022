public class MountainRangesRunner
{
    public static void main(String[] args)
    {
        MountainRange app = new MountainRange();
        // checkHeightAtX(app); // uncomment this line to test your heightOfMountainAtX() method.
        app.run();
        System.out.println("Done with program. I hope you like your mountains.");
    }


    public static void checkHeightAtX(MountainRange range)
    {
        boolean testsPassed = true;
        int firstHeight = range.heightOfMountainAtX(5,3,4);
        if (firstHeight!=2)
        {
            testsPassed = false;
            System.out.println("First test failed. You got "+firstHeight+" but it should be 2.");
        }
        int secondHeight = range.heightOfMountainAtX(2,4,6);
        if (secondHeight!= 0)
        {
            testsPassed = false;
            System.out.println("Second test failed. You got "+secondHeight+" but it should be 0.");
        }
        int thirdHeight = range.heightOfMountainAtX(8,4,5);
        if (thirdHeight != 1)
        {
            testsPassed = false;
            System.out.println("Third test failed. You got "+thirdHeight+" but it should be 1.");
        }
        int fourthHeight = range.heightOfMountainAtX(6,5,15);
        if (fourthHeight != 0)
        {
            testsPassed = false;
            System.out.println("Fourth test failed. You got "+fourthHeight+" but it should be 0.");
        }
        int fifthHeight = range.heightOfMountainAtX(12,9,12);
        if (fifthHeight != 9)
        {
            testsPassed = false;
            System.out.println("Fifth test failed. You got "+fifthHeight+" but it should be 9.");
        }

        if (testsPassed)
        {
            System.out.println("Congratulations. All tests on the heightOfMountainAtX() method have passed.");
        }

    }

}
