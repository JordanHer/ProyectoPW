/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author andre
 */
public class Encriptar {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        var claveAndrey = encoder.encode("123");
        var claveJordan = encoder.encode("123");
        var claveSebas = encoder.encode("123");
        var claveCamil = encoder.encode("123");
        System.out.println("Esta es la clave de Andrey " + claveAndrey);
        System.out.println("Esta es la clave de Jordan " + claveJordan);
        System.out.println("Esta es la clave de sebas " + claveSebas);
        System.out.println("Esta es la clave de Camil " + claveCamil);
    }

}
