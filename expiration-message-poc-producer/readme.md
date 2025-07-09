## Objetivo

Servir de exemplo como criação do dado no Redis salvando com o TTL.


## Configurações Importantes

## Redis
Precisa configurar o Redis para permitir notificações de eventos expirados por TTL.

Código abaixo:

```
CONFIG SET notify-keyspace-events Ex
OK
```

