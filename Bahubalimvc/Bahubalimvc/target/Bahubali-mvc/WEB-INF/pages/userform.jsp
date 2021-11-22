<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<c:url value="/addUser" var="formUrl" />
<f:form action="${formUrl}" method="post" modelAttribute="user">
    <f:label path="id">User ID</f:label>
    <f:input path="id"/>
    <f:label path="name">Name</f:label>
    <f:input path="name"/>
    <f:errors path="name" cssClass="error"/>
    <f:label path="email">Email</f:label>
    <f:input path="email"/>
    <f:label path="age">Age</f:label>
    <f:input path="age"/>
    <f:label path="country" />
    <f:select path="country">
        <f:options items="${countries}" />
    </f:select>
    <input type="submit" name="submit" value="submit">
</f:form>
${msg}