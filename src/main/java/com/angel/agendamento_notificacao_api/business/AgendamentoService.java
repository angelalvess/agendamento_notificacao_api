package com.angel.agendamento_notificacao_api.business;

import com.angel.agendamento_notificacao_api.business.mapper.IAgendamentoMapper;
import com.angel.agendamento_notificacao_api.controller.dto.in.AgendamentoRecord;
import com.angel.agendamento_notificacao_api.controller.dto.out.AgendamentoRecordOut;
import com.angel.agendamento_notificacao_api.infrastructure.repositories.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;
    private final IAgendamentoMapper agendamentoMapper;

    public AgendamentoRecordOut criarAgendamento (AgendamentoRecord agendamentoRecord) {

        return agendamentoMapper.paraOut(agendamentoRepository.save(agendamentoMapper.paraEntity(agendamentoRecord)));
    }


}
