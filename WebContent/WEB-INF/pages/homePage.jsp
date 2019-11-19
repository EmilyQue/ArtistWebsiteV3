<%--//Almicke Navarro and Emily Quevedo
	//CST-341
	//September 17, 2019 
	//This is our own work. 
	
	//VIEW
	//this is the home page of the website; it will greet the user--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>RGO Crew</title>
    <link rel="stylesheet" href="/resources/assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Cabin:700">
    <link rel="stylesheet" href="/resources/assets/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="/resources/assets/fonts/line-awesome.min.css">
    <link rel="stylesheet" href="/resources/assets/css/Login-Form-Dark.css">
</head>

<body id="page-top" style="background-image: url(&quot;resources/stars.gif&quot;);">
    
    <div style="padding: 100px; position:relative">	
		<h1>Watch our latest video</h1>
		
	<iframe width="75%" height="400" src="https://www.youtube.com/embed/8k1M29QKmUw" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
		
	</div>

    <script src="/resources/assets/js/jquery.min.js"></script>
    <script src="/resources/assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
    <script src="/resources/assets/js/grayscale.js"></script>
    
    <div style="padding: 150px; padding-top: 50px; position:relative">	
    
		<div class = "card-deck">
	            	<div class="card text-white bg-dark mb-3" style="width: 15rem;" >
	            		<div class="card-body">
	            			<h3 class="card-title">SPOTIFY</h3>
	   					 	<iframe src="https://open.spotify.com/embed/album/5soA01GVZxM5t3Oh4IOWtU" width="80%" height="500" margin="15" frameborder="0" allowtransparency="true" allow="encrypted-media"></iframe>
	            	</div>
	    			</div>
	    				    		<div class="card text-white bg-dark mb-3" style="width: 15rem;" >
	            		<div class="card-body">
	            			<h3 class="card-title">APPLE MUSIC</h3>
	   					 	<iframe allow="autoplay *; encrypted-media *;" frameborder="0" width="80%" height="500" margin="15" style="max-width:660px;overflow:hidden;background:transparent;margin:15px;" sandbox="allow-forms allow-popups allow-same-origin allow-scripts allow-storage-access-by-user-activation allow-top-navigation-by-user-activation" src="https://embed.music.apple.com/us/album/and-the-argonauts-ep/1473397136"></iframe>
	            </div>
	            </div>
	            	

    </div>
    <div class="card text-white bg-dark mb-3" style="width: 60rem; margin-top: 50px">
	            		<div class="card-body">
	            			<h3 class="card-title">FOLLOW OUR INSTAGRAM</h3>
	    					<div class='embedsocial-instagram' data-ref="56ececb3017f83dc16a6fcdcd96a75a6bd7a5820"></div><script>(function(d, s, id){var js; if (d.getElementById(id)) {return;} js = d.createElement(s); js.id = id; js.src = "https://embedsocial.com/embedscript/in.js"; d.getElementsByTagName("head")[0].appendChild(js);}(document, "script", "EmbedSocialInstagramScript"));</script>
	              		</div>
	    			</div>
</body>

</html>
