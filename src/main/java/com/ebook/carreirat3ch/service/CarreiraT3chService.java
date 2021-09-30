package com.ebook.carreirat3ch.service;

import com.ebook.carreirat3ch.domain.CarreiraT3ch;
import com.ebook.carreirat3ch.repository.CarreiraT3chRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarreiraT3chService {

    @Autowired
    CarreiraT3chRepository carreiraT3chRepository;

    public void criarLead(CarreiraT3ch careCarreiraT3ch){
        carreiraT3chRepository.save(careCarreiraT3ch);
    }

    public Iterable<CarreiraT3ch> exibirPageEbook(){
        return carreiraT3chRepository.findAll();
    }


}
