package com.example.spring;


import com.example.spring.model.Student;
import com.example.spring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
@SpringBootTest
@Test
@ContextConfiguration(locations = { "classpath:spring-test-config.xml" })
public class StudentTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void simpleTest() {
        //Должен закидывать в базу данных
        Student s = new Student();
        s.setFname("Nurzhan");
        s.setLname("Raikhanov");
        s.setDepartment("CS-1702");
        studentRepository.insert(s);
        //Проверка на то что у нас данные из первой строки в базе данных совпадают с теми что выше
        List<Student> students = studentRepository.findAll();
        Assert.assertEquals("Nurzhan", students.get(0).getFname());
        Assert.assertEquals("Raikhanov", students.get(0).getLname());
        Assert.assertEquals("CS-1702", students.get(0).getDepartment());
    }
}
