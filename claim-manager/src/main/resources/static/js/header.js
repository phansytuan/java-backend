function getCurrentUser() {
  let baseUrl = window.origin;
  let fullUrl = baseUrl + "/api/current-user";

  fetch(fullUrl)
  .then(response => {
    if (!response.ok) {
      return Promise.reject(response)
    }
    return response.json();
  }).then(body => {
    let fullName = document.getElementById("fullName");
    fullName.innerHTML = body.data.firstName + " " + body.data.lastName;
    let userName = document.getElementById("userName");
    userName.innerHTML = body.data.username;
  }).catch(body => {
    console.log(body)
    alert("get current user fail")
  })
}

window.onload = function () {
  getCurrentUser();
}