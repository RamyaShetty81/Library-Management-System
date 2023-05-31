package com.example.Library.Management.System.controller;


import com.example.Library.Management.System.DTO.RequestDto.StudentRequestDto;
import com.example.Library.Management.System.DTO.RequestDto.UpdateStudentMobRequestDto;
import com.example.Library.Management.System.DTO.ResponseDto.StudentResponseDto;
import com.example.Library.Management.System.DTO.ResponseDto.UpdateStudentMobNoResponseDto;
import com.example.Library.Management.System.exceptions.StudentNotFoundException;
import com.example.Library.Management.System.repository.StudentRepository;
import com.example.Library.Management.System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/add")
    public String addStudent(@RequestBody StudentRequestDto studentRequestDto){

        return studentService.addStudent(studentRequestDto);
    }

    @PutMapping("/update_mobile")
    public UpdateStudentMobNoResponseDto updateMobNo(@RequestBody UpdateStudentMobRequestDto updateStudentMobRequestDto) throws StudentNotFoundException {

        return studentService.updateMobNo(updateStudentMobRequestDto);
    }

    // delete a student by id

    // update the student by id

    @GetMapping("/get_student")
    public StudentResponseDto getStudent(@RequestParam("id") int id){
        return studentService.getStudentById(id);
    }

    // find all the students
}