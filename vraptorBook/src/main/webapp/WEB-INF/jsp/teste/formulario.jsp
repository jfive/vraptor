<ul class="errors">
        <c:forEach items="${errors}" var="error">
            <li>${error.category} : ${error.message}</li>
        </c:forEach>
    </ul>


    <h1>${message}</h1>

    Teste Formulário

    <form action="${linkTo[TesteController].salvar}" method="post">

        <input type="text" name="teste.id" value="${teste.id}" /> <br />
        <input type="text" name="teste.nome" value="${teste.nome}" /> <br />
        <input type="text" name="teste.sobrenome" value="${teste.sobrenome}" /> <br />
        <input type="text" name="teste.descricao" value="${teste.descricao}" /> <br />

        <input type="submit" value="salvar" />

    </form>