<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="user_option_box">
	<c:if test="${sessionScope.accountInfo != null}"> 
		<a href="profile" class="account-link"> 
			<i class="fa fa-user" aria-hidden="true" style="color: #fff;"></i> 
			<span style="text-transform: none; font-size: 15px;"> My Account </span>
		</a>
	</c:if> 
	<a href="cart" class="cart-link"> 
		<i class="fa fa-shopping-cart" aria-hidden="true" style="color: #fff;"></i> 
		<span style="text-transform: none; font-size: 15px;"> Cart </span>
	</a>
	<c:if test="${sessionScope.accountInfo != null}"> 
	 	<a style="padding-right: 5px; border-right: 1px solid #fff" href="#">
			<span style="font-size: 15px; text-transform: none">Welcome, ${sessionScope.accountInfo.fullName}</span>
		</a>
		<a style="margin-left: 0px" href="log-out"> 
			<span style="font-size: 15px; text-transform: none">Log Out</span>
		</a>
	</c:if>
	<c:if test="${sessionScope.accountInfo == null}">
		<a style="padding-right: 5px; border-right: 1px solid #fff" href="sign-in">
			<span style="font-size: 15px; text-transform: none">Sign In</span>
		</a>
		<a style="margin-left: 0px" href="sign-up"> 
			<span style="font-size: 15px; text-transform: none">Sign Up</span>
		</a>
	</c:if>
</div>