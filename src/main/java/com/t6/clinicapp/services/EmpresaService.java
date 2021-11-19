package com.t6.clinicapp.services;

import java.util.Optional;

import com.t6.clinicapp.models.EmpresaModel;
import com.t6.clinicapp.repositories.EmpresaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository empresaRepo;

    public Optional<EmpresaModel> bucarEmpresa(){
        String id="1";
        return empresaRepo.findById(id);
    }

    public EmpresaModel guardarEmpresa(EmpresaModel empresa){
        empresa.setId("1");
        return empresaRepo.save(empresa);
    }
    
}
