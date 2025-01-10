package co.edu.sena.gestion_turistica.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import co.edu.sena.gestion_turistica.dto.RestauranteDto;

import co.edu.sena.gestion_turistica.entity.RestauranteEntity;
import co.edu.sena.gestion_turistica.repository.RestauranteRepository;

@Service

public class RestauranteService {

    @Autowired
    private RestauranteRepository repository;

    
    public void save(RestauranteDto dto) {
      RestauranteEntity entity = new RestauranteEntity();
      entity.setNombre(dto.getNombre());
      entity.setIdMunicipio(dto.getIdMunicipio());
      entity.setCelular(dto.getCelular());
      entity.setDireccion(dto.getDireccion());

      repository.save(entity);



    }

    public List<RestauranteDto> getAll(){

     List<RestauranteDto> dtos = new ArrayList<>();
     List <RestauranteEntity> entities = repository.findAll();

     for(RestauranteEntity entity: entities){

      RestauranteDto dto = new RestauranteDto();
      dto.setId(entity.getId());
      dto.setNombre(entity.getNombre());
      dto.setIdMunicipio(entity.getIdMunicipio());
      dto.setCelular(entity.getCelular());
      dto.setDireccion(entity.getDireccion());

      dtos.add(dto);

     }
  
     return dtos;
    }

     public RestauranteDto getById(Long id) {
      
        Optional<RestauranteEntity> optionalrestaurante = this.repository.findById(id);
        if (optionalrestaurante.isPresent()) {
            RestauranteEntity entity = optionalrestaurante.get();
            RestauranteDto dto = new RestauranteDto();
            dto.setId(entity.getId());
            dto.setNombre(entity.getNombre());
            dto.setIdMunicipio(entity.getIdMunicipio());
            dto.setCelular(entity.getCelular());
            dto.setDireccion(entity.getDireccion());
            return dto;


  }
  return null;

}
}