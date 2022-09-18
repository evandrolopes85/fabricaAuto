# fabrica de Automóveis

Uma fábrica de automóveis precisa criar um software de automatização na fabricação dos veículos e inicialmente precisa de um módulo para cadastrar carros e motos.

Crie uma classe Automovel, Carro e Moto. Para o projeto atribua o nome do projeto fabricaAuto  com as seguintes regras:

Atenção: A classe deve ser nomeada sempre no singular e com a primeira letra em maiúsculo não utilize acento e nem espaços. 

- Classe Carro e Moto são  filhas da classe Automovel;

- Na classe Automovel terão alguns atributos que são comuns entre Carro e Moto, são eles: a cor, placa, modelo, ligado ( 0 - não, 1 - sim) e em movimento ( 0 - não, 1 - sim).

Atenção: coloque o atributo todo em letra minúscula, no singular e não coloque acentuação, caracteres especiais e nem espaço.

A classe  Carro deve conter os seguintes atributos: teto solar ( 0 - não, 1 - sim) e aberto ( 0 - não, 1 - sim);
A classe Moto deve conter os seguintes  atributos: freio abs ( 0 - não, 1 - sim)   se tem baú ( 0 - não, 1 - sim).
A classe Automovel:
contém o método ligar() que deve mostrar uma mensagem informando que o carro ou a moto está ligado.
contém o método mover() enviando uma mensagem informando que o automóvel está movendo, mas para realizar esse aviso deve verificar se o carro está ligado.
criar o método parar() mostrar a mensagem que o veículo está parado, mas para realizar esse aviso deve verificar se o carro está movendo.
A classe Carro:
criar o método abrirFechar(), mostrar a mensagem "carro aberto" se o carro estiver fechado, mas se o carro está aberto mostrar a mensagem “carro fechado” .
A classe Moto:
criar um método alarme() e mostrar a mensagem "alarme ligado".

