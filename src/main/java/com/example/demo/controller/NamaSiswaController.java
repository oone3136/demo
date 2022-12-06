package com.example.demo.controller;

import com.example.demo.model.NamaSiswa;
import com.example.demo.respons.Respons;
import com.example.demo.servis.NamaSiswaServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping(value = "/api")
public class NamaSiswaController {
    @Autowired
    NamaSiswaServis namaSiswaServis;

    private String service = "NamaSiswa";

    @PostMapping("/siswa")
    ResponseEntity<Respons>create(@RequestBody @Validated NamaSiswa namaSiswa){
        String nameofCurrMethod = new Throwable()
                .getStackTrace()[0]
                .getMethodName();
        Respons respons = new Respons();
        respons.setService(this.getClass().getName()+nameofCurrMethod);
        respons.setMessage("Berhasil Membuat Data");

        respons.setData(namaSiswaServis.create(namaSiswa));

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(respons);
    }
    @PutMapping("/siswa/{id}")
    ResponseEntity<Respons>update(@PathVariable("id")Long id, @RequestBody @Validated NamaSiswa namaSiswa){
        String nameofCurrMethod = new Throwable()
                .getStackTrace()[0]
                .getMethodName();
        Respons respons = new Respons();
        respons.setService(this.getClass().getName()+nameofCurrMethod);
        respons.setMessage("Berhasil Update Data");

        respons.setData(namaSiswaServis.update(id, namaSiswa));

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(respons);
    }
    @GetMapping("/siswa/{id}")
    ResponseEntity<Respons>getById(@PathVariable ("id")Long id){
        String nameofCurrMethod = new Throwable()
                .getStackTrace()[0]
                .getMethodName();
        Respons respons = new Respons();
        respons.setService(this.getClass().getName()+nameofCurrMethod);
        respons.setMessage("Berhasil Mengambil Data berdasarkan ID");

        respons.setData(namaSiswaServis.findById(id));

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(respons);
    }
    @GetMapping("/siswa")
    ResponseEntity<Respons>findAll(){
        String nameofCurrMethod = new Throwable()
                .getStackTrace()[0]
                .getMethodName();

        Respons respons = new Respons();
        respons.setService(this.getClass().getName()+nameofCurrMethod);
        respons.setMessage("Berhasil Menampilkan Semua Data");

        respons.setData(namaSiswaServis.findAll());

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(respons);
    }
    @DeleteMapping("/siswa/{id}")
    ResponseEntity<Respons>deleteById(@PathVariable("id")Long id){
        String nameofCurrMethod = new Throwable()
                .getStackTrace()[0]
                .getMethodName();
        Respons respons = new Respons();
        respons.setService(this.getClass().getName()+nameofCurrMethod);
        respons.setMessage("Berhasil Menghapus Data");

        namaSiswaServis.delete(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(respons);
    }
}
