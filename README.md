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
* [Video do Jogo](https://drive.google.com/file/d/1zUWeqz2p2WLOYELaCWBa-N4BP9jXS4rf/view?usp=sharing)
# Slides do Projeto
## Slides da Previa
* [Slide do projeto](https://docs.google.com/presentation/d/1OUHMlqgoMDY4zieyRQ7nLU_UCLnYMEF865pBTfMvgnE/edit?usp=sharing)
## Slides da Apresentação Final
* [Slide final](https://docs.google.com/presentation/d/11QEVWDz5mHV7Hf0p8Hz7kfBu2iKJmkUizKd4TMEI7vo/edit?usp=sharing)
## Relatório de Evolução
Este projeto sofreu diversas alterações ao longo de seu desenvolvimento, tanto alterações simples de atributos básicos das unidades quanto alterações mais complexas que mudavam de maneira significativa a estrutura do programa. Inicialmente, o jogo começou a ser programado com interfaces gráficas muito mais simples em que o tabuleiro e as peças eram feitas em char, de maneira similar ao que foi feito nos programas da dama e do xadrez. Além disso, foi implementada somente uma fase de testes, sem possuir um menu inicial. Nós utilizamos este códico mais simplificado para testar todas as interações de vizinhança entre as peças, descartando as ideias inviáveis e desenvolvendo novas interações. Também utilizamos este código para testar o balanceamento do jogo mudando atributos básicos das peças como "dano", "vida" ou "custo", de maneira a melhorar a experiência do jogador. Após o programa estar rodando perfeitamente nesta interface gráfica simplificada, começamos a implementar a interface gráfica definitiva. Neste processo, acabamos criando novas interfaces e classes que não estavam previstas inicialmente no projeto, como uma interface para criar diferentes fases. Implementamos 3 fases com diferentes unidades e níveis de dificuldade, além de uma área de menu, onde o jogador pode selecionar a fase que ele deseja jogar, e uma página com as instruções de como se jogar o jogo.

Após concluirmos a implementação da interface gráfica final o jogo estava praticamente pronto. Nós nos dedicamos por fm a deixar o layout do jogo o melhor e mais intuitivo possível. Alteramos as posições de botões e de informações na tela, alteramos o modo de se selecionar unidades e criamos telas intermediárias para direcionar o jogador durante o jogo. 

Finalmente, depois destas mudanças finais, o jogo foi concluído.

Cabe ressaltar, que as grandes dificuldades encontradas foram em estruturas de Pattern, e na diagramação de telas. Buscando entender melhor as restrições de cada tipo de Layout, o jogo foi implementado da forma que mais se encaixava nos Layouts escolhidos.

# Destaques de Código
~~~java
...
public void criarTab() {//cria os objetos na matriz de peças, todos primeiramente da classe vazio
	int z=0;
        for (int i=0; i < 6; i++) {
        	for (int j=0; j < 10; j++) {
        		tab[i][j] = new Vazio(z);
        		z++;
        	}
        }
}
~~~


~~~java
...
//aqui construimos uma peça
//mecanica de tirar um celula do lugar e colocar outra,
//destaque pois para uma peça se mover apresenta uma estrutura semelhante
//criar um novo objeto e substituir na matriz de peças e no GridLayout
		x=f.x;
		y=f.y;
		int z;
		  if (f.tab[y][x].nome == '-' ) {
				z= f.tab[y][x].pos;
				pe = new Fabrica(f,z);
					if (f.rec.dinheiro >= pe.custo) {
						f.removerPeca(z);
						f.tab[y][x] = new Fabrica(f,z);
						f.adicionaPeca(f.tab[y][x], z);
						f.rec.alterarRecursos(0, pe.custo);		
					}
					
					
			}
			...
~~~


~~~java
...
public void mostrarRecursos() {//altera na tela os recursos disponiveis
	     
		String s =Integer.toString(dinheiro);
		tab.label1.setText("Recursos disponivel: " + s);
		tab.label1.updateUI();
}
...
~~~


~~~java
...
//criação de um determinado tipo de botao
Icon bot = new ImageIcon("src//assets//menub.png");
		acabou = new JButton(bot);
		acabou.setBounds(425, 500, 150, 75);
		adicionaComando(acabou);
...
~~~


~~~java
...
//parte da execução de rodadas na fase 1
public void continuar() {
		if(f1.vitoria==true) {
			f1.executar();
			if(f1.rodada<f1.fim) {
				novoMonstro = rand.nextInt(6);
				l = f1.tab[novoMonstro][9].pos;
				if(f1.rodada%2==1) {
					f1.entrar(l,novoMonstro,'m');
			}
			else {
					1.entrar(l,novoMonstro,'r');//r de monstro rapido
			}
		}
		...
}
~~~


~~~java
...
//sequencia para a construção de uma determinada peça na fase 1
String[] itens = {"Fabrica - custo 50","Soldado - custo 100"};
		  String selectedValue = (String) JOptionPane.showInputDialog(null,
		          "Escolha um item", "Construir",
		              JOptionPane.INFORMATION_MESSAGE, null,
		                  itens, itens [0]); //
		 
		  if(selectedValue!=null){
			  String stringX   = JOptionPane.showInputDialog("Digite um valor para a coordenda x");
			  String stringY   = JOptionPane.showInputDialog("Digite um valor para a coordenda y");
			  Excecao e = new Excecao(f1);
			  e.verificarPosicao(stringX,stringY);
			  ....
~~~


~~~java
...
//parte da interacao no espaco celular de uma peca inimiga
public void interagir(int posicaoX, int posicaoY){
		if (tabu.tab[posicaoY][posicaoX-1].tipo == "Aliadas" || tabu.tab[posicaoY][posicaoX-1].nome == 'a') {
			if(tabu.tab[posicaoY][posicaoX-1].nome!='e') {
				causarDano(posicaoX, posicaoY, -1, 0, dano);
			}
			
		}...
}
~~~

~~~java
public abstract class Inimigas extends Pecas {//classe pai de todas as classes inimigas
    private static final long serialVersionUID = 1L;
    int dano;
    public Inimigas(String s,int z) {
        super(s,z);
    }
public void causarDano(int posicaoX, int posicaoY, int x, int y, int dano) {
...}
public void interagir(int posicaoX, int posicaoY){
    ...}
public abstract void andar(int posicaoX, int posicaoY, int x, int y, int l);
    public abstract void mover(int posicaoX, int posicaoY);
}
~~~


~~~java
public class Monstro extends Inimigas{
    private static final long serialVersionUID = 1L;
    public Monstro(Tabuleiro tab,int z) {
        super("src\\assets\\monstro1.png",z);
        vida = 2;
        nome = 'm';
        tipo = "Inimigas";
        dano = 1;
        this.tabu = tab;
}...
public void interagir(int posicaoX, int posicaoY) {
        super.interagir(posicaoX, posicaoY);//utilização do interagir da classe Inimigas
    }...
}
~~~


# Destaques de Pattern

O Pattern adotado foi o Action Listener, de modo que determinada ação desencadeava em outra.

## Diagrama do Pattern

![imagem_Pattern](imagem_Pattern.png)

## Código do Patern
~~~java
...
acabou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	dispose();
        		Menu menu = new Menu();
        		menu.iniciarMenu();
            		
            }
        });
	...
~~~
Utilizamos o pattern de modo que o acionamento de cada botão dentro do jogo gerava uma nova ação.
* O botão menu, fecha a tela atual, e abre o menu
* O botão faseX, abre a fase equivalente, sendo X = 1,2,3
* O botão instrucoes, abre a tela de instruções
* O botão construir, permite a construção de uma determinada peça de defesa
* O botão continue, executa novas  rodadas na fase que esta sendo executada

# Conclusões e Trabalhos Futuros
Após finalizarmos o projeto, concluímos que ainda há muito que pode ser explorado dentro deste jogo. A programação das classes assim como a escolha de interfaces foi feita de modo que é fácil de se criar novas fases, assim como novas peças. Muitas ideias de peças foram descartadas ao longo do percurso pois seriam muito demoradas para serem implementadas, mas trariam uma complexidade e diversidade maior para o jogo. Com mais tempo, seria possível implementar essas peças e outras, assim como novas fases. Também gostaríamos de implementar futuramente um modo "construtor" no jogo, em que o jogador conseguiria construir sua própria fase dentro do jogo e jogá-la. Isto seria muito interessante, pois abre um cenário para a criatividade do jogador que não pode ser explorado somente com fase pré-desenvolvidas.

Outra implementação que gostaríamos de fazer futuramente, pois acreditamos que melhoraria muito a jogabilidade, é o mapeamento do percurso mouse, de modo que o jogador conseguisse fazer todas as construções sem utilizar o teclado. Isto deixaria o jogo ainda mais dinâmico e intuitivo de se jogar.
Além disso, esse projeto foi de grandes lições para o que para nós foi o primeiro jogo desenvolvido, pretendemos nos aprofundar mais para que novos projetos possam ser desenvolvidos com uma melhor qualidade, tanto de código, quanto de estética. Cremos que esse projeto possam auxiliar no desenvolvimento de outras aplicações futuramente, uma vez que tivemos a oportunidade de compreendermos melhor conceitos de programação orientada a objetos, e também de ferramentas para o desenvolvimento de aplicações que não fiquem rodando apenas no console de uma IDE ou em um terminal.
# Documentação dos Componentes
# Diagramas

## Diagrama Geral do Projeto

![imagem_diagrama_Geral](imagem_diagrama_Geral.png)

Este diagrama mostra o percurso que o jogador faz ao iniciar o jogo, e quais possibilidades de escolha ele tem. Cada retângulo preto simboliza uma tela do jogo, enquanto os retângulos vermelhos representam os botões presentes em cada tela e para onde eles direcionam o jogador. Ao abrir o jogo, o jogador se depara com um Menu, em que é possível selecionar as intruções (para aprender mais sobre o jogo) ou selecionar uma fase para jogar. Dentro de cada fase está implementado um tabuleiro com características específicas. Nele, o jogador escolhe ou ações de construir(apertando o botão de contruir) ou de continuar(apertando o botão de continuar) até que ele vença ou perca o jogo. Caso ele perca, ele será redirecionado para o Menu após a tela de fim de jogo, mas caso ele ganhe ele poderá jogar a próxima fase em sequencia. Se o jogador ganhar a terceira fase, ele é enviado para uma tela onde é informada de que venceu o jogo.
## Diagrama Geral de Componentes

![imagem_Diagrama_de_componentes](imagem_Diagrama_de_componetes.png)

* Como grande parte das interfaces estão relacionadas com mais de um componente, elas serão detalhadas depois da apresentação de todos os componentes.

## Componente Tabuleiro

Este componente representa todos os tabuleiros gerados no jogo. Ele interage com todas as peças do jogo, já que os tabuleiros possuim uma matriz de peças, interage com o recurso, já que cada tabuleiro possui seus determinados recursos no início do jogo e interage com todas as fases, já que cada fase do jogo nescessariamente possui um tabuleiro.

![imagem_componentes_Tabuleiro](imagem_componentes_Tabuleiro.png)

#### Ficha Técnica

|Item|Detalhamento|
|:-----:|:------:|
|Classes|pt.principal|
|Autores|Pedro Hori Bueno, Matheus Augusto da Silva Cândido|
|Interfaces|ITabuleiro, ITabuleiroDois, ITabuleiroTres|

### Interfaces
Interfaces associadas a esse componente:

~~~java
public interface ITabuleiro{
	
	public void criarTab();
	public void fazerTab(int arvores, int pedras, int lagos, int r, int tempo);
	public void addFundo();
	public void entrar(int l, int posicaoY,char t);
	public void executar();
	public boolean procurarMonstro();
	public void adicionaPeca(Pecas img, int posicao);
	public void removerPeca(int posicao);
	public void adicionaComando (JButton comando);
}
public interface ITabuleiroDois {
	public void entrarDois(int l, int posicaoY);
}
public interface ITabuleiroTres {
	public void entrarTres(int l, int posicaoY);
}
~~~

## Componente Aliadas

Este componente representa todas as peças aliadas do jogo (que o jogador pode construir). Ele interage com o tabuleiro, pois as peças são construidas no tabuleiro, e também interage com o recurso, pois para o jogador construir novas peças aliadas ele gasta uma determinada quantidade de recurso.

![imagem_componentes_Aliadas](imagem_componete_Aliadas.png)

#### Ficha Técnica

|Item|Detalhamento|
|:-----:|:------:|
|Classe|pt.pecas|
|Autores|Pedro Hori Bueno, Matheus Augusto da Silva Cândido|
|Interfaces|IPeças,ITabuleiro,ITabuleiroDois,ITabuleiroTres|

### Interfaces
Interfaces associadas a esse componente:

~~~java
public interface IPecas {
	
	public void interagir(int posicaoX, int posicaoY);
	public void mover(int posicaoX, int posicaoY);
}

public interface ITabuleiro{
	
	public void criarTab();
	public void fazerTab(int arvores, int pedras, int lagos, int r, int tempo);
	public void addFundo();
	public void entrar(int l, int posicaoY,char t);
	public void executar();
	public boolean procurarMonstro();
	public void adicionaPeca(Pecas img, int posicao);
	public void removerPeca(int posicao);
	public void adicionaComando (JButton comando);
}
public interface ITabuleiroDois {
	public void entrarDois(int l, int posicaoY);
}
public interface ITabuleiroTres {
	public void entrarTres(int l, int posicaoY);
}
~~~

## Componente Inimigas

Este componente representa todas as peças inimigas do jogo (os monstros que invadem o tabuleiro). Ele interage com o tabuleiro, pois as peças inimigas surgem no tabuleiro e interagem nele.

![imagem_componentes_Inimigas](imagem_componentes_Inimigas.png)

#### Ficha Técnica

|Item|Detalhamento|
|:-----:|:------:|
|Classe|pt.pecas|
|Autores|Pedro Hori Bueno, Matheus Augusto da Silva Cândido|
|Interfaces|IPeças,ITabuleiro,ITabuleiroDois,ITabuleiroTres|

### Interfaces
Interfaces associadas a esse componente:

~~~java
public interface IPecas {
	
	public void interagir(int posicaoX, int posicaoY);
	public void mover(int posicaoX, int posicaoY);
}

public interface ITabuleiro{
	
	public void criarTab();
	public void fazerTab(int arvores, int pedras, int lagos, int r, int tempo);
	public void addFundo();
	public void entrar(int l, int posicaoY,char t);
	public void executar();
	public boolean procurarMonstro();
	public void adicionaPeca(Pecas img, int posicao);
	public void removerPeca(int posicao);
	public void adicionaComando (JButton comando);
}
public interface ITabuleiroDois {
	public void entrarDois(int l, int posicaoY);
}
public interface ITabuleiroTres {
	public void entrarTres(int l, int posicaoY);
}
~~~


## Componente Neutras

Este componente representa todas as peças neutras do jogo, que são posiconas no tabuleiro quando ele é gerado. Desta forma, este componente também interage com o tabuleiro.

![imagem_componentes_Neutras](imagem_componetes_Neutras.png)

#### Ficha Técnica

|Item|Detalhamento|
|:-----:|:------:|
|Classe|pt.pecas|
|Autores|Pedro Hori Bueno, Matheus Augusto da Silva Cândido|
|Interfaces|IPeças,ITabuleiro,ITabuleiroDois,ITabuleiroTres|

### Interfaces
Interfaces associadas a esse componente:

~~~java
public interface IPecas {
	
	public void interagir(int posicaoX, int posicaoY);
	public void mover(int posicaoX, int posicaoY);
}

public interface ITabuleiro{
	
	public void criarTab();
	public void fazerTab(int arvores, int pedras, int lagos, int r, int tempo);
	public void addFundo();
	public void entrar(int l, int posicaoY,char t);
	public void executar();
	public boolean procurarMonstro();
	public void adicionaPeca(Pecas img, int posicao);
	public void removerPeca(int posicao);
	public void adicionaComando (JButton comando);
}
public interface ITabuleiroDois {
	public void entrarDois(int l, int posicaoY);
}
public interface ITabuleiroTres {
	public void entrarTres(int l, int posicaoY);
}
~~~



## Componente Vazio

Este componente representa todas as peças da classe vazio presentes no tabuleiro, ou seja, todas as células vazias.

![imagem_componentes_Vazio](imagem_componetes_Vazio.png)

#### Ficha Técnica

|Item|Detalhamento|
|:-----:|:------:|
|Classe|pt.pecas|
|Autores|Pedro Hori Bueno, Matheus Augusto da Silva Cândido|
|Interfaces|IPeças,ITabuleiro,ITabuleiroDois,ITabuleiroTres|

### Interfaces
Interfaces associadas a esse componente:

~~~java
public interface IPecas {
	
	public void interagir(int posicaoX, int posicaoY);
	public void mover(int posicaoX, int posicaoY);
}

public interface ITabuleiro{
	
	public void criarTab();
	public void fazerTab(int arvores, int pedras, int lagos, int r, int tempo);
	public void addFundo();
	public void entrar(int l, int posicaoY,char t);
	public void executar();
	public boolean procurarMonstro();
	public void adicionaPeca(Pecas img, int posicao);
	public void removerPeca(int posicao);
	public void adicionaComando (JButton comando);
}
public interface ITabuleiroDois {
	public void entrarDois(int l, int posicaoY);
}
public interface ITabuleiroTres {
	public void entrarTres(int l, int posicaoY);
}
~~~


## Componente Recursos

Este componente representa os recursos necessários para a construção de peças de defesa.

![imagem_componentes_Recursos](imagem_componentes_Recursos.png)

#### Ficha Técnica

|Item|Detalhamento|
|:-----:|:------:|
|Classe|pt.principal|
|Autores|Pedro Hori Bueno, Matheus Augusto da Silva Cândido|
|Interfaces|IRecursos|

### Interfaces
Interfaces associadas a esse componente:
~~~java
public interface IRecursos {
	public void alterarRecursos(int operacao, int valor);
	public void mostrarRecursos();
}

~~~

## Componente Fase1

Este componente representa a fase 1 do jogo. Como a fase um é composta por um tabuleiro, este componente interage com tabuleiro.

![imagem_componentes_Fase1](imagem_componentes_Fase1.png)

#### Ficha Técnica

|Item|Detalhamento|
|:-----:|:------:|
|Classe|pt.principal.fases|
|Autores|Pedro Hori Bueno, Matheus Augusto da Silva Cândido|
|Interfaces|IFases,ITabuleiro|

### Interfaces
Interfaces associadas a esse componente
~~~java
public interface IFases {
	
	public void continuar();
	public void construir();
	
}

public interface ITabuleiro{
	
	public void criarTab();
	public void fazerTab(int arvores, int pedras, int lagos, int r, int tempo);
	public void addFundo();
	public void entrar(int l, int posicaoY,char t);
	public void executar();
	public boolean procurarMonstro();
	public void adicionaPeca(Pecas img, int posicao);
	public void removerPeca(int posicao);
	public void adicionaComando (JButton comando);
}
~~~
## Componente Fase2

Este componente representa a fase 2 do jogo. Como a fase dois é composta por um tabuleiro, este componente interage com tabuleiro. Esta interação ocorre pela interface ITabuleiroDois, que determina os monstros da segunda fase.

![imagem_componentes_Fase2](imagem_componentes_Fase2.png)

#### Ficha Técnica

|Item|Detalhamento|
|:-----:|:------:|
|Classe|pt.principal.fases|
|Autores|Pedro Hori Bueno, Matheus Augusto da Silva Cândido|
|Interfaces|IFases,ITabuleiro,ITabuleiroDois|

### Interfaces
Interfaces associadas a esse componente
~~~java
public interface IFases {
	
	public void continuar();
	public void construir();
	
}

public interface ITabuleiro{
	
	public void criarTab();
	public void fazerTab(int arvores, int pedras, int lagos, int r, int tempo);
	public void addFundo();
	public void entrar(int l, int posicaoY,char t);
	public void executar();
	public boolean procurarMonstro();
	public void adicionaPeca(Pecas img, int posicao);
	public void removerPeca(int posicao);
	public void adicionaComando (JButton comando);
}
public interface ITabuleiroDois {
	public void entrarDois(int l, int posicaoY);
}
~~~

## Componente Fase3

Este componente representa a fase 3 do jogo. Como a fase três é composta por um tabuleiro, este componente interage com tabuleiro. Esta interação ocorre pela interface ITabuleiroTres, que determina os monstros da terceira fase.

![imagem_componentes_Fase3](imagem_componentes_Fase3.png)

#### Ficha Técnica

|Item|Detalhamento|
|:-----:|:------:|
|Classe|pt.principal.fases|
|Autores|Pedro Hori Bueno, Matheus Augusto da Silva Cândido|
|Interfaces|IFases,ITabuleiro,ITabuleiroDois,ITabuleiroTres|

### Interfaces
Interfaces associadas a esse componente
~~~java
public interface IFases {
	
	public void continuar();
	public void construir();
	
}

public interface ITabuleiro{
	
	public void criarTab();
	public void fazerTab(int arvores, int pedras, int lagos, int r, int tempo);
	public void addFundo();
	public void entrar(int l, int posicaoY,char t);
	public void executar();
	public boolean procurarMonstro();
	public void adicionaPeca(Pecas img, int posicao);
	public void removerPeca(int posicao);
	public void adicionaComando (JButton comando);
}
public interface ITabuleiroDois {
	public void entrarDois(int l, int posicaoY);
}
public interface ITabuleiroTres {
	public void entrarTres(int l, int posicaoY);
}
~~~



# Interfaces


## Detalhamento das Interfaces
![imagem_ITabuleiro](Imagem_ITabuleiro.png)
### Interface ITabuleiro


Interface impelementada pela classe Tabuleiro, determinando seu comportamento. Classe Tabuleiro que controla determinadas funções nas três fases.

|Método|Objetivo|
|:-----:|:------:|
|CriarTab|Cria um novo tabuleiro com espaços vazios|
|fazerTab|Configura o tabuleiro adicionando peças neutras, recursos iniciais e a quantidade de rodadas|
|addFundo|Adiciona cada celula no GridLayout|
|entrar|Adiciona monstros da fase 1ao tabuleiro|
|executar|Percorre o tabuleiro fazendo as peças efetuarem suas ações|
|procurarMonstro|Verifica se existem monstros no tabuleiro|
|adicionarPeca|Adiciona uma peça ao tabuleiro|
|removerPeca|Remove uma peça do tabuleiro|
|adicionarComando|Adiciona um botão ao tabuleiro|

### Interface ITabuleiroDois

Interface implementada pela classe TabuleiroDois, classe essa que extende Tabuleiro, e possui também a função de como os monstros da fase dois irão entrar no jogo.

|Método|Objetivo|
|:-----:|:------:|
|entrarDois|Determina como monstros da fase 2 entram no tabuleiro|

### Interface ITabuleiroTres

IInterface implementada pela classe TabuleiroTres, classe essa que extende TabuleiroDois, e tem a capacidade de determinar como os monstros da fase três entram no jogo.

|Método|Objetivo|
|:-----:|:------:|
|entrarTres|Determina como monstros da fase 3 entram no tabuleiro|

![imagem_IPeças](imagem_IPecas.png)

![imagem_Aliadas](imagem_Aliadas.png)

![imagem_Inimigas](imagem_Inimigas.png)

![imagem_Neutras](imagem_Neutras.png)

### Interface IPecas

Interface implementada por todas as peças do jogo, inclusive células vazia. Esta interface permite que todas as células do tabuleiro seja composto por objetos que implementam a mesma interface, possibilitando interações mais simples e eficientes durante o código.

|Método|Objetivo|
|:-----:|:------:|
|interagir|Faz com que uma peça efetue sua interação no tabuleiro|
|mover|Faz com que uma peça efetue seu movimento no tabueliro|

![imagem_ITRecursos](imagem_IRecursos.png)

### Interface IRecursos

Interface implementada pelo recurso do jogo presente em cada uma das fases. Esta interface permite que as devidas operações sejam feitas para altarar a quantidade de recursos e mostrar os recursos que o jogador possui durante a fase.

|Método|Objetivo|
|:-----:|:------:|
|alterarRecursos|Altera os recursos do jogador|
|mostrarRecursos|Altera o label de recursos que aparece na tela|

![imagem_IFases](imagem_IFases.png)

### Interface IFases

Interface implementada pelas fases do jogo. Esta interface permite ao jogador fazer ações durante a fase, um elemento central do jogo.

|Método|Objetivo|
|:-----:|:------:|
|continuar|Avança em um a rodada de determinada fase e faz todas as peças do tabuleiro efetuarem suas interações ou moverem|
|construir|Permite que o jogador construa unidades no tabueliro|

![imagem_IJanela](imagem_IJanela.png)

### Interface IJanela

Interface implementada pelas janelas abertas do jogo. Esta interface possibilita a criação de novas janelas do jogo.

|Método|Objetivo|
|:-----:|:------:|
|janelaVisual|Cria o design de determinadas janelas do jogo|


# Plano de Exceções
## Diagrama da Hierarquia de excessões

![imagem_Exceçao](imagem_Exceção.png)

## Descrição das classes de exceção

|Classe|Descrição|
|:-----:|:------:|
|Excecao|Engloba todas as exceções na conversão de String para int|
|ExcecaoX|Verifica e solicita ao usuario um valor que possa ser convertido para int para a coordenada x|
|ExcecaoY|Verifica e solicita ao usuario um valor que possa ser convertido para int para a coordenada y|


