<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>eCommerce Product Detail</title>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700" rel="stylesheet">
    <<link rel="stylesheet" href="css/detailProduct.css"/>

  </head>

  <body>
	
	<div class="container">
		<div class="card">
			<div class="container-fliud">
				<div class="wrapper row">
					<div class="preview col-md-6">
						
						<div class="preview-pic tab-content">
						  <div class="tab-pane active" id="pic-1"><img src="${detail.image}" /></div>
						  <div class="tab-pane" id="pic-2"><img src="${detail.image}" /></div>
						  <div class="tab-pane" id="pic-3"><img src="${detail.image}" /></div>
						  <div class="tab-pane" id="pic-4"><img src="${detail.image}" /></div>
						  <div class="tab-pane" id="pic-5"><img src="${detail.image}" /></div>
						</div>
						
						
					</div>
					<div class="details col-md-6">
						<h3 class="product-title">${detail.name}</h3>
						<p class="product-description">${detail.description}</p>
						<h4 class="price">current price: <span>${detail.price}</span></h4>
				
						
						<h5 class="colors">colors:
							<span class="color orange not-available" data-toggle="tooltip" title="Not In store"></span>
							<span class="color green"></span>
							<span class="color blue"></span>
						</h5>
						<div class="action">
							<button class="add-to-cart btn btn-default" type="button">add to cart</button>
							<button class="like btn btn-default" type="button"><span class="fa fa-heart"></span></button>
                                                        <a class="btn btn-default" href="home">Return</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
  </body>
</html>

