package com.spiet.hroauth.entities;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Role implements Serializable {
    private static final long serialVersionUID = -7585001821926304667L;

    private Long id;

    private String roleName;

}
