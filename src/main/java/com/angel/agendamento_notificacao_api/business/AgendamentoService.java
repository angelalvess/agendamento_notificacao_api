package com.angel.agendamento_notificacao_api.business;

import com.angel.agendamento_notificacao_api.business.mapper.IAgendamentoMapper;
import com.angel.agendamento_notificacao_api.controller.dto.in.AgendamentoRecord;
import com.angel.agendamento_notificacao_api.controller.dto.out.AgendamentoRecordOut;
import com.angel.agendamento_notificacao_api.infrastructure.entities.Agendamento;
import com.angel.agendamento_notificacao_api.infrastructure.exception.NotFoundException;
import com.angel.agendamento_notificacao_api.infrastructure.repositories.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AgendamentoService {


    private final AgendamentoRepository agendamentoRepository;

    private final IAgendamentoMapper agendamentoMapper;


    public AgendamentoRecordOut criarAgendamento (AgendamentoRecord agendamento) {
        return agendamentoMapper.paraOut(agendamentoRepository
                .save(agendamentoMapper.paraEntity(agendamento)));
    }

    public AgendamentoRecordOut buscarAgendamentoPorId (Long id) {
        return agendamentoMapper.paraOut(agendamentoRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("ID do agendamento nao encontrado")));
    }

    public void cancelarAgendamento (Long id) {

        Agendamento agendamento = agendamentoRepository.findById(id).orElseThrow(() -> new NotFoundException("ID do agendamento nao encontrado"));
        agendamentoRepository.save(agendamentoMapper.paraEntityCancelamento(agendamento));

    }

}
