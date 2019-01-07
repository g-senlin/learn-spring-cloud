package com.senlin.movie.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author gsl
 * @date 2019/1/3 23:19.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;

    private String username;

    private String name;

    private Integer age;

    private BigDecimal balance;
}
