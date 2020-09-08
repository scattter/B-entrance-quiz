package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class StudentService {
    List<Student> students = new ArrayList<>();

    {
        students.add(new Student(1, "沈乐棋"));
        students.add(new Student(2, "徐慧慧"));
        students.add(new Student(3, "陈思聪"));
        students.add(new Student(4, "王江林"));
        students.add(new Student(5, "王登宇"));
        students.add(new Student(6, "杨思雨"));
        students.add(new Student(7, "江雨舟"));
        students.add(new Student(8, "廖燊"));
        students.add(new Student(9, "胡晓"));
        students.add(new Student(10, "但杰"));
        students.add(new Student(11, "盖迈达"));
        students.add(new Student(12, "肖美琦"));
        students.add(new Student(13, "黄云洁"));
        students.add(new Student(14, "齐瑾浩"));
        students.add(new Student(15, "刘亮亮"));
        students.add(new Student(16, "肖逸凡"));
        students.add(new Student(17, "王作文"));
        students.add(new Student(18, "郭瑞凌"));
        students.add(new Student(19, "李明豪"));
        students.add(new Student(20, "党泽"));
        students.add(new Student(21, "肖伊佐"));
        students.add(new Student(22, "贠晨曦"));
        students.add(new Student(23, "李康宁"));
        students.add(new Student(24, "马庆"));
        students.add(new Student(25, "商婕"));
        students.add(new Student(26, "余榕"));
        students.add(new Student(27, "谌哲"));
        students.add(new Student(28, "董翔锐"));
        students.add(new Student(29, "陈泰宇"));
        students.add(new Student(30, "赵允齐"));
        students.add(new Student(31, "张柯"));
        students.add(new Student(32, "廖文强"));
        students.add(new Student(33, "刘轲"));
        students.add(new Student(34, "廖浚斌"));
        students.add(new Student(35, "凌凤仪"));
    }

    public List<Student> getAllStudent() {
        return students;
    }

    public List<Student> addStudent(String name) {
        int index = students.size() + 1;
        students.add(new Student(index, name));
        return students;
    }

    public List<Student> sortStudent(){
        List<Student> newStudents = new ArrayList<Student>();
        newStudents.addAll(students);
        Collections.shuffle(newStudents);
        return newStudents;
    }
}
