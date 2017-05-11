/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springweb.controller;

import com.springweb.model.Mahasiswa;
import com.springweb.services.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author BAY
 */
@Controller
public class MahasiswaController {
    
    private MahasiswaService mahasiswaService;

    @Autowired
    public void setMahasiswaService(MahasiswaService mahasiswaService) {
        this.mahasiswaService = mahasiswaService;
    }
      
            
    @RequestMapping("/mahasiswa")
    public String MahasiswaList(Model model){
        model.addAttribute("mahasiswa",mahasiswaService.listMahasiswa());
        return "mahasiswa";
    }
    
    @RequestMapping(value = "/mahasiswa/create", method = RequestMethod.GET)
    public String tampilkanForm(Model model){
        model.addAttribute("mahasiswa", new Mahasiswa());
        return "formMahasiswa";
    }
    
    @RequestMapping(value = "/mahasiswa/create", method = RequestMethod.POST)
    public String simpanDataMahasiswa(Model model, Mahasiswa mahasiswa){
        model.addAttribute("mahasiswa",mahasiswaService.saveOrUpdate(mahasiswa));
        return "redirect:/mahasiswa";
    }
}
