package com.company;

public class Point
{
    private int [] coordinates;
    private boolean pointOnXaxis;
    private boolean sameCoordinates;
    private int distanceFromAnotherPoint;
    private boolean unitCircle;
    private int midpoint;
    private int [] someOtherPoint;

    public Point (int [] var1, int [] var2)
    {
        this.coordinates = var1;
        this.someOtherPoint = var2;
    }

    public String toString ()
    {

        //method to determine whether the point is on the x-axis or not
        if (coordinates [1] == 0)
            pointOnXaxis = true;
        else
            pointOnXaxis = false;

        // method to determine whether the point has the same coordinates as the other point
        if (coordinates [0] == someOtherPoint [0] && coordinates [1] == someOtherPoint [1])
            sameCoordinates = true;
        else
            sameCoordinates = false;

        // method to determine the distance of the point from the other one
        int a = someOtherPoint[0] - coordinates[0];
        int b = someOtherPoint[1] - coordinates[1];
        int c = (int) Math.pow (a, 2);
        int d = (int) Math.pow (b, 2);
        int e = c + d;
        distanceFromAnotherPoint = (int) Math.sqrt (e);

        // method to determine whether the point is in the unit circle
        if (Math.pow (coordinates[0], 2) + Math.pow (coordinates[1], 2) == 1)
            unitCircle = true;
        else
            unitCircle = false;

        // method to determine the midpoint of the line connecting the points
        int midpointx = ((coordinates[0] + someOtherPoint [0]) / 2);
        int midpointy = ((someOtherPoint[1] + coordinates[1]) / 2);
        midpoint = midpointx & midpointy;

        return    "Coordinates: " + coordinates[0] + ", " + coordinates[1] + "\n"
                + "Some other point: " + someOtherPoint[0] + ", " + someOtherPoint[1] +  "\n"
                + "Point on x-axis: " + pointOnXaxis + "\n"
                + "Same coordinates with some other point: " + sameCoordinates + "\n"
                + "Distance from another point: " + distanceFromAnotherPoint + "\n"
                + "Is the point in the unit circle: " + unitCircle + "\n"
                + "The midpoint of the line: " + midpointx + ", " + midpointy;
    }
}