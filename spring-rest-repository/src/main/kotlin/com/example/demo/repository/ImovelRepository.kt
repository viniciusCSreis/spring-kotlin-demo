package com.example.demo.repository

import com.example.demo.entity.Imovel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "imoveis", path = "imoveis")
interface ImovelRepository : JpaRepository<Imovel,String>