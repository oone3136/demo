package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "nama_siswa")
public class NamaSiswa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public long id;

    @Column(name = "nama", nullable = false, length = 50)
    public String nama;

    @Column(name = "kelas", nullable = false, length = 5)
    public String kelas;

    @Column(name = "jurusan", nullable = false,length = 36)
    public String jurusan;


}
