# Prática com JUnit e TDD

Este projeto contém as soluções para o exercício prático de testes de software, incluindo:
1.  Correção de bug em `PalindromeChecker` com testes JUnit.
2.  Desenvolvimento de `AgeClassifier` usando TDD.
3.  Análise de `Fatorial` com CFG e testes de caminho.

## Estrutura do Projeto

```
testes-software-pratica/
├── src/
│   └── main/
│       └── java/
│           ├── PalindromeChecker.java
│           ├── AgeClassifier.java
│           └── Fatorial.java
├── src/
│   └── test/
│       └── java/
│           ├── PalindromeCheckerTest.java
│           ├── AgeClassifierTest.java
│           └── FatorialTest.java
├── build.gradle
└── README.md
```

## Como Executar os Testes

Para compilar o projeto e executar os testes, navegue até o diretório `testes-software-pratica` no terminal e utilize o Gradle wrapper:

No Windows:
```bash
gradlew.bat test
```

No macOS/Linux:
```bash
./gradlew test
```
Em caso de erro:

Navigate to C:\Users\annah\Downloads\Prova1VV-main\testes-software-pratica in your terminal.
Run gradle wrapper.
After it completes, run .\gradlew.bat test.

Caso queira testar novamente:

Parar os processos do Gradle (Daemons):
powershell
CopyInsert in Terminal
.\gradlew.bat --stop
Este comando tentará parar todos os processos do Gradle que podem estar rodando em segundo plano. Aguarde ele finalizar.
Limpar o projeto (Clean):
powershell
CopyInsert in Terminal
.\gradlew.bat clean
Este comando deve deletar a pasta build com os resultados anteriores. Verifique se ele produz alguma saída no console, como > Task :clean.
Rodar os testes novamente, forçando a re-execução:
powershell
CopyInsert in Terminal
.\gradlew.bat test --rerun-tasks
O comando --rerun-tasks diz ao Gradle para executar a tarefa test mesmo que ele ache que ela está atualizada.


Os resultados dos testes serão exibidos no console, e um relatório HTML pode ser encontrado em `build/reports/tests/test/index.html`.

## Geração do Gradle Wrapper
Se o Gradle wrapper (`gradlew` e `gradlew.bat`) não estiver presente no diretório `testes-software-pratica`, você pode gerá-lo (requer Gradle instalado globalmente) navegando até o diretório e executando:
```bash
gradle wrapper
```
cd 'c:\Users\annah\Downloads\Prova1VV-main\testes-software-pratica'