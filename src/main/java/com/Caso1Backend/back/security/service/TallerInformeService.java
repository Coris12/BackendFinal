package com.Caso1Backend.back.security.service;

import com.Caso1Backend.back.security.models.TallerInforme;
import com.Caso1Backend.back.security.repository.TallerInformeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TallerInformeService {

    @Autowired
    TallerInformeRepository informe;

    public List<TallerInforme> findAll() {
        return informe.findAll();
    }

    public <S extends TallerInforme> S save(S entity) {
        return informe.save(entity);
    }

    public TallerInforme editarInforme(TallerInforme t) {
        return informe.save(t);
    }

    public Optional<TallerInforme> getOneInforme(int id) {
        return informe.findById(id);
    }
}
