package com.tlaloc_es.anthill.math;

public class Vector2D {

	public final int TOTAL_DEGREES = 360;
	
    private double x;
    private double y;
    private double direction;

    public Vector2D(double x, double y, double direction) {
        setX(x);
        setY(y);
        setDirection(direction);
    }

    public Vector2D(double x, double y) {
        setX(x);
        setY(y);
        setDirection(0);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public double distanceFrom(Vector2D vector2d) {
        return Math.sqrt(Math.pow((x - vector2d.x), 2) + Math.pow((y - vector2d.y), 2));
    }

    public double calculateNorm() {
    	return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    
    public void rotate(double angle) {
    	direction += angle;
    	if(direction > TOTAL_DEGREES) {
    		direction = direction % TOTAL_DEGREES;
    	}
    }

    public void rotateTo(double angle) {
    	direction = angle;
    	if(direction > TOTAL_DEGREES) {
    		direction = direction % TOTAL_DEGREES;
    	}
    }
    
    public double getAngleToAnotherPoint(double x1, double y1) {
    	double angle =  Math.toDegrees(Math.atan2(y1 - y, x1 - x));

 	    if(angle < 0){
 	        angle += 360;
 	    }

 	    return angle;
    }
    
    public double getAngleToAnotherPoint(Vector2D vector2d) {
		return getAngleToAnotherPoint(vector2d.getX(), vector2d.getY());
	}
    
    @Override
    public String toString() {
        return "(" + x + ", " + y + ") With direction to: " + direction;
    }

}
