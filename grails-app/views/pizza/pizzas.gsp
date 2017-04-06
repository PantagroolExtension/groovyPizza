<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'pizza.label', default: 'Pizza')}" />
        <title><g:message code="default.show.label" args="[entityName]" /></title>
    </head>
    <body>
        <h2> Speciality Pizzas </h2>

        <table>
            <tbody>
                <tr>
                    <td>
                        <a href="/pizza/show/${pizzas[0].id}"><img src="${resource(dir:"images", file: "${pizzas[0].name + ".jpg"}")}"/></a>
                        <br>
                        <h4>${pizzas[0].name}</h4>
                    </td>
                    <td>
                        <a href="/pizza/show/${pizzas[1].id}"><img src="${resource(dir:"images", file: "${pizzas[1].name + ".jpg"}")}"/></a>
                        <br>
                        <h4>${pizzas[1].name}</h4>
                    </td>
                    <td>
                        <a href="/pizza/show/${pizzas[2].id}"><img src="${resource(dir:"images", file: "${pizzas[2].name + ".jpg"}")}"/></a>
                        <br>
                        <h4>${pizzas[2].name}</h4>
                    </td>
                    <td>
                        <a href="/pizza/show/${pizzas[3].id}"><img src="${resource(dir:"images", file: "${pizzas[3].name + ".jpg"}")}"/></a>
                        <br>
                        <h4>${pizzas[3].name}</h4>
                    </td>
                </tr>
                <tr>
                    <td>
                        <a href="/pizza/show/${pizzas[4].id}"><img src="${resource(dir:"images", file: "${pizzas[4].name + ".jpg"}")}"/></a>
                        <br>
                        <h4>${pizzas[4].name}</h4>
                    </td>
                    <td>
                        <a href="/pizza/show/${pizzas[5].id}"><img src="${resource(dir:"images", file: "${pizzas[5].name + ".jpg"}")}"/></a>
                        <br>
                        <h4>${pizzas[5].name}</h4>
                    </td>
                    <td>
                        <a href="/pizza/show/${pizzas[6].id}"><img src="${resource(dir:"images", file: "${pizzas[6].name + ".jpg"}")}"/></a>
                        <br>
                        <h4>${pizzas[6].name}</h4>
                    </td>
                    <td>
                        <a href="/pizza/show/${pizzas[7].id}"><img src="${resource(dir:"images", file: "${pizzas[7].name + ".jpg"}")}"/></a>
                        <br>
                        <h4>${pizzas[7].name}</h4>
                    </td>
                </tr>
                <tr>
                    <td>
                        <a href="/pizza/show/${pizzas[8].id}"><img src="${resource(dir:"images", file: "${pizzas[8].name + ".jpg"}")}"/></a>
                        <br>
                        <h4>${pizzas[8].name}</h4>
                    </td>
                    <td>
                        <a href="/pizza/show/${pizzas[9].id}"><img src="${resource(dir:"images", file: "${pizzas[9].name + ".jpg"}")}"/></a>
                        <br>
                        <h4>${pizzas[9].name}</h4>
                    </td>
                    <td>
                        <a href="/pizza/show/${pizzas[10].id}"><img src="${resource(dir:"images", file: "${pizzas[10].name + ".jpg"}")}"/></a>
                        <br>
                        <h4>${pizzas[10].name}</h4>
                    </td>
                    <td>
                        <a href="/pizza/show/${pizzas[11].id}"><img src="${resource(dir:"images", file: "${pizzas[11].name + ".jpg"}")}"/></a>
                        <br>
                        <h4>${pizzas[11].name}</h4>
                    </td>
                </tr>
            </tbody>
        </table>

%{--        <div class="container">

            <div class="row">
                <a href="/pizza/show/${pizzas[0].id}"><img src="${resource(dir:"images", file: "${pizzas[0].name + ".jpg"}")}"/>${pizzas[0].name}</a>
                <a href="/pizza/show/${pizzas[1].id}"><img src="${resource(dir:"images", file: "${pizzas[1].name + ".jpg"}")}"/>${pizzas[1].name}</a>
                <a href="/pizza/show/${pizzas[2].id}"><img src="${resource(dir:"images", file: "${pizzas[2].name + ".jpg"}")}"/>${pizzas[2].name}</a>
                <a href="/pizza/show/${pizzas[3].id}"><img src="${resource(dir:"images", file: "${pizzas[3].name + ".jpg"}")}"/>${pizzas[3].name}</a>
            </div>
            <div class="row">
                <a href="/pizza/show/${pizzas[4].id}"><img src="${resource(dir:"images", file: "${pizzas[4].name + ".jpg"}")}"/>${pizzas[4].name}</a>
                <a href="/pizza/show/${pizzas[5].id}"><img src="${resource(dir:"images", file: "${pizzas[5].name + ".jpg"}")}"/>${pizzas[5].name}</a>
                <a href="/pizza/show/${pizzas[6].id}"><img src="${resource(dir:"images", file: "${pizzas[6].name + ".jpg"}")}"/>${pizzas[6].name}</a>
                <a href="/pizza/show/${pizzas[7].id}"><img src="${resource(dir:"images", file: "${pizzas[7].name + ".jpg"}")}"/>${pizzas[7].name}</a>
            </div>
            <div class="row">
                <a href="/pizza/show/${pizzas[8].id}"><img src="${resource(dir:"images", file: "${pizzas[8].name + ".jpg"}")}"/>${pizzas[8].name}</a>
                <a href="/pizza/show/${pizzas[9].id}"><img src="${resource(dir:"images", file: "${pizzas[9].name + ".jpg"}")}"/>${pizzas[9].name}</a>
                <a href="/pizza/show/${pizzas[10].id}"><img src="${resource(dir:"images", file: "${pizzas[10].name + ".jpg"}")}"/>${pizzas[10].name}</a>
                <a href="/pizza/show/${pizzas[11].id}"><img src="${resource(dir:"images", file: "${pizzas[11].name + ".jpg"}")}"/>${pizzas[11].name}</a>
            </div>
        </div>--}%
    </body>
</html>
