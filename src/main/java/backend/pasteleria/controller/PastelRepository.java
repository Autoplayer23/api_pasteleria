package backend.pasteleria.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backend.pasteleria.model.Pastel;
@Repository
public interface PastelRepository extends JpaRepository<Pastel, Integer > {

}
