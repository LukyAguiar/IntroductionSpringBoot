# Introduction Spring Boot



- <b>O que é e quais problemas resolvem o Spring Boot?</b>
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
  - <b>Ambientes para desenvolvimento, teste e produção.</b>
  - <b>Múltiplos ambientes</b> 
    - Bancos de dados para cada ambiente.
    - Execução de testes unitários em ambiente local.
    - Suíte de testes completas em ambiente de teste. 
    - Simulação do ambiente real em staging.
    - Deploy simplificado em produção. 
  - Spring Boot Profiles 
    - Configurações Próprias para cada ambiente.
      - <b>application.properties</b>
      - <b>application-dev.properties</b> - ( Profile específico para desenvolvimento);
      - <b>application-release.properties</b> - (Profile específico para teste de novas versões) 
    - Ambientes com sua configuração: <b>dev, production.</b>b>