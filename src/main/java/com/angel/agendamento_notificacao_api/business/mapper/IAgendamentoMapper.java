package com.angel.agendamento_notificacao_api.business.mapper;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

import com.angel.agendamento_notificacao_api.controller.dto.in.AgendamentoRecord;
import com.angel.agendamento_notificacao_api.controller.dto.out.AgendamentoRecordOut;
import com.angel.agendamento_notificacao_api.infrastructure.entities.Agendamento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = SPRING)
public interface IAgendamentoMapper {


    Agendamento paraEntity (AgendamentoRecord agendamentoRecord);

    AgendamentoRecordOut paraOut (Agendamento agendamento);


    @Mapping(target = "dataHoraModificado", expression = "java(LocalDateTime.now())")
    @Mapping(target = "statusNotificacao", expression = "java(StatusNotificacaoEnum.CANCELADO)")
    Agendamento paraEntityCancelamento (Agendamento agendamento);

}
