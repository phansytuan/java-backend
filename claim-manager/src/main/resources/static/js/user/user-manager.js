PAGE_INIT = 0;
const SIZE_DEFAULT = 3;
const BASE_URL = 'http://localhost:8080/';
var totalPage = 0;

function redirectPageCreateUser() {
  window.location.href = "http://localhost:8080/cms/create-user";
}

function search(page, size) {
  let code = document.getElementById("search-ma-yeu-cau").value;
  let fromDate = document.getElementById("from-date").value;
  let toDate = document.getElementById("to-date").value;
  let phone = document.getElementById("phone").value;

  let url = BASE_URL
      + `api/users?page=${page}&size=${size}&code=${code}&fromDate=${fromDate}&toDate=${toDate}&phone=${phone}`;
  console.log(url)
  fetch(url)  // Bước 1: Gọi API, method fetch đang trả về 1 Promise
  .then(response => {  // Bước 2: Xử lý phản hồi (response) từ Promise
    if (!response.ok) {
      throw new Error('call api error');  // Bước 3: Nếu không thành công, ném lỗi
    }
    return response.json();  // Bước 4: Chuyển dữ liệu nhận được từ API thành JSON, trả về 1 Promise
  })
  .then(dataResponse => {  // Bước 5: Xử lý dữ liệu nhận được từ API hứng lại Promise từ Bước 4
    console.log(dataResponse);  // In dữ liệu ra console
    renderTable(dataResponse.data);  // Hiển thị dữ liệu lên giao diện
    renderPaging(dataResponse);
  })
  .catch(error => {  // Bước 6: Xử lý lỗi (nếu có) xử lý nếu Bước 4 bắn ra lỗi
    console.log(error);  // In lỗi ra console nếu có
  });
}

function renderTable(data) {
  // lay ra body cua table
  let bodyTable = document.getElementById('bodyTableData');
  // xóa bỏ toàn bộ dữ liệu đã có của table
  bodyTable.innerHTML = '';
  // chạy 1 vòng for duyệt danh sách claims
  for (let i = 0; i < data.length; i++) {
    // lấy ra từng claim
    let dto = data[i];
    // tạo ra từng row
    let urlDetail = BASE_URL + 'cms/detail-user/' + dto.id;
    let rowTable = `<tr>
                                <td><input type="checkbox" class="recordCheckbox"></td>
                                <td><a href="${urlDetail}"><strong>${getValueDto(dto.code)}</strong></a></td>
                                <td>${getValueDto(dto.username)}</td>
                                <td>${getValueDto(dto.firstName) + ' ' + getValueDto(dto.lastName)}</td>
                                <td>${getValueDto(dto.phone)}</td>
                                <td>${getValueDto(dto.createdDate)}</td>
                                <td>${getValueDto(dto.address)}</td>
                              </tr>`;

    // lắp các row đó vào trong body của table
    bodyTable.innerHTML += rowTable;
  }
}

function getValueDto(data) {
  if (data == undefined || data == null) {
    return '';
  }
  return data;
}

function renderPaging(response) {
  totalPage = response.totalPage;
  let pageIndex = response.pageIndex;

  let pageBody = document.getElementById("paginationId");
  // reset empty page body
  pageBody.innerHTML = '';

  let preIcon = `<li class="page-item">
                                        <a class="page-link" onclick="changePage(${pageIndex - 1})" aria-label="Next">
                                           <span aria-hidden="true">&laquo;</span>
                                        </a>
                                    </li>`
  pageBody.innerHTML += preIcon;

  for (let i = 0; i < totalPage; i++) {
    let classPage = 'page-item';
    if (i === pageIndex) {
      classPage += ' active';
    }
    let page = `<li class="${classPage}"><a class="page-link" onclick="changePage(${i})">${i
    + 1}</a></li>`;
    pageBody.innerHTML += page;
  }

  let nextIcon = `<li class="page-item">
                                        <a class="page-link" onclick="changePage(${pageIndex + 1})" aria-label="Next">
                                            <span aria-hidden="true">&raquo;</span>
                                        </a>
                                    </li>`
  pageBody.innerHTML += nextIcon;

}

function changePage(pageIndex) {
  if (pageIndex < 0) {
    pageIndex = 0;
  } else if (pageIndex >= totalPage) {
    pageIndex = pageIndex - 1;
  }
  search(pageIndex, SIZE_DEFAULT)
}

function actionSearch() {
  search(PAGE_INIT, SIZE_DEFAULT);
}

// khi toàn bộ dữ liệu tại window đã load xong
window.onload = function () {
  search(PAGE_INIT, SIZE_DEFAULT);
}