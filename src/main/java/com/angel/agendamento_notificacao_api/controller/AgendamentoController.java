package com.angel.agendamento_notificacao_api.controller;


import com.angel.agendamento_notificacao_api.business.AgendamentoService;
import com.angel.agendamento_notificacao_api.controller.dto.in.AgendamentoRecord;
import com.angel.agendamento_notificacao_api.controller.dto.out.AgendamentoRecordOut;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agendamento")
@RequiredArgsConstructor
public class AgendamentoController {


    private final AgendamentoService agendamentoService;

    @PostMapping
    public ResponseEntity<AgendamentoRecordOut> criarAgendamento(@RequestBody AgendamentoRecord agendamentoRecord){
        return ResponseEntity.ok(agendamentoService.criarAgendamento(agendamentoRecord));

}
}
