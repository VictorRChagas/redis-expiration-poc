Eu subi o Redis via docker para fazer essa POC.

Adicionei as coleções para você não precisar se preocupar em cria-las.

Utilizei as collections para criar, deletar e consultar os dados no Redis.

## Ponto importante

É essencial que o Redis seja configurado para permitir o consumo dessas mensagens expiradas.

Rode isso no terminao do **Redis**

```
CONFIG SET notify-keyspace-events Ex
```

Saida esperada:
```
OK
```

Você pode configurar isso via arquivos também para ser permanente, porém aqui como é só uma POC isso resovelrá o problema.


## Como testar?

- Suba as duas aplicações
- Salve um novo registro, atualmente está com um TTL de 60 segundos.
- Veja na outra aplicação se irá logar

Em resumo é isso. Claro, no cenário real você vai recortar os trechos do código mostrado aqui e
fazer conforme espera o seu caso de uso.