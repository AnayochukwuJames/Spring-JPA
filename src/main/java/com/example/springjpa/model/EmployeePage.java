package com.example.springjpa.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Sort;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeePage {
    private int pageNumber = 0;
    private int pageSize = 10;
    private Sort.Direction SortDirection = Sort.Direction.ASC;
    private String SortBy = "lastName";
}
