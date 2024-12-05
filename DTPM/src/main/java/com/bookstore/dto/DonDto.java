package com.bookstore.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DonDto {
    private Integer accountId;
    private List<BookOrderDto> bookOrderDtoList;
}
