<!DOCTYPE html>
<html lang="ru">
<head>
    <title>JShop</title>
</head>
<body>
<h1>JShop</h1><hr>
<h4>Товары</h4>
<#list products as product>
    <div>
        <p>
            <b>${product.title}</b>
            ${product.price} руб.
            | <a href="/product/"${product.id}>Подробне...</a>
        </p>
    </div>
</#list>
<hr>
<h3>Создать новый товар</h3>
<form action="/product/create" method="post">
    Название объявления: <input type="text" name="title"/><br><br>
    Описание объявления: <input type="text" name="description"/><br><br>
    Цена: <input type="number" name="price"/><br><br>
    Город: <input type="text" name="city"/><br><br>
    Автор: <input type="text" name="author"/><br><br>
    <input type="submit" value="Добавить товар"/>
</form>
</body>
</html>