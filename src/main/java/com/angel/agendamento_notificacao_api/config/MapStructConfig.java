package com.angel.agendamento_notificacao_api.config;

import com.angel.agendamento_notificacao_api.business.mapper.IAgendamentoMapper;
import com.angel.agendamento_notificacao_api.business.mapper.IAgendamentoMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.angel.agendamento_notificacao_api")
public class MapStructConfig {

    @Bean
    public IAgendamentoMapper agendamentoMapper () {
        // Retorna a implementação gerada pelo MapStruct
        return new IAgendamentoMapperImpl();
    }
}
