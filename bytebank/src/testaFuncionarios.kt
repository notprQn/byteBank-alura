fun testaFuncionarios() {
    val joao = Analista(
        nome = "João",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("Nome do Funcionário: ${joao.nome}")
    println("CPF do Funcionário: ${joao.cpf}")
    println("Salario do Funcionário: ${joao.salario}")
    println("Bonificação do ${joao.nome}: ${joao.bonificacao}")
    println()

    val alex = Gerente(
        nome = "Alex",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("Nome do Gerente: ${alex.nome}")
    println("CPF do Gerente: ${alex.cpf}")
    println("Salario do Gerente: ${alex.salario}")
    println("Bonificação do ${alex.nome}: ${alex.bonificacao}")

    if (alex.auntenticar(1234)) {
        println("Senha Correta")
    } else {
        println("Senha Incorreta")
    }
    println()

    val alec = Diretor(
        nome = "Arthur",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("Nome do Diretor: ${alec.nome}")
    println("CPF do Diretor: ${alec.cpf}")
    println("Salario do Diretor: ${alec.salario}")
    println("Bonificação do ${alec.nome}: ${alec.bonificacao}")
    println("PLR do ${alec.nome}: ${alec.plr}")

    if (alec.auntenticar(4000)) {
        println("Senha Correta")
    } else {
        println("Senha Incorreta")
    }
    println()

    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444-44",
        salario = 2500.00
    )

    println("Nome da Analista: ${maria.nome}")
    println("CPF do Analista: ${maria.cpf}")
    println("Salario do Analista: ${maria.salario}")
    println("Bonificação do ${maria.nome}: ${maria.bonificacao}")
    println()

    val clara = Auxiliar(
        nome = "Clara",
        cpf = "555.555.555-55",
        salario = 500.00
    )

    println("Nome da Auxiliar: ${clara.nome}")
    println("CPF do Auxiliar: ${clara.cpf}")
    println("Salario do Auxiliar: ${clara.salario}")
    println("Bonificação do ${clara.nome}: ${clara.bonificacao}")
    println()

    val calculadora = CalculadoraBonificacao()
    calculadora.regsitrar(joao)
    calculadora.regsitrar(alex)
    calculadora.regsitrar(alec)
    calculadora.regsitrar(maria)
    calculadora.regsitrar(clara)

    println("Total de Bonificação: ${calculadora.total}")
}