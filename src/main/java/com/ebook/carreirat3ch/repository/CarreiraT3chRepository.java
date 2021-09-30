package com.ebook.carreirat3ch.repository;

import com.ebook.carreirat3ch.domain.CarreiraT3ch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreiraT3chRepository extends JpaRepository< CarreiraT3ch, Long > {
}
