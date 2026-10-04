package com.example.testDrivenDevelopment.ArrayList;


import com.example.testDrivenDevelopment.Repository.ProjectRepository;
import com.example.testDrivenDevelopment.Service.ArrayListService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class ArrayListTest {

    @Mock
    private ProjectRepository projectRepository;


    @InjectMocks
    private ArrayListService serviceForArray;

    @Test
    void theFoundProjectsShouldReturnAsActive() {

    }
}
