package dao;

import domain.Student;

import java.util.List;

public interface StudentDao {
    List<Student> selectStudents();
}
