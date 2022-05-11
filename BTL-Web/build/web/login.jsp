<%-- 
    Document   : login
    Created on : May 11, 2022, 9:04:09 PM
    Author     : Nguyen Hoang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </head>
    <body>
        <div style="width: 20%; margin-left: 40%; margin-top: 10%">
                        <!-- Pills navs -->
            <ul class="nav nav-pills nav-justified mb-3" id="ex1" role="tablist">
              <li class="nav-item" role="presentation">
                <a class="nav-link active" id="tab-login" data-mdb-toggle="pill" href="login.jsp" role="tab"
                  aria-controls="pills-login" aria-selected="true">Login</a>
              </li>
              <li class="nav-item" role="presentation">
                <a class="nav-link" id="tab-register" data-mdb-toggle="pill" href="register.jsp" role="tab"
                  aria-controls="pills-register" aria-selected="false">Register</a>
              </li>
            </ul>
            <!-- Pills navs -->

            <!-- Pills content -->
            <div class="tab-content">
              <div class="tab-pane fade show active" id="pills-login" role="tabpanel" aria-labelledby="tab-login">
                  <form action="login" method="post">
                      <div class="text-center mb-3">
                        <div class="form-outline mb-4">
                            <input name="user" type="text" class="form-control" />
                          <label class="form-label" for="loginName">Username</label>
                        </div>

                        <!-- Password input -->
                        <div class="form-outline mb-4">
                            <input name="pass" type="password" id="loginPassword" class="form-control" />
                          <label class="form-label" for="loginPassword">Password</label>
                        </div>
                      
                        <p class="text-danger">${message}</p>

                      </div>
                        <!-- 2 column grid layout -->
                        <div class="row mb-4">
                          <div class="col-md-6 d-flex justify-content-center">
                            <!-- Checkbox -->
                            <div class="form-check mb-3 mb-md-0">
                              <input class="form-check-input" type="checkbox" value="" id="loginCheck" checked />
                              <label class="form-check-label" for="loginCheck"> Remember me </label>
                            </div>
                          </div>

                          <div class="col-md-6 d-flex justify-content-center">
                            <!-- Simple link -->
                            <a href="#!">Forgot password?</a>
                          </div>
                        </div>

                        <!-- Submit button -->
                        <button type="submit" class="btn btn-primary btn-block mb-4">Sign in</button>
                  </form>
                  
              </div>
        </div>
        </div>
    </body>
</html>
