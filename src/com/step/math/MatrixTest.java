package com.step.math;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MatrixTest {

  @Test
  public void shouldAddTwoMatrices() {
    int[][] m1 = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
    int[][] m2 = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
    int[][] expected = { { 2, 2, 2 }, { 4, 4, 4 }, { 6, 6, 6 } };
    Matrix matrix1 = new Matrix(m1, 3, 3);
    Matrix matrix2 = new Matrix(m2, 3, 3);
    Matrix expectedMatrix = new Matrix(expected, 3, 3);
    Matrix actual = matrix1.add(matrix2);
    assertEquals("should add two Matrices", expectedMatrix, actual);
  }
}
