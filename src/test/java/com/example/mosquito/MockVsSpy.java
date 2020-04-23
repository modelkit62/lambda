package com.example.mosquito;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.*;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class MockVsSpy {

    @Rule
    public MockitoRule initRule = MockitoJUnit.rule();

    @Mock
    List<String> lista1;

/*
    @Spy
    List<String> lista2 = new ArrayList<>();

    List<String> lista3 = new ArrayList<>();
*/

    /*@Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }*/

    @Captor
    ArgumentCaptor<String> captor;

    @Test
    public void test1() {
        lista1.add("Dummy1");
        // assertEquals(0, lista1.size());
        verify(lista1).add(captor.capture());
        // assertEquals("Dummy1", captor.getValue());
        assertThat("Dummy1", is(captor.getValue()));
/*
        assertFalse(lista1.contains("Dummy1"));
        Mockito.doReturn(100).when(lista1).size();
        assertEquals(100, lista1.size());

        lista2.add("Dummy2");
        assertEquals(1, lista2.size());
        assertTrue(lista2.contains("Dummy2"));
        Mockito.doReturn(100).when(lista2).size();
        assertEquals(100, lista2.size());

        lista3.add("Dummy3");
        assertEquals(1, lista3.size());
        assertTrue(lista3.contains("Dummy3"));*/

       /* Mockito.doReturn(100).when(lista3).size();
        assertEquals(100, lista3.size());*/
    }
}
