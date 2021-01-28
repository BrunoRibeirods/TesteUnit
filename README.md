
(1) O que é TDD?
-> Desenvolvimento guiado por testes, uma técnica que é realizada com um intuito De validação e verificação

(2)Defina a referência de dependência para a biblioteca do Espresso.
-> androidTestImplementation 'androidx.test.espresso:espresso-core:3.1.0'

(3)Qual a diferença entre teste de UI e o no viewmodel ? Dá para executaros dois da mesma forma?
->Não se tem a possibilidade de testar os dois na mesma forma, O teste de UI entra em vigor utilizando como
ajuda a propria interface, já o teste na viewmodel é realizado dentro do proprio codigo.

(4)Elabore um app que contenha um campo de texto e um botão.Em seguida, elabore uma classe de teste
que acesse o campo detexto, insira   a   string   “Teste   DH”,   feche   o   teclado   virtual 
e execute um clique no botão.
-> App elaborado, encontra-se no arquivo "MainTest"

(5)A seção a seguir descreve a criação um teste do Espresso no estiloJUnit 4 e a utilização do ActivityTestRule para 
reduzir a quantidade decódigo de texto clichê necessário. Explique o que o código realiza.
-> O codigo verifica se o mesmo que foi inserido no EditText é condizente ao que está escrito na TextView.



