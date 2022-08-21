<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<!-- Basic -->
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<!-- Mobile Metas -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<!-- Site Metas -->
<link rel="icon" href="images/fevicon.png" type="image/gif" />
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="author" content="" />

<title>Products</title>


<!-- bootstrap core css -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />

<!-- fonts style -->
<link
	href="https://fonts.googleapis.com/css?family=Poppins:400,700&display=swap"
	rel="stylesheet">
<!-- range slider -->

<!-- font awesome style -->
<link href="css/font-awesome.min.css" rel="stylesheet" />

<!-- Custom styles for this template -->
<link href="css/style.css" rel="stylesheet" />
<!-- responsive style -->
<link href="css/responsive.css" rel="stylesheet" />

</head>

<body class="sub_page">

	<div class="hero_area">
		<!-- header section strats -->
		<header class="header_section">
			<div class="header_top">
				<div class="container-fluid">
					<div class="top_nav_container">
						<div class="contact_nav">
							<a href=""> <i class="fa fa-phone" aria-hidden="true"></i> <span>
									Call : +01 123455678990 </span>
							</a> <a href=""> <i class="fa fa-envelope" aria-hidden="true"></i>
								<span> Email : demo@gmail.com </span>
							</a>
						</div>
						<form action="product" class="search_form" method="post">
							<input type="text" class="form-control" name="input"
								placeholder="Search here...">
							<button class="" type="submit">
								<i class="fa fa-search" aria-hidden="true"></i>
							</button>
						</form>
						<div class="user_option_box">
							<a href="" class="account-link"> <i class="fa fa-user"
								aria-hidden="true"></i> <span> My Account </span>
							</a> 
							<a href="cart" class="cart-link"> <i
								class="fa fa-shopping-cart" aria-hidden="true"></i> <span>
									Cart </span>
							</a> 
							<a style="padding-right: 5px; border-right: 1px solid #fff"
								href="#"> 
								<span style="font-size: 15px; text-transform: none">
								Sign in
								</span>
							</a> 
							<a style="margin-left: 0px" href="#"> 
							<span style="font-size: 15px; text-transform: none">
								Sign Out
							</span>
							</a>
						</div>
					</div>

				</div>
			</div>
			<div class="header_bottom">
				<div class="container-fluid">
					<nav class="navbar navbar-expand-lg custom_nav-container ">
						<a class="navbar-brand" href="home"> <span> DttShop </span>
						</a>

						<button class="navbar-toggler" type="button"
							data-toggle="collapse" data-target="#navbarSupportedContent"
							aria-controls="navbarSupportedContent" aria-expanded="false"
							aria-label="Toggle navigation">
							<span class=""> </span>
						</button>

						<div class="collapse navbar-collapse" id="navbarSupportedContent">
							<ul class="navbar-nav ">
								<li class="nav-item "><a class="nav-link" href="home">Home
										<span class="sr-only">(current)</span>
								</a></li>
								<li class="nav-item"><a class="nav-link" href="about">
										About</a></li>
								<li class="nav-item active"><a class="nav-link"
									href="product">Products</a></li>
								<li class="nav-item"><a class="nav-link" href="why">Why
										Us</a></li>
								<li class="nav-item"><a class="nav-link" href="testimonial">Testimonial</a>
								</li>
							</ul>
						</div>
					</nav>
				</div>
			</div>
		</header>
		<!-- end header section -->
	</div>


	<!-- product section -->

	<section class="product_section layout_padding">
		<div class="container">
			<div class="heading_container heading_center">
				<h2>Our Products</h2>
			</div>

			<div class="row">
				<c:forEach items="${listProduct}" var="o">
					<div class="col-sm-6 col-lg-4">
						<div class="box">
							<div class="img-box">
								<img src="${o.imageUrl}" alt="">
								<c:url value="add-to-cart?id=${o.productId}" var="addToCart" />
								<a href="${addToCart}" class="add_cart_btn"> <span>
										Add To Cart </span>
								</a>
							</div>
							<div class="detail-box">
								<h5>${o.productName}</h5>
								<div class="product_info">
									<h5>
										<span>$</span> ${o.price}
									</h5>
									<div class="star_container">
										<i class="fa fa-star" aria-hidden="true"></i> <i
											class="fa fa-star" aria-hidden="true"></i> <i
											class="fa fa-star" aria-hidden="true"></i> <i
											class="fa fa-star" aria-hidden="true"></i> <i
											class="fa fa-star" aria-hidden="true"></i>
									</div>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
			<div class="btn_box">
				<a href="product" class="view_more-link"> View More </a>
			</div>
		</div>
	</section>

	<!-- end product section -->


	<!-- info section -->
	<section class="info_section ">
		<div class="container">
			<div class="row">
				<div class="col-md-3">
					<div class="info_contact">
						<h5>
							<a href="" class="navbar-brand"> <span> DttShop </span>
							</a>
						</h5>
						<p>
							<i class="fa fa-map-marker" aria-hidden="true"></i> Address
						</p>
						<p>
							<i class="fa fa-phone" aria-hidden="true"></i> +01 1234567890
						</p>
						<p>
							<i class="fa fa-envelope" aria-hidden="true"></i> demo@gmail.com
						</p>
					</div>
				</div>
				<div class="col-md-3">
					<div class="info_info">
						<h5>Information</h5>
						<p>Eligendi sunt, provident, debitis nemo, facilis cupiditate
							velit libero dolorum aperiam enim nulla iste maxime corrupti ad
							illo libero minus.</p>
					</div>
				</div>
				<div class="col-md-3">
					<div class="info_links">
						<h5>Useful Link</h5>
						<ul>
							<li><a href="home"> Home </a></li>
							<li><a href="about"> About </a></li>
							<li><a href="product"> Products </a></li>
							<li><a href="why"> Why Us </a></li>
							<li><a href="testimonial"> Testimonial </a></li>
						</ul>
					</div>
				</div>
				<div class="col-md-3">
					<div class="info_form ">
						<h5>Newsletter</h5>
						<form action="">
							<input type="email" placeholder="Enter your email">
							<button>Subscribe</button>
						</form>
						<div class="social_box">
							<a href=""> <i class="fa fa-facebook" aria-hidden="true"></i>
							</a> <a href=""> <i class="fa fa-twitter" aria-hidden="true"></i>
							</a> <a href=""> <i class="fa fa-instagram" aria-hidden="true"></i>
							</a> <a href=""> <i class="fa fa-youtube" aria-hidden="true"></i>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- end info_section -->


	<!-- footer section -->
	<footer class="footer_section">
		<div class="container">
			<p>
				&copy; <span id="displayYear"></span> All Rights Reserved By <a
					href="https://html.design/">Free Html Templates</a>
			</p>
		</div>
	</footer>
	<!-- footer section -->

	<!-- jQery -->
	<script src="js/jquery-3.4.1.min.js"></script>
	<!-- bootstrap js -->
	<script src="js/bootstrap.js"></script>
	<!-- custom js -->
	<script src="js/custom.js"></script>


</body>

</html>