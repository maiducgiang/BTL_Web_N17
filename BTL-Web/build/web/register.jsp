<%-- 
    Document   : register
    Created on : May 11, 2022, 9:13:53 PM
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
            <div class="tab-pane fade show" id="pills-register" role="tabpanel" aria-labelledby="tab-register">
                <ul class="nav nav-pills nav-justified mb-3" id="ex1" role="tablist">
                    <li class="nav-item" role="presentation">
                      <a class="nav-link" id="tab-login" data-mdb-toggle="pill" href="login.jsp" role="tab"
                        aria-controls="pills-login" aria-selected="true">Login</a>
                    </li>
                    <li class="nav-item" role="presentation">
                      <a class="nav-link active" id="tab-register" data-mdb-toggle="pill" href="register.jsp" role="tab"
                        aria-controls="pills-register" aria-selected="false">Register</a>
                    </li>
                  </ul>
            </div>
            <form action="register">
                  <!-- Username input -->
                  <div class="form-outline mb-4">
                      <input name="user" type="text" id="registerUsername" class="form-control" />
                    <label class="form-label" for="registerUsername">Username</label>
                  </div>

                  <!-- Password input -->
                  <div class="form-outline mb-4">
                      <input name="pass" type="password" id="registerPassword" class="form-control" />
                    <label class="form-label" for="registerPassword">Password</label>
                  </div>

                  <!-- Repeat Password input -->
                  <div class="form-outline mb-4">
                      <input name="repass" type="password" id="registerRepeatPassword" class="form-control" />
                    <label class="form-label" for="registerRepeatPassword">Repeat password</label>
                  </div>
                  <!-- Submit button -->
                  <button type="submit" class="btn btn-primary btn-block mb-3">Sign in</button>
                </form>
              </div>
        </div>
    </body>
</html>
