# estudo_de_caso01_pds

Estudo de Caso Gestão de Hotéis

1. Descrição das Funcionalidades do Sistema:

O sistema permitirá ao usuário (funcionário) as seguintes funcionalidades: cadastro de um cliente/hóspede; listagem de hóspedes; alteração de dados do hóspede; exclusão de um hóspede. Além disso, o sistema permitirá a realização de uma reserva de quarto (ou quartos) e também o cancelamento desta reserva se necessário. Por fim, o sistema permitirá fazer check-in e check-out, envolvendo neste último o pagamento desta estadia. 

2. Diagrama de Casos de Uso:
![Diagrama]()

3. Descrição do Fluxo de Telas do Sistema:
 
O fluxograma desenvolvido contará com as seguintes telas, sendo elas: Tela Cadastro, a qual vai pedir se tem ou não um cadastro (nesse caso irá pedir que preencha com os dados do funcionário); a Tela Login que vai guardar o cadastro; a Tela Principal que vai ter acesso a reserva de hospedagem; a Tela Reserva que vai preencher com as informações do cliente (data de entrada e saída, tipo de quarto, número da reserva e quantidade de pessoas); a Tela Cancelar Reserva do Cliente, que vai cancelar a reserva do mesmo (solicitando o CPF do hóspede e o número da reserva); a Tela  Listagem de Hóspedes que vai listar os hóspedes se for pedido pelo cliente, seguindo caso seja necessário, para a Tela Exclusão de Hóspede,  que vai excluir o/os hóspedes ao preencher com os dados do cliente inseridos no cadastro e pelo número da reserva (nesse caso irá seguir para a Tela Principal novamente ou seguirá para a Tela de Efetuar Check-In); Tela Efetuar Check-In, que confirmará a reserva e estadia do hóspede, seguindo assim para a Tela de pagamento, o qual irá verificar o preço da diária, serviço de quarto (incluso ou não) e forma de pagamento (cartão de crédito, débito, boleto ou pix); seguindo estes processos, Check-Out confirma a saída do hóspede e vai para a tela Principal, sendo o botão Saída da Tela Principal o fim do programa.

4. Fluxograma de Uso do Sistema:

![Diagrama](https://github.com/MariaTerezaWippel/estudo_de_caso01_pds/assets/111304031/42d7809a-2349-4cfb-8119-3b61cb36a61f)

5. Diagrama de Classes:
O Diagrama de Classes é um documento único que permite visualizar todos os objetos de entidade da análise, bem como os relacionamentos entre eles,permitindo identificar as estruturas do mesmo. Para fazer uma reserva no hotel, foram desenvolvidas 9 classes que englobam todas as informações necessárias ao funcionamento da aplicação. As classes ListagemdeHospedes, LoginFuncionarios, CancelarReservas, CadastroFuncionarios,ExclusaodeHospedes , TelaPrincipal, Reservas, TelaCheckins e Pagamentos são apresentadas na imagem abaixo.
