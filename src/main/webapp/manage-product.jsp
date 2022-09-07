<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Product Management</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css">
</head>

<body>
	<div class="container p-4">
		<a href="home" style="text-decoration: none; color: #333;">Back To
			Home</a>
		<h1 class="text-center">Product Management</h1>
		<a href="#" class="btn btn-primary">Add new product</a>
		<div class="table-responsive mt-3">
			<table class="table table-bordered">
				<thead>
					<tr>
						<th class="text-center text-primary">Id</th>
						<th class="text-center text-primary">Name</th>
						<th class="text-center text-primary">Image</th>
						<th class="text-center text-primary">Price</th>
						<th class="text-center text-primary">Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${listProduct}" var="p">
						<tr>
							<td class="text-center">${p.productId}</td>
							<td class="text-center">${p.productName}</td>
							<td class="d-flex justify-content-center"><img
								style="max-width: 70px;" src="${p.imageUrl}" alt="" /></td>
							<td class="text-center">${p.price}</td>
							<td class="text-center"><a class="btn btn-primary btn-sm"
								href="#">View</a> <a class="btn btn-warning btn-sm" href="#">Edit</a>
								<a class="btn btn-danger btn-sm" href="#">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>