package org.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Calendar;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Reserved {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(nullable = false)
    private Calendar startDate;

    @Column(nullable = false)
    @NonNull
    private Calendar stopDate;

    @Column(nullable = false)
    @NonNull
    private String buyName;

}
