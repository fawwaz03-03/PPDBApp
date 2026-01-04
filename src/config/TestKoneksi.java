/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;

public class TestKoneksi {
    public static void main(String[] args) {
        Connection conn = Koneksi.getConnection();

        if (conn != null) {
            System.out.println("Koneksi BERHASIL");
        } else {
            System.out.println("Koneksi GAGAL");
        }
    }
}

