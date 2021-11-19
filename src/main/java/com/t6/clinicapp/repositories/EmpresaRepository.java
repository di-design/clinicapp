package com.t6.clinicapp.repositories;

import com.t6.clinicapp.models.EmpresaModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends MongoRepository<EmpresaModel, String>{
    
}
