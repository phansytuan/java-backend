const PAGE_INIT = 0;
const SIZE_DEFAULT = 3;
const BASE_URL = 'http://localhost:8080/';
var totalPage = 0;

function searchClaim(page, size) {
  let claimCode = document.getElementById("search-ma-yeu-cau").value;
  let fromDate = document.getElementById("from-date").value;
  let toDate = document.getElementById("to-date").value;
  let codeStatus = document.getElementById("status-claim").value;

  let url = BASE_URL
      + `api/claim?page=${page}&size=${size}&claimCode=${claimCode}&fromDate=${fromDate}&toDate=${toDate}&codeStatus=${codeStatus}`;
  console.log(url)

  fetch(url)  // 1. Gọi API, method fetch đang trả về 1 Promise
  .then(response => {  // 2. Xử lý phản hồi (response) từ Promise
    if (!response.ok) {
      throw new Error('call api error');  // 3. Nếu không thành công, ném lỗi
    }
    return response.json();  // 4. Chuyển dữ liệu nhận được từ API thành JSON, trả về 1 Promise
  })
  .then(dataResponse => {  // 5. Xử lý dữ liệu nhận được từ API hứng lại Promise từ Bước 4
    console.log(dataResponse);  // In dữ liệu ra console
    renderTable(dataResponse.data);  // Hiển thị dữ liệu lên giao diện
    renderPaging(dataResponse);
  })
  .catch(error => {  // 6. Xử lý lỗi (nếu có) xử lý nếu bước 4 bắn ra lỗi
    console.log(error);  // In lỗi ra console nếu có
  });
}


function renderTable(claims) {
  // lay ra body cua table
  let bodyTable = document.getElementById('bodyTableData');
  // xóa bỏ toàn bộ dữ liệu đã có của table
  bodyTable.innerHTML = '';
  // chạy 1 vòng for duyệt danh sách claims
  for (let i = 0; i < claims.length; i++) {
    // lấy ra từng claim
    let claim = claims[i];
    // tạo ra từng row
    let rowTable = `<tr>
                                    <td><input type="checkbox" class="recordCheckbox"></td>
                                    <td><strong>${claim.code}</strong></td>
                                    <td>${claim.customerName}</td>
                                    <td>${claim.nameProduct}</td>
                                    <td>${claim.claimDate}</td>
                                    <td>${claim.coverageProduct}</td>
                                    <td><span class="badge bg-label-primary me-1">${claim.statusName}</span></td>
                                </tr>`
    // lắp các row đó vào trong body của table
    bodyTable.innerHTML += rowTable;
  }
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
    let page = `<li class="${classPage}">
                                        <a class="page-link" onclick="changePage(${i})">
                                          ${i + 1}
                                        </a>
                                    </li>`;
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
  searchClaim(pageIndex, SIZE_DEFAULT)
}

function actionSearch() {
  searchClaim(PAGE_INIT, SIZE_DEFAULT);
}

// khi toàn bộ dữ liệu tại window đã load xong
window.onload = function () {
  searchClaim(PAGE_INIT, SIZE_DEFAULT);
}
