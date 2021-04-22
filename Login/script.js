$("#login-submit").click(function (event) {
  event.preventDefault();

  var user = $(".login-user").val();
  var pass = $(".login-pass").val();
  var message = "Invalid username or password.";

  if (user === "sicredi" && pass === "teste123") {
    $("form").fadeOut(500, function () {
      $(".container").addClass("login-success");
      $(".login-message").fadeIn(1000);
    });
  } else {
    if (user === "" && pass === "") {
      message = "Required fields.";
    }

    $(".login-error-message").text(message);
    $(".login-error").fadeIn(300);
    HideLoginError();
  }
});

function HideLoginError() {
  if ($("#login-error").css("display") !== "none") {
    setTimeout(function () {
      $("#login-error").fadeOut(1000);
    }, 2000);
  }
}
