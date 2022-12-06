# SistemaBanco
Integrantes: Ruan, João, Lucas e Warley.



Tela de Login > 
Login = nome de cada um do grupo (joaoruanlucaswarley).
Senha = matriculas (11).
Mensagem de Erro.

Menu >
redireciona o usuario para cada uma das funcionalidades do sistema.

Cadastro > 
recebe um numero de id,data,cpf e nome do cliente,alem disso o cliente tbm deve informar uma senha ao criar a conta,assim,so ele podera fazer alteracoes na conta.

Conta > 
possui saque,tranferencia,deposito,historico e tambem a opcao de exclui-la.

Buscar > 
E possivel buscar a conta por Id ou Cpf.
Tambem e possivel exibir todas as cadastradas no banco e os clientes com mais dinheiro .

CRUD > 
O CRUD permite cadastrar, remover e buscar uma conta por um determinado valor.
Tambem ordena as conta por id e saldo.
A data e id sao setados automaticamente.
A linked list foi utilizada pois como a posicao na lista nao era importante,apenas o id da conta, quando fosse removida alguma conta iria ficar um "buraco".Isso poderia ser corrigido 
com o uso de um interator,porem, como o indice do vetor nao seria usado, preferi utilizar a linked list.

