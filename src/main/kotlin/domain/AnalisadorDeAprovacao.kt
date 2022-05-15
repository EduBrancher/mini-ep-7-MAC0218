package domain

import domain.criterios.CriterioDeAprovacao

class AnalisadorDeAprovacao {

    lateinit var criterioDeAprovacao: CriterioDeAprovacao
    // ---------------------------------
    //
    //      Seu código deve vir aqui
    //
    //      Defina atributos e métodos conforme especificado
    //      no arquivo de teste encontrado em
    //      'src/test/kotlin/domain/AnalisadorDeAprovacaoTest'
    //
    // ---------------------------------
    fun fechaBoletim(boletim: Boletim): BoletimFechado {
        var boletimFechado = BoletimFechado(boletim.mediaEPs, boletim.mediaMiniEPs,
                                            this.criterioDeAprovacao.mediaFinal(boletim),
                                            this.criterioDeAprovacao.estaAprovado(boletim))
        return boletimFechado
    }
    fun defineCriterio(criterioDeAprovacao: CriterioDeAprovacao){
        this.criterioDeAprovacao = criterioDeAprovacao
    }
}