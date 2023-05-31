package com.example.Library.Management.System.service;


import com.example.Library.Management.System.DTO.ResponseDto.AuthorResponseDto;
import com.example.Library.Management.System.entity.Author;

public interface AuthorService {

    public String addAuthor(Author author);
    public AuthorResponseDto getByEmail(String email);
}