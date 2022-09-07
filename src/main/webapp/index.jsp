<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

<title>Home</title>

<!-- bootstrap core css -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />

<!-- fonts style -->
<link
	href="https://fonts.googleapis.com/css?family=Poppins:400,700&display=swap"
	rel="stylesheet">
<!-- range slider -->

<!-- font awesome style -->
<link href="css/font-awesome.min.css" rel="stylesheet" />
<link href="fontawesome-6.1.2/css/all.min.css" rel="stylesheet" />

<!-- Custom styles for this template -->
<link href="css/style.css" rel="stylesheet" />
<!-- responsive style -->
<link href="css/responsive.css" rel="stylesheet" />

</head>

<body>

	<div class="hero_area">
		<!-- header section strats -->
		<header class="header_section">
			<div class="header_top">
				<div class="container-fluid">
					<div class="top_nav_container">
						<div class="contact_nav">
							<a href=""> <i class="fa fa-phone" aria-hidden="true"></i> <span>
									Call : 0123456789 </span>
							</a> <a href=""> <i class="fa fa-envelope" aria-hidden="true"></i>
								<span> Email : flycam@gmail.com </span>
							</a>
						</div>
						<form action="product" class="search_form" method="post">
							<input type="text" class="form-control" name="input"
								placeholder="Search here...">
							<button class="" type="submit">
								<i class="fa fa-search" aria-hidden="true"></i>
							</button>
						</form>

						<%@ include file="/user-box/user-box.jsp"%>

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
								<li class="nav-item active"><a class="nav-link" href="home">Home
										<span class="sr-only">(current)</span>
								</a></li>
								<li class="nav-item"><a class="nav-link" href="about">
										About</a></li>
								<li class="nav-item"><a class="nav-link" href="product">Products</a>
								</li>
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
		<!-- slider section -->
		<section class="slider_section ">
			<div id="customCarousel1" class="carousel slide" data-ride="carousel">
				<div class="carousel-inner">
					<div class="carousel-item active">
						<div class="container ">
							<div class="row">
								<div class="col-md-6">
									<div class="detail-box">
										<h1>Welcome to our shop</h1>
										<p>Lorem ipsum dolor sit amet, consectetur adipisicing
											elit. Iste quam velit saepe dolorem deserunt quo quidem ad
											optio.</p>
										<a href=""> Read More </a>
									</div>
								</div>
								<div class="col-md-6">
									<div class="img-box">
										<img src="images/slider-img.png" alt="">
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="carousel-item">
						<div class="container ">
							<div class="row">
								<div class="col-md-6">
									<div class="detail-box">
										<h1>Welcome to our shop</h1>
										<p>Lorem ipsum dolor sit amet, consectetur adipisicing
											elit. Iste quam velit saepe dolorem deserunt quo quidem ad
											optio.</p>
										<a href="about"> Read More </a>
									</div>
								</div>
								<div class="col-md-6">
									<div class="img-box">
										<img src="images/slider-img.png" alt="">
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="carousel-item">
						<div class="container ">
							<div class="row">
								<div class="col-md-6">
									<div class="detail-box">
										<h1>Welcome to our shop</h1>
										<p>Lorem ipsum dolor sit amet, consectetur adipisicing
											elit. Iste quam velit saepe dolorem deserunt quo quidem ad
											optio.</p>
										<a href="about"> Read More </a>
									</div>
								</div>
								<div class="col-md-6">
									<div class="img-box">
										<img src="images/slider-img.png" alt="">
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="carousel_btn_box">
					<a class="carousel-control-prev" href="#customCarousel1"
						role="button" data-slide="prev"> <i class="fa fa-angle-left"
						aria-hidden="true"></i> <span class="sr-only">Previous</span>
					</a> <a class="carousel-control-next" href="#customCarousel1"
						role="button" data-slide="next"> <i class="fa fa-angle-right"
						aria-hidden="true"></i> <span class="sr-only">Next</span>
					</a>
				</div>
			</div>
		</section>
		<!-- end slider section -->
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
								<a href="${addToCart}" class="add_cart_btn"> <span>Add
										To Cart</span>
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

	<!-- about section -->

	<section class="about_section">
		<div class="container-fluid  ">
			<div class="row">
				<div class="col-md-5 ml-auto">
					<div class="detail-box pr-md-3">
						<div class="heading_container">
							<h2>We Provide Best For You</h2>
						</div>
						<p>Totam architecto rem beatae veniam, cum officiis adipisci
							soluta perspiciatis ipsa, expedita maiores quae accusantium.
							Animi veniam aperiam, necessitatibus mollitia ipsum id optio ipsa
							odio ab facilis sit labore officia! Repellat expedita, deserunt
							eum soluta rem culpa. Aut, necessitatibus cumque. Voluptas
							consequuntur vitae aperiam animi sint earum, ex unde cupiditate,
							molestias dolore quos quas possimus eveniet facilis magnam? Vero,
							dicta.</p>
						<a href=""> Read More </a>
					</div>
				</div>
				<div class="col-md-6 px-0">
					<div class="img-box">
						<img src="images/about-img.jpg" alt="">
					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- end about section -->

	<!-- why us section -->

	<section class="why_us_section layout_padding">
		<div class="container">
			<div class="heading_container heading_center">
				<h2>Why Choose Us</h2>
			</div>
			<div class="row">
				<div class="col-md-4">
					<div class="box ">
						<div class="img-box">
							<img src="images/w1.png" alt="">
						</div>
						<div class="detail-box">
							<h5>Fast Delivery</h5>
							<p>variations of passages of Lorem Ipsum available</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="box ">
						<div class="img-box">
							<img src="images/w2.png" alt="">
						</div>
						<div class="detail-box">
							<h5>Free Shiping</h5>
							<p>variations of passages of Lorem Ipsum available</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="box ">
						<div class="img-box">
							<img src="images/w3.png" alt="">
						</div>
						<div class="detail-box">
							<h5>Best Quality</h5>
							<p>variations of passages of Lorem Ipsum available</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- end why us section -->


	<!-- client section -->

	<section class="client_section layout_padding-bottom">
		<div class="container">
			<div class="heading_container heading_center">
				<h2>What Says Our Customers</h2>
			</div>
		</div>
		<div class="client_container ">
			<div id="carouselExample2Controls" class="carousel slide"
				data-ride="carousel">
				<div class="carousel-inner">
					<div class="carousel-item active">
						<div class="container">
							<div class="box">
								<div class="detail-box">
									<p>
										<i class="fa fa-quote-left" aria-hidden="true"></i>
									</p>
									<p>It is a long established fact that a reader will be
										distracted by the readable content of a page when looking at
										its layout. The point of using Lorem Ipsum is that it has a
										more-or-less normal distribution of letters, as opposed to
										using 'Content here, content here', making it lookIt is a long
										established fact that a reader will be distracted by the
										readable content of a page when looking at its layout. The
										point of using Lorem Ipsum is that it has a more-or-less
										normal distribution of letters, as opposed to using 'Content
										here, content here', making it look</p>
								</div>
								<div class="client-id">
									<div class="img-box">
										<img src="images/client.jpg" alt="">
									</div>
									<div class="name">
										<h5>James Dew</h5>
										<h6>Photographer</h6>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="carousel-item">
						<div class="container">
							<div class="box">
								<div class="detail-box">
									<p>
										<i class="fa fa-quote-left" aria-hidden="true"></i>
									</p>
									<p>It is a long established fact that a reader will be
										distracted by the readable content of a page when looking at
										its layout. The point of using Lorem Ipsum is that it has a
										more-or-less normal distribution of letters, as opposed to
										using 'Content here, content here', making it lookIt is a long
										established fact that a reader will be distracted by the
										readable content of a page when looking at its layout. The
										point of using Lorem Ipsum is that it has a more-or-less
										normal distribution of letters, as opposed to using 'Content
										here, content here', making it look</p>
								</div>
								<div class="client-id">
									<div class="img-box">
										<img src="images/client.jpg" alt="">
									</div>
									<div class="name">
										<h5>James Dew</h5>
										<h6>Photographer</h6>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="carousel-item">
						<div class="container">
							<div class="box">
								<div class="detail-box">
									<p>
										<i class="fa fa-quote-left" aria-hidden="true"></i>
									</p>
									<p>It is a long established fact that a reader will be
										distracted by the readable content of a page when looking at
										its layout. The point of using Lorem Ipsum is that it has a
										more-or-less normal distribution of letters, as opposed to
										using 'Content here, content here', making it lookIt is a long
										established fact that a reader will be distracted by the
										readable content of a page when looking at its layout. The
										point of using Lorem Ipsum is that it has a more-or-less
										normal distribution of letters, as opposed to using 'Content
										here, content here', making it look</p>
								</div>
								<div class="client-id">
									<div class="img-box">
										<img src="images/client.jpg" alt="">
									</div>
									<div class="name">
										<h5>James Dew</h5>
										<h6>Photographer</h6>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="carousel_btn-box">
					<a class="carousel-control-prev" href="#carouselExample2Controls"
						role="button" data-slide="prev"> <span> <i
							class="fa fa-angle-left" aria-hidden="true"></i>
					</span> <span class="sr-only">Previous</span>
					</a> <a class="carousel-control-next" href="#carouselExample2Controls"
						role="button" data-slide="next"> <span> <i
							class="fa fa-angle-right" aria-hidden="true"></i>
					</span> <span class="sr-only">Next</span>
					</a>
				</div>
			</div>
		</div>
	</section>
	<!-- end client section -->

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