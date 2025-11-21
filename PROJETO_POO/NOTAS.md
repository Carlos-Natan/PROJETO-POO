Projeto: Sistema de Registro/Login de Alunos e Professores (cordenador)

Sistema de login/registro de alunos e professores:

Alunos poderão visualizar suas médias, enquanto os professores serão responsáveis por informar as notas. (O sistema será responsável por calcular automaticamente a média final.)

_______

 Sistema do Aluno:

Após o login ou registro, o aluno estará cadastrado no sistema e poderá visualizar todas as notas e médias de suas disciplinas. Além disso, poderá ver as datas importantes do semestre (provas, trabalhos, avaliações etc.). Essas informações serão registradas pelo professor.
Caso o professor ainda não tenha inserido as datas, será exibida a seguinte mensagem:
"O PROFESSOR AINDA NÃO INSERIU AS DATAS DESTE SEMESTRE."

Para garantir a segurança e a integridade das informações, o sistema contará com validações automáticas no momento do registro e durante o uso. Por exemplo, não será possível cadastrar um aluno com dados incompletos, como nome em branco ou senha muito curta. Também não será permitido cadastrar e-mails já existentes, impedindo duplicidade de contas. Essas validações garantem que o aluno só possa acessar o sistema quando seus dados estiverem corretos e completos.

_______

 Sistema do Professor:

O professor deverá inserir as notas referentes às suas disciplinas para que os alunos possam visualizá-las.
Também poderá cadastrar as datas de avaliações do primeiro e do segundo semestre.

Além disso, os professores estarão vinculados a turmas específicas. Cada professor poderá gerenciar as disciplinas que leciona dentro de cada turma cadastrada, tendo acesso apenas aos alunos pertencentes àquelas turmas. Isso garante um controle mais preciso e organizado da informação, evitando que um professor acesse dados de alunos que não pertencem à sua responsabilidade.

As turmas serão cadastradas previamente pelo administrador do sistema, contendo dados como o nome da turma, o ano ou semestre vigente, e as disciplinas associadas. Dessa forma, ao acessar o sistema, o professor já terá acesso direto aos alunos e disciplinas sob sua responsabilidade, facilitando o lançamento de notas e o planejamento de avaliações.

_______

 Sistema de Notas e Médias:

Esse sistema deverá ser alimentado pelo professor, registrando um número X de notas e calculando automaticamente a média de cada aluno, informando sua situação: aprovado, em recuperação ou reprovado.

As notas são organizadas da seguinte forma:

* N1, N2, N3, N4, M1 e M2
* M1 = (N1 + N2) / 2 → média do primeiro semestre
* M2 = (N3 + N4) / 2 → média do segundo semestre

Os alunos poderão visualizar todas as suas notas na data prevista para o lançamento.
Exemplo de aviso:
"AS NOTAS DO PRIMEIRO SEMESTRE SERÃO LANÇADAS EM 7 DE OUTUBRO, E AS NOTAS DO SEGUNDO SEMESTRE SERÃO LIBERADAS EM 8 DE DEZEMBRO."

Além disso, o sistema implementará validações automáticas para o lançamento de notas, impedindo que valores incorretos sejam registrados. Por exemplo, não será possível lançar notas negativas ou acima do limite máximo (ex: 10). Caso o professor tente inserir uma nota inválida, o sistema alertará e bloqueará o lançamento até a correção do dado.

_______

 Interface de Administração:

O sistema contará com uma interface administrativa exclusiva para gestores e administradores da plataforma. Através dela, será possível realizar ações como:

* Cadastro, edição e exclusão de alunos e professores;
* Gerenciamento de turmas e disciplinas;
* Reset de senhas;
* Monitoramento das atividades do sistema;
* Acompanhamento do desempenho geral das turmas e professores.


class turma:
atributos: nome-professro, valor-horarios, nome-aluno


class horarios: 
