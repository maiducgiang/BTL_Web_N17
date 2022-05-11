<%-- 
    Document   : home
    Created on : May 9, 2022, 4:15:29 PM
    Author     : Nguyen Hoang
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="/css/main.css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </head>
    <body>
            <!-- Navbar -->
            <nav class="navbar-color navbar fixed-top navbar-expand-lg navbar-light white scrolling-navbar" style="background-color: #929fba;">
        <div class="container">

          <!-- Brand -->
          <a class="navbar-brand waves-effect" href="https://mdbootstrap.com/docs/jquery/" target="_blank">
            <strong class="blue-text">MDB</strong>
          </a>

          <!-- Collapse -->
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
            aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>

          <!-- Links -->
          <div class="collapse navbar-collapse" id="navbarSupportedContent">

            <!-- Left -->
            <ul class="navbar-nav mr-auto">
              <li class="nav-item active">
                <a class="nav-link waves-effect" href="home">Home
                  <span class="sr-only">(current)</span>
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link waves-effect" href="https://mdbootstrap.com/docs/jquery/" target="_blank">About MDB</a>
              </li>
              <li class="nav-item">
                <a class="nav-link waves-effect" href="https://mdbootstrap.com/docs/jquery/getting-started/download/" target="_blank">Free download</a>
              </li>
              <li class="nav-item">
                <a class="nav-link waves-effect" href="https://mdbootstrap.com/education/bootstrap/" target="_blank">Free tutorials</a>
              </li>
            </ul>

            <!-- Right -->
            <ul class="navbar-nav nav-flex-icons">
              <li class="nav-item">
                <a class="nav-link waves-effect">
                  <span class="badge red z-depth-1 mr-1"> 1 </span>
                  <i class="fas fa-shopping-cart"></i>
                  <span class="clearfix d-none d-sm-inline-block"> Cart </span>
                </a>
              </li>
              <li class="nav-item">
                <a href="https://www.facebook.com/mdbootstrap" class="nav-link waves-effect" target="_blank">
                  <i class="fab fa-facebook-f"></i>
                </a>
              </li>
              <li class="nav-item">
                <a href="https://twitter.com/MDBootstrap" class="nav-link waves-effect" target="_blank">
                  <i class="fab fa-twitter"></i>
                </a>
              </li>
              <li class="nav-item">
                <a href="login.jsp" class="nav-link border border-light rounded waves-effect">
                  <i class="fa-solid fa-right-to-bracket"></i>
                  Login
                </a>
              </li>
            </ul>

          </div>

        </div>
      </nav>
      <!-- Navbar -->

      <!--Carousel Wrapper-->
      <div id="carousel-example-1z" class="carousel slide carousel-fade pt-4" data-ride="carousel">

        <!--Indicators-->
        <ol class="carousel-indicators">
          <li data-target="#carousel-example-1z" data-slide-to="0" class="active"></li>
          <li data-target="#carousel-example-1z" data-slide-to="1"></li>
          <li data-target="#carousel-example-1z" data-slide-to="2"></li>
        </ol>
        <!--/.Indicators-->
      </div>
      <!--/.Carousel Wrapper-->

      <!--Main layout-->
      <main>
        <div class="container mt-5">

          <!--Navbar-->
          <!-- Navbar -->
            <nav class="navbar navbar-expand-lg navbar-light bg-light mb-4">
              <!-- Container wrapper -->
              <div class="container-fluid">
                <!-- Toggle button -->
                <button
                  class="navbar-toggler"
                  type="button"
                  data-mdb-toggle="collapse"
                  data-mdb-target="#navbarSupportedContent"
                  aria-controls="navbarSupportedContent"
                  aria-expanded="false"
                  aria-label="Toggle navigation"
                >
                  <i class="fas fa-bars"></i>
                </button>

                <!-- Collapsible wrapper -->
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                  <!-- Navbar brand -->
                  <a class="navbar-brand mt-2 mt-lg-0" href="home">
                    Category
                  </a>
                  <!-- Left links -->
                  <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                      <c:forEach items="${listC}" var="o">
                        <li class="nav-item ${tag == o.id ? "active":""}">
                            <a class="nav-link" href="category?id=${o.id}">${o.name}</a>
                        </li>
                      </c:forEach>
                  </ul>
                  <!-- Left links -->
                </div>
                <!-- Collapsible wrapper -->
                <!-- search elements -->
                <form action="search" method="post">
                    <div class="form-outline">
                        <input value="${value}" name="txtsearch" type="search" id="form1" class="form-control" placeholder="Search" />
                    </div>
          
                </form>
                <!-- search elements// -->
              </div>
              <!-- Container wrapper -->
            </nav>
            <!-- Navbar -->

            <div class="col-sm-9">
                <div class="row">
                    <c:forEach items="${listP}" var="o">
                        <div class="col-12 col-md-6 col-lg-4">
                            <div class="card">
                                <img class="card-img-top" src="${o.image}" alt="Card image cap">
                                <div class="card-body">
                                    <h4 class="card-title show_txt"><a href="detail?pid=${o.id}" title="View Product">${o.name}</a></h4>
                                    <p class="card-text show_txt">${o.title}</p>
                                    <div class="row">
                                        <div class="col">
                                            <p class="btn btn-danger btn-block">${o.price} $</p>
                                        </div>
                                        <div class="col">
                                            <a href="#" class="btn btn-success btn-block">Add to cart</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>
      </main>
      <!--Main layout-->

      <!--Footer-->
      <footer class="page-footer text-center font-small mt-4 wow fadeIn">

        <!--Call to action-->
        <div class="pt-4">
          <a class="btn btn-outline-white" href="https://mdbootstrap.com/docs/jquery/getting-started/download/" target="_blank" role="button">Download MDB
            <i class="fas fa-download ml-2"></i>
          </a>
          <a class="btn btn-outline-white" href="https://mdbootstrap.com/education/bootstrap/" target="_blank" role="button">Start free tutorial
            <i class="fas fa-graduation-cap ml-2"></i>
          </a>
        </div>
        <!--/.Call to action-->

        <hr class="my-4">

        <!-- Social icons -->
        <div class="pb-4">
          <a href="https://www.facebook.com/mdbootstrap" target="_blank">
            <i class="fab fa-facebook-f mr-3"></i>
          </a>

          <a href="https://twitter.com/MDBootstrap" target="_blank">
            <i class="fab fa-twitter mr-3"></i>
          </a>

          <a href="https://www.youtube.com/watch?v=7MUISDJ5ZZ4" target="_blank">
            <i class="fab fa-youtube mr-3"></i>
          </a>

          <a href="https://plus.google.com/u/0/b/107863090883699620484" target="_blank">
            <i class="fab fa-google-plus-g mr-3"></i>
          </a>

          <a href="https://dribbble.com/mdbootstrap" target="_blank">
            <i class="fab fa-dribbble mr-3"></i>
          </a>

          <a href="https://pinterest.com/mdbootstrap" target="_blank">
            <i class="fab fa-pinterest mr-3"></i>
          </a>

          <a href="https://github.com/mdbootstrap/bootstrap-material-design" target="_blank">
            <i class="fab fa-github mr-3"></i>
          </a>

          <a href="http://codepen.io/mdbootstrap/" target="_blank">
            <i class="fab fa-codepen mr-3"></i>
          </a>
        </div>
        <!-- Social icons -->

        <!--Copyright-->
        <div class="footer-copyright py-3">
          © 2018 Copyright:
          <a href="https://mdbootstrap.com/education/bootstrap/" target="_blank"> MDBootstrap.com </a>
        </div>
        <!--/.Copyright-->

      </footer>
      <!--/.Footer-->
    </body>
</html>
