package com.spiet.hroauth.entities;


import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User implements Serializable {

    private static final long serialVersionUID = 8833921007606169182L;

    private Long id;

    private String name;

    private String email;

    private String password;

   private Set<Role> role = new HashSet<>();
}
