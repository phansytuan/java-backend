// B4. Trong file create-user.js, method createUser() thực hiện các hành động
const PAGE_INIT = 0;
const SIZE_DEFAULT = 3;
const BASE_URL = 'http://localhost:8080/';
const CMS_USER_PAGE = 'http://localhost:8080/cms/user-manager';

var base64Image = '';

document.getElementById('upload').addEventListener('change', function () {
  const file = this.files[0];
  if (file) {
    const reader = new FileReader();
    reader.onload = function (e) {
      base64Image = e.target.result;
      document.getElementById('uploadedAvatar').setAttribute('src',
          base64Image);
    }
    reader.readAsDataURL(file);
  }
});

function createUser(e) {
  /*
      1.	lấy toàn bộ thông tin trong form của admin điền
      2.	thực hiện lấy dữ liệu file avatar của form và convert file ảnh sang dạng StringBase64
      3.	convert toàn thông tin user trong form và StringBase64 image trong object userDto thành String json
      4.	đưa String json vào body và gửi vào api create-user
  */
  e.preventDefault();
  let userDto = {
    username: document.getElementById("username").value,
    password: document.getElementById("password").value,
    email: document.getElementById("email").value,
    firstName: document.getElementById("firstName").value,
    lastName: document.getElementById("lastName").value,
    phone: document.getElementById("phone").value,
    address: document.getElementById("address").value,
    stringBase64Avatar: base64Image
  }
  let json = JSON.stringify(userDto);
  let url = BASE_URL + 'api/user/create';
  fetch(url, {
    method: 'POST',
    body: json,
    headers: {
      'Content-Type': 'application/json'
    }
  }).then(response => {
    if (!response.ok) {
      return Promise.reject(response.json());
    }
    return response.json();
  }).then(body => {
    alert('create user success');
    window.location.href = CMS_USER_PAGE;
  })
}