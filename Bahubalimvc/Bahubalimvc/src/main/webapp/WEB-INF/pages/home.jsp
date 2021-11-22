<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h1>${msg}</h1>
<c:url var="productUrl" value="/product?code=p-123" />
<c:url var="formUrl" value="/product" />
<c:url var="addUser" value="/addUser" />

<form action="${formUrl}" method="post">
    code : <input type="text" name="code" />
    <input type="submit" name="submit" />
</form>


<h4>
    <a href="${productUrl}">OnePlus 6</a>
</h4>

<h4>
    <a href="${addUser}">Add New User</a>
</h4>