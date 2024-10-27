package com.example.mywebapp.model;


import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String nombre;
 private String email;
 // Getters y Setters
}