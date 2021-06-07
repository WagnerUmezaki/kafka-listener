# kafka-listener

### Objetivo
Escutar eventos do kafka para auxiliar em testes de envio de evento.

### Requisitos
- Java 11
- URLs dos brokers do kafka
- URL do schema-registry do kafka

### How to
- Abrir arquivo `application.yml`
- Adicionar lista de brokers na propriedade `spring.cloud.stream.kafka.binder.brokers`
- Adicionar tópico do kafka na propriedade `spring.cloud.stream.bindings.event-input.destination`