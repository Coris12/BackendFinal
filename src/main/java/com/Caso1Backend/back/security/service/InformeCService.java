package com.Caso1Backend.back.security.service;
import org.springframework.stereotype.Service;

import com.Caso1Backend.back.security.models.InformeC;
import com.Caso1Backend.back.security.repository.InformeRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class InformeCService {
	@Autowired
    private InformeRepository informeRepository;

    public <S extends InformeC> S save(S entity) {
        return informeRepository.save(entity);
    }
}
