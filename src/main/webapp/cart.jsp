<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cart</title>

<link href="fontawesome-6.1.2/css/all.min.css" rel="stylesheet" />
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/cart-style.css">
</head>
<body>
	<div class="card">
		<div class="row">
			<div class="col-md-8 cart">
				<div class="title">
					<div class="row">
						<div class="col">
							<h4>
								<b>Cart</b>
							</h4>
						</div>
						<div class="col align-self-center text-right text-muted">${numberProduct}
							items</div>
					</div>
				</div>
				<c:forEach items="${listCartItem}" var="cartItem">
					<div class="row border-top border-bottom">
						<div class="row main align-items-center">
							<div class="col-2">
								<img class="img-fluid" src="${cartItem.imageUrl}">
							</div>
							<div class="col">
								<!-- <div class="row text-muted">Shirt</div>  -->
								<div class="row">${cartItem.productName}</div>
							</div>
							<div class="col">
								<c:url value="reduce-quantity?id=${cartItem.productId}"
									var="reduceQuantity" />
								<a href="${reduceQuantity}">-</a> <a href="#" class="border">${cartItem.quantity}</a>

								<c:url value="add-quantity?id=${cartItem.productId}"
									var="addQuantity" />
								<a href="${addQuantity}">+</a>

							</div>
							<div class="col">
								$ ${cartItem.itemPrice}
								<c:url value="remove-item?id=${cartItem.productId}"
									var="removeItem" />
								<a href="${removeItem}"> <span class="close">&#10005;</span>
								</a>
							</div>
						</div>
					</div>
				</c:forEach>

				<div class="back-to-shop">
					<a href="home"> <i class="fa-solid fa-arrow-left"></i> <span
						class="text-muted">Back to shop</span>
					</a>
				</div>
			</div>
			<div class="col-md-4 summary">
				<div>
					<h5>
						<b>Summary</b>
					</h5>
				</div>
				<hr>
				<div class="row">
					<div class="col" style="padding-left: 0;">ITEMS
						${numberProduct}</div>
					<div class="col text-right">$ ${totalPrice}</div>
				</div>
				<form>
					<p>SHIPPING</p>
					<select><option class="text-muted">Standard-Delivery-
							$0.00</option></select>
					<p>GIVE CODE</p>
					<input id="code" placeholder="Enter your code">
				</form>
				<div class="row"
					style="border-top: 1px solid rgba(0, 0, 0, .1); padding: 2vh 0;">
					<div class="col">TOTAL PRICE</div>
					<div class="col text-right">$ ${totalPrice}</div>
				</div>
				<button class="btn">CHECKOUT</button>
			</div>
		</div>

	</div>
</body>
</html>