package com.example.mosquito;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

public class Captura {

    @Rule
    public MockitoRule initRule = MockitoJUnit.rule();

    @Mock
    List<String> mockedList;

    @Captor
    ArgumentCaptor<String> captor;

    @Test
    public void whenUseCaptorAnnotation_thenTheSam() {
        mockedList.add("one");
        /*Mockito.verify(mockedList).add(argCaptor.capture());*/
        verify(mockedList).add(captor.capture());

        assertEquals("one", captor.getValue());
    }

}
