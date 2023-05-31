package com.example.Library.Management.System.DTO.RequestDto;
import com.example.Library.Management.System.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class IssueBookRequestDto {
private int cardId;
private int bookId;

}
