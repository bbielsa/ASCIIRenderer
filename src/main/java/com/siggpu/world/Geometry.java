package com.siggpu.world;

import org.la4j.vector.DenseVector;

/**
 * Created by bbielsa on 4/16/16.
 */
public interface Geometry {

    DenseVector getClosestPointTo(DenseVector point);

}
