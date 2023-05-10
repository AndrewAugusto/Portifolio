# Andrew Augusto Dias Santos

## Introdução

<img src="https://avatars.githubusercontent.com/u/81338441?v=4" height="250" width="250"/>

   Olá, Sou Andrew Santos, tenho 23 anos, atualmente estou concluindo minha graduação em Banco de Dados, trabalho como Consultor/Products com o SAP Business One, anteriormente trabalhei 
como Analista Desenvolvedor utilizava as linguagens NodeJS e C#. Apesar do pouco tempo de experiência como Desenvolvedor, já consegui aprender bastante e estou muito empolgado em continuar 
a aprimorar minhas habilidades e crescer na área. Acredito que a constante busca por conhecimento e a prática constante são fundamentais para se tornar um bom Desenvolvedor, e estou sempre 
em busca de novos desafios e oportunidades para me desenvolver.

<br>

## Meus principais conhecimentos

### JavaScript  <img src="https://github.com/devicons/devicon/blob/master/icons/javascript/javascript-original.svg" width="30" height="30" /> 
   Meu primeiro contato com a ferramenta foi no período de estágio, desde o momento que realizei a primeira integração passei a ama-lá, foi uma das minhas principais linguagens de trabalho 
e projetos particulares, realizava desenvolvimento de Serviços em NodeJS, Integração de sistemas e foi uma via para aprender padrões de desenvolvimento.  

### Java  <img src="https://github.com/devicons/devicon/blob/master/icons/java/java-original.svg" width="30" height="30" /> 
   Foi a primeira linguagem de programação que tive contato para estudo, foi a base na minha graduação, em um primeiro momento minha fonte inicial da minha curiosidade para descobrir o 
mundo do desenvolvimento.

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

   A assistente Ibet foi criada com a ideia de ser uma assistente virtual que auxilia o usuário na busca por informações relacionadas a esportes. Entre as funcionalidades que ela possui 
algumas delas são definição de alarmes para jogos, placares de jogos ao vivo e jogos antigos, vídeos entre outros. O diferencial da aplicação é o retorno de informações entregando o máximo 
de interatividade ao cliente sem a necessidade de digitar ou clicar em nenhuma informação. Todas as funcionalidades são ativas por comando de voz.

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
     
   O algoritmo mostrado define uma função chamada "ouvir_microfone()", que utiliza a biblioteca SpeechRecognition para transcrever o que é dito em um microfone para texto.
O primeiro passo é criar uma instância do objeto Recognizer() da biblioteca SpeechRecognition. Em seguida, a função entra em um bloco "with" para configurar e usar o microfone como fonte de 
entrada de áudio.
Dentro do bloco "with", o método "adjust_for_ambient_noise()" é chamado para ajustar automaticamente o nível de ruído de fundo para melhorar a precisão da transcrição.
Em seguida, o método "listen()" é chamado para gravar o áudio da fonte (microfone) e armazená-lo na variável "audio".
Depois disso, a função tenta transcrever o áudio em texto usando a API do Google Speech Recognition (recognize_google), especificando a linguagem de entrada como "pt-BR" (português do
Brasil).
Se a transcrição for bem-sucedida, o texto é armazenado na variável "frase" e retornado pela função. Caso contrário, se o reconhecimento de fala falhar ou não for compreendido, a função 
retornará a mensagem "Não entendi!".

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
	
   - Esse método é responsável por passar os parâmetros para o back-end, processar a informação e direcionar o retorno para a camada de visualização do usuário,
  sendo um trecho importante pois enviar dados, processa o retorno e já devolve os resultados para usuário.
    
<details close></summary></summary>

Click aqui [GitHub](https://github.com/Doc-Docker/APIMidAll/blob/main/frontend-midall/src/app/cart.service.ts) para mais detalhes 😃

- O link acima traz detalhes da implementação do método responsável por enviar a requisição para back-end. 

</details>

</details> 

## Aprendizados Efetivos

   A integração do projeto com as matérias do semestre se deu em diversas frentes. A mais importante delas foi na disciplina de Engenharia de Software. Durante o semestre de desenvolvimento 
deste trabalho, iniciamos o aprendizado sobre diversos padrões de projeto nesta disciplina, pela primeira vez. Com isso, pela primeira vez nos preocupamos em separar nosso programa que se 
tornaria o produto em camadas, seguir padrões de arquitetura, torná-lo componentizável e seguindo modos de construção comuns aos utilizados no mercado e comunidade. Foi o passo inicial de 
estudo sobre tais competências tão importantes para qualquer desenvolvedor de software.
Outros aprendizados também importantes precisam ser mencionados:
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

## Projeto II

<details>
  
<summary>
	Mais Detalhes do Projeto II
</summary>

# SGBD (Sistema de Gerenciamento de Banco de Dados)

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
   - Esse método é responsável por passar os parâmetros para o back-end, processar a informação e direcionar o retorno para a camada de visualização do usuário,
sendo um trecho importante pois enviar dados, processa o retorno e já devolve os resultados para usuário.

<details close></summary></summary>

Click aqui [GitHub](https://github.com/Doc-Docker/APIMidAll/blob/main/frontend-midall/src/app/cart.service.ts) para mais detalhes :)

- O link acima traz detalhes da implementação do método responsável por enviar a requisição para back-end. 

</details>

</details> 

## Aprendizados Efetivos

   A integração do projeto com as matérias do semestre se deu em diversas frentes. A mais importante delas foi na disciplina de Engenharia de Software. Durante o semestre de desenvolvimento 
deste trabalho, iniciamos o aprendizado sobre diversos padrões de projeto nesta disciplina, pela primeira vez. Com isso, pela primeira vez nos preocupamos em separar nosso programa que se 
tornaria o produto em camadas, seguir padrões de arquitetura, torná-lo componentizável e seguindo modos de construção comuns aos utilizados no mercado e comunidade. Foi o passo inicial de 
estudo sobre tais competências tão importantes para qualquer desenvolvedor de software.
Outros aprendizados também importantes precisam ser mencionados:
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

<br>

#### Soft Skills Efetivamente Desenvolvidas

- **Comunicação**: uma habilidade que está em constante desenvolvimento, e não foi diferente nesta etapa onde foi necessário apresentar o projeto para o cliente e professores avaliadores. 
Além de ser necessário para manter um esquema organizacional eficiente, ativo e funcional entre os integrantes da equipe. 
- **Gestão de Tempo**: por ser o primeiro projeto em parceria com um cliente real no curso de Banco de Dados, uma empresa parceira da universidade, com prazos mais curtos para um 
desenvolvimento mais complexo e com mais requisitos, o controle do tempo foi necessário para cumprir com as entregas nos prazos determinados, buscando otimizar a eficiência.
- **Gerenciamento de projetos**: muitas vezes o melhor caminho pode não ser o mais claro ou o mais fácil, portanto a tomada de decisões de forma assertiva foi uma habilidade crítica para o 
desenvolvimento do projeto.

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

<br>

#### Soft Skills Efetivamente Desenvolvidas

- **Comunicação**: uma habilidade que está em constante desenvolvimento, e não foi diferente nesta etapa onde foi necessário apresentar o projeto para o cliente e professores avaliadores. 
Além de ser necessário para manter um esquema organizacional eficiente, ativo e funcional entre os integrantes da equipe. 
- **Gestão de Tempo**: por ser o primeiro projeto em parceria com um cliente real no curso de Banco de Dados, uma empresa parceira da universidade, com prazos mais curtos para um 
desenvolvimento mais complexo e com mais requisitos, o controle do tempo foi necessário para cumprir com as entregas nos prazos determinados, buscando otimizar a eficiência.
- **Gerenciamento de projetos**: muitas vezes o melhor caminho pode não ser o mais claro ou o mais fácil, portanto a tomada de decisões de forma assertiva foi uma habilidade crítica para o 
desenvolvimento do projeto.

</details>

<br>

## Contatos
* [GitHub](https://github.com/AndrewAugusto)
* [LinkedIn](https://linkedin.com/in/AndrewAugusto/)
