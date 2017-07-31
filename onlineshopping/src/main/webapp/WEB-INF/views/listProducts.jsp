<div class="container">
	<div class="row">
<!-- Display sidebar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>

		</div>

		<!-- Display actual products -->
		<div class="col-md-9">
			<div class="row">

				<div class="col-lg-12">
					<!-- added breadcrumb componenet hyyyhfhfhfhfhyfyh-->
				<!-- 	  console.log(${userClickAllProducts});  -->  
					<c:if test="${userClickAllProducts == true}">
						<ol class="breadcrumb">
						  <li class="breadcrumb-item"><a href="${contextRoot}/Home">Home</a></li>
						  <li class="active breadcrumb-item">All Products</li>
						</ol>
					</c:if>
				 <!--  console.log(${userClickCategoryProducts}); --> 
					<c:if test="${userClickCagtegoryProducts == true}">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${contextRoot}/Home">Home</a></li>
							<li class="active breadcrumb-item">Category</li>
							<li class="active breadcrumb-item">${category.name}</li>
						</ol>
					</c:if> 

				</div>
			</div>
		</div>


	</div>
</div>