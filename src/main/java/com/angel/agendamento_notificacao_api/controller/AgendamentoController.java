package com.angel.agendamento_notificacao_api.controller;


import com.angel.agendamento_notificacao_api.business.AgendamentoService;
import com.angel.agendamento_notificacao_api.controller.dto.in.AgendamentoRecord;
import com.angel.agendamento_notificacao_api.controller.dto.out.AgendamentoRecordOut;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agendamento")

public class AgendamentoController {


    private final AgendamentoService agendamentoService;

    public AgendamentoController (AgendamentoService agendamentoService) {
        this.agendamentoService = agendamentoService;
    }

    @PostMapping
    public ResponseEntity<AgendamentoRecordOut> criarAgendamento (@RequestBody AgendamentoRecord agendamento) {

        return ResponseEntity.ok(agendamentoService.criarAgendamento(agendamento));

    }

    @GetMapping("/{id}")
    public ResponseEntity<AgendamentoRecordOut> buscarAgendamentPorId (@PathVariable Long id) {

        return ResponseEntity.ok(agendamentoService.buscarAgendamentoPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> cancelarAgendamento (@PathVariable Long id) {
        agendamentoService.cancelarAgendamento(id);

        return ResponseEntity.accepted().build();
    }
}
