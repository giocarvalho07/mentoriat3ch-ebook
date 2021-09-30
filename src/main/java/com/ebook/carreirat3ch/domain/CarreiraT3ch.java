package com.ebook.carreirat3ch.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CarreiraT3ch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 50)
    @NotNull
    @NotBlank
    private String nome;

    @Size(max = 50)
    @NotNull
    @NotBlank
    private String sobrenome;

    @NotNull
    @NotBlank
    @Email
    private String email;

    @Size(max = 11)
    @NotNull
    @NotBlank
    private String telefone;




}
