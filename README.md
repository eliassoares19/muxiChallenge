# Desafio Muxi - muxiChallenge

Aplicativo em Kotlin que recebe um Json com uma lista de frutas obtido através de um GET na URL:
https://raw.githubusercontent.com/muxidev/desafio-android/master/fruits.json

Além disso, o aplicativo salva as informações das frutas (nome, preço em dólar e imagem) e calcula o preço em real de cada fruta.

## Instruções

O código utiliza uma estrutura que se baseia em dois módulos, como descrito abaixo:

- Módulo sharedcode:
    Usado para trabalhar com Kotlin Native e para suportar múltiplas linguagens como, por exemplo, Android e IOS.

- Módulo app:
    Usado para utilizar Kotlin Android e fazer integração com o módulo sharedcode para utilização da API Get Json.
    
## Desenvolvimento (Funcionalidades utilizadas)

- Adapter
- RecyclerView
- API Json
- Kotlin Native (Módulo shared code)
- Lib Picasso para imagens
- Interfaces
- Callbacks e Coroutines
- Utilização de flavor
- Suporte a mudança de orientação de telas sem perder estado
  
