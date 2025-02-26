package com.angel.agendamento_notificacao_api.controller.dto.in;

import com.angel.agendamento_notificacao_api.infrastructure.enums.StatusNotificacaoEnum;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record AgendamentoRecord( String emailDestinatario, String telefoneDestinatario, String mensagem,
                                @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
                                LocalDateTime dataHoraEnvio
                                ) {
}
