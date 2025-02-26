package com.angel.agendamento_notificacao_api.infrastructure.repositories;

import com.angel.agendamento_notificacao_api.infrastructure.entities.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}
