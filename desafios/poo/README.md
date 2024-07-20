# POO - Desafio

Diagrama UML (Mermaid) que representa os papéis do iPhone de: Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

1. Reprodutor Musical

   - Métodos: tocar(), pausar(), selecionarMusica(String musica)

2. Aparelho Telefônico

   - Métodos: ligar(String numero), atender(), iniciarCorreioVoz()

3. Navegador na Internet
   - Métodos: exibirPagina(String url), adicionarNovaAba(), atualizarPagina()

## Autores

- Bruna Oliveira

```mermaid
classDiagram
class ReprodutorMusical {
+tocar()
+pausar()
+selecionarMusica(String musica)
}

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet


```
