package com.example.spring.repository;

import java.util.List;
import com.example.spring.model.Student;
import org.apache.ibatis.annotations.*;
@Mapper
public interface StudentRepository {
    @Insert("INSERT INTO students(fname, lname, department) " +
            " VALUES (#{fname}, #{lname}, #{department})")
    int insert(Student student);

    @Select("SELECT * FROM students")
    List<Student> findAll();

    @Select("SELECT * FROM students WHERE id = #{id}")
    Student findById(@Param("id") long id);

    @Update("Update students set fname=#{fname}, " +
            " lname=#{lname}, department = #{department} where id=#{id}")
    int update(Student student);

    @Delete("DELETE FROM students WHERE id = #{id}")
    int deleteById(@Param("id") long id);
}
