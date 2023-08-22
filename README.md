# Agencia

## criar um projeto no Maven
    mvn archetype:generate -DgroupId=br.com.senai -DartifactId=agencia -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

## Acessar o projeto
    cd nome_do_projeto

## Inicializador o versionamento
    git init

## Adcionar os arquivos do projeto
    git add . (o ponto informa que irá adcionar tudo)

## Colocar um comentário no versionamento
    git commit -m "coloque o seu comentário"

## Criar um repositório na minha conta GitHub com nome do projeto
    Ex.: agencia | agenciaRH ou agencia-rh

## Capturar o link do git remote em ssh
    Ex.: git@github.com:glesiosantos/agencia.git

## Subir o projeto para GitHub
    git push -u origin main (ou branch atual)