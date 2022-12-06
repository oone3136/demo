package com.example.demo.servis;

import com.example.demo.model.NamaSiswa;
import com.example.demo.repository.NamaSiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NamaSiswaServisImpl implements NamaSiswaServis{

    @Autowired
    NamaSiswaRepository namaSiswaRepository;

    @Override
    public List<NamaSiswa> findAll() {
        return namaSiswaRepository.findAll();
    }

    @Override
    public NamaSiswa findById(Long id) {
        return namaSiswaRepository.getOne(id);
    }

    @Override
    public NamaSiswa update(Long id, NamaSiswa namaSiswa) {
        return namaSiswaRepository.save(namaSiswa);
    }

    @Override
    public NamaSiswa create(NamaSiswa namaSiswa) {
        return namaSiswaRepository.save(namaSiswa);
    }

    @Override
    public void delete(Long id) {
        namaSiswaRepository.deleteById(id);
    }
}
