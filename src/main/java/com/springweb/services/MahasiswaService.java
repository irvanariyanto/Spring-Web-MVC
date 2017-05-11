/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springweb.services;

import com.springweb.model.Mahasiswa;
import java.util.List;

/**
 *
 * @author BAY
 */
public interface MahasiswaService {
    
    List <Mahasiswa> listMahasiswa();
    
    Mahasiswa saveOrUpdate(Mahasiswa mahasiswa);
    
    Mahasiswa getIdMahasiswa(Integer id);
    
    void hapus(Integer id);
}
