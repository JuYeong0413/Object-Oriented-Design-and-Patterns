package q1;

public class Matcher {
    public Matcher() { }
    public boolean match(int[] expected, int[] actual,
                         int clipLimit, int delta)
    {
        clipTooLargeValues(actual, clipLimit);
        if (differentLength(expected, actual)) return false;
        if (!withinDelta(expected, actual, delta)) return false;

        return true;
    }

    public void clipTooLargeValues(int[] actual, int clipLimit)
    {
        for (int i = 0; i < actual.length; i++)
            if (actual[i] > clipLimit)
                actual[i] = clipLimit;
    }

    public boolean differentLength(int[] expected, int[] actual)
    {
        if (actual.length != expected.length) return true;
        else return false;
    }

    public boolean withinDelta(int[] expected, int[] actual, int delta)
    {
        for (int i = 0; i < actual.length; i++)
            if (Math.abs(expected[i] - actual[i]) > delta)
                return false;

        return true;
    }

}
