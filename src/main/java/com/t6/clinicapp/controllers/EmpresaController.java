package com.t6.clinicapp.controllers;

import java.util.Optional;

import com.t6.clinicapp.models.EmpresaModel;
import com.t6.clinicapp.services.EmpresaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;
    
    @GetMapping("/listar")
    public Optional<EmpresaModel> listarEmpresa(){
        
        return empresaService.bucarEmpresa();
    }
    
    @PostMapping("/guardar")
    public EmpresaModel guardarEmpresa(@RequestBody EmpresaModel empresaModel){

        return empresaService.guardarEmpresa(empresaModel);
    }

}
