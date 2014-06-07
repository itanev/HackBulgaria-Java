package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MatrixTest {
	private Matrix matrix;
	
	@Test
	public void testInitialization() {
		matrix = new Matrix(5, 5);
		
		assertTrue(matrix.getRows() == 5);
		assertTrue(matrix.getCols() == 5);
	}
	
	@Test
	public void testSettersAndGetters() {
		matrix = new Matrix(5, 5);
		
		matrix.set(5, 5, new Pixel(Color.Red));
		
		assertTrue(matrix.get(5, 5).getColor() == Color.Red);
	}
	
	@Test
	public void testToString() {
		matrix = new Matrix(1, 1);
		matrix.set(1, 0, new Pixel(Color.Red));
		matrix.set(0, 0, new Pixel(Color.Blue));
		matrix.set(1, 1, new Pixel(Color.White));
		matrix.set(0, 1, new Pixel(Color.Green));
		
		assertTrue(matrix.toString() == "|B|G|\n|R|W|\n");
	}
	
	@Test
	public void testOperate() {
		matrix = new Matrix(1, 1);
		matrix.set(1, 0, new Pixel(Color.Red));
		matrix.set(0, 0, new Pixel(Color.Blue));
		matrix.set(1, 1, new Pixel(Color.White));
		matrix.set(0, 1, new Pixel(Color.Green));
		
		assertTrue(matrix.toString() == "|B|G|\n|R|W|\n");
		
		MatrixOperation clearPixels = new ClearPixelsOperation();
		matrix.operate(clearPixels);
		
		assertTrue(matrix.toString() == "| | |\n| | |\n");
	}
}
