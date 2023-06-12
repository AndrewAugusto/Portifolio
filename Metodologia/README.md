# Andrew Augusto Dias Santos

## Introdução

<img src="https://avatars.githubusercontent.com/u/81338441?v=4" height="250" width="250"/>

   Olá, Sou Andrew Santos, tenho 23 anos, atualmente concluindo graduação em Banco de Dados, trabalho como Desenvolvedor Full Stack (Com foco em Node e React) com o SAP Business One, anteriormente trabalhei 
como Analista Desenvolvedor utilizava as linguagens NodeJS e C#. Apesar do pouco tempo de experiência como Desenvolvedor, já consegui aprender bastante e estou muito empolgado em continuar 
a aprimorar minhas habilidades e crescer na área. Acredito que a constante busca por conhecimento e a prática constante são fundamentais para se tornar um bom Desenvolvedor, e estou sempre 
em busca de novos desafios e oportunidades para me desenvolver.

<br>

## Meus principais conhecimentos

### JavaScript  <img src="https://github.com/devicons/devicon/blob/master/icons/javascript/javascript-original.svg" width="30" height="30" />   
### Java  <img src="https://github.com/devicons/devicon/blob/master/icons/java/java-original.svg" width="30" height="30" /> 

<br>

## Projetos Integradores durante a graduação 
   Durante a minha gradução, trabalhei no desenvolvimento de trabalhos chamados de API "Aprendizagem por Processos Integrados". Um projeto integrador tem o objetivo de solucionar um
problema do mundo real.

<br>

## Projeto I

<details>
  
<summary>
         Mais Detalhes do Projeto I
</summary>

# Assistente Virtual - Ibet

<br>

![image](https://user-images.githubusercontent.com/80988756/218878798-d33629bc-acf9-4edb-b463-b14fd8a90404.png)

##### *Figura 01. Logo Fatec - Profº Jassen Vidal*

   A Fatec é uma Faculdade Pública Estadual e todos os cursos oferecidos são gratuitos. De uma forma geral a formação do Tecnólogo, além de aspectos técnicos, envolve também, uma base de 
caráter social, ético, filosófico e ambiental que faz deste cidadão um profissional ciente de sua inserção e responsabilidades no meio social que integra.

![image](https://github.com/criskurim/CodeYCode/blob/main/Imagens/logo-removebg-preview.png)

##### *Figura 02. Logo do Projeto Ibet Assistente*

### Visão do Projeto

   A assistente Ibet foi criada com a ideia de ser uma assistente virtual que auxilia o usuário na busca por informações relacionadas a esportes. Entre as funcionalidades que ela possui algumas delas são definição de alarmes para jogos, placares de jogos ao vivo e jogos antigos, vídeos entre outros. O diferencial da aplicação é o retorno de informações entregando o máximo de interatividade ao cliente sem a necessidade de digitar ou clicar em nenhuma informação. Todas as funcionalidades são ativas por comando de voz.

#### Requisitos do Projeto
	
* Acionamento por comando de voz;
* 8 funcionalidades distintas;
* Ser mobile, web ou desktop;
* Retornar o comando em qualquer forma (som, texto ou ação);
* Ter um contexto específico de aplicação;
* Não pode usar 100% de APIs prontas e disponíveis no mercado.

Dessa forma, foi desenvolvido a IBet.

Link do repositório do projeto: https://github.com/AndrewAugusto/Ibet_Assistente

### Tecnologias adotadas no Projeto

<div style="display: inline_block">
  <img src="https://raw.githubusercontent.com/devicons/devicon/1119b9f84c0290e0f0b38982099a2bd027a48bf1/icons/python/python-original-wordmark.svg" width="100"    height="100" />
  <img src="https://github.com/devicons/devicon/blob/master/icons/sqlite/sqlite-original.svg" width="100" height="100" />
</div>

## Contribuições Pessoais

   Fui responsável pela implementação da tecnologia de reconhecimento de voz na API, criei um algoritmo para possibilitar a execução do serviço em segundo plano (Modo Standy By) para ser 
acionada somente quando chamada.

<details open><summary>Informações código Back-End</summary>
 
   1. Algoritmo para reconhecimento de voz.
     
   ```python
   
   def ouvir_microfone():
    microfone = SpeechRecognition.Recognizer()
    with SpeechRecognition.Microphone() as source:
        microfone.adjust_for_ambient_noise(source)
        audio = microfone.listen(source)
        try:
            frase = microfone.recognize_google(audio, language='pt-BR')
            return frase
        except SpeechRecognition.UnknownValueError:
            return "Não entendi!"   
	    
   ```
     
   O primeiro passo foi criar uma instância do objeto Recognizer() da biblioteca SpeechRecognition. Em seguida, a função entra em um bloco "with" para configurar e usar o microfone como fonte de 
entrada de áudio.
Dentro do bloco "with", o método "adjust_for_ambient_noise()" é chamado para ajustar automaticamente o nível de ruído de fundo para melhorar a precisão da transcrição.
Em seguida, o método "listen()" é chamado para gravar o áudio da fonte (microfone) e armazená-lo na variável "audio".
Depois disso, a função tenta transcrever o áudio em texto usando a API do Google Speech Recognition (recognize_google), especificando a linguagem de entrada como "pt-BR" (português do
Brasil).
Se a transcrição for bem-sucedida, o texto é armazenado na variável "frase" e retornado pela função. Caso contrário, se o reconhecimento de fala falhar ou não for compreendido, a função 
retornará a mensagem "Não entendi!".

<details close></summary></summary>

Click aqui [GitHub]([https://github.com/Doc-Docker/APIMidAll) para mais detalhes. 
	
- O link acima traz detalhes da implementação da classe de serviço responsável por reconhecimento de voz.
	
</details>

</details>   

   Por ser uma assistente foi levado em consideração a necessidade de ser executada em segundo plano e ativa assim que chamada, evitando ao máximo a interação fisica (Entrada de informações via teclado ou mouse) do usuário com a aplicação.

 <details open><summary>Informações código Front-End</summary>
  
   1. Trecho do código responsável de receber o retorno do back-end, da explicação citada acima.
     
   ```js
   
        this.total = this.noDiscount += (element.price  * element.quantidade);

        this.service.getDiscount(this.id, this.quantidade, this.total, this.categoria).subscribe(
            response =>
            { const product : Product = new Product();
              this.discount = response;
              this.product.discount = this.discount
              this.finalPrice = this.finalPrice += (element.price * element.quantidade)-(this.discount)
              console.log("teste", this.categoria)
            errorResponse => console.log(errorResponse)
        })
    });
         
         ...
         
         return new ResponseEntity<>(desconto, HttpStatus.OK);     
   ```
	
   - Esse método é responsável por passar os parâmetros para o back-end, processar a informação e direcionar o retorno para a camada de visualização do usuário,
  sendo um trecho importante pois enviar dados, processa o retorno e já devolve os resultados para usuário.
    
<details close></summary></summary>

Click aqui [GitHub](https://github.com/Doc-Docker/APIMidAll/blob/main/frontend-midall/src/app/cart.service.ts) para mais detalhes 😃

- O link acima traz detalhes da implementação do método responsável por enviar a requisição para back-end. 

</details>

</details> 

## Aprendizados Efetivos

* Realizei meu primeiro contato com a linguagem de programação Python.
* Adquiri compreensão da metodologia ágil Scrum, buscando entender e aplicar seus conceitos.
* Optei pelo paradigma de programação imperativo na construção do projeto, seguindo uma abordagem estrutural.
* Iniciei meu aprendizado em lógica de programação, buscando encontrar as melhores soluções computacionais para a resolução de problemas.
* Introduzi as primeiras estruturas de dados utilizadas no projeto, com base na linguagem Python.
* Comunicação uma habilidade que está em constante desenvolvimento. 

#### Hard Skills Desenvolvidas

- Desenvolvimento de aplicações back-end em Python;
- Criação de uma API;
- Versionamento de repositório git;
- Definir a arquitetura de um sistema de acordo com seus requisitos funcionais e não funcionais;
- Desenvolvimento com integração a um banco de dados relacional.

</details>

## Projeto II

<details>
  
<summary>
	Mais Detalhes do Projeto II
</summary>

# SGBD (Sistema de Gerenciamento de Banco de Dados)

### Parceiro Acadêmico
	
<br/>
	
<img src="https://user-images.githubusercontent.com/80851038/133914328-794317fa-31e1-4279-afb0-d986acb5db45.png" alt="440" width="300"/>

##### *Figura 01. Logo Necto System Fonte(www.necto.com.br)*

A empresa Necto System situada no Parque Tecnológico de São José dos Campos, propôs o seguinte desafio baseado na metodologia ágil Scrum.

### Visão do Projeto

   Desenvolvido uma integração para coleta de informações do servidor para geração de série histórica. A ideia foi desenvolver uma aplicação para coletar métricas periodicamente de um ou mais Sistemas Gerenciadores de Banco de Dados remoto. Através desta ferramenta o usuário terá informações para tomar decisões quanto a necessidade de manutenções, balanceamento e aumento de capacidade e melhoria no seus SGBDs, databases e na sua infra (Servidores).

Link do repositório do projeto: https://github.com/apibanco/Vigilant

### Tecnologias adotadas na solução

* **Back-end:** Java e Spring-Boot
* **Front-end:** Angular, CSS, Bootstrap
* **Banco de Dados:** Po

## Contribuições Pessoais

   Fui responsável pela implementação da lógica para conexão da integração ao Banco de dados para a coleta de parametrizações periodicamente, toda a criação de querys para retorno de dados e criação de procedures.

<details open><summary>Informações código Back-End</summary>
    
   1. Algoritmo de conexão com o Banco de Dados (Postgress).
     
   ```js
   
	   public conexao(){
			url = "jdbc:postgresql://localhost:5432/teste";
			usuario = "postgres";
			senha = "toto190100";

			try {
				Class.forName("org.postgresql.Driver");
				con = DriverManager.getConnection(url,usuario,senha);
				System.out.println("Conexão realizada com sucesso!!!");
			} catch (Exception e) {
				e.printStackTrace();
			}
			ExibirTamanhoTabelas(con);
	
	public static void ExibirTamanhoTabelas(Connection con) {
		String sql = "SELECT 
				esquema, 
				tabela,
				pg_size_pretty(pg_relation_size(esq_tab)) AS tamanho,
				pg_size_pretty(pg_total_relation_size(esq_tab)) AS tamanho_total,
			      FROM 
				(SELECT 
				    tablename AS tabela,
				    schemaname AS esquema,
				    schemaname||'.'||tablename AS esq_tab
				FROM
				    pg_catalog.pg_tables
				WHERE 
				    schemaname NOT IN ('pg_catalog', 'information_schema', 'pg_toast') ) AS x
				ORDER BY 
				    pg_total_relation_size(esq_tab) DESC; ";

		try {
			PreparedStatement pesquisa = con.prepareStatement(sql);
			ResultSet result = pesquisa.executeQuery();
			while(result.next()) {
				System.out.println("NOME: " + result.getString("tabela"));
				System.out.println("TAMANHO: "+result.getString("tamanho"));
				System.out.println("TAMANHO TOTAL: " + result.getString("tamanho_total"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
   ```
   
   Na primeira parte do código, são definidas as informações necessárias para a conexão com o banco de dados local. A variável "url" contém a URL de conexão com o banco, a porta padrão do PostgreSQL e o nome do banco de dados.

Em seguida, dentro de um bloco try-catch, o código tenta estabelecer a conexão com o banco de dados. A linha Class.forName("org.postgresql.Driver") carrega dinamicamente o driver JDBC necessário para se comunicar com o PostgreSQL. Em seguida, DriverManager.getConnection(url,usuario,senha) estabelece a conexão com o banco de dados usando as informações fornecidas. Se a conexão for estabelecida com sucesso, a mensagem "Conexão realizada com sucesso!!!" é exibida. Caso ocorra algum erro durante a conexão, a exceção é capturada e o rastreamento de pilha do erro é impresso.

Após a conexão ser estabelecida, há uma chamadas de método chamando "ExibirTamanhoTabelas". Esse método exibe o tamanho das tabelas do banco de dados através de um retorno de uma query consultando através da conexão realizada.
	
<details close></summary></summary>

Click aqui [GitHub]([https://github.com/apibanco/Vigilant]) para mais detalhes

</details>

</details>   

- Participei também da integração da chamada de todos os métodos do Back-End, criando alguns métodos e realizando testes para validação das requisições.

 <details open><summary>Informações código Front-End</summary>
  
   1. Trecho do código responsável de receber o retorno do back-end, da explicação citada acima.
     
   ```js
   
        public class Principal {

		public static void main(String[] args) throws IOException {
			LoginModel loginModel = LoginController.PreencherLogin();
			Menu menu = new Menu(loginModel);
			Properties prop = LoginController.getProp();
			String openMenu = prop.getProperty("openMenu");

			if (openMenu.equals("y")) {
				menu.startmenu();
			} else {
				ImprimeMetricas imprimeMetricas = new ImprimeMetricas(loginModel);
				imprimeMetricas.tamanhobancos();
				imprimeMetricas.tamanhoTabelas();
				imprimeMetricas.selectsChamadas1000x();
				imprimeMetricas.SelectMaisDemoradas();
				imprimeMetricas.selectsMaisDemoradasMedia();
				imprimeMetricas.conflicts();
			}
		}
	}
	
   ```

O código é uma classe Java chamada "Principal" com um método "main". O método "main" é o ponto de entrada principal do programa Java e recebe um array de strings como argumento.
Na primeira parte do código, uma instância da classe "LoginModel" é criada chamada "loginModel", e o método estático "PreencherLogin()" da classe "LoginController" é chamado para preencher os dados do login.
Em seguida, uma instância da classe "Menu" chamada "menu" é criada, passando o objeto "loginModel" como argumento para o construtor da classe "Menu".
A próxima linha cria uma instância da classe "Properties" chamada "prop" e chama o método estático "getProp()" da classe "LoginController" para obter um objeto "Properties".
Em seguida, a propriedade chamada "openMenu" é recuperada do objeto "Properties" e armazenada na variável "openMenu" como uma string.
Em seguida, o código verifica se o valor da variável "openMenu" é igual a "y". Se for, o método "startmenu()" é chamado no objeto "menu". Caso contrário, uma instância da classe "ImprimeMetricas" chamada "imprimeMetricas" é criada, passando o objeto "loginModel" como argumento para o construtor. Em seguida, vários métodos são chamados nessa instância, como "tamanhobancos()", "tamanhoTabelas()", "selectsChamadas1000x()", "SelectMaisDemoradas()", "selectsMaisDemoradasMedia()" e "conflicts()". Esses métodos provavelmente realizam diferentes operações relacionadas a métricas e análises de um sistema.

<details close></summary></summary>

</details>

</details> 

## Aprendizados Efetivos

- Durante o desenvolvimento do projeto, tive uma valiosa oportunidade de adquirir conhecimentos sobre sistemas de gerenciamento de banco de dados (SGBDs), o que me permitiu coletar e manipular informações de forma eficiente para gerar séries históricas e métricas relevantes para os usuários da aplicação.
- Essa experiência enriqueceu minhas habilidades na manipulação de dados em ambientes de banco de dados, aprimorando minha capacidade de criar consultas SQL e utilizar outros comandos para obter informações específicas e significativas. Além disso, tive a chance de explorar e familiarizar-me com ferramentas de gerenciamento de banco de dados, como o PostgreSQL, e aprendi a utilizá-las de maneira altamente efetiva.
- Essa contribuição foi fundamental para o desenvolvimento da aplicação, pois fui capaz de criar consultas e rotinas que permitiram a coleta de métricas importantes, como o tamanho das tabelas e do próprio banco de dados. Essas métricas forneceram insights valiosos aos usuários, permitindo-lhes compreender melhor o estado e a evolução do sistema, bem como tomar decisões informadas baseadas nesses dados.
- Ao longo desse processo, pude aprimorar minha compreensão dos princípios fundamentais de um SGBD, bem como a importância de estruturar e organizar os dados de maneira adequada para facilitar a manipulação e a análise posterior. Essa experiência também me ensinou a importância de otimizar consultas e operações de banco de dados, visando a melhorar o desempenho e a eficiência geral do sistema.
- Como resultado, minha contribuição no projeto envolveu não apenas a coleta e manipulação de dados, mas também a criação de um ambiente de banco de dados robusto e eficiente, que se mostrou fundamental para o sucesso da aplicação como um todo. Essa experiência me proporcionou um conhecimento valioso e uma base sólida para futuros projetos que envolvam o gerenciamento de dados e o uso de SGBDs.

</details>

## Projeto III

<details>
  
<summary>
	 Mais Detalhes do Projeto III
</summary>

# Motor de Regra de Promoções

### Parceiro Acadêmico

<br/>

![image](https://static.wixstatic.com/media/456d95_d8bfdcb4942b46c69950e9616742df4e~mv2.png/v1/fill/w_156,h_124,al_c,q_85,usm_0.66_1.00_0.01,enc_auto/Logo%20MidAll.png)

##### *Figura 01. Logo MidAll Fonte(www.midall.com.br)*

   A empresa MidAll situada no Parque Tecnológico de São José dos Campos, propôs o seguinte desafio baseado na metodologia ágil Scrum.

### Visão do Projeto

   A empresa parceira MidAll tem um problema para criação de promoções em E-commerce. A ideia foi criar um motor de regras com uma interface onde as regras das promoções possam ser 
cadastradas.

Link do repositório do projeto: https://github.com/Doc-Docker/APIMidAll

### Tecnologias adotadas na solução

* **Back-end:** Java e Spring-Boot
* **Front-end:** Angular, CSS, Bootstrap
* **Banco de Dados:** SQLite

## Contribuições Pessoais

   Fui responsável pela implementação da lógica do motor de regras da API, criei um algoritmo capaz de calcular os valores recebidos como parâmetro, devolvendo como resultado a melhor 
promoção a ser aplicada no carrinho de compras

<details open><summary>Informações código Back-End</summary>
  
   1. Algoritmo de cálculo de valores das promoções.
     
   ```js
   
   public ResponseEntity<?> retornaProdutoPromocao(@RequestBody Integer id, Integer quantidade, Integer total, Integer categoria) {
		       List<ProductPromotion> promotios = productPromotionRepository.findAll();
		       List<ProductPromotion> productPromotion = new ArrayList<ProductPromotion>();

		       Product product = productService.findById(id);
		       productPromotion.addAll(product.getProductPromotions());
		       int new = productPromotion.size();
         
         ...
         
         return new ResponseEntity<>(desconto, HttpStatus.OK);     
   ```
   
   Consumido na camada controller através de um método com uma anotação HTTP, no caso dessa requisição foi utilizado o verbo Post. 
     
   O algoritmo mostrado é responsável por receber os parâmetros vindos do front end, esses parâmetros são filtrados por algumas condições, verificando o melhor valor de retorno para uma 
   determinado produto que esteja em uma promoção, esse retorno é devolvido para camada controller que por sua vez devolve o resultado para a interface.

<details close></summary></summary>

Click aqui [GitHub]([https://github.com/Doc-Docker/APIMidAll) para mais detalhes
	
- O link acima traz detalhes da implementação da classe de serviço responsável por todos os métodos da promoção

</details>

</details>   

- Participei de forma efetiva da integração do Front-End com Back-End, criando alguns métodos e realizando testes para validação das requisições.

 <details open><summary>Informações código Front-End</summary>
    
   1. Trecho do código responsável de receber o retorno do back-end, da explicação citada acima.  
     
   ```js
   
        this.total = this.noDiscount += (element.price  * element.quantidade);

        this.service.getDiscount(this.id, this.quantidade, this.total, this.categoria).subscribe(
            response =>
            { const product : Product = new Product();
              this.discount = response;
              this.product.discount = this.discount
              this.finalPrice = this.finalPrice += (element.price * element.quantidade)-(this.discount)
              console.log("teste", this.categoria)
            errorResponse => console.log(errorResponse)
        })
    });
         
         ...
         
         return new ResponseEntity<>(desconto, HttpStatus.OK);    
 
   ```
 
  - Esse método é responsável por passar os parâmetros para o back-end, processar a informação e direcionar o retorno para a camada de visualização do usuário, sendo um trecho importante 
pois enviar dados, processa o retorno e já devolve os resultados para usuário. 

<details close></summary></summary>

Click aqui [GitHub](https://github.com/Doc-Docker/APIMidAll/blob/main/frontend-midall/src/app/cart.service.ts) para mais detalhes :)

- O link acima traz detalhes da implementação do método responsável por enviar a requisição para back-end. 

</details>

</details> 

- Participei de forma efetiva na implementação de DTO's.

 <details open><summary>Informações código Front-End</summary>
    
   ```js

	@AllArgsConstructor
	@NoArgsConstructor
	@Data
	@EqualsAndHashCode(of={"id"})
	public class ProductDTO implements Serializable {
	    private static final long serialVersionUID = 1L;
	    private Integer id;

	    @NotBlank(message = "Name is required")
	    private String name;

	    @PositiveOrZero(message = "Price must be a value higher or equal to 0")
	    private Double price;

	    private List<CategoryDTO> categories = new ArrayList<>();

	    public ProductDTO(Product product) {
		this.id = product.getId();
		this.name = product.getName();
		this.price = product.getPrice();
	    }

	}
 
   ```
 
O código acima define uma classe chamada ProductDTO no pacote com.backend.backend.dto. Essa classe representa um objeto de transferência de dados (DTO) para a entidade Product.
A classe ProductDTO implementa a interface Serializable, o que permite que os objetos dessa classe sejam serializados e desserializados.
A classe possui os seguintes campos:

- id: um campo do tipo Integer que representa o identificador do produto.
- name: um campo do tipo String que representa o nome do produto. É anotado com @NotBlank para garantir que não esteja em branco.
- price: um campo do tipo Double que representa o preço do produto. É anotado com @PositiveOrZero para garantir que seja maior ou igual a zero.
- categories: uma lista de objetos CategoryDTO, representando as categorias associadas ao produto. É inicializada como uma lista vazia.

A classe possui os seguintes construtores e anotações:

- @AllArgsConstructor e @NoArgsConstructor: anotações do Lombok que geram automaticamente construtores com e sem argumentos, respectivamente.
- @Data: anotação do Lombok que gera automaticamente getters, setters, toString, equals e hashCode para todos os campos da classe.
- @EqualsAndHashCode(of={"id"}): anotação do Lombok que gera automaticamente os métodos equals e hashCode, considerando apenas o campo id.

Além disso, a classe possui um construtor adicional que recebe um objeto Product. Esse construtor é usado para converter um objeto Product em um objeto ProductDTO, copiando os valores do Product para as variáveis correspondentes em ProductDTO.

Essa classe é usada para transferir informações específicas de um produto entre diferentes partes de uma aplicação, geralmente em operações de criação, leitura, atualização e exclusão (CRUD) ou em serviços de API.

<details close></summary></summary>

Click aqui [GitHub]([https://github.com/Doc-Docker/APIMidAll/blob/main/frontend-midall/src/app/cart.service.ts](https://github.com/AndrewAugusto/APIMidAll/blob/main/backend-midall/src/main/java/com/backend/backend/dto/ProductDTO.java)) para mais detalhes :)

</details>

</details> 

## Aprendizados Efetivos

   A integração do projeto com as matérias do semestre se deu em diversas frentes. A mais importante delas foi na disciplina de Engenharia de Software. Durante o semestre de desenvolvimento 
deste trabalho, iniciamos o aprendizado sobre diversos padrões de projeto nesta disciplina, pela primeira vez. Com isso, pela primeira vez nos preocupamos em separar nosso programa que se 
tornaria o produto em camadas, seguir padrões de arquitetura, torná-lo componentizável e seguindo modos de construção comuns aos utilizados no mercado e comunidade. Foi o passo inicial de 
estudo sobre tais competências tão importantes para qualquer desenvolvedor de software.
outros aprendizados também importantes precisam ser mencionados:
Durante o desenvolvimento do projeto, a performance do sistema foi uma questão central em seu desenvolvimento.
Possuíamos uma base de dados minimamente volumosa, e precisávamos calcular diversos fatores de todos os seus registros. Com isso, precisávamos pensar em formas mais eficientes em 
processamento para garantir uma resposta rápida e confiável ao nosso usuário final. A evolução nos algoritmos de análise de dados com o passar do projeto é algo que foi de grande valia para 
a nossa formação como profissionais desenvolvedores.

#### Hard Skills Efetivamente Desenvolvidas

No mais, o conhecimento adquirido neste projeto pode ser resumido da seguinte forma:

- Desenvolvimento de aplicações back-end em Java: Sei fazer com ajuda.
- Criação de uma API HTTP que gerencia requests e respostas para um cliente: sei fazer com autonomia
- Versionamento de repositório git: Sei fazer com autonomia.
- Importação de dados de diferentes fontes e análises gerais sobre o conteúdo importado: sei fazer com ajuda
- Definir a arquitetura de um sistema de acordo com seus requisitos funcionais e não funcionais: sei fazer com ajuda
- Desenvolvimento com integração a um banco de dados relacional: Sei fazer com autonomia

#### Soft Skills Efetivamente Desenvolvidas

- **Comunicação**: uma habilidade que está em constante desenvolvimento, e não foi diferente nesta etapa onde foi necessário apresentar o projeto para o cliente e professores avaliadores. 
Além de ser necessário para manter um esquema organizacional eficiente, ativo e funcional entre os integrantes da equipe. 
- **Gestão de Tempo**: por ser o primeiro projeto em parceria com um cliente real no curso de Banco de Dados, uma empresa parceira da universidade, com prazos mais curtos para um 
desenvolvimento mais complexo e com mais requisitos, o controle do tempo foi necessário para cumprir com as entregas nos prazos determinados, buscando otimizar a eficiência.
- **Gerenciamento de projetos**: muitas vezes o melhor caminho pode não ser o mais claro ou o mais fácil, portanto a tomada de decisões de forma assertiva foi uma habilidade crítica para o 
desenvolvimento do projeto.

</details>

## Projeto IV

<details>
  
<summary>
	Mais Detalhes do Projeto IV
</summary>

# Sistema de abertura de chamados de suporte com níveis diferentes de acesso

### Parceiro Acadêmico
	
<br/>

![image]([https://static.wixstatic.com/media/456d95_d8bfdcb4942b46c69950e9616742df4e~mv2.png/v1/fill/w_156,h_124,al_c,q_85,usm_0.66_1.00_0.01,enc_auto/Logo%20MidAll.png](https://static.wixstatic.com/media/28f919_850cdd0bc47d4fbd8aa3eeb79db23bf3~mv2.png/v1/fill/w_144,h_50,al_c,q_85,usm_0.66_1.00_0.01,enc_auto/Subiter_NovoLogoCol.png))

##### *Figura 01. Logo Subiter Fonte(https://www.subiter.com)*

   Estamos enfrentando um desafio significativo no que diz respeito à sincronização dos dados administrativos, financeiros e operacionais relacionados aos serviços que nossa empresa oferece. A falta de organização desses dados tem causado lentidão no atendimento aos chamados, além de gerar confusão na interpretação dos indicadores comerciais e financeiros

### Visão do Projeto

   A empresa parceira MidAll tem um problema para criação de promoções em E-commerce. A ideia foi criar um motor de regras com uma interface onde as regras das promoções possam ser 
cadastradas.

Link do repositório do projeto: https://github.com/Doc-Docker/APIMidAll

### Tecnologias adotadas na solução

* **Back-end:** Java e Spring-Boot
* **Front-end:** Angular, CSS, Bootstrap
* **Banco de Dados:** SQLite

## Contribuições Pessoais

   Fui responsável pela implementação da lógica do motor de regras da API, criei um algoritmo capaz de calcular os valores recebidos como parâmetro, devolvendo como resultado a melhor 
promoção a ser aplicada no carrinho de compras

<details open><summary>Informações código Back-End</summary>
     
   ```js
   
	   public Chamado updateChamadoById(Integer id, Chamado chamado) {
			Chamado chamadoSelector = this.getChamadoById(id);

			String Ns = chamadoSelector.getAgendamento().getNumerosSerie();
			String Ns = "";
			if(chamadoSelector.getAgendamento() != null) {
				Ns = chamadoSelector.getAgendamento().getNumerosSerie();
			}


			EquipamentoSerie equipamentoSerie = this.equipamentoSerie.getById(Ns);

			if (chamado.getSituacaoChamado().equals("F") || chamado.getSituacaoChamado().equals("f")) {
				equipamentoSerie.setDisponibilidade(true);
				chamadoSelector.setEncerramentoChamado(LocalDate.now());
				this.equipamentoSerie.save(equipamentoSerie);
			}
			chamadoSelector.setCriticidadeChamado(chamado.getCriticidadeChamado());
			chamadoSelector.setDataChamado(chamado.getDataChamado());
			chamadoSelector.setDescricaoChamado(chamado.getDescricaoChamado());
			chamadoSelector.setSituacaoChamado(chamado.getSituacaoChamado());
			chamadoSelector.setSolucaoChamado(chamado.getSolucaoChamado());

			return chamadoRepository.save(chamadoSelector);
		}  

   ```
   
Este código é um método de atualização de chamado em uma aplicação. Vou explicar o que cada parte faz:

- O método recebe dois parâmetros: um ID do chamado a ser atualizado (representado por um número inteiro) e um objeto Chamado contendo as novas informações para atualização.
Chamado chamadoSelector = this.getChamadoById(id); - Esta linha obtém o chamado existente com o ID fornecido usando um método getChamadoById (que não está presente neste trecho de código). O chamado original é armazenado na variável chamadoSelector.

- String Ns = chamadoSelector.getAgendamento().getNumerosSerie(); - Esta linha extrai o número de série (atributo numerosSerie) do objeto Agendamento dentro do chamado selecionado e o armazena na variável Ns.

- String Ns = ""; - Parece haver um erro neste trecho, pois a variável Ns já foi declarada anteriormente.

- if(chamadoSelector.getAgendamento() != null) { Ns = chamadoSelector.getAgendamento().getNumerosSerie(); } - Esta condição verifica se o objeto Agendamento dentro do chamado selecionado não é nulo. Se não for nulo, o número de série é atribuído à variável Ns.

- EquipamentoSerie equipamentoSerie = this.equipamentoSerie.getById(Ns); - Aqui, é obtido um objeto EquipamentoSerie com base no número de série obtido. O método getById (que pertence a uma instância de equipamentoSerie, provavelmente uma classe) é usado para obter o objeto correspondente ao número de série.

- if (chamado.getSituacaoChamado().equals("F") || chamado.getSituacaoChamado().equals("f")) { ... } - Esta condição verifica se a situação do chamado recebido é igual a "F" ou "f". Se for, o seguinte bloco de código será executado:

  a. equipamentoSerie.setDisponibilidade(true); - Define a disponibilidade do objeto equipamentoSerie como verdadeira.

  b. chamadoSelector.setEncerramentoChamado(LocalDate.now()); - Define a data de encerramento do chamado selecionado como a data atual (representada por LocalDate.now()).

  c. this.equipamentoSerie.save(equipamentoSerie); - Salva as alterações feitas no objeto equipamentoSerie no banco de dados ou em algum outro local de armazenamento.

As linhas seguintes atualizam várias propriedades do chamado selecionado com os valores fornecidos no objeto chamado.
- return chamadoRepository.save(chamadoSelector); - Por fim, o chamado selecionado, com todas as atualizações realizadas, é salvo utilizando o método save de um repositório chamado chamadoRepository (que não está presente neste trecho de código), e o chamado atualizado é retornado.

<details close></summary></summary>

Click aqui [GitHub]([https://github.com/Doc-Docker/APISubiter]) para mais detalhes

</details>

</details>   

- Participei de forma efetiva da integração do Front-End com Back-End, criando alguns métodos e realizando testes para validação das requisições.

 <details open><summary>Informações código Front-End</summary>
       
   ```js
   
        import {http} from './config'
	export default{
	    listar:(token) =>{
		return http.get('/chamados', {headers:{Authorization: `Bearer ${token}`}})
	    },
	    salvar:(suporte)=>{
		return http.post('/chamados', suporte)
	    },
	    deletar:(id)=>{
		return http.delete('/chamados/' + id)
	    },

	    atualizar:(chamado)=>{
		return http.patch('/chamados/' + chamado.id , chamado)
	    atualizar:(chamado, id, token)=>{
		return http.patch('/chamados/' + id , chamado, {headers:{Authorization: `Bearer ${token}`}})
	    },

	    listarEquipamentosDisponiveis:(token) =>{
		return http.get('/equipamento-serie/disponivel', {headers:{Authorization: `Bearer ${token}`}})
	    } ,

	    salvarAgendamento:(agendamento, token)=>{
		return http.post('/agendamento', agendamento, {headers:{Authorization: `Bearer ${token}`}})
	    }
	}
         
   ```
- listar:(token) => { ... } - Esta função faz uma solicitação GET para obter a lista de chamados. Recebe um parâmetro token que é utilizado para autenticar a requisição. A URL para a solicitação GET é '/chamados', e o token de autorização é passado no cabeçalho da requisição.

- salvar:(suporte) => { ... } - Esta função faz uma solicitação POST para salvar um novo chamado. Recebe um objeto suporte contendo as informações do chamado a ser salvo. A URL para a solicitação POST é '/chamados', e o objeto suporte é passado como corpo da requisição.

- deletar:(id) => { ... } - Esta função faz uma solicitação DELETE para excluir um chamado com base em seu ID. Recebe um parâmetro id que representa o ID do chamado a ser excluído. A URL para a solicitação DELETE é '/chamados/' + id, onde o ID é concatenado à URL.

- atualizar:(chamado) => { ... } - Esta função faz uma solicitação PATCH para atualizar um chamado existente. Recebe um objeto chamado contendo as informações atualizadas do chamado. A URL para a solicitação PATCH é '/chamados/' + chamado.id, onde o ID do chamado é concatenado à URL, e o objeto chamado é passado como corpo da requisição.

- atualizar:(chamado, id, token) => { ... } - Esta função é uma versão modificada da função atualizar, que inclui um parâmetro adicional token para autenticar a requisição. Recebe um objeto chamado contendo as informações atualizadas do chamado, um parâmetro id que representa o ID do chamado a ser atualizado e um parâmetro token para autenticação. A URL para a solicitação PATCH é '/chamados/' + id, onde o ID é concatenado à URL, o objeto chamado é passado como corpo da requisição, e o token de autorização é passado no cabeçalho da requisição.

- listarEquipamentosDisponiveis:(token) => { ... } - Esta função faz uma solicitação GET para obter a lista de equipamentos disponíveis. Recebe um parâmetro token que é utilizado para autenticar a requisição. A URL para a solicitação GET é '/equipamento-serie/disponivel', e o token de autorização é passado no cabeçalho da requisição.

- salvarAgendamento:(agendamento, token) => { ... } - Esta função faz uma solicitação POST para salvar um novo agendamento. Recebe um objeto agendamento contendo as informações do agendamento a ser salvo e um parâmetro token para autenticação. A URL para a solicitação POST é '/agendamento', o objeto agendamento é passado como corpo da requisição, e o

<details close></summary></summary>

</details>

</details> 

## Aprendizados Efetivos

Além de aprender a trabalhar com o VueJs e consultar a documentação oficial da tecnologia, também aprendi a importância de dedicar-me a um estudo aprofundado para obter um conhecimento sólido e consistente. Embora os tutoriais sejam úteis, geralmente abordam apenas as partes mais básicas e superficiais de um assunto. Ao mergulhar na documentação da tecnologia, pude compreender melhor suas nuances e recursos avançados.
Essa experiência também me ensinou a importância de buscar constantemente novos conhecimentos e manter-me atualizado em relação às novas tecnologias e tendências do mercado. Como resultado, fui capaz de desenvolver um projeto mais completo e eficiente, enquanto adquiria habilidades valiosas para minha carreira profissional.

</details>

<br>

## Contatos
* [GitHub](https://github.com/AndrewAugusto)
* [LinkedIn](https://linkedin.com/in/AndrewAugusto/)
