package com.tlaloc_es.anthill.animals.organs.eye;

import java.util.List;

import com.tlaloc_es.anthill.math.Angles;
import com.tlaloc_es.anthill.math.Vector2D;
import com.tlaloc_es.anthill.world.Locatable2D;

public abstract class Eye {
    
    private double visionDepth;
    private double visionAngle;
    private Vector2D position;
    
    public Eye(Locatable2D locatable2D) {this.position = locatable2D.getPosition();}
    
    public abstract List<Locatable2D> see();

    public void setVisionDepth(double visionDepth) {
        this.visionDepth = visionDepth;
    }

    public void setVisionAngle(double visionAngle) {
        this.visionAngle = visionAngle;
    }
    
    public double getVisionDepth() {
        return visionDepth;
    }

    public double getVisionAngle() {
        return visionAngle;
    }
    
    public boolean isInVisionRange(Locatable2D locatable2D) {
    	Vector2D targetPosition = locatable2D.getPosition();
    	double angleTarget = position.getAngleToAnotherPoint(targetPosition);
    	double distanceToTarget = position.distanceFrom(targetPosition);
    	double startAngle = Angles.subtractionAngle(position.getDirection(), visionAngle/2);
    	boolean isInVisionDept = (distanceToTarget > visionDepth);
    	boolean isVisionAngle = Angles.isBetweenAngles(startAngle, visionAngle, angleTarget);
    	boolean isInVisionRange = isInVisionDept && isVisionAngle;
    	return isInVisionRange;
    }
    
}
