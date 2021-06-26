package com.aleDev.controleAcesso.model;

import lombok.*;


import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class CategoriaUsuario {
    @Id
    private long id;
    private String desscricao;
}