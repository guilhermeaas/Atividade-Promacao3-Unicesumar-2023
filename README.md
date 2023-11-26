# Atividade-Promacao3-Unicesumar-2023
 Atividade M.A.P.A  da discliplina de programação 3 do curso de análise e desenvolvimento de sistemas

Enunciado:
Caro estudante,

Temos por certo que os desafios sempre contribuem na aquisição de conhecimentos e competências desejadas. Sendo assim, faz-se necessário relacionar o que se aprende com situações reais que podem ser encontradas no cotidiano.

Nesta atividade, você é convidado a realizar uma atividade para verificar como a disciplina em questão pode contribuir na sua experiência e formação profissional. Por este motivo, nesta atividade MAPA, você é instigado a solucionar um problema voltado para sua área de formação.

Atente-se para as informações e realize um ótimo trabalho!

Gerenciamento de locação de veículos.

Uma grande rede de aluguéis de veículos contratou a fábrica de software em que você trabalha para criar um software em Java orientado à objetos que faça a gestão de seus veículos para os clientes.

O processo de desenvolvimento já se iniciou e o analista de sistema já modelou parte do processo de locação, criando o diagrama de classe abaixo:


Além do diagrama de classe, o analista ainda mandou o documento de requisitos contendo as seguinte regras
- O método de cadastrar usuário deve ler as informações através do JOptionPane
- O método mostrar dados do usuário deve preprar uma string e retornar como saída do método
- O mesmo comportamento dos métodos de usuário devem ser contemplados em Carro
- O método iniciar aluguel deve chamar o método cadastrarUsuario e cadastrarCarro do objeto relacionado a aluguel
- O método iniciar aluguel deve pedir também o kmInicial do veiculo 
- O método fechar locacao deve ler a informação de kmFinal.
    - Para calcular a locação deve-se calcular a quantidad de dias locados * valor por km. Além disso se o carro ficou alugado por mais de 10 dias, deve-se dar desconto de 10% e se ficou mais de 20 dias deve-se dar um desconto de 20%. O valor final deve ser armazenado no atributo valorTotalAluguel
- O método mostrarResumoLocacao deve mostrar as informacoes de cliente, carro, e do aluguel através do JOptionPane, no final ficará assim:

Resumo Aluguel
Cliente
Nome: Rogério
CPF: 123.123.123-11
Telefone: (11)1111-11111
Carro
Modelo: HB20
Marca: Hyundai
Valor por Km: 5.0
Aluguel
Quantidade de dias: 1
Km Inicial: 100
Km Final: 200
Valor Total: R$500,00
