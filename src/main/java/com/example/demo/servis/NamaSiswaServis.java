package com.example.demo.servis;

import com.example.demo.model.NamaSiswa;

import java.util.List;

public interface NamaSiswaServis {

    List<NamaSiswa> findAll();
    NamaSiswa findById(Long id);
    NamaSiswa update(Long id, NamaSiswa namaSiswa);
    NamaSiswa create (NamaSiswa namaSiswa);
    void delete (Long id);
}
