# desafio_poo_Iphone
Desafio da DIO realizado com o objetivo de criar um diagrama de classes e implementar o que é proposto no diagrama.

# Interfaces

- Interfaces são utilizadas para conseguirmos aplicar o conceito de herança múltipla. Herança múltipla é quando uma classe possui métodos vinculados a mais de uma classe.
- Como no Java isso não é possível usando apenas classes, podemos usar interfaces para criar métodos que serão implementados por uma classe, podendo essa classe implementar mais de uma interface.
- No nosso exercício temos as interfaces `Aparelho Telefônico`, `Reprodutor Musical`, `Navegador da Internet` contendo os métodos que serão implementados pela classe `Iphone`.

- Nosso diagrama ficou da seguinte forma:

<p align="center">
<img src="/src/images/Iphone_Class_Diagram.jpg"><br>
</p>

- No caso dos métodos ligar e atender usei como parâmetro uma String com o número de Telefone para o qual o usuário do Iphone pode ligar ou receber ligações. 
A fim de deixar a solução mais simples. Mas podemos implementar uma classe `Contato` por exemplo com o número de telefone e o nome do contato.

- Para o método iniciarCorreioVoz além do número, passamos uma String mensagem como parâmetro. E o retorno deste método é a mensagem enviada pelo correio de Voz.
- Para a interface de reprodutorMusical implementei os métodos tocar(String musica), pausar() e selecionarMusica(String musica). O último retorna o nome da música selecionada.
- Para a interface de navegadorInternet implementei os métodos exibirPagina(), adicionarNovaAba() e atualizarPagina();
