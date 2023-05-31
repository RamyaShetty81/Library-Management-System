package com.example.Library.Management.System.service;


import com.example.Library.Management.System.DTO.RequestDto.StudentRequestDto;
import com.example.Library.Management.System.DTO.RequestDto.UpdateStudentMobRequestDto;
import com.example.Library.Management.System.DTO.ResponseDto.StudentResponseDto;
import com.example.Library.Management.System.DTO.ResponseDto.UpdateStudentMobNoResponseDto;
import com.example.Library.Management.System.exceptions.StudentNotFoundException;

public interface StudentService {

    public String addStudent(StudentRequestDto studentRequestDto);

    public StudentResponseDto getStudentById(int id);
    public UpdateStudentMobNoResponseDto updateMobNo(UpdateStudentMobRequestDto updateStudentMobRequestDto) throws StudentNotFoundException;
}