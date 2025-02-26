package com.angel.agendamento_notificacao_api.infrastructure.entities;


import com.angel.agendamento_notificacao_api.infrastructure.enums.StatusNotificacaoEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity(name = "agendamento")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String emailDestinatario;
    private String telefoneDestinatario;
    private String mensagem;
    private LocalDateTime dataHoraAgendamento;
    private LocalDateTime dataHoraEnvio;
    private LocalDateTime dataHoraModificado;
    private StatusNotificacaoEnum statusNotificacao;

    @PrePersist
    private void prePersist () {
        dataHoraAgendamento = LocalDateTime.now();
        statusNotificacao = StatusNotificacaoEnum.AGENDADO;
    }

}
