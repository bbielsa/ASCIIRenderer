package com.siggpu.world;

import org.la4j.vector.DenseVector;

import java.util.ArrayList;

/**
 * Created by bbielsa on 4/15/16.
 */
public class World {

    ArrayList<Geometry> geometries;

    public World() {
        geometries = new ArrayList<Geometry>();
    }

    public double getTraceIncrement(DenseVector rayPosition) {
        double closest = Double.MAX_VALUE;

        for(Geometry geometry : geometries) {
            double distance = geometry.getClosestPointTo(rayPosition).length();

            if (closest < distance) {
                closest = distance;
            }
        }

        return closest;
    }

}
