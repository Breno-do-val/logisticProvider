Setup do sistema
Clicar com o botão direito na classe principal "ProvedorDeLogísticaApplication" e então Run as SPRING BOOT APP.

APIs do Sistema
Obter todos os pedidos do sistema
GET - http://localhost:8080/logistic/

Obter um pedido entregue
GET - http://localhost:8080/logistic/{id}

Registrar uma nova entrega
POST - http://localhost:8080/logistic

Alterar dado de uma entrega
PUT - http://localhost:8080/logistic/{id}

Parâmetros{
Id: int, 
receiverName: string,
receiverCpf: string,
date: string
OrderStatus: 0 - NOT_FOUND / 1 - DELIVERED
}