package com.example.demo2.controller.request

import com.example.demo2.entity.Imovel
import com.example.demo2.enums.TipoImovel
import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class ImovelRequest(

    @field:NotNull
    val cep: String? = null,

    @field:NotBlank
    val endereco: String? = null,

    @field:NotNull
    val numero: Long? = null,

    @field:NotNull
    val tipoImovel: TipoImovel? = null,

    val andar: Long? = null
) {
    fun toEntity(): Imovel {
        return Imovel(
            cep = this.cep,
            andar = this.andar,
            endereco = this.endereco,
            numero = this.numero,
            tipoImovel = this.tipoImovel
        )
    }

    fun valid() : ImovelRequest{
        if(this.tipoImovel == TipoImovel.APARTAMENTO && this.andar == null)
        {
            throw ResponseStatusException(
                HttpStatus.BAD_REQUEST,"Imoveis do tipo apartamento devem informar o andar."
            )
        }
        return this
    }
}