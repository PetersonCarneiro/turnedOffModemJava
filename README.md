# Reboot Automático de Modem via Selenium

Este é um projeto Java que utiliza o Selenium WebDriver para automatizar o login em um modem/router e acionar remotamente o comando de reboot.

## Objetivo

Automatizar o processo de reinicialização de um modem através da interface web, sem intervenção manual, usando o navegador controlado via Selenium.

## Tecnologias Usadas

- Java 21
- Selenium WebDriver 4.18.1
- ChromeDriver (compatível com sua versão do Google Chrome)
- Maven (opcional, para gerenciamento de dependências)

## Pré-requisitos

- Java instalado
- Google Chrome instalado
- ChromeDriver compatível com a versão do Chrome (adicione no PATH ou configure no código)
- Dependência do Selenium no seu projeto

Exemplo com Maven:
```xml
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.18.1</version>
</dependency>
