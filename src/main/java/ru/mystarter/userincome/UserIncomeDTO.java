package ru.mystarter.userincome;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserIncomeDTO {
    private long id;
    private double income;
}
