# language : pt

@tag
Funcionalidade: Cadastro de usuário
Como um novo usuário
Eu quero me cadastrar no sistema para poder utilizar os serviços disponíveis

  @tag1
Cenário: Cadastro com sucesso
Dado que estou na página de cadastro "https://demo.automationtesting.in/Register.html"
Quando preencho o formulário com um nome válido, um e-mail válido, uma senha válida e a confirmação da senha
E clico no botão "Submit"
Então vejo uma mensagem de sucesso indicando que meu cadastro foi realizado
