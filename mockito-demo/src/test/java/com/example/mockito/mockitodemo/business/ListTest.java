package com.example.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ListTest {

	@Test
	void simpleTest() {

		List listMock = mock(List.class);

		when(listMock.size()).thenReturn(2);
		assertEquals(2, listMock.size());

	}

	@Test
	void multipleReturnTest() {

		List listMock = mock(List.class);

		when(listMock.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, listMock.size());
		assertEquals(3, listMock.size());
		assertEquals(3, listMock.size());

	}

	@Test
	void genricParameterTest() {

		List listMock = mock(List.class);

		when(listMock.get(Mockito.anyInt())).thenReturn("some String");
		assertEquals("some String", listMock.get(0));
		assertEquals("some String", listMock.get(1));
		assertEquals("some String", listMock.get(3));

	}

}
