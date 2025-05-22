# **Prática com JUnit e TDD** #

* Este repositório contém as soluções do exercício prático de testes de software. O projeto abrange:
* Correção de bug em PalindromeChecker com testes JUnit.
* Desenvolvimento de AgeClassifier utilizando TDD.
* Análise da função Fatorial com criação de um Gráfico de Fluxo de Controle (CFG) e testes de caminho.

### -> **Estrutura do Projeto** 

* A organização do projeto está disposta da seguinte forma:

testes-software-pratica/


├── src/

│---└── main/

│-------└── java/

│-----------├── PalindromeChecker.java

│-----------├── AgeClassifier.java

│-----------└── Fatorial.java

├── src/

│---└── test/

│-------└── java/



│-----------├── PalindromeCheckerTest.java

│-----------├── AgeClassifierTest.java

│-----------└── FatorialTest.java

├── build.gradle

└── README.md


### -> **Pré-requisitos:**


*Java JDK 8 ou superior.

*Gradle (se não quiser gerar o wrapper manualmente, certifique-se de que o Gradle Wrapper já esteja incluso no projeto).


### -> **Como Executar os Testes:**


*Utilizando o Gradle Wrapper navegue até o diretório do projeto:

_cd testes-software-pratica_

* **Execute os testes:**

**No Windows:**

_bash
gradlew.bat test_

**No macOS/Linux:**

_bash
./gradlew test_


### -> **Resultados dos Testes:**


* Os resultados serão exibidos no console.
* Um relatório HTML completo será gerado em: build/reports/tests/test/index.html


### -> **Solução de Problemas**


* Caso os testes não executem conforme o esperado ou encontrem erros, **siga os passos abaixo:**

**Navegue para o diretório do projeto:**

_bash
cd C:\Prova1VV-main\testes-software-pratica_

**Gere o Gradle Wrapper (caso necessário):
**

_bash
gradle wrapper_

**Pare os processos em segundo plano do Gradle (Daemons):**

_bash
.\gradlew.bat --stop_

**Aguarde a finalização de todos os processos.**

**Limpe o projeto:**

_bash
.\gradlew.bat clean_

**Reexecute os testes forçando a reexecução das tarefas:**

_bash
.\gradlew.bat test --rerun-tasks_



### -> **Geração do Gradle Wrapper**


* Caso os arquivos gradlew e gradlew.bat não estejam presentes no diretório do projeto, **você pode gerar o wrapper executando:**

_bash
gradle wrapper_

* **Após a geração, certifique-se de estar no diretório correto:**

_bash
cd "c:\Prova1VV-main\testes-software-pratica"_
