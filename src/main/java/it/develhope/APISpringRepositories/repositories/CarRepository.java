package it.develhope.APISpringRepositories.repositories;

import it.develhope.APISpringRepositories.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, Long>{
}
