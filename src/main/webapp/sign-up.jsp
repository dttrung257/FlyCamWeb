<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="icon" href="images/fevicon.png" type="image/gif" />
	<title>Sign Up</title>

	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" />
	<link href="css/sign-in-sign-up.css" rel="stylesheet"/>
	<link href="fontawesome-6.1.2/css/all.min.css" rel="stylesheet" />
	
</head>

<body>
  <div class="container">
    <div class="row">
      <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
        <div class="card border-0 shadow rounded-3 my-5">
          <div class="card-body p-4 p-sm-5">
          	<a href="home" style="text-decoration: none; color: #434f78;">
               &leftarrow; <span>Back to home</span>
            </a>
            <h5 class="card-title text-center mb-5 fw-bold fs-5">Sign Up</h5>
            <form action="sign-up" method="post">
            	<div class="form-floating mb-3">
                <input type="text" class="form-control" id="floatingInput" name="fullName" placeholder="name@example.com">
                <label for="floatingInput">Full Name</label>
              	</div>
              <div class="form-floating mb-3">
                <input type="email" class="form-control" id="floatingInput" name="email" placeholder="name@example.com">
                <label for="floatingInput">Email address</label>
              </div>
              <div class="form-floating mb-3">
                <input type="password" class="form-control" id="floatingPassword" name="password" placeholder="Password">
                <label for="floatingPassword">Password</label>
              </div>
              <div class="d-grid">
                <button class="btn btn-primary btn-login text-uppercase fw-bold" type="submit">Sign
                  Up</button>
              </div>
              <hr class="my-4">
              <p class="text-center">
              	Already have an account?
              	<a href="sign-in" style="text-decoration: none;">Sign In</a>
              </p>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>

</html>