# Andrew Augusto Dias Santos

## Introdução

<img src="https://avatars.githubusercontent.com/u/81338441?v=4" height="250" width="250"/>

   Olá, sou Andrew Santos, tenho 23 anos e estou atualmente na fase final da minha graduação em Banco de Dados. Atuo como Desenvolvedor Full Stack, com foco em Node e React, dentro do contexto do SAP Business One. Anteriormente, desempenhei o papel de Analista Desenvolvedor, trabalhando com linguagens como NodeJS e C#.

   Apesar do meu tempo relativamente curto de experiência como Desenvolvedor, já obtive conquistas significativas e adquiri um conhecimento substancial. Sinto-me entusiasmado com a perspectiva de continuar aprimorando minhas habilidades e crescendo nessa área dinâmica. Acredito firmemente que a busca contínua por conhecimento e a dedicação à prática são pilares essenciais para se tornar um profissional de excelência. Sempre estou em busca de novos desafios e oportunidades que me permitam expandir meu potencial e aprofundar meu aprendizado.

<br>

## Meus principais conhecimentos

### JavaScript  <img src="https://github.com/devicons/devicon/blob/master/icons/javascript/javascript-original.svg" width="30" height="30" />   
### Java  <img src="https://github.com/devicons/devicon/blob/master/icons/java/java-original.svg" width="30" height="30" /> 

<br>

## Projetos Integradores durante a graduação 
   Durante minha graduação, participei ativamente do desenvolvimento de projetos conhecidos como "API de Aprendizagem por Processos Integrados". Esses projetos integradores são cuidadosamente elaborados para abordar questões do mundo real e buscar soluções eficazes.

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

   A Fatec é uma instituição de ensino superior pública, mantida pelo estado, onde todos os cursos disponibilizados são de acesso gratuito. A formação de um Tecnólogo na Fatec vai além dos aspectos técnicos, incorporando também uma base sólida de valores sociais, éticos, filosóficos e ambientais. Essa abordagem visa transformar o indivíduo em um profissional consciente de seu papel e responsabilidades dentro da sociedade à qual pertence.

![image](https://github.com/criskurim/CodeYCode/blob/main/Imagens/logo-removebg-preview.png)

##### *Figura 02. Logo do Projeto Ibet Assistente*

### Visão do Projeto

   A assistente virtual Ibet foi desenvolvida com a finalidade de proporcionar aos usuários uma maneira eficiente de acessar informações relacionadas a esportes. Ela oferece diversas funcionalidades que visam facilitar a experiência do usuário nesse contexto. Algumas das características que a Ibet oferece incluem:

   <strong>Definição de Alarmes para Jogos</strong>: A assistente Ibet permite que os usuários configurem alarmes para serem notificados sobre jogos específicos. Isso garante que eles fiquem atualizados sobre as partidas de seu interesse.
Placares de Jogos em Tempo Real: A Ibet fornece placares atualizados em tempo real para jogos em andamento. Isso permite que os usuários acompanhem os resultados instantaneamente, sem atrasos.

<strong>Acesso a Jogos Antigos</strong>: Além de informações sobre jogos atuais, a Ibet também disponibiliza detalhes sobre jogos antigos. Isso possibilita que os usuários revivam momentos marcantes no mundo esportivo.

<strong>Vídeos e Conteúdo Relacionado</strong>: A assistente oferece acesso a vídeos e conteúdo relacionado a esportes, permitindo que os usuários assistam a momentos emocionantes, entrevistas e análises.

<strong>Interação por Comando de Voz</strong>: O grande diferencial da aplicação é a interação por meio de comandos de voz. Os usuários podem obter todas as informações necessárias sem precisar digitar ou clicar em botões. Isso torna a experiência mais conveniente e intuitiva.

A Ibet foi projetada para entregar informações de forma interativa, proporcionando aos usuários uma experiência rica em conteúdo esportivo sem os incômodos de interações tradicionais. Com sua funcionalidade de comando de voz, a assistente busca tornar a busca por informações esportivas mais prática e acessível.

Link do repositório do projeto: https://github.com/AndrewAugusto/Ibet_Assistente

### Tecnologias adotadas no Projeto

<div style="display: inline_block">
  <img src="https://raw.githubusercontent.com/devicons/devicon/1119b9f84c0290e0f0b38982099a2bd027a48bf1/icons/python/python-original-wordmark.svg" width="100"    height="100" />
  <img src="https://github.com/devicons/devicon/blob/master/icons/sqlite/sqlite-original.svg" width="100" height="100" />
</div>

## Contribuições Pessoais

  Desempenhei um papel crucial na implementação da tecnologia de reconhecimento de voz na API, onde fui responsável por criar um algoritmo que permitisse a execução do serviço em segundo plano, no modo Standby. Essa abordagem garante que a tecnologia seja ativada somente quando chamada, otimizando os recursos e proporcionando uma experiência eficiente aos usuários.
  
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

   Com certeza, ao desenvolver a assistente, priorizamos a sua capacidade de ser executada em segundo plano e entrar em ação imediatamente quando chamada. Isso foi feito com o objetivo de reduzir ao máximo a necessidade de interação física por parte do usuário, como inserção manual de informações via teclado ou mouse. A nossa abordagem visa proporcionar uma experiência mais fluida e prática, permitindo que os usuários interajam com a assistente por meio de comandos de voz, minimizando a barreira entre eles e as informações que estão buscando. Isso não apenas aumenta a eficiência, mas também torna a experiência mais intuitiva e acessível para um amplo público.

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

* Iniciei minha jornada com a linguagem de programação Python, abrindo portas para novas possibilidades.
* Adquiri uma compreensão profunda da metodologia ágil Scrum, aplicando seus princípios de forma prática.
* Optei por adotar o paradigma de programação imperativo para construir meu projeto, utilizando uma abordagem estruturada.
* Desenvolvi uma base sólida em lógica de programação, capacitando-me para resolver desafios computacionais de maneira eficaz.
* Introduzi e utilizei com sucesso as primeiras estruturas de dados em meu projeto, explorando as capacidades da linguagem Python.
* Minhas habilidades de comunicação estão em constante evolução, contribuindo para uma melhor interação com colegas e stakeholders.

#### Hard Skills Desenvolvidas

* Desenvolvimento do backend com Python, criando aplicações robustas.
* Criação de APIs para fornecer serviços e funcionalidades.
* Domínio do versionamento de código com o uso do Git.
* Capaz de projetar a arquitetura de sistemas alinhada aos requisitos funcionais e não funcionais.
* Experiência no desenvolvimento integrado com bancos de dados relacionais.

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

   Foi construido uma integração crucial para a coleta de informações diretamente dos servidores, visando a criação de uma série histórica de dados. A concepção por trás disso era criar uma aplicação que pudesse realizar a coleta regular de métricas de um ou mais Sistemas Gerenciadores de Banco de Dados remotos. Essa ferramenta é projetada para fornecer informações valiosas ao usuário, permitindo que tomem decisões informadas em relação à manutenção, balanceamento, escalabilidade e melhorias necessárias nos seus SGBDs, bancos de dados e infraestrutura de servidores.

   Ao realizar essa integração, o objetivo é capacitar os usuários a monitorar de perto o desempenho de seus sistemas, identificar tendências ao longo do tempo e agir de forma proativa para otimizar e manter a estabilidade de suas operações. Ao fornecer uma visão holística das métricas do sistema, essa aplicação permite que os usuários tomem decisões fundamentadas sobre ajustes necessários, sejam eles relacionados a melhorias na eficiência dos bancos de dados, balanceamento de carga ou mesmo escalonamento da infraestrutura para atender às demandas crescentes.

   Essa iniciativa reflete um entendimento avançado das necessidades de gestão de banco de dados e infraestrutura, demonstrando a capacidade de criar soluções práticas para otimizar a operação dos sistemas e garantir sua confiabilidade e eficácia contínuas.

Link do repositório do projeto: https://github.com/apibanco/Vigilant

### Tecnologias adotadas na solução

* **Back-end:** Java e Spring-Boot
* **Front-end:** Angular, CSS, Bootstrap
* **Banco de Dados:** Po

## Contribuições Pessoais

   Assumi a responsabilidade crucial de implementar a lógica que permite a integração se conectar ao banco de dados, a fim de realizar a coleta periódica de parametrizações. Além disso, fui encarregado de criar as consultas (queries) necessárias para recuperar os dados e desenvolver procedimentos armazenados (procedures) para a execução eficiente dessas operações.

   Essa tarefa implica um profundo entendimento das estruturas de banco de dados e suas nuances, demonstrando habilidades sólidas em design de consultas, otimização de desempenho e conhecimento técnico na criação de procedimentos que automatizam processos complexos. Ao implementar essa lógica, fui capaz de fornecer à integração a capacidade de extrair informações relevantes de forma eficaz e precisa, garantindo que as parametrizações fossem coletadas de maneira confiável.

   Minha contribuição na criação de consultas e procedures reforça minha habilidade de traduzir requisitos de negócios em ações concretas no ambiente de banco de dados. Além disso, demonstra meu conhecimento sólido em SQL e meu compromisso em desenvolver soluções robustas que atendam às necessidades do projeto e da equipe.

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
	};

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
		} catch(Exception e) {
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

- Minha participação se estendeu ainda para a integração completa das chamadas de todos os métodos do Back-End. Durante esse processo, além de criar alguns métodos, desempenhei um papel fundamental na realização de testes para validar as requisições.

  Essa etapa é de extrema importância, pois envolve garantir que cada funcionalidade do Back-End esteja operando de maneira correta e coesa. Ao criar e implementar esses métodos, pude contribuir para a construção de uma aplicação robusta e funcional. Os testes que conduzi permitiram identificar possíveis problemas e assegurar que as requisições feitas à API estivessem fornecendo os resultados esperados.

  Minha participação nesse processo demonstra a capacidade de colaborar em todos os estágios do desenvolvimento, desde a criação até a validação das funcionalidades. A abordagem sistemática e a atenção aos detalhes nos testes ilustram meu compromisso em oferecer um produto final de alta qualidade, além de evidenciar minhas habilidades em depuração e solução de problemas.

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

* Ao longo do desenvolvimento do projeto, tive a valiosa oportunidade de adquirir um profundo conhecimento sobre sistemas de gerenciamento de banco de dados (SGBDs), capacitando-me a coletar e manipular informações de maneira altamente eficiente para a geração de séries históricas e métricas de grande relevância para os usuários da aplicação.
* Essa experiência enriqueceu consideravelmente minhas habilidades na manipulação de dados dentro de ambientes de banco de dados. Pude aprimorar minha capacidade de criar consultas SQL e utilizar diversos comandos para extrair informações específicas e impactantes. Além disso, aproveitei a oportunidade para explorar e me familiarizar profundamente com ferramentas de gerenciamento de banco de dados, como o PostgreSQL, aplicando-as de maneira excepcionalmente eficaz.
* Minha contribuição desempenhou um papel fundamental no desenvolvimento da aplicação, uma vez que pude criar consultas e rotinas que viabilizaram a coleta de métricas cruciais, como o dimensionamento das tabelas e do próprio banco de dados. Essas métricas forneceram insights inestimáveis aos usuários, permitindo-lhes uma compreensão mais completa da situação e da evolução do sistema, além de respaldar decisões informadas com base nesses dados.
* Ao longo desse processo, aprofundei minha compreensão dos princípios fundamentais que regem um SGBD e a importância de estruturar e organizar os dados de maneira adequada para facilitar operações futuras. A experiência também me mostrou a relevância de otimizar consultas e operações de banco de dados, contribuindo para um desempenho mais eficiente e uma experiência geral mais satisfatória para os usuários.
* Como resultado, minha atuação no projeto não apenas se limitou à coleta e manipulação de dados, mas também envolveu a criação de um ambiente de banco de dados resiliente e otimizado. Esse aspecto desempenhou um papel essencial no sucesso da aplicação como um todo. A experiência adquirida nesse processo me concedeu um conhecimento profundo e uma base sólida para futuros empreendimentos que envolvam a gestão de dados e o uso de SGBDs.
  
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

A empresa parceira MidAll apresentou um desafio interessante relacionado à criação de promoções em um ambiente de E-commerce. Para abordar essa demanda, desenvolvemos um motor de regras acompanhado de uma interface intuitiva, que permitisse o cadastro simplificado das regras das promoções.

Essa solução teve como objetivo proporcionar uma abordagem eficiente e flexível para a gestão de promoções, permitindo que a equipe de marketing e vendas pudesse criar, ajustar e monitorar promoções de forma ágil e personalizada. O motor de regras, com sua lógica subjacente, permitiu a definição de critérios específicos para a ativação das promoções, como combinações de produtos, valores de compra e outros fatores relevantes.

A interface de cadastro simplificou o processo ao máximo, eliminando a necessidade de conhecimento técnico avançado. Os colaboradores da empresa puderam criar e ajustar regras de promoções de acordo com as metas de marketing e os objetivos comerciais.

Com essa solução, a MidAll conseguiu atender às suas necessidades de promoções de maneira eficiente e escalável, impulsionando as vendas e a satisfação do cliente. A abordagem de motor de regras e interface de cadastro trouxe mais flexibilidade e autonomia à equipe, garantindo a criação de promoções personalizadas e impactantes no cenário do E-commerce.

Link do repositório do projeto: https://github.com/Doc-Docker/APIMidAll

### Tecnologias adotadas na solução

* **Back-end:** Java e Spring-Boot
* **Front-end:** Angular, CSS, Bootstrap
* **Banco de Dados:** SQLite

## Contribuições Pessoais

   Assumi a responsabilidade crucial de implementar a lógica do motor de regras na API, desempenhando um papel central na criação de um algoritmo avançado. Esse algoritmo foi projetado para calcular os valores passados como parâmetros e, em retorno, fornecer a melhor promoção a ser aplicada no carrinho de compras do usuário.

   Essa tarefa exige um profundo entendimento das diferentes regras de promoção e de como elas interagem com os valores específicos de compra. Ao criar esse algoritmo, você demonstrou um domínio sólido das lógicas de cálculo e das nuances das promoções, considerando diversos cenários para determinar qual promoção seria mais vantajosa para o cliente.

   Além disso, sua contribuição na criação deste motor de regras demonstra habilidades de programação avançadas, como o desenvolvimento de algoritmos complexos e a capacidade de traduzir requisitos de negócios em lógica computacional. A aplicação prática do algoritmo também demonstra seu compromisso em criar uma experiência de compra otimizada para os usuários, onde eles possam se beneficiar ao máximo das promoções disponíveis.

   Seu papel na implementação da lógica do motor de regras foi essencial para a funcionalidade e sucesso da aplicação, oferecendo aos usuários a melhor promoção possível com base em suas compras. Isso destaca sua capacidade de resolver problemas complexos e criar soluções técnicas que têm um impacto direto nas operações comerciais.

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

  Minha participação no projeto incluiu um papel ativo na integração entre o Front-End e o Back-End, onde desempenhei um papel essencial na criação de diversos métodos e na condução de testes para validar as requisições.

  Ao participar da integração entre essas duas partes fundamentais do sistema, contribuí para assegurar que a comunicação entre elas ocorresse de maneira suave e confiável. A criação de métodos no Back-End permitiu que o Front-End pudesse acessar e manipular dados e funcionalidades, garantindo a funcionalidade harmoniosa da aplicação como um todo.

  A condução de testes para validar as requisições é uma etapa crucial para verificar se todas as partes do sistema estão funcionando conforme o esperado. Seu papel na execução desses testes evidencia seu comprometimento em entregar um produto de alta qualidade, minimizando possíveis erros e garantindo uma experiência consistente para os usuários.

  Essa contribuição demonstra suas habilidades técnicas na criação de métodos funcionais e na realização de testes rigorosos. Além disso, ressalta sua capacidade de trabalhar de forma colaborativa entre as equipes de Front-End e Back-End, garantindo que a aplicação final seja coesa e eficaz.

  Seu envolvimento na integração entre o Front-End e o Back-End teve um impacto direto na funcionalidade e usabilidade da aplicação, assegurando que os usuários possam interagir com uma interface responsiva e que todas as suas ações sejam processadas com precisão nos bastidores.

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

- <strong>id</strong>: um campo do tipo Integer que representa o identificador do produto.
- <strong>name</strong>: um campo do tipo String que representa o nome do produto. É anotado com @NotBlank para garantir que não esteja em branco.
- <strong>price</strong>: um campo do tipo Double que representa o preço do produto. É anotado com @PositiveOrZero para garantir que seja maior ou igual a zero.
- <strong>categories</strong>: uma lista de objetos CategoryDTO, representando as categorias associadas ao produto. É inicializada como uma lista vazia.

A classe possui os seguintes construtores e anotações:

- <strong>@AllArgsConstructor e @NoArgsConstructor</strong>: anotações do Lombok que geram automaticamente construtores com e sem argumentos, respectivamente.
- <strong>@Data</strong>: anotação do Lombok que gera automaticamente getters, setters, toString, equals e hashCode para todos os campos da classe.
- <strong>@EqualsAndHashCode(of={"id"})</strong>: anotação do Lombok que gera automaticamente os métodos equals e hashCode, considerando apenas o campo id.

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

- <strong>Comunicação</strong>: uma habilidade que está em constante desenvolvimento, e não foi diferente nesta etapa onde foi necessário apresentar o projeto para o cliente e professores avaliadores. 
Além de ser necessário para manter um esquema organizacional eficiente, ativo e funcional entre os integrantes da equipe. 
- <strong>Gestão de Tempo</strong>: por ser o primeiro projeto em parceria com um cliente real no curso de Banco de Dados, uma empresa parceira da universidade, com prazos mais curtos para um 
desenvolvimento mais complexo e com mais requisitos, o controle do tempo foi necessário para cumprir com as entregas nos prazos determinados, buscando otimizar a eficiência.
- <strong>Gerenciamento de projetos</strong>: muitas vezes o melhor caminho pode não ser o mais claro ou o mais fácil, portanto a tomada de decisões de forma assertiva foi uma habilidade crítica para o 
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

### Visão do Projeto

  Enfrentamos um desafio crucial em relação à sincronização dos dados administrativos, financeiros e operacionais ligados aos nossos serviços. A ausência de organização desses dados tem acarretado demora no atendimento aos chamados e, adicionalmente, tem gerado complexidade na interpretação dos indicadores comerciais e financeiros.

### Tecnologias adotadas na solução

* **Back-end:** Java e Spring-Boot
* **Front-end:** Angular, CSS, Bootstrap
* **Banco de Dados:** SQLite

## Contribuições Pessoais

  Desempenhei um papel central na implementação da lógica do motor de regras da API, desenvolvendo um algoritmo altamente funcional. Este algoritmo foi projetado para efetuar cálculos com base nos valores recebidos como parâmetros e, em resposta, determinar a promoção mais vantajosa a ser aplicada no carrinho de compras do usuário.
  
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

- Tive uma participação ativa na integração perfeita entre o Front-End e Back-End, desempenhando um papel crucial na criação de vários métodos e na execução de testes rigorosos para assegurar a validade das requisições.

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
- <strong>listar</strong>:(token) => { ... } - Esta função faz uma solicitação GET para obter a lista de chamados. Recebe um parâmetro token que é utilizado para autenticar a requisição. A URL para a solicitação GET é '/chamados', e o token de autorização é passado no cabeçalho da requisição.

- <strong>salvar</strong>:(suporte) => { ... } - Esta função faz uma solicitação POST para salvar um novo chamado. Recebe um objeto suporte contendo as informações do chamado a ser salvo. A URL para a solicitação POST é '/chamados', e o objeto suporte é passado como corpo da requisição.

- <strong>deletar</strong>:(id) => { ... } - Esta função faz uma solicitação DELETE para excluir um chamado com base em seu ID. Recebe um parâmetro id que representa o ID do chamado a ser excluído. A URL para a solicitação DELETE é '/chamados/' + id, onde o ID é concatenado à URL.

- <strong>atualizar</strong>:(chamado) => { ... } - Esta função faz uma solicitação PATCH para atualizar um chamado existente. Recebe um objeto chamado contendo as informações atualizadas do chamado. A URL para a solicitação PATCH é '/chamados/' + chamado.id, onde o ID do chamado é concatenado à URL, e o objeto chamado é passado como corpo da requisição.

- <strong>atualizar</strong>:(chamado, id, token) => { ... } - Esta função é uma versão modificada da função atualizar, que inclui um parâmetro adicional token para autenticar a requisição. Recebe um objeto chamado contendo as informações atualizadas do chamado, um parâmetro id que representa o ID do chamado a ser atualizado e um parâmetro token para autenticação. A URL para a solicitação PATCH é '/chamados/' + id, onde o ID é concatenado à URL, o objeto chamado é passado como corpo da requisição, e o token de autorização é passado no cabeçalho da requisição.

- <strong>listarEquipamentosDisponiveis</strong>:(token) => { ... } - Esta função faz uma solicitação GET para obter a lista de equipamentos disponíveis. Recebe um parâmetro token que é utilizado para autenticar a requisição. A URL para a solicitação GET é '/equipamento-serie/disponivel', e o token de autorização é passado no cabeçalho da requisição.

- <strong>salvarAgendamento</strong>:(agendamento, token) => { ... } - Esta função faz uma solicitação POST para salvar um novo agendamento. Recebe um objeto agendamento contendo as informações do agendamento a ser salvo e um parâmetro token para autenticação. A URL para a solicitação POST é '/agendamento', o objeto agendamento é passado como corpo da requisição, e o

<details close></summary></summary>

</details>

</details> 

## Aprendizados Efetivos

Além de adquirir habilidades no uso do VueJs e de consultar sua documentação oficial, compreendi a importância de me dedicar a um estudo aprofundado para construir uma base sólida e confiável de conhecimento. Embora os tutoriais sejam úteis, muitas vezes tratam apenas das noções básicas de um tópico. Ao me aprofundar na documentação da tecnologia, pude entender suas complexidades e explorar recursos avançados.
Essa experiência também reforçou a importância de estar em constante busca por novos aprendizados e de manter-me atualizado sobre as últimas tecnologias e tendências do mercado. Como resultado, pude desenvolver um projeto mais sofisticado e eficaz, ao mesmo tempo em que adquiria habilidades valiosas para minha trajetória profissional.

</details>

<br>

## Contatos
* [GitHub](https://github.com/AndrewAugusto)
* [LinkedIn](https://linkedin.com/in/AndrewAugusto/)
