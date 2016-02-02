<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<div class="well well-sm">
	<div class="container">
		<div class="row">
			<h3>Featured</h3>
			<h5>View:</h5>
			<div class="btn-group">
				<a href="#" id="grid" class="btn btn-default btn-sm"><span
					class="glyphicon glyphicon-th"></span> Grid</a> <a href="#" id="list"
					class="btn btn-default btn-sm"><span
					class="glyphicon glyphicon-th-list"></span> List</a>
			</div>
		</div>
	</div>
</div>

<div id="content" class="container list-group">

	<div class="row">
		<c:forEach var="product" items="${products}">
		
			<div class="item  col-md-3 col-sm-6">
				<div class="thumbnail">
				
					<a href='<spring:url value="/product/${product.id}" />'>
						<img class="group list-group-image img-responsive" src="<spring:url value='/resources/img/${product.image}'></spring:url>" alt="mac">
					</a>
					
					<div class="caption">
											
						<h4 class="group inner list-group-item-heading"><c:out value="${product.name}" /></h4>
						<p class="group inner list-group-item-text">This is a short	product description.</p>
						<h5>
							<c:choose>
								<c:when test="${product.quantity gt 0 }">
									Availability: <span class="green">In Stock</span>
								</c:when>
								<c:otherwise>
									Availability: <span class="red">Not in Stock </span>
								</c:otherwise>
							</c:choose>				
							
						</h5>
						<div class="btn-group">
							<button type="button" class="btn btn-default">$<c:out value="${product.price}" /></button>
							<a href="cart/add/${product.id}" class="btn btn-info">Add to cart</a>
						</div>
					</div>
				</div>
			</div>
			
		</c:forEach>

	</div>
	<!-- END ROW-->
</div>

