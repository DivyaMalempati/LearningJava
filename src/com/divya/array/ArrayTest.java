package com.divya.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayTest {
	@Test
	void addSingleElement() {
		Array array = new Array();
		array.add(5);
		assertEquals(1, array.getSize());
		assertEquals(2, array.getArrayLength());
		array.add(51);
		assertEquals(2, array.getSize());
		assertEquals(2, array.getArrayLength());
		array.add(1, 2, 3, 4, 5, 6);
		assertEquals(8, array.getSize());
		assertEquals(8, array.getArrayLength());
		array.insertAtFirst(23);
		assertEquals(9, array.getSize());
		assertEquals(16, array.getArrayLength());
		array.insertAtLast(16);
		assertEquals(10, array.getSize());
		assertEquals(16, array.getArrayLength());
		array.insertAtRequiredIndex(6, 3);
		assertEquals(11, array.getSize());
		assertEquals(16, array.getArrayLength());
	}

	@Test
	void deleteFromEmptyArray() {
		Array array = new Array();
		assertFalse(array.deleteLastElement());
	}

	@Test
	void deleteOneElementFromArray() {
		Array array = new Array();
		array.add(44);
		assertEquals(1, array.getSize());
		assertEquals(2, array.getArrayLength());
		assertTrue(array.deleteLastElement());
		assertEquals(0, array.getSize());
		assertEquals(2, array.getArrayLength());
	}

	@Test
	void deleteManyELementsFromArray() {
		Array array = new Array();
		array.add(44);
		array.add(4);
		array.add(40);
		array.add(14);
		array.add(140);
		assertEquals(5, array.getSize());
		assertEquals(8, array.getArrayLength());
		assertTrue(array.deleteLastElement());
		assertEquals(4, array.getSize());
		assertEquals(4, array.getArrayLength());
		assertTrue(array.deleteFirstElement());
		assertEquals(3, array.getSize());
		assertEquals(4, array.getArrayLength());
		assertTrue(array.deleteLastElement());
		assertEquals(2, array.getSize());
		assertEquals(2, array.getArrayLength());
		assertTrue(array.deleteLastElement());
		assertEquals(1, array.getSize());
		assertEquals(2, array.getArrayLength());
		assertTrue(array.deleteLastElement());
		assertEquals(0, array.getSize());
		assertEquals(2, array.getArrayLength());
	}

}
