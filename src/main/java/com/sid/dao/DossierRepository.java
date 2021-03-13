package com.sid.dao;

import com.sid.entities.Dossier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DossierRepository extends JpaRepository<Dossier,Long> {
}
