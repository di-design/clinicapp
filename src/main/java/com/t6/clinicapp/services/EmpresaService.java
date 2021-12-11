package com.t6.clinicapp.services;

import java.util.Date;
import java.util.Optional;

import com.t6.clinicapp.models.EmpresaModel;
import com.t6.clinicapp.models.PortalModel;
import com.t6.clinicapp.repositories.EmpresaRepository;
import com.t6.clinicapp.utileria.Utileria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository empresaRepo;

    private Utileria util = new Utileria();

    public Optional<EmpresaModel> bucarEmpresa(){
        String id="1";
        return empresaRepo.findById(id);
    }

    public EmpresaModel guardarEmpresa(EmpresaModel empresa){
        empresa.setId("1");

        return empresaRepo.save(ValidarCampos(empresa));
    }

    private EmpresaModel ValidarCampos(EmpresaModel empresa){
        
        Optional <EmpresaModel> empresabbdd = empresaRepo.findById("1");
        PortalModel portal = new PortalModel();

        // Ajusta cadenas antes de persistir
        empresabbdd.get().setNit(util.eliminarEspaciosEnBlanco(empresa.getNit()));
        empresabbdd.get().setNombre(util.ajustarCadena(empresa.getNombre()));
        empresabbdd.get().setDireccion(util.ajustarCadena(empresa.getDireccion()));
        empresabbdd.get().setTelefono(util.eliminarEspaciosEnBlanco(empresa.getTelefono()));
        empresabbdd.get().setCorreo(util.eliminarEspaciosEnBlanco(empresa.getCorreo()));
        empresabbdd.get().setQuienes_somos(util.ajustarCadena(empresa.getQuienes_somos()));
        empresabbdd.get().setMision(util.ajustarCadena(empresa.getMision()));
        empresabbdd.get().setVision(util.ajustarCadena(empresa.getVision()));
        empresabbdd.get().setObjetivos(util.ajustarCadena(empresa.getObjetivos()));
        empresabbdd.get().setNombre_corto(util.ajustarCadena(empresa.getNombre_corto()));
        empresabbdd.get().setSiglas(util.eliminarEspaciosEnBlanco(empresa.getSiglas()));
        empresabbdd.get().setFecha_cambio(new Date());
        portal.setUrlImageBannerUno(empresa.getPortal().getUrlImageBannerUno());
        portal.setUrlImageBannerDos(empresa.getPortal().getUrlImageBannerDos());
        portal.setUrlImageBannerTres(empresa.getPortal().getUrlImageBannerTres());
        portal.setUrlImageBannerCuatro(empresa.getPortal().getUrlImageBannerCuatro());
        portal.setTittleTextSlideUno(util.ajustarCadena(empresa.getPortal().getTittleTextSlideUno()));
        portal.setTextSlideUno(util.ajustarCadena(empresa.getPortal().getTextSlideUno()));
        portal.setTittleTextSlideDos(util.ajustarCadena(empresa.getPortal().getTittleTextSlideDos()));
        portal.setTextSlideDos(util.ajustarCadena(empresa.getPortal().getTextSlideDos()));
        portal.setTittleTextSlideTres(util.ajustarCadena(empresa.getPortal().getTittleTextSlideTres()));
        portal.setTextSlideTres(util.ajustarCadena(empresa.getPortal().getTittleTextSlideTres()));
        portal.setTittleTextSlideCuatro(util.ajustarCadena(empresa.getPortal().getTittleTextSlideCuatro()));
        portal.setTextSlideCuatro(util.ajustarCadena(empresa.getPortal().getTextSlideCuatro()));
        portal.setImageFavicon32(empresa.getPortal().getImageFavicon32());
        portal.setImageFavicon64(empresa.getPortal().getImageFavicon64());
        empresabbdd.get().setPortal(portal);

        return empresabbdd.get();
    }
    
}
