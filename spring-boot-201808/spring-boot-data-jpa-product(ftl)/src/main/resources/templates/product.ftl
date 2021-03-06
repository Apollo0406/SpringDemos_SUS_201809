<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>

    <link href = "/webjars/bootstrap/4.1.0/css/bootstrap.min.css" rel = "stylesheet"/>
    <script type="text/javascript" src="webjars/jquery/2.1.4/jquery.min.js"></script>
</head>
<body>
    <h1>product list</h1>
    <#list products>
        <table class = "table table-hover table-dark">
            <thread>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">NAME</th>
                    <th scope="col">PRICE</th>
                </tr>
                <tbody>
                    <#items as product>
                        <tr>
                            <td scope="row">${product.id}</td>
                            <td scope="row">${product.name}</td>
                            <td scope="row">${product.price}</td>
                        </tr>
                    </#items>
                </tbody>
            </thread>
        </table>
    <#else>
        Table is Empty
    </#list>
</body>
</html>