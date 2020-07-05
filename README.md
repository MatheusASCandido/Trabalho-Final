# Projeto Defenda-se da Invasão.

# Equipe
  * Pedro Hori Bueno - RA 223402
  * Matheus Augusto da Silva Cândido - RA 241640

# Descrição Resumida do Projeto
Este é um jogo single player no qual o jogador tem como objetivo impedir a invasão de inimigos em seu território utilizando defesas estáticas que podem ser construídas ao decorrer do jogo utilizando recursos.  
    O tabuleiro do jogo será dividido por células, de modo que cada célula pode estar vazia, conter alguma unidade aliada (construída pelo jogador), conter alguma unidade inimiga, ou conter alguma peça estática (característica do próprio tabuleiro criado). As unidades inimigas surgem nas células mais à direita do tabuleiro, e conforme as rodadas passam elas se movem para a parte esquerda do tabuleiro. Se alguma unidade inimiga conseguir alcançar a extremidade esquerda do tabuleiro sem ser impedida ou morta, o jogador perde o jogo. O jogador vence o jogo quando as rodadas acabarem e todas as unidades inimigas forem eliminadas no tabuleiro. Pretendemos criar diversos tipos de unidades inimigas e aliadas (cada uma representada por uma classe diferente) que interajam com sua vizinhança de maneiras distintas e criativas.  
	O jogo seria dividido em fases com  diferentes dificuldades. Cada fase possuiria um tabuleiro levemente diferente (em que as peças estáticas são posicionadas de maneira diferente) e as unidades aliadas disponíveis seriam diferentes assim como as inimigas que estariam invadindo.  
	Também gostaríamos de utilizar uma boa interface gráfica para o jogo. Desta forma cada peça possuiria um nome e desenho relativo a ela baseado na temática do jogo, o que tornaria o jogo menos abstrato e melhoraria a experiência do jogador.  
  
# Vídeos do Projeto
## Vídeo da Prévia
* [Video com explicação básica do jogo](https://drive.google.com/file/d/1PenhFqBI79RkenKXz6Xt08x29YHh8kXR/view?usp=sharing)
## Vídeo do Jogo
*
# Slides do Projeto
## Slides da Previa
* [Slide do projeto](https://docs.google.com/presentation/d/1OUHMlqgoMDY4zieyRQ7nLU_UCLnYMEF865pBTfMvgnE/edit?usp=sharing)
## Slides da Apresentação Final
*
## Relatório de Evolução
Este projeto sofreu diversas alterações ao longo de seu desenvolvimento, tanto alterações simples de atributos básicos das unidades quanto alterações mais complexas que mudavam de maneira significativa a estrutura do programa. Inicialmete, o jogo começou a ser prográmado com interfaces gráficas muito mais simples em que o tabuleiro e as peças eram feitas com Strings, de maneira similar ao que foi feito nos programas da dama e do xadrez. Além disso, foi implementada somente uma fase de testes, sem possuir um menu inicial. Nós utilizamos este códico mais simplificado para testar todas as interações de vizinhança entre as peças, descartando as ideias inviáveis e desenvolvendo novas interações. Também utilizamos este código para testar o balanceamento do jogo mudando atributos básicos das peças como "dano", "vida" ou "custo", de maneira a melhorar a experiência do jogador. Após o programa estar rodando perfeitamente nesta interface gráfica simplificada, começamos a implementar a interface gráfica definitiva. Neste processo, acabamos criando novas interfaces e classes que não estavam previstas inicialmente no projeto, como uma interface para criar deferentes fases. Implementamos 3 fases com diferentes unidades e níveis de dificuldade, além de uma área de menu, onde o jogador pode selecionar a fase que ele deseja jogar, e uma página com as instruções de como se jogar o jogo.

Após concluirmos a implementação da interface gráfica finalo jogo estava praticamente pronto. Nós nos dedicamos por fm a deixar o layout do jogo o melhor e mais intuitivo possível. Alteramos as posições de botões e de informações na tela, alteramos o modo de se selicionar unidades e criamos telas intermediárias para direcionar o jogador durante o jogo. 

Finalmente, depois destas mudanças finais, o jogo foi concluido.

# Destaques de Código
# Destaques de Pattern
## Diagrama do Pattern
![imagem_Pattern](imagem_Pattern.png)
## Código do Patern
# Conclusões e Trabalhos Futuros
# Documentação dos Componentes
# Diagramas

## Diagrama Geral do Projeto
## Diagrama Geral de Componentes

![imagem_Diagrama_de_componentes](imagem_Diagrama_de_componetes.png)

### Componente Tabuleiro

Este componente representa todos os tabuleiros gerados no jogo. Ele interage com todas as peças do jogo, já que os tabuleiros possuim uma matriz de peças, interage com o recurso, já que cada tabuleiro possui seus determinados recursos no início do jogo e interage com todas as fases, já que cada fase do jogo nescessariamente possui um tabuleiro.

![imagem_componentes_Tabuleiro](imagem_componentes_Tabuleiro.png)

#### Ficha Técnica

|Item|Detalhamento|
|:-----:|:------:|
|Classe||
|Autores|Pedro Hori Bueno, Matheus Augusto da Silva Cândido|
|Interfaces|ITabuleiro, ITabuleiroDois, ITabuleiroTres|

### Componente Aliadas

Este componente representa todas as peças aliadas do jogo (que o jogador pode construir). Ele interage com o tabuleiro, pois as peças são construidas no tabuleiro, e também interage com o recurso, pois para o jogador construir novas peças aliadas ele gasta uma determinada quantidade de recurso.

![imagem_componentes_Aliadas](imagem_componete_Aliadas.png)

#### Ficha Técnica

|Item|Detalhamento|
|:-----:|:------:|
|Classe||
|Autores|Pedro Hori Bueno, Matheus Augusto da Silva Cândido|
|Interfaces|IPeças|

### Componente Inimigas

Este componente representa todas as peças inimigas do jogo (os monstros que invadem o tabuleiro). Ele interage com o tabuleiro, pois as peças inimigas surgem no tabuleiro e interagem nele.

![imagem_componentes_Inimigas](imagem_componentes_Inimigas.png)

#### Ficha Técnica

|Item|Detalhamento|
|:-----:|:------:|
|Classe||
|Autores|Pedro Hori Bueno, Matheus Augusto da Silva Cândido|
|Interfaces|IPeças|

### Componente Neutras

Este componente representa todas as peças neutras do jogo, que são posiconas no tabuleiro quando ele é gerado. Desta forma, este componente também interage com o tabuleiro.

![imagem_componentes_Neutras](imagem_componetes_Neutras.png)

#### Ficha Técnica

|Item|Detalhamento|
|:-----:|:------:|
|Classe||
|Autores|Pedro Hori Bueno, Matheus Augusto da Silva Cândido|
|Interfaces|IPeças|


### Componente Vazio

Este componente representa todas as peças da classe vazio presentes no tabuleiro, ou seja, todas as células vazias.

![imagem_componentes_Vazio](imagem_componetes_Vazio.png)

#### Ficha Técnica

|Item|Detalhamento|
|:-----:|:------:|
|Classe||
|Autores|Pedro Hori Bueno, Matheus Augusto da Silva Cândido|
|Interfaces|IPeças|

### Componente Recursos

Este componente representa o recurso do tabuleiro.

![imagem_componentes_Recursos](imagem_componentes_Recursos.png)

#### Ficha Técnica

|Item|Detalhamento|
|:-----:|:------:|
|Classe||
|Autores|Pedro Hori Bueno, Matheus Augusto da Silva Cândido|
|Interfaces|IRecursos|

### Componente Fase1

Este componente representa a fase 1 do jogo. Como a fase um é composta por um tabuleiro, este componente interage com tabuleiro.

![imagem_componentes_Fase1](imagem_componentes_Fase1.png)

#### Ficha Técnica

|Item|Detalhamento|
|:-----:|:------:|
|Classe||
|Autores|Pedro Hori Bueno, Matheus Augusto da Silva Cândido|
|Interfaces|IFases|

### Componente Fase2

Este componente representa a fase 2 do jogo. Como a fase dois é composta por um tabuleiro, este componente interage com tabuleiro. Esta interação ocorre pela interface ITabuleiroDois, que determina os monstros da segunda fase.

![imagem_componentes_Fase2](imagem_componentes_Fase2.png)

#### Ficha Técnica

|Item|Detalhamento|
|:-----:|:------:|
|Classe||
|Autores|Pedro Hori Bueno, Matheus Augusto da Silva Cândido|
|Interfaces|IFases|

### Componente Fase3

Este componente representa a fase 3 do jogo. Como a fase três é composta por um tabuleiro, este componente interage com tabuleiro. Esta interação ocorre pela interface ITabuleiroTres, que determina os monstros da terceira fase.

![imagem_componentes_Fase3](imagem_componentes_Fase3.png)

#### Ficha Técnica

|Item|Detalhamento|
|:-----:|:------:|
|Classe||
|Autores|Pedro Hori Bueno, Matheus Augusto da Silva Cândido|
|Interfaces|IFases|


### Interfaces

![imagem_ITabuleiro](Imagem_ITabuleiro.png)

![imagem_IPeças](imagem_IPecas.png)

![imagem_Aliadas](imagem_Aliadas.png)

![imagem_Inimigas](imagem_Inimigas.png)

![imagem_Neutras](imagem_Neutras.png)

![imagem_ITRecursos](imagem_IRecursos.png)

![imagem_IFases](imagem_IFases.png)

![imagem_IJanela](imagem_IJanela.png)


## Detalhamento das Interfaces

### Interface ITabuleiro

Interface impelemntada por todos os tabuleiros criados durante o jogo, determinando seu comportamento.

|Método|Objetivo|
|:-----:|:------:|
|CriarTab|Cria um novo tabuleiro com espaços vazios|
|fazerTab|Configura o tabuleiro adicionando peças neutras, recursos iniciais e a quantidade de rodadas|
|addFundo|Adiciona o fundo da fase|
|entrar|Adiciona novos monstros ao tabuleiro|
|executar|Percorre o tabuleiro fazendo as peças efetuarem suas ações|
|procurarMonstro|Verifica se existem monstros no tabuleiro|
|adicionarPeca|Adiciona uma peça ao tabuleiro|
|removerPeca|Remove uma peça do tabuleiro|
|adicionarComando|Adiciona um botão ao tabuleiro|

### Interface ITabuleiroDois

Interface implementada pelo tabuleiro da fase dois (serve para determinar o padrão de entrada de monstros novos no mapa na segunda fase).

|Método|Objetivo|
|:-----:|:------:|
|entrarDois|Determina como novos monstros entram no tabuleiro|

### Interface ITabuleiroTres

Interface implementada pelo tabuleiro da fase três (serve para determinar o padrão de entrada de monstros novos no mapa na terceira fase).

|Método|Objetivo|
|:-----:|:------:|
|entrarTres|Determina como novos monstros entram no tabuleiro|


### Interface IPecas

Interface implementada por todas as peças do jogo, inclusive células vazia. Esta interface permite que todas as células do tabuleiro seja composto por objetos que implementam a mesma interface, possibilitando interações mais simples e eficientes durante o código.

|Método|Objetivo|
|:-----:|:------:|
|interagir|Faz com que uma peça efetue sua interação no tabuleiro|
|mover|Faz com que uma peça efetue seu movimento no tabueliro|

### Interface IRecursos

Interface implementada pelo recurso do jogo presente em cada uma das fases. Esta interface permite que as devidas operações sejam feitas para altarar a quantidade de recursos e mostrar os recursos que o jogador possui durante a fase.

|Método|Objetivo|
|:-----:|:------:|
|alterarRecursos|Altera os recursos do jogador|
|mostrarRecursos|Mostra os recursos do jogador na tela|

### Interface IFases

Interface implementada pelas fases do jogo. Esta interface permite ao jogador fazer ações durante a fase, um elemento central do jogo.

|Método|Objetivo|
|:-----:|:------:|
|continuar|Avança em um a rodada de determinada fase e faz todas as peças do tabuleiro efetuarem suas interações|
|construir|Permite que o jogador construa unidades no tabueliro|

### Interface IJanela

Interface implementada pelas janelas abertas do jogo. Esta interface possibilita a criação de novas janelas do jogo.

|Método|Objetivo|
|:-----:|:------:|
|janelaVisual|Cria e abre uma nova janela do jogo|


# Plano de Exceções
## Diagrama da Hierarquia de excessões

![imagem_Exceçao](imagem_Exceção.png)

## Descrição das classes de exceção

|Classe|Descrição|
|:-----:|:------:|
|Excecao|Engloba todas as exceções na conversão de String para int|
|ExcecaoX|Verifica e solicita ao usuario um valor que possa ser convertido para int para a coordenada x|
|ExcecaoY|Verifica e solicita ao usuario um valor que possa ser convertido para int para a coordenada y|


