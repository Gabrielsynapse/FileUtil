# Projeto FileUtil
>Este repositório contém um conjunto de classes utilitárias Java para manipulação simplificada de arquivos e JSON. A FileUtilclasse oferece uma variedade de métodos para operações comuns com arquivos, como leitura, gravação, cópia e exclusão de arquivos, bem como gerenciamento de diretórios. A Jsonclasse fornece um wrapper simples para serializar e desserializar objetos Java de e para o formato JSON usando a biblioteca Gson.

# Classe: **FileUtil**

>Esta classe fornece um conjunto abrangente de métodos estáticos para gerenciamento de arquivos e diretórios.
>* Operações de arquivo: **ler e gravar em arquivos.**
>* Navegação no sistema de arquivos: **verifique a existência de arquivos ou diretórios, obtenha o comprimento dos arquivos e liste o conteúdo dos diretórios.**
>* Copiar e mover: **copie arquivos e diretórios inteiros recursivamente.**
>* Renomear e excluir: **renomeie e exclua arquivos e diretórios.**
>* Arquivamento ZIP: **Extraia arquivos de um fluxo de entrada ZIP.**
>* Auxiliares de caminho: **obtenha um nome de arquivo com ou sem extensão.**

# Classe: **Json**

>Esta classe fornece uma maneira conveniente de lidar com serialização e desserialização JSON para qualquer objeto Java.
>* Leitura/Gravação: **Grava um objeto Java em um arquivo JSON e lê um objeto de volta de um arquivo JSON.**
>* Segurança de tipo: **utiliza genéricos para garantir a segurança de tipo para os objetos com os quais você está trabalhando.**
>* Impressão bonita: **os arquivos JSON são formatados com recuo para facilitar a leitura.**
>* Tratamento de erros: **gera um erro JsonNotFoundException se você tentar ler um arquivo que não existe.**

## Voce pode implementar no pom.xml

```xml
<dependency>
<groupId>gabrielsynapse.util.fileutil</groupId>
<artifactId>fileutil</artifactId>
<version>1.1</version>
</dependency>
```

