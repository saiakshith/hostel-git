<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h3>this is product page</h3>

<p>
    ${product.name}
    ${product.code}
    ${product.brand}
</p>

********** ${countries}

<h1>Products from Rest Service</h1>
<h2>****** Product Data section ********</h2>
<h5>${restProduct.data.id}</h5>
<h5>${restProduct.data.name}</h5>
<h5>${restProduct.data.year}</h5>
<h5>${restProduct.data.color}</h5>
<h5>${restProduct.data.pantone_value}</h5>
<h2>******* Product Support section ********</h2>
<h5>${restProduct.support.url}</h5>
<h5>${restProduct.support.text}</h5>