Introduction Spring Boot

- <b>O que é e quais problemas resolvem o Spring Boot?</b>

  - O que é o Spring Boot?

    - 

  - Quais problemas Resolvem o Spring Boot?

    - Configurações de <b>Beans</b> em Arquivos xml.

    - <b>Dispatche Servelet</b> e <b>View</b> resolve em web.xml.

    - Setup manual de Banco de dados.

    - MUito tempo gasto em configurações 

    - Perda de foco em valor

      


- <b>Execução direta atráves de um único java -jar (Processo); </b>b>
  - <b>mvn clean package </b> - ( Dentro do Projeto ) ;
  - <b>cd target</b> - ( Entrar na pasta Target - criada após o comando acima ) ; 
  - <b>java -jar springboot.jar</b> (Assim subindo o projeto via <b>jar</b>, lembrando que o nome pode alterar de acordo com a <b>versão</b>.)



- <b> Comando para listar e exibição todo o conteúdo do jar</b>
  - <b>cd target </b>
  - <b>jar tf springboot.jar</b> (Lembrando que o nome pode alterar de acordo com a <b>versão</b>.)



- <b>Profiles</b>
  - <b>Múltiplos ambientes / Ambientes para desenvolvimento, teste e produção.</b> 
    - Bancos de dados para cada ambiente.
    - Execução de testes unitários em ambiente local.
    - Suíte de testes completas em ambiente de teste. 
    - Simulação do ambiente real em staging.
    - Deploy simplificado em produção. 
  - <b>Spring Boot Profiles ( properties - yml )</b>
    - Configurações Próprias para cada ambiente.
      - <b>application.properties</b>
      - <b>application-dev.properties</b> - ( Profile específico para desenvolvimento);
      - <b>application-release.properties</b> - (Profile específico para teste de novas versões) 
      - <b>application-dev.yml</b> - (O formato do YML é definido como chaves em um JSON por exemplo, assim facilitando a leitura e a configuração)
    - Ambientes com sua configuração: <b>dev, production.</b>
- <b>Uso de Command Line</b>
  - Propriedades do arquivo de configuração na linha de comando; 
  - Sobrescreve as propriedades definidas no arquivo de configurações;
  - Valores passados como argumento na execução do projeto;



- <b>Podemos alterar a porta que o projeto ira subir com esse comando</b>

​		<b>mvn spring-boot:run -Dserver.port= 8085</b> 

​		ou indo até o arquivo de configuração {xxx.properties ou xx.yml} inserindo a config a baixo

<b>		server.port = 8080</b> { Alterando o número na frente se altera a porta, caso ela não esteja 	    		em uso o projeto ira subir na porta inserida }

​	

- <b>Configurações com variáveis de ambiente</b>
  - Variável de ambiente pode ser injetada através da anotação @Value no projeto
  - Linux e Mac: export comum de variável.
    - <b>export ENV_DB_URL=jdbc:h2:mem:db;DB_CLOSE_DELAY=-1</b>
  - Windows: padrão de variável de ambiente.
  - Variáveis de ambiente 
    - injeção com anotação @Value({NOME_VARIAVEL}).



<h2>Curso Finalizado - Certificado </h2>

<img src="BF981BB6.png">