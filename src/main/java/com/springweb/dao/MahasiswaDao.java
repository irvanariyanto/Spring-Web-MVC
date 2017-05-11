/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springweb.dao;

import com.springweb.model.Mahasiswa;
import com.springweb.services.MahasiswaService;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author BAY
 */
@Service
public class MahasiswaDao implements MahasiswaService{

    private EntityManagerFactory emf;

    @Autowired
    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
           

    @Override
    public List<Mahasiswa> listMahasiswa() {
        EntityManager em= emf.createEntityManager();
        return em.createQuery("from Mahasiswa",Mahasiswa.class).getResultList();
    }
    
}
