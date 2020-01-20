package com.example.demo.entity

import org.hibernate.annotations.GenericGenerator
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@Entity
data class Imovel(
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    var id: String? = null,

    @field:NotNull
    var cep: String? = null,

    @field:NotBlank
    var endereco: String? = null,

    @field:NotNull
    var numero: Long? = null,

    @Enumerated(EnumType.STRING)
    @field:NotNull
    var tipoImovel: TipoImovel? = null,

    var andar: Long? = null
)