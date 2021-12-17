package com.Caso1Backend.back.security.service;

import com.Caso1Backend.back.security.models.TallerSolicitud;
import com.Caso1Backend.back.security.repository.TallerSolicitudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TallerSolicitudService {

    @Autowired
    TallerSolicitudRepository solicitud;

    public List<TallerSolicitud> findAll() {
        return solicitud.findAll();
    }

    public <S extends TallerSolicitud> S save(S entity) {
        return solicitud.save(entity);
    }

    public TallerSolicitud editarSolicitud(TallerSolicitud s) {
        return solicitud.save(s);
    }

    public Optional<TallerSolicitud> getOneSolicitud(int id) {
        return solicitud.findById(id);
    }
}
